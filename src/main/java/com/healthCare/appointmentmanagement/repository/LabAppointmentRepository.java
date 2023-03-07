package com.healthCare.appointmentmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import  com.healthCare.appointmentmanagement.model.LabAppointment;
@Repository
public interface LabAppointmentRepository extends JpaRepository<LabAppointment,Long> {

}
