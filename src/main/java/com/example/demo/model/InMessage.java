package com.example.demo.model;

import java.util.Date;

/**
 * 定义的消息进入模型
 */
public class InMessage {

    private String from;

    private String to;

    private String content;

    private Date time;

    public InMessage() {
    }

    public InMessage(String content) {
        this.content = content;
    }

    public InMessage(String from, String to, String content, Date time) {
        this.from = from;
        this.to = to;
        this.content = content;
        this.time = time;
    }

    public String getFrom() {
        return from;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
