package com.healthCare.appointmentmanagement.controller;

import com.healthCare.appointmentmanagement.dto.DoctorAppointmentDto;
import com.healthCare.appointmentmanagement.model.DoctorAppointment;
import com.healthCare.appointmentmanagement.service.DoctorAppointmentService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/v1/appointment/doctor")
public class DoctorAppointmentController  {
    @Autowired
    private DoctorAppointmentService doctorAppointmentService;

    @Autowired
    private ModelMapper modelMapper;

    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "world") String name){
        return String.format("Hello, %s", name);
    }
    @PostMapping
    public ResponseEntity<DoctorAppointmentDto> create(@RequestBody DoctorAppointmentDto doctorAppointmentDto){
        DoctorAppointment doctorAppointment= modelMapper.map(doctorAppointmentDto,DoctorAppointment.class);
        doctorAppointment = DoctorAppointmentService.create(doctorAppointment);
        return ResponseEntity.status(HttpStatus.CREATED).body(modelMapper.map(doctorAppointment,DoctorAppointmentDto.class));
    }

    @GetMapping("/{id}")
    public ResponseEntity<DoctorAppointmentDto> findById(@PathVariable Long id){
        DoctorAppointment doctorAppointment= doctorAppointmentService.findById(id);
        return ResponseEntity.ok(modelMapper.map(doctorAppointment,DoctorAppointmentDto.class));
    }

    @GetMapping
    public List<DoctorAppointmentDto> findAllByPatientId(Long id){
        List<DoctorAppointment> doctorAppointmentList = doctorAppointmentService.findAllByPatientId(id);
        return doctorAppointmentList.stream()
                .map(doctorAppointment -> modelMapper.map(doctorAppointment, DoctorAppointmentDto.class))
                .collect(Collectors.toList());
    }

    @GetMapping("/{id}/date/{date}")
    public List<DoctorAppointmentDto> findAllByDoctorIdAndDate(Long id, Date date){
        List<DoctorAppointment> doctorAppointmentList = doctorAppointmentService.findAllByDoctorIdAndDate(id,date);
        return doctorAppointmentList.stream()
                .map(doctorAppointment -> modelMapper.map(doctorAppointment, DoctorAppointmentDto.class))
                .collect(Collectors.toList());
    }
}
