package com.example.demo.model;

import java.util.Date;

public class OutMessage {
    private String from;

    private String content;

    private Date time;

    public OutMessage() {
    }

    public OutMessage(String content) {
        this.content = content;
    }

    public OutMessage(String from, String content, Date time) {
        this.from = from;
        this.content = content;
        this.time = time;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}
