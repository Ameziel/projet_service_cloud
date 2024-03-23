package com.example.projet_service_cloud.app;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@AllArgsConstructor
@RestController
@CrossOrigin("*")
@RequestMapping(path = "/api/v1/projet_service_cloud")
public class PersonnageController {

    private PersonnageService personnageService;
    @GetMapping("/personnages")
    public List<PersonnageEntity> getAllPersonnage() {
        return personnageService.getAllPersonnages();
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
