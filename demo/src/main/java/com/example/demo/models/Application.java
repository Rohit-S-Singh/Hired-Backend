package com.example.demo.models;

public class Application {

    String Id;

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
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
    String currentStatus;

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
