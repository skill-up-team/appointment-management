package com.healthCare.appointmentmanagement.model;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.sql.Time;
import java.time.LocalDate;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name="doctor_appointment")
public class DoctorAppointment {
    @jakarta.persistence.Id
    @Id
    @Column (name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column (name = "doctorId")
    private Long doctorId;
    @Column (name = "hospitalId")
    private Long hospitalId;
    @Column (name = "patientId")
    private Long patientId;
    @Column (name = "status")
    private String status;
    @Column (name = "date")
    private LocalDate date;
    @Column (name = "time")
    private Time time;
}


