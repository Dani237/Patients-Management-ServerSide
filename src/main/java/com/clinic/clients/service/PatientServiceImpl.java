package com.clinic.clients.service;

import com.clinic.clients.models.Patient;
import com.clinic.clients.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientServiceImpl implements PatientService{

    @Autowired
    private PatientRepository repository;


    @Override
    public List<Patient> getAll() {
        return repository.findAll();
    }

    @Override
    public Patient getById(int id) {
        return repository.findById(id).orElseThrow();
    }

    @Override
    public Patient add(Patient patient) {
        return repository.save(patient);
    }

    @Override
    public Patient edit(Patient patient) {
        return repository.save(patient);
    }

    @Override
    public Patient delete(int id) {
        Patient patient = repository.findById(id).orElseThrow();
        if (patient != null) {
            repository.delete(patient);
        }
        return patient;
    }
}
