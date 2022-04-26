package com.test.doas.amq;


import com.daou.amqp.base.BaseProducer;
import com.daou.amqp.component.AmqMessageFactory;
import com.daou.amqp.model.AmqMessage;
import com.daou.amqp.model.AmqRoutingInfo;
import com.test.common.model.individual.neworder.DoChannelSyncModel;
import com.test.common.builder.EventBuilder;
import com.test.common.builder.WorkflowBuilder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.AsyncRabbitTemplate;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Component;


@Slf4j
@Component
public class DoasCreateCompanyProducer extends BaseProducer {

    public DoasCreateCompanyProducer(RabbitTemplate rabbitTemplate, AsyncRabbitTemplate asyncRabbitTemplate, AmqMessageFactory messageFactory) {
        super(rabbitTemplate, asyncRabbitTemplate, messageFactory, WorkflowBuilder.createCompany());
    }

    public void sendDoChannelSyncMessage(AmqMessage prevMessage, DoChannelSyncModel requestModel, AmqRoutingInfo requestRoutingInfo) {
        this.sendNextMessage(EventBuilder.doChannelSync(),
                prevMessage,
                requestModel,
                requestRoutingInfo);
    }


}
