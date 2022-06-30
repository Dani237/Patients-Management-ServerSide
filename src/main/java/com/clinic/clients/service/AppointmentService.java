package com.clinic.clients.service;

import com.clinic.clients.models.Appointment;

import java.util.List;

public interface AppointmentService {
    List<Appointment> getAll();
    Appointment getById(int id);
    List<Appointment> getByPatientId(int patientId);
    Appointment add(Appointment appointment);
    Appointment edit(Appointment appointment);
    Appointment delete(int id);
}
