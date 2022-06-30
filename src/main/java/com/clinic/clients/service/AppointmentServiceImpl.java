package com.clinic.clients.service;

import com.clinic.clients.models.Appointment;
import com.clinic.clients.models.Patient;
import com.clinic.clients.repository.AppointmentRepository;
import com.clinic.clients.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppointmentServiceImpl implements AppointmentService{

    @Autowired
    private AppointmentRepository appointmentRepository;

    @Autowired
    private PatientRepository patientRepository;

    @Override
    public List<Appointment> getAll() {
        return appointmentRepository.findAll();
    }

    @Override
    public Appointment getById(int id) {
        return appointmentRepository.findById(id).orElseThrow();
    }

    @Override
    public List<Appointment> getByPatientId(int patientId) {
        return null;
    }

    @Override
    public Appointment add(Appointment appointment) {
        return appointmentRepository.save(appointment);
    }

    @Override
    public Appointment edit(Appointment appointment) {
        return appointmentRepository.save(appointment);
    }

    @Override
    public Appointment delete(int id) {
        Appointment appointment = appointmentRepository.findById(id).orElseThrow();
        if ( appointment != null) {
            appointmentRepository.delete(appointment);
        }

        return appointment;
    }
}
