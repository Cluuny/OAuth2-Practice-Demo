package dev.cluuny.practice.oauth2resourceserver.controller;

import dev.cluuny.practice.oauth2resourceserver.dto.MessageRequest;
import dev.cluuny.practice.oauth2resourceserver.dto.MessageResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
public class AppController {
    @GetMapping("/list")
    public List<MessageResponse> listMessages() {
        return Collections.singletonList(MessageResponse.builder()
                .data("Test Message")
                .build());
    }

    @PostMapping("/create")
    public MessageResponse create(@RequestBody MessageRequest messageRequest) {
        return MessageResponse.builder()
                .data("Mensaje guardado: " + messageRequest.getData())
                .build();
    }
}
