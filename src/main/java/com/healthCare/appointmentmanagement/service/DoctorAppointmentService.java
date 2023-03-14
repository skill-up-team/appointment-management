package com.healthCare.appointmentmanagement.service;

import com.healthCare.appointmentmanagement.model.DoctorAppointment;
import com.healthCare.appointmentmanagement.repository.DoctorAppointmentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
@Slf4j
public class DoctorAppointmentService{

    @Autowired
    private static DoctorAppointmentRepository doctorAppointmentRepository;



    public static DoctorAppointment create(DoctorAppointment doctorAppointment){
        return doctorAppointmentRepository.save(doctorAppointment);
    }


    public static DoctorAppointment update(DoctorAppointment doctorAppointment){
        return doctorAppointmentRepository.save(doctorAppointment);
    }

    public static DoctorAppointment findById(Long docAppointmentId){
        return doctorAppointmentRepository.findById(docAppointmentId).get();
    }

    public static List<DoctorAppointment> findAllByDoctorIdAndDate(Long DoctorId, Date date){
        return doctorAppointmentRepository.findAllByDoctorIdAndDate(DoctorId,date);
    }


    public static List<DoctorAppointment> findAllByPatientId(Long PatientId){
        return doctorAppointmentRepository.findAllByPatientId(PatientId);
    }
}
