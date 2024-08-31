package com.example.demo.controllers;

import com.example.demo.models.Application;
import com.example.demo.models.Upskill;
import com.example.demo.service.UpskillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/upskill")
public class UpskillController {

    @Autowired
    UpskillService upskillService;

    @PostMapping("/add")
    ResponseEntity<Upskill> saveTask (Upskill Task){
        Upskill Taask = upskillService.savee(Task);
        return ResponseEntity.ok(Taask);
    }

    @GetMapping("/getAllUserTasks/{id}")
    ResponseEntity<List<Upskill>> getAllUserApplications(@PathVariable("id") String userId){
        List<Upskill> applications =  upskillService.getTasksByUserId(userId);
        return ResponseEntity.ok(applications);
    }
}
