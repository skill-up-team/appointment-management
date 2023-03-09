package com.healthCare.appointmentmanagement.repository;

import com.healthCare.appointmentmanagement.model.DoctorAppointment;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DoctorAppointmentRepository extends JpaRepository<DoctorAppointment,Long> {

}
