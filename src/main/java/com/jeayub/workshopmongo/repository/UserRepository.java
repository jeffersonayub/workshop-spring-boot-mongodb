package com.jeayub.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.jeayub.workshopmongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{

}
