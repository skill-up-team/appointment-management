package com.healthCare.appointmentmanagement.service.implementation;

import com.healthCare.appointmentmanagement.model.LabAppointment;
import com.healthCare.appointmentmanagement.repository.LabAppointmentRepository;
import com.healthCare.appointmentmanagement.service.ILabAppointmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@Slf4j
public class LabAppointmentService implements ILabAppointmentService {

    @Autowired
    private LabAppointmentRepository labAppointmentRepository;

    @Override
    public LabAppointment create(LabAppointment labAppointment){
        return labAppointmentRepository.save(labAppointment);
    }
    @Override
    public LabAppointment findById(Long docAppointmentId){
        return labAppointmentRepository.findById(docAppointmentId).get();
    }
    
}
