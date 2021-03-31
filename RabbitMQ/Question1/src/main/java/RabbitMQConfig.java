package com.assignment1.CustomerProd;

import com.rabbitmq.client.ConnectionFactory;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.amqp.rabbit.connection.CachingConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.repository.NoRepositoryBean;

@Configuration
@EnableAutoConfiguration
public class RabbitMQConfig {

    public static final String queueName = "customer_queue";
    public static final String topicExchange = "customer_queue_exchange";
    public static final String routingKey = "customer_routingKey";

    @Autowired
    RabbitTemplate rabbitTemplate;

    @Bean
    public CachingConnectionFactory connectionFactory(){
        CachingConnectionFactory connectionFactory = new CachingConnectionFactory("localhost");
        connectionFactory.setPort(5672);
        connectionFactory.setUsername("guest");
        connectionFactory.setPassword("guest");
        return connectionFactory;
    }

    @Bean
    org.springframework.amqp.core.Queue queue(){
        return new org.springframework.amqp.core.Queue(queueName,false);
    }

    @Bean
    TopicExchange exchange(){
        return new TopicExchange(topicExchange);
    }

    @Bean
    Binding binding(org.springframework.amqp.core.Queue queue, TopicExchange exchange){
        return BindingBuilder.bind(queue).to(exchange).with(queueName);
    }

    @Bean
    public AmqpTemplate amqpTemplate(CachingConnectionFactory connectionFactory){
        System.out.println("Sending the Message");
        rabbitTemplate.setConnectionFactory(connectionFactory);
        return rabbitTemplate;
    }
}





