package com.healthCare.appointmentmanagement.service.implementation;

import com.healthCare.appointmentmanagement.model.DoctorAppointment;
import com.healthCare.appointmentmanagement.repository.DoctorAppointmentRepository;
import com.healthCare.appointmentmanagement.service.IDoctorAppointmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DocterAppointmentService implements IDoctorAppointmentService {

    @Autowired
    private DoctorAppointmentRepository doctorAppointmentRepository;

    @Override
    public DoctorAppointment create(DoctorAppointment doctorAppointment){
        return doctorAppointmentRepository.save(doctorAppointment);
    }

    @Override
    public DoctorAppointment update(DoctorAppointment doctorAppointment){
        return doctorAppointmentRepository.save(doctorAppointment);
    }

    @Override
    public DoctorAppointment findById(Long docAppointmentId){
        return doctorAppointmentRepository.findById(docAppointmentId).get();
    }
}
