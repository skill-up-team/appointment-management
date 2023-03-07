package com.healthCare.appointmentmanagement.model;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
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
@Table(name="doctorAppointment")
public class doctorAppointment {
    @Id
    @Column (name = "docAppointmentId")
    private String docAppointmentId;
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
