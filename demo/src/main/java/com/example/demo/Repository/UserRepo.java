package com.example.demo.Repository;

import com.example.demo.models.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepo extends MongoRepository<User,String> {

    User findByUserName(String Username);

}
