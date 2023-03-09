package com.healthCare.appointmentmanagement.dto;

import jakarta.persistence.Column;
import lombok.Data;

import java.sql.Time;
import java.util.Date;

@Data
public class DoctorAppointmentDto {
    private Long docAppointmentId;
    private String doctorId;
    private String hospitalId;
    private String patientId;
    private String status;
    private Date date;
    private Time time;
}
