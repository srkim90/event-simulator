package com.test.doms.amq.receiver;

import com.daou.amqp.base.BaseReceiver;
import com.daou.amqp.component.AmqMessageFactory;
import com.daou.amqp.model.AmqJsonPayloadMessage;
import com.test.common.builder.WorkflowBuilder;
import com.test.common.model.dis.DisManualSyncAnswerModel;
import com.test.common.model.doms.CompanyCreatorModel;
import com.test.doms.amq.producer.DomsCreateCompanyProducer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.AsyncRabbitTemplate;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Slf4j
@Component
public class DomsCreateCompanyReceiver extends BaseReceiver {
    @Autowired
    DomsCreateCompanyProducer producer;

    public DomsCreateCompanyReceiver(RabbitTemplate rabbitTemplate,
                                     AsyncRabbitTemplate asyncRabbitTemplate,
                                     AmqMessageFactory messageFactory) {
        super(rabbitTemplate, asyncRabbitTemplate, messageFactory, WorkflowBuilder.createCompany());
    }

    @RabbitListener(queues = "create_company.doms.dns.registration.answer.queue")
    public void onArecordDnsRegistrationAnswerReceived(Message message) {
        log.info("onArecordDnsRegistrationAnswerReceived");
        DisManualSyncAnswerModel model = (DisManualSyncAnswerModel) messageFactory.convertToObject(message, DisManualSyncAnswerModel.class);
        messageFactory.printMessageLog(message, model.getClass());
        producer.sendDoCreateCompanyMessage(model,
                new CompanyCreatorModel("123e4567-e89b-12d3-a456-426614174000",
                        "eluon",
                        new ArrayList<>(),
                        new ArrayList<>(),
                        false));

    }

    @RabbitListener(queues = "create_company.doms.failover.queue")
    public void onDomsFailoverMessageReceived(Message message) {
        log.info("Error in onDomsFailoverMessageReceived");
    }
}
