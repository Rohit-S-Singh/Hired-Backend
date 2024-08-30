package com.example.demo.controllers;

import com.example.demo.models.Application;
import com.example.demo.service.ApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/application")
public class ApplicationController {

    @Autowired
    private ApplicationService applicationService;

    @PostMapping("/add")
    ResponseEntity<Application> addApplication(@RequestBody Application application){

        Application newApplication = applicationService.saveApplication(application);
        return ResponseEntity.ok(newApplication);
    }

    @GetMapping("/getAllUserApplications/{id}")
    ResponseEntity<List<Application>> getAllUserApplications(@PathVariable("id") String userId){
        List<Application> applications =  applicationService.getApplicationByUserId(userId);
        return ResponseEntity.ok(applications);
    }
}
