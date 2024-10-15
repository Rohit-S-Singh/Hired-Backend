package com.example.demo.Repository;

import com.example.demo.models.MyUser;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserDetailsRepo extends MongoRepository<MyUser, ObjectId> {
    public Optional<MyUser> findByUserName(String name);

    boolean existsByEmail(String email);

    boolean existsByUserName(String userName);
}
