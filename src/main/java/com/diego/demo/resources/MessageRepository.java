package com.diego.demo.resources;


import org.springframework.data.mongodb.repository.MongoRepository;
import com.diego.demo.entities.Message;

public interface MessageRepository extends MongoRepository<Message, String> {
}
