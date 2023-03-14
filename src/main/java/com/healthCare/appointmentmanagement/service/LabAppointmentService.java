package com.healthCare.appointmentmanagement.service;

import com.healthCare.appointmentmanagement.model.LabAppointment;
import com.healthCare.appointmentmanagement.repository.LabAppointmentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@Slf4j
public class LabAppointmentService {

    @Autowired
    private static LabAppointmentRepository labAppointmentRepository;


    public static LabAppointment create(LabAppointment labAppointment){
        return labAppointmentRepository.save(labAppointment);
    }

    public static LabAppointment findById(Long docAppointmentId){
        return labAppointmentRepository.findById(docAppointmentId).get();
    }

    public static List<LabAppointment> findAll(){
        return labAppointmentRepository.findAll();
    }
    
}
