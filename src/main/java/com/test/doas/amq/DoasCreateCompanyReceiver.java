package com.test.doas.amq;

import com.daou.amqp.base.BaseReceiver;
import com.daou.amqp.component.AmqMessageFactory;
import com.test.common.model.individual.neworder.DoChannelSyncModel;
import com.test.common.model.individual.neworder.DoasCompanyRegisterModel;
import com.test.common.builder.WorkflowBuilder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.AsyncRabbitTemplate;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Component;

@Slf4j
//@Component
public class DoasCreateCompanyReceiver extends BaseReceiver {
    private final DoasCreateCompanyProducer doasCreateCompanyProducer;
    public DoasCreateCompanyReceiver(RabbitTemplate rabbitTemplate, AsyncRabbitTemplate asyncRabbitTemplate, AmqMessageFactory messageFactory, DoasCreateCompanyProducer doasCreateCompanyProducer) {
        super(rabbitTemplate, asyncRabbitTemplate, messageFactory, WorkflowBuilder.createCompany());
        this.doasCreateCompanyProducer = doasCreateCompanyProducer;
    }

//    @RabbitListener(queues = "create_company.doas.company.registration.queue")
//    public void onDoasCompanyRegistration(Message message) {
//        DoasCompanyRegisterModel model = (DoasCompanyRegisterModel) messageFactory.convertToObject(message, DoasCompanyRegisterModel.class);
//        DoChannelSyncModel doChannelSyncModel = new DoChannelSyncModel();
//        doasCreateCompanyProducer.sendDoChannelSyncMessage(model, doChannelSyncModel, null);
//    }
//
//    @RabbitListener(queues = "create_company.doas.failover.queue")
//    public void onDomsFailoverMessageReceived(Message message) {
//        log.info("Error in onDisFailoverMessageReceived");
//    }
}
