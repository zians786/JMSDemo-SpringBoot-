package com.bridgeit.JMSdemo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.bridgeit.JMSdemo.service.JMSService;

@RestController
public class JMSController {

	@Autowired
	JMSService jmsService;
	
	
	@GetMapping("/producer/{message}")
	public String producer(@PathVariable String message) {
		jmsService.produce(message);
		return "Producess Successfully..";
	}
	
}
