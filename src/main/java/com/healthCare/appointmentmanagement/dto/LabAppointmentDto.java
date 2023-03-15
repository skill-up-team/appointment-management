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
public class LabAppointmentDto {
    private Long id;
    private Long labId;
    private Long serviceId;
    private Long patientId;
    private Date date;
    private Time time;
}