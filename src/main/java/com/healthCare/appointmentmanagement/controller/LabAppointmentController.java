package com.healthCare.appointmentmanagement.controller;

import com.healthCare.appointmentmanagement.dto.LabAppointmentDto;
import com.healthCare.appointmentmanagement.model.LabAppointment;
import com.healthCare.appointmentmanagement.service.LabAppointmentService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/api/v1/appointment/lab")
public class LabAppointmentController {

    @Autowired
    private LabAppointmentService labAppointmentService;


    @Autowired
    private ModelMapper modelMapper;

    @PostMapping
    public ResponseEntity<LabAppointmentDto> create(@RequestBody LabAppointmentDto labAppointmentDto){
        LabAppointment labAppointment = modelMapper.map(labAppointmentDto, LabAppointment.class);
        labAppointment = labAppointmentService.create(labAppointment);
        return ResponseEntity.status(HttpStatus.CREATED).body(modelMapper.map(labAppointment,LabAppointmentDto.class));
    }

    @GetMapping("/{id}")
    public ResponseEntity<LabAppointmentDto> FindById(@PathVariable Long id){
        LabAppointment labAppointment = labAppointmentService.findById(id);
        return ResponseEntity.ok(modelMapper.map(labAppointment,LabAppointmentDto.class));
    }

    @GetMapping
    public List<LabAppointmentDto> FindAll(){
        List<LabAppointment> labAppointmentList = labAppointmentService.findAll();
        return labAppointmentList.stream()
                .map(labAppointment -> modelMapper.map(labAppointment, LabAppointmentDto.class))
                .collect(Collectors.toList());
    }

}
