package com.testlab.websocket.controller;

import com.testlab.websocket.model.dto.Greeting;
import com.testlab.websocket.model.dto.MessageDto;
import com.testlab.websocket.service.MessageService;
import lombok.AllArgsConstructor;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.util.HtmlUtils;

@Controller
@AllArgsConstructor
public class OperationalController {

    private final MessageService messageService;

    @MessageMapping("/creation")
    @SendTo("/topic/creation")
    public Greeting create(final MessageDto messageDto) {

        return new Greeting("Created object with name , " + HtmlUtils.htmlEscape(messageService.create(messageDto).getName()) + "!");
    }
}
