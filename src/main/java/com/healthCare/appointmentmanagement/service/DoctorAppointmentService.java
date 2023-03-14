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
    private  DoctorAppointmentRepository doctorAppointmentRepository;



    public DoctorAppointment create(DoctorAppointment doctorAppointment){
        return doctorAppointmentRepository.save(doctorAppointment);
    }


    public DoctorAppointment update(DoctorAppointment doctorAppointment){
        return doctorAppointmentRepository.save(doctorAppointment);
    }

    public DoctorAppointment findById(Long docAppointmentId){
        return doctorAppointmentRepository.findById(docAppointmentId).get();
    }

    public List<DoctorAppointment> findAllByDoctorIdAndDate(Long DoctorId, Date date){
        return doctorAppointmentRepository.findAllByDoctorIdAndDate(DoctorId,date);
    }


    public List<DoctorAppointment> findAllByPatientId(Long PatientId){
        return doctorAppointmentRepository.findAllByPatientId(PatientId);
    }
}
