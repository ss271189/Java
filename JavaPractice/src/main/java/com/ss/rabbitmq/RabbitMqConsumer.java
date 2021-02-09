package com.ss.rabbitmq;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.DeliverCallback;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

public class RabbitMqConsumer {

    public static void main(String[] args) throws IOException, TimeoutException {
        ConnectionFactory factory=new ConnectionFactory();
        Connection con=factory.newConnection();
        Channel ch=con.createChannel();

        DeliverCallback callback= (consumerTag,deliverCallback) ->{
          String msg=new String(deliverCallback.getBody());
            System.out.println("Mesg"+ msg);
        };

        ch.basicConsume("queue-1",true,callback,(consumerTag)->{});
    }
}
