package com.example.demo.Repository;

import com.example.demo.models.Application;
import com.example.demo.models.Upskill;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface UpskillRepo extends MongoRepository<Upskill,String> {

    List<Upskill> findByUserId(String s);

}
