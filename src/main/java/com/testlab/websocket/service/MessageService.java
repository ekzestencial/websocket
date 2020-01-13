package com.testlab.websocket.service;

import com.testlab.websocket.model.db.Message;
import com.testlab.websocket.model.dto.MessageDto;
import com.testlab.websocket.repo.MessageRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class MessageService {

    private final MessageRepository messageRepository;

    public Message create(MessageDto messageDto) {
        String name = messageDto.getName();
        if (findByName(name).isPresent()) {
            throw new RuntimeException("The name exists, please write other name");
        }
        return messageRepository.save(new Message(name));
    }

    public Optional<Message> findByName(String name) {
        return messageRepository.findByName(name);
    }
}
