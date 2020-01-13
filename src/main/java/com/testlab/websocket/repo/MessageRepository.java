package com.testlab.websocket.repo;

import com.testlab.websocket.model.db.Message;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public
interface MessageRepository extends CrudRepository <Message, Integer> {
   Optional<Message> findByName(String name);
}
