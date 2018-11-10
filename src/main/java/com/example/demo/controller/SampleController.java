package com.example.demo.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.model.Message;
import com.example.demo.model.MessageForm;
import com.example.demo.service.MessageService;

@Controller
public class SampleController {
	
	@Autowired
	private MessageService service;

	@GetMapping("/messages")
	public String messages(Model model) {
		model.addAttribute("messageForm", new MessageForm());

		List<Message> messages = service.getRecentMessages();
		model.addAttribute("messages", messages);

		return "index";
	}

	@PostMapping("/add")
	public String messagesPost(Model model, @Valid MessageForm messageForm, BindingResult bindingResult,
			HttpServletRequest request) {
		if (!bindingResult.hasErrors()) {
			service.addMessage(messageForm);
			List<Message> messages = service.getRecentMessages();
			model.addAttribute("messages", messages);
		}
		return "redirect:/messages";
	}
}
