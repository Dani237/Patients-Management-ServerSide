package com.clinic.clients.models;

import lombok.Data;

import javax.persistence.*;
import java.sql.Time;
import java.util.Date;

@Entity
@Data
@Table(name = "appointments")
public class Appointment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "app_id")
    private int appId;

    @Column(name = "date_appointment")
    private Date dateAppointment;

    //@Column(name = "hour_appointment")
    //private Time hourAppointment;

    @Column(name = "patient_name")
    private String patientName;

    @Column(name = "description")
    private String description;

    //@ManyToOne(fetch = FetchType.LAZY, optional = false)
    //private Patient patient;
}
