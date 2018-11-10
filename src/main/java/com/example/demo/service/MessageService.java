package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.data.MessageRepository;
import com.example.demo.model.Message;
import com.example.demo.model.MessageForm;

@Service
public class MessageService {

	@Autowired
	private MessageRepository messageRep;

	public List<Message> getRecentMessages() {
		List<Message> result = messageRep.findAll();

		return result;
	}
	
	public void addMessage(MessageForm messageForm) {
		messageRep.save(Message.toEntity(messageForm));
	}
}
