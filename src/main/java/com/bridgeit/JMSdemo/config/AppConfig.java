package com.bridgeit.JMSdemo.config;


import javax.jms.Queue;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.core.JmsTemplate;

@Configuration
public class AppConfig {
	
	@Value("${activemq.broker-url}")	
	private String connectionURL;

	@Bean
	public Queue queue() {
		return new ActiveMQQueue("StandAlone.queue");
	}
	
	@Bean
	public ActiveMQConnectionFactory activeMQConnectionFactory() {
		ActiveMQConnectionFactory factory=new ActiveMQConnectionFactory();
		factory.setBrokerURL(connectionURL);
		return factory;
	}
	
	
	@Bean
	public JmsTemplate jmsTemplate() {
		return new JmsTemplate(activeMQConnectionFactory());
	}
	
}
