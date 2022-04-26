package com.test.doms.amq.producer;

import com.daou.amqp.base.BaseProducer;
import com.daou.amqp.component.AmqMessageFactory;
import com.test.common.builder.WorkflowBuilder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.AsyncRabbitTemplate;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Component;


@Slf4j
@Component
public class DomsFullRefundProducer extends BaseProducer {
    public DomsFullRefundProducer(RabbitTemplate rabbitTemplate,
                                    AsyncRabbitTemplate asyncRabbitTemplate,
                                    AmqMessageFactory messageFactory) {
        super(rabbitTemplate, asyncRabbitTemplate, messageFactory, WorkflowBuilder.fullRefund());
    }
}
