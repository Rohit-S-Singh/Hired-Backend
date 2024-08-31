package com.example.demo.models;

import org.springframework.data.annotation.Id;

public class Application {

    @org.springframework.data.annotation.Id
    String id;

    public String getid() {
        return id;
    }

    public void setId(String id) {
        id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    String userId;
    String companyName;
    Integer noOfInterviewRounds;
    String recruiterEmailId;
    String roleAppliedFor;

    public String getDateOfApplication() {
        return dateOfApplication;
    }

    public void setDateOfApplication(String dateOfApplication) {
        this.dateOfApplication = dateOfApplication;
    }

    String currentStatus;
    String dateOfApplication;

    public String getUserID() {
        return userId;
    }

    public void setUserID(String userID) {
        this.userId = userID;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Integer getNoOfInterviewRounds() {
        return noOfInterviewRounds;
    }

    public void setNoOfInterviewRounds(Integer noOfInterviewRounds) {
        this.noOfInterviewRounds = noOfInterviewRounds;
    }

    public String getRecruiterEmailId() {
        return recruiterEmailId;
    }

    public void setRecruiterEmailId(String recruiterEmailId) {
        this.recruiterEmailId = recruiterEmailId;
    }

    public String getRoleAppliedFor() {
        return roleAppliedFor;
    }

    public void setRoleAppliedFor(String roleAppliedFor) {
        this.roleAppliedFor = roleAppliedFor;
    }

    public String getCurrentStatus() {
        return currentStatus;
    }

    public void setCurrentStatus(String currentStatus) {
        this.currentStatus = currentStatus;
    }
}
