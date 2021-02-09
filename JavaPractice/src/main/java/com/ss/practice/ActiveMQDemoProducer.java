package com.ss.practice;

import org.apache.activemq.ActiveMQConnectionFactory;

import javax.jms.*;

public class ActiveMQDemoProducer {

    public static void main(String[] args) throws JMSException {
        Connection connection = null;
        ConnectionFactory connectionFactory = new ActiveMQConnectionFactory(
                "tcp://localhost:61616");

        connection = connectionFactory.createConnection();
        Session session = connection.createSession(false,
                Session.AUTO_ACKNOWLEDGE);
        Queue queue = session.createQueue("customerQueue");
        String payload = "Important Task";
        Message msg = session.createTextMessage(payload);
        MessageProducer producer = session.createProducer(queue);
        System.out.println("Sending text '" + payload + "'");
        producer.send(msg);

        // Consumer
        MessageConsumer consumer = session.createConsumer(queue);
        connection.start();
        TextMessage textMsg = (TextMessage) consumer.receive();
        System.out.println(textMsg);
        System.out.println("Received: " + textMsg.getText());
        session.close();

    }
}
