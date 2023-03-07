package com.healthCare.appointmentmanagement.repository;

import com.healthCare.appointmentmanagement.model.DoctorAppointment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorAppointmentRepository extends JpaRepository<DoctorAppointment,Long> {
}
