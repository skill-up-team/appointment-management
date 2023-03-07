package com.healthCare.appointmentmanagement.service;
import com.healthCare.appointmentmanagement.model.LabAppointment;
import java.util.List;
public interface ILabAppointmentService {
    LabAppointment create(LabAppointment labAppointment);

    LabAppointment findById(Long docAppointmentId);
}
