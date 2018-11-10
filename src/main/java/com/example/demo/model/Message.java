package com.example.demo.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Message {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
    
	@Column(name="name")
    private String name;
    
	@Column(name="text")
    private String text;
    
	@Column(name="created_date")
    private Date createdDate;

	public static Message toEntity(MessageForm messageForm) {
    	Message entity = new Message();
    	entity.setName(messageForm.getName());
    	entity.setText(messageForm.getText());
    	entity.setCreatedDate(new Date());
    	return entity;
    }
	
    @Override
    public String toString() {
        return String.format("Message[id=%d, name='%s', text='%s']", id, name, text);
    }
}
