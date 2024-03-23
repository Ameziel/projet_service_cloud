package com.example.projet_service_cloud.app;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface PersonnageRepository extends JpaRepository<PersonnageEntity, UUID> {
}
