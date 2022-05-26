package com.test.doms.configure;

import com.daou.amqp.component.AmqMessageFactory;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.test.common.builder.NodeBuilder;
import org.springframework.amqp.rabbit.AsyncRabbitTemplate;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/* 시스템에 하나만 있으면 되는 설정 */
@Configuration
public class DomsRabbitMQBaseConfig {
    @Bean
    public AmqMessageFactory amqMessageFactory() {
        ObjectMapper objectMapper = new ObjectMapper().registerModule(new JavaTimeModule());
        return new AmqMessageFactory(objectMapper, NodeBuilder.nodeDoms());
    }

    @Bean
    public RabbitTemplate rabbitTemplate(ConnectionFactory connectionFactory) {
        return new RabbitTemplate(connectionFactory);
    }

    @Bean
    public AsyncRabbitTemplate asyncRabbitTemplate(ConnectionFactory connectionFactory) {
        return new AsyncRabbitTemplate(rabbitTemplate(connectionFactory));
    }
}
