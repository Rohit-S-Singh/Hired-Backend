package com.example.demo.controllers;

import com.example.demo.models.Application;
import com.example.demo.service.ApplicationService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.web.csrf.CsrfToken;
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

    @GetMapping("/get-csrf")
    public CsrfToken getCsrf(HttpServletRequest r){
        return (CsrfToken)r.getAttribute("_csrf");
    }

    @GetMapping("/a")
    public String addApplication(){

        return "oyee";
    }

    @GetMapping("/getAllUserApplications/{id}")
    ResponseEntity<List<Application>> getAllUserApplications(@PathVariable("id") String userId){
        List<Application> applications =  applicationService.getApplicationByUserId(userId);
        return ResponseEntity.ok(applications);
    }

    @PostMapping("updateApplication/{id}")
    ResponseEntity<Application> updateApplication(@PathVariable("id") String id, @RequestBody Application application){
        Application newApplication  = applicationService.updateAppById(id,application);
        return ResponseEntity.ok(newApplication);
    }

    @DeleteMapping("delete/{id}")
    ResponseEntity<String> deleteApplication(@PathVariable("id") String Id){
        applicationService.deleteApplication(Id);
        return ResponseEntity.ok("Application Deleted Succesfull");
    }
}
