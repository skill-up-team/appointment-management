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
@Table(name="DoctorAppointment")
public class DoctorAppointment {
    @Id
    @Column (name = "docAppointmentId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long docAppointmentId;
    @Column (name = "doctorId")
    private String doctorId;
    @Column (name = "hospitalId")
    private String hospitalId;
    @Column (name = "patientId")
    private String patientId;
    @Column (name = "status")
    private String status;
    @Column (name = "date")
    private String date;
    @Column (name = "time")
    private String time;
}
