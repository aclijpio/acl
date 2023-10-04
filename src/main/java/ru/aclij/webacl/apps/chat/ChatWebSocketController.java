package ru.aclij.webacl.apps.chat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;

@Controller
public class ChatWebSocketController {
    @MessageMapping("/chat")
    @SendTo("/topic/response")
    public String move(String message){
        System.out.println(message);
        return message;
    }
}

