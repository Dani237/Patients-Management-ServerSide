package com.clinic.clients.service;

import com.clinic.clients.models.Patient;

import java.util.List;

public interface PatientService {
    List<Patient> getAll();
    Patient getById(int id);
    Patient add(Patient patient);
    Patient edit(Patient patient);
    Patient delete(int id);
}
