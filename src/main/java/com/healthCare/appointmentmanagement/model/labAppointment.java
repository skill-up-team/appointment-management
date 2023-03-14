package com.healthCare.appointmentmanagement.model;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.sql.Time;
import java.util.Date;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name="labAppointment")
public class LabAppointment {
    @jakarta.persistence.Id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column (name = "labId")
    private Long labId;
    @Column (name = "serviceId")
    private Long serviceId;
    @Column (name = "patientId")
    private Long patientId;
    @Column (name = "date")
    private Date date;
    @Column (name = "time")
    private Time time;

}
