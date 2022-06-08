package com.test.doms.configure.interceptor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.AmqpException;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessagePostProcessor;
import org.springframework.amqp.rabbit.connection.CorrelationData;
import org.springframework.amqp.rabbit.core.CorrelationDataPostProcessor;

@Slf4j
public class AmqCorrelationDataPostProcessor implements CorrelationDataPostProcessor {

    @Override
    public CorrelationData postProcess(Message message, CorrelationData correlationData) {
        log.info("AmqCorrelationDataPostProcessor : postProcessMessage");
        return null;
    }
}