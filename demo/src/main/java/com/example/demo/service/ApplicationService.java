package com.example.demo.service;

import com.example.demo.Repository.ApplicationRepo;
import com.example.demo.models.Application;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ApplicationService {

    @Autowired
    ApplicationRepo applicationRepo;

    public Application saveApplication(Application application){
        return applicationRepo.save(application);
    }

    public  List<Application> getApplicationByUserId(String Id){

        List<Application> application = applicationRepo.findByUserId(Id);
        return application;
    }




}
