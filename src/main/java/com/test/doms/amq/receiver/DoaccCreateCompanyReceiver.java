package com.test.doms.amq.receiver;

import com.daou.amqp.base.BaseReceiver;
import com.daou.amqp.component.AmqMessageFactory;
import com.test.common.builder.WorkflowBuilder;
import com.test.common.model.dis.DisManualSyncAnswerModel;
import com.test.common.model.doms.CompanyCreatorModel;
import com.test.doms.amq.producer.DomsCreateCompanyProducer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.AsyncRabbitTemplate;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.rabbit.support.ListenerExecutionFailedException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Slf4j
@Component
public class DoaccCreateCompanyReceiver extends BaseReceiver {
    @Autowired
    DomsCreateCompanyProducer producer;

    public DoaccCreateCompanyReceiver(RabbitTemplate rabbitTemplate,
                                      AsyncRabbitTemplate asyncRabbitTemplate,
                                      AmqMessageFactory messageFactory) {
        super(rabbitTemplate, asyncRabbitTemplate, messageFactory, WorkflowBuilder.createCompany());
    }

    @RabbitListener(queues = "create_company.doacc.company.registration.request.queue", errorHandler = "1")
    public void onDoaccCompanyRegistrationReceived(Message message) throws Exception {
        log.info("onDoaccCompanyRegistrationReceived");
        String aaa = null;
        aaa.length();
    }

    @RabbitListener(queues = "create_company.doms.failover.queue")
    public void onDoaccFailoverMessageReceived(Message message) {
        log.info("Error in onDoaccFailoverMessageReceived");
    }
}
