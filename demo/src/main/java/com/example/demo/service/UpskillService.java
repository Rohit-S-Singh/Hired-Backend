package com.example.demo.service;

import com.example.demo.Repository.UpskillRepo;
import com.example.demo.models.Upskill;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UpskillService {

    @Autowired
    UpskillRepo upskillRepo;

    public Upskill savee(Upskill task){
        Upskill taskk  = upskillRepo.save(task);
        return taskk;
    }

    public List<Upskill> getTasksByUserId(String Id){

        List<Upskill> application = upskillRepo.findByUserId(Id);
        return application;
    }



}
