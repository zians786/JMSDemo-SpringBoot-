package com.bridgeit.JMSdemo.service;

import javax.jms.Queue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

@Service
public class JMSService {

	@Autowired
	Queue queue;
	
	@Autowired
	JmsTemplate jmsTemplate;
	
	public void produce(String message){
		jmsTemplate.convertAndSend(queue,message);
	}
	
	
}
