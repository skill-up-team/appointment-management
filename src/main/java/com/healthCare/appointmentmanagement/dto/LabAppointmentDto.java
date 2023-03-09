package com.healthCare.appointmentmanagement.dto;

import jakarta.persistence.Column;
import lombok.Data;

import java.sql.Time;
import java.util.Date;
@Data
public class LabAppointmentDto {
    private Long labAppointmentId;
    private String labId;
    private String serviceId;
    private String patientId;
    private Date date;
    private Time time;
}
