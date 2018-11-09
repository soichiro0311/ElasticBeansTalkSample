package com.example.demo.model;

import java.util.Date;

public class Message {
	private Long id;
    
    private String name;
    
    private String text;
    
    private String remoteAddr;

    private Date createdAt;

    // JPA requirement
    public Message() {}

    public Message(String name, String text, String remoteAddr) {
        this.name = name;
        this.text = text;
        this.remoteAddr = remoteAddr;
    }

    @Override
    public String toString() {
        return String.format("Message[id=%d, name='%s', text='%s']", id, name, text);
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getRemoteAddr() {
        return remoteAddr;
    }

    public void setRemoteAddr(String remoteAddr) {
        this.remoteAddr = remoteAddr;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

}
