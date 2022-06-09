package com.test.doms.configure;

import com.daou.amqp.base.BaseErrorHandlerProcessorConfig;
import com.daou.amqp.component.AmqMessageFactory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.rabbit.listener.api.RabbitListenerErrorHandler;
import org.springframework.amqp.rabbit.support.ListenerExecutionFailedException;
import org.springframework.stereotype.Component;

@Slf4j
@Component("AmqErrorHandler")
public class AmqErrorHandlerProcessorConfig extends BaseErrorHandlerProcessorConfig implements RabbitListenerErrorHandler{

    public AmqErrorHandlerProcessorConfig(AmqMessageFactory amqMessageFactory, RabbitTemplate rabbitTemplate) {
        super(amqMessageFactory, rabbitTemplate);
    }

    @Override
    public Object handleError(Message amqpMessage, org.springframework.messaging.Message<?> message,
                              ListenerExecutionFailedException exception) throws Exception {
        doHandleError(amqpMessage, exception);
        throw exception;
    }
}