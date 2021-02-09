package com.ss.rabbitmq;

import com.rabbitmq.client.BasicProperties;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

public class RabbitMqPublisher {

    public static void main(String[] args) throws IOException, TimeoutException {
        ConnectionFactory factory=new ConnectionFactory();
        Connection con=factory.newConnection();
        Channel ch=con.createChannel();

        ch.basicPublish("","queue-2",null,"My first Message".getBytes());

        ch.close();
        con.close();




    }
}
