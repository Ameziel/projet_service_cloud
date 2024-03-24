package com.example.projet_service_cloud.app;

import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@AllArgsConstructor
@RestController
@CrossOrigin("*")
@RequestMapping(path = "/api/v1/projet_service_cloud")
public class PersonnageController {

    private PersonnageService personnageService;
    @GetMapping("/personnages")
    public Page<PersonnageEntity> getAllPersonnage(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "5") int size) {
        return personnageService.getAllPersonnages(page, size);
    }
    @GetMapping("/personnages/{id}")
    public PersonnageEntity getPersonnageById(@PathVariable(name = "id") UUID id) throws PersonnageNotFoundException {
        return personnageService.getPersonnageById((id));
    }

    /**
     * **************************************
     * *                                    *
     * *            POST Method             *
     * *                                    *
     * **************************************
     */
    @PostMapping("/personnages")
    @ResponseStatus(HttpStatus.CREATED)
    public PersonnageEntity saveEleve(@RequestBody PersonnageEntity personnageEntity) {
        return personnageService.savePersonnage(personnageEntity);
    }

    /**
     * **************************************
     * *                                    *
     * *           DELETE Method            *
     * *                                    *
     * **************************************
     */
    @DeleteMapping("/personnages/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deletePersonnage(@PathVariable UUID id) {
        personnageService.deletePersonnage(id);
    }
}
