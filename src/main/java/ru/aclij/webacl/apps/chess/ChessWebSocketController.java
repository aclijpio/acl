package ru.aclij.webacl.apps.chess;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;

@Controller
public class ChessWebSocketController {

    @MessageMapping("/move")
    //@SendTo("/topic/response")
    public void move(ChessMove move){
        System.out.println(move.target());
        System.out.println(move.source());  
        //messagingTemplate.convertAndSendToUser(principal.getName(), "/topic/send", "1");
        // //return move;
    }
    @MessageMapping("/request/start")
    @SendTo("/topic/send")
    public boolean start(){

        return true;
    }
    @MessageMapping("/request/surrender")
    @SendTo("/topic/send")
    public boolean surrender(){

        return true;
    }
}
