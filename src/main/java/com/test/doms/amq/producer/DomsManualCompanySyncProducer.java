package com.test.doms.amq.producer;

import com.daou.amqp.base.BaseProducer;
import com.daou.amqp.component.AmqMessageFactory;
import com.daou.amqp.type.AmqNodeType;
import com.test.common.builder.EventBuilder;
import com.test.common.builder.NodeBuilder;
import com.test.common.builder.WorkflowBuilder;
import com.test.common.model.dis.DisManualSyncRequestModel;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.AsyncRabbitTemplate;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class DomsManualCompanySyncProducer extends BaseProducer {
    private final AmqNodeType nodeType = NodeBuilder.nodeDoms();

    public DomsManualCompanySyncProducer(RabbitTemplate rabbitTemplate,
                                        AsyncRabbitTemplate asyncRabbitTemplate,
                                        AmqMessageFactory messageFactory) {
        super(rabbitTemplate, asyncRabbitTemplate, messageFactory, WorkflowBuilder.doDisManualCompanySync());
    }
    public void sendDisManualSyncRequestMessage(DisManualSyncRequestModel message) {
        sendMessage(EventBuilder.disManualSyncRequest(), message, null, nodeType);
    }
}
