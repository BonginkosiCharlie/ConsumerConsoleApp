package com.bonginkosi.app;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

public class App {
    public static void main( String[] args ) throws IOException, TimeoutException {
        ConnectionFactory factory = new ConnectionFactory();
        
        Connection connection = factory.newConnection();
    	Channel channel = connection.createChannel();
    	channel.queueDeclare("send-name-queue", false, false, false, null);
    	
    	channel.basicConsume("send-name-queue", true, (consumerTag, message) -> {
    		String msg = new String(message.getBody(), "UTF-8");
    		System.out.println("Hello " + msg.substring(msg.indexOf(",") + 1).replaceAll(" ", "") + ", I am your father!");
    	}, consumerTag -> {});
    }
}
