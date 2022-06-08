package com.test.doms.configure.interceptor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.AmqpException;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessagePostProcessor;

@Slf4j
public class AmqAfterReceivePostProcessors implements MessagePostProcessor {


    @Override
    public Message postProcessMessage(Message message) throws AmqpException {
        log.info("AmqAfterReceivePostProcessors : postProcessMessage");
        return message;
    }
}