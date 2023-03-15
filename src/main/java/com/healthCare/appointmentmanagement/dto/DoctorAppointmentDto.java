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
    private Long doctorId;
    private Long hospitalId;
    private Long patientId;
    private String status;
    private Date date;
    private Time time;
}
