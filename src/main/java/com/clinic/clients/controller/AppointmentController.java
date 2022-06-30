package com.clinic.clients.controller;

import com.clinic.clients.models.Appointment;
import com.clinic.clients.models.Patient;
import com.clinic.clients.service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200/", maxAge = 3600)
@RequestMapping({"/appointments"})
public class AppointmentController {

    @Autowired
    private AppointmentService appointmentService;

    @GetMapping
    public List<Appointment>getAll() {
        return appointmentService.getAll();
    }

    @PostMapping
    public Appointment add(@RequestBody Appointment appointment) {
        return appointmentService.add(appointment);
    }

    @GetMapping("/{appId}")
    public Appointment getAppointmentById(@PathVariable int appId) {
        return appointmentService.getById(appId);
    }

    @PutMapping("/{appId}")
    public Appointment update(@RequestBody Appointment appointment, @PathVariable int appId) {
        appointment.setAppId(appId);
        return appointmentService.edit(appointment);
    }

    @DeleteMapping("/{appId}")
    public Appointment delete(@PathVariable int appId) {
        return appointmentService.delete(appId);
    }
}
