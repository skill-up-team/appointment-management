package com.healthCare.appointmentmanagement.service;
import com.healthCare.appointmentmanagement.model.DoctorAppointment;
import java.util.List;
public interface IDoctorAppointmentService {
    DoctorAppointment create(DoctorAppointment doctorAppointment);

    DoctorAppointment update(DoctorAppointment doctorAppointment);

    DoctorAppointment findById(Long docAppointmentId);

}
