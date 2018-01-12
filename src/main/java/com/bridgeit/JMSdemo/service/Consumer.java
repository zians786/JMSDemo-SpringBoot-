package com.bridgeit.JMSdemo.service;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class Consumer {

	@JmsListener(destination="StandAlone.queue")
	public void consume(String message) {
		System.out.println("Recieved: "+message);
	}
	
}
