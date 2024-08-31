package com.example.demo.models;

import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;
import java.util.List;

public class Interviews {

    @Id
    String id;

    String interviewerEmail;
    String interviweeEmail;
    String type;
    String channel;
    LocalDateTime time;
    String duration;
    String description;
    String Experience;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getExperience() {
        return Experience;
    }

    public void setExperience(String experience) {
        Experience = experience;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getInterviewerEmail() {
        return interviewerEmail;
    }

    public void setInterviewerEmail(String interviewerEmail) {
        this.interviewerEmail = interviewerEmail;
    }

    public String getInterviweeEmail() {
        return interviweeEmail;
    }

    public void setInterviweeEmail(String interviweeEmail) {
        this.interviweeEmail = interviweeEmail;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public List<String> getTopics() {
        return topics;
    }

    public void setTopics(List<String> topics) {
        this.topics = topics;
    }

    List<String> topics;


    public String getId() {
        return id;
    }
}
