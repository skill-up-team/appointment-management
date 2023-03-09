package com.healthCare.appointmentmanagement.model;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name="LabAppointment")
public class LabAppointment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "labAppointmentId")
    private Long labAppointmentId;
    @Column (name = "labId")
    private String labId;
    @Column (name = "serviceId")
    private String serviceId;
    @Column (name = "patientId")
    private String patientId;
    @Column (name = "date")
    private String date;
    @Column (name = "time")
    private String time;
}