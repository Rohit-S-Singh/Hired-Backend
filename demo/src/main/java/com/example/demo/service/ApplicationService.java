package com.example.demo.service;

import com.example.demo.Repository.ApplicationRepo;
import com.example.demo.models.Application;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
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

    public Application updateAppById(String id, Application updatedApplication) {
        // Find the existing application by ID
        Optional<Application> existingApplicationOpt = applicationRepo.findById(id);

        if (existingApplicationOpt.isPresent()) {
            Application existingApplication = existingApplicationOpt.get();

            // Update the fields of the existing application
            existingApplication.setDateOfApplication(updatedApplication.getDateOfApplication());
            existingApplication.setCurrentStatus(updatedApplication.getCurrentStatus());
            // Add other fields as needed...

            existingApplication.setRoleAppliedFor(updatedApplication.getRoleAppliedFor());
            existingApplication.setRecruiterEmailId(updatedApplication.getRecruiterEmailId());
            existingApplication.setRoleAppliedFor(updatedApplication.getRoleAppliedFor());
            existingApplication.setCompanyName(updatedApplication.getCompanyName());



            // Save the updated application back to the repository
            return applicationRepo.save(existingApplication);
        } else {
//            throw new EntityNotFoundException("Application not found with ID: " + id);
            throw new NoSuchElementException("Application not found with ID: " + id);
        }
    }

    public void deleteApplication(String id){
        applicationRepo.deleteById(id);
    }
}
