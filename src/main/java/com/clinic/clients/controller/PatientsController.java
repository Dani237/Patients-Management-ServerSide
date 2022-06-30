package com.clinic.clients.controller;

import com.clinic.clients.models.Patient;
import com.clinic.clients.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200/", maxAge = 3600)
@RequestMapping({"/patients"})
public class PatientsController {

    @Autowired
    private PatientService patientService;

    @GetMapping
    public List<Patient>getAll() {
        return patientService.getAll();
    }

    @PostMapping
    public Patient add(@RequestBody Patient patient) {
        return patientService.add(patient);
    }

    @GetMapping("/{id}")
    public Patient etPatientById(@PathVariable int id) {
        return patientService.getById(id);
    }

    @PutMapping("/{id}")
    public Patient update(@RequestBody Patient patient, @PathVariable int id) {
        patient.setId(id);
        return patientService.edit(patient);
    }

    @DeleteMapping("/{id}")
    public Patient delete(@PathVariable int id) {
        return patientService.delete(id);
    }
}
