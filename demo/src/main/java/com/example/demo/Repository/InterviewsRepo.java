package com.example.demo.Repository;

import com.example.demo.models.Interviews;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface InterviewsRepo extends MongoRepository<Interviews,String> {


}
