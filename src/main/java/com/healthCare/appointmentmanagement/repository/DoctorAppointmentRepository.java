package com.healthCare.appointmentmanagement.repository;

import com.healthCare.appointmentmanagement.model.DoctorAppointment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;


public interface DoctorAppointmentRepository extends JpaRepository<DoctorAppointment,Long> {
    //Doctors daily appointment list
    List<DoctorAppointment> findAllByDoctorIdAndDate(Long DoctorId, LocalDate date);

    //patient appointment list
    List<DoctorAppointment> findAllByPatientId(Long PatientId);

}
