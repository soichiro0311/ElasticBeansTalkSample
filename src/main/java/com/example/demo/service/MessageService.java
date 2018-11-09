package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Message;

@Service
public class MessageService {
    public List<Message> getRecentMessages() {	
    	List<Message> result=new ArrayList<Message>();
    	result.add(new Message("Dog","Dog","Dog"));
    	result.add(new Message("Cat","Cat","Cat"));
    	
        return result;
    }
}
