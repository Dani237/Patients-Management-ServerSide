package com.clinic.clients.repository;

import com.clinic.clients.models.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Integer> {
    //List<Patient>findAll();
    //Patient findOne(int id);
    //Patient save(Patient patient);
    //void delete(Patient patient);
}
