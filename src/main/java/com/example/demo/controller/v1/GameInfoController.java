package com.example.demo.controller.v1;


import com.example.demo.model.InMessage;
import com.example.demo.model.OutMessage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;

public class GameInfoController {

    @MessageMapping("/v1/chat")// 根据这个路径找到这个方法，消息进来了
    @SendTo("/topic/game_chat")// 网页订阅这个topic就会收到返回的消息了
    public OutMessage gameInfo(InMessage message){
        return new OutMessage(message.getContent());
    }

}
