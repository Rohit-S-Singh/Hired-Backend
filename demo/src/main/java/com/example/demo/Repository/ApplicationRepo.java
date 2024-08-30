package com.example.demo.Repository;

import com.example.demo.models.Application;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ApplicationRepo extends MongoRepository<Application,String> {

    List<Application> findByUserId(String s);
}
