package com.test.doms.configure;

import com.daou.amqp.component.AmqMessageFactory;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.test.common.builder.NodeBuilder;
import com.test.doms.amq.config.CommonErrorHandler;
import com.test.doms.configure.interceptor.AmqAfterReceivePostProcessors;
import com.test.doms.configure.interceptor.AmqBeforePublishPostProcessors;
import com.test.doms.configure.interceptor.AmqCorrelationDataPostProcessor;
import org.springframework.amqp.rabbit.AsyncRabbitTemplate;
import org.springframework.amqp.rabbit.config.SimpleRabbitListenerContainerFactory;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.boot.autoconfigure.amqp.SimpleRabbitListenerContainerFactoryConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.ErrorHandler;

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
        RabbitTemplate rabbitTemplate = new RabbitTemplate(connectionFactory);
        rabbitTemplate.setAfterReceivePostProcessors(new AmqAfterReceivePostProcessors());
        rabbitTemplate.setBeforePublishPostProcessors(new AmqBeforePublishPostProcessors());
        rabbitTemplate.setCorrelationDataPostProcessor(new AmqCorrelationDataPostProcessor());
        return rabbitTemplate;
    }

    @Bean
    public ErrorHandler errorHandler() {
        return new CommonErrorHandler();
    }

    @Bean
    public AsyncRabbitTemplate asyncRabbitTemplate(ConnectionFactory connectionFactory) {
        return new AsyncRabbitTemplate(rabbitTemplate(connectionFactory));
    }

    @Bean
    public SimpleRabbitListenerContainerFactory listenerContainerFactory(ConnectionFactory connectionFactory,
                                                                         SimpleRabbitListenerContainerFactoryConfigurer configurer) {
        SimpleRabbitListenerContainerFactory factory = new SimpleRabbitListenerContainerFactory();
        configurer.configure(factory, connectionFactory);
        factory.setErrorHandler(errorHandler());
        return factory;
    }
}
