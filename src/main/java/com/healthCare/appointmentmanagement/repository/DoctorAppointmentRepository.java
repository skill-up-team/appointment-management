package com.healthCare.appointmentmanagement.repository;

import com.healthCare.appointmentmanagement.model.DoctorAppointment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;


public interface DoctorAppointmentRepository extends JpaRepository<DoctorAppointment,Long> {
    //Docters daily appointment list
    List<DoctorAppointment> findAllByDoctorIdAndDate(Long DoctorId, Date date);

    //patient appointment list
    List<DoctorAppointment> findAllByPatientId(Long PatientId);

}
