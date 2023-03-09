package com.healthCare.appointmentmanagement.controller;

import com.healthCare.appointmentmanagement.model.LabAppointment;
import com.healthCare.appointmentmanagement.service.ILabAppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/api/v1/appointment/doctor")
public class LabAppointmentController {

    @Autowired
    private ILabAppointmentService labAppointmentService;

    @PostMapping()
    public LabAppointment create(@RequestBody LabAppointment labAppointment){
        return labAppointmentService.create(labAppointment);
    }

}
