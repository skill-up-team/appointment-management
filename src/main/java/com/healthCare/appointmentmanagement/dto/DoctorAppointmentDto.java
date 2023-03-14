package com.healthCare.appointmentmanagement.dto;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Time;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DoctorAppointmentDto {
    private Long id;
    private String doctorId;
    private String hospitalId;
    private String patientId;
    private String status;
    private Date date;
    private Time time;
}

