package com.example.projet_service_cloud.app;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@Transactional
@AllArgsConstructor
public class PersonnageService {

    private PersonnageRepository personnageRepository;

    /**
     * **************************************
     * *                                    *
     * *            GET Methods             *
     * *                                    *
     * **************************************
     */
    public List<PersonnageEntity> getAllPersonnages() {
        List<PersonnageEntity> personnageEntities = personnageRepository.findAll();
        return personnageEntities;
    }
    public PersonnageEntity getPersonnageById(UUID id) throws PersonnageNotFoundException {
        PersonnageEntity eleve = personnageRepository.findById(id)
                .orElseThrow(() -> new PersonnageNotFoundException());
        return eleve;
    }
    /**
     * **************************************
     * *                                    *
     * *            POST Methods            *
     * *                                    *
     * **************************************
     */
    public PersonnageEntity savePersonnage(PersonnageEntity personnageEntityArg) {
        PersonnageEntity personnageEntity = personnageRepository.save(personnageEntityArg);
        return personnageEntity;
    }
    /**
     * **************************************
     * *                                    *
     * *           DELETE Methods           *
     * *                                    *
     * **************************************
     */
    public void deletePersonnage(UUID id) {
        personnageRepository.deleteById(id);
    }


}
