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
@Table(name="labAppointment")
public class labAppointment {
    @Id
    @Column (name = "labAppointmentId")
    private String labAppointmentId;
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
