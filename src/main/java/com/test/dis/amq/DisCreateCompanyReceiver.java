package com.test.dis.amq;

import com.daou.amqp.base.BaseReceiver;
import com.daou.amqp.component.AmqMessageFactory;
import com.test.common.model.individual.neworder.*;
import com.test.common.builder.WorkflowBuilder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.AsyncRabbitTemplate;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Component;


@Slf4j
//@Component
public class DisCreateCompanyReceiver extends BaseReceiver {
    private final DisCreateCompanyProducer disCreateCompanyProducer;
    public DisCreateCompanyReceiver(RabbitTemplate rabbitTemplate, AsyncRabbitTemplate asyncRabbitTemplate, AmqMessageFactory messageFactory, DisCreateCompanyProducer disCreateCompanyProducer) {
        super(rabbitTemplate, asyncRabbitTemplate, messageFactory, WorkflowBuilder.createCompany());
        this.disCreateCompanyProducer = disCreateCompanyProducer;
    }

    @RabbitListener(queues = "create_company.dis.company.registration.queue")
    public Message onDisCompanyRegistrationMessageReceived(Message message) {
        DisCompanyRegisterModel model = (DisCompanyRegisterModel) messageFactory.convertToObject(message, DisCompanyRegisterModel.class);

        DisCompanySyncModel syncModel = new DisCompanySyncModel();
        DisCompanySyncModel resModel = disCreateCompanyProducer.sendDisCompanySyncMessage(model, syncModel, null);

        model.setAnswer("OK");
        return sendResponseMessage(model);
    }

    @RabbitListener(queues = "create_company.dis.company.sync.queue")
    public Message onDisCompanySyncMessageReceived(Message message) {
        DisCompanySyncModel model = (DisCompanySyncModel) messageFactory.convertToObject(message, DisCompanySyncModel.class);
        String resModel = "OK";
        model.setAnswer(resModel);
        return sendResponseMessage(model);
    }

    @RabbitListener(queues = "create_company.dis.failover.queue")
    public void onDisFailoverMessageReceived(Message message) {
        log.info("Error in onDisFailoverMessageReceived");
    }
}
