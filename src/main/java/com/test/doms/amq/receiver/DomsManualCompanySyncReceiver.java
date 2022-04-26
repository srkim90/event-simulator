package com.test.doms.amq.receiver;

import com.daou.amqp.base.BaseReceiver;
import com.daou.amqp.component.AmqMessageFactory;
import com.test.common.builder.WorkflowBuilder;
import com.test.common.model.dis.DisManualSyncAnswerModel;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;
import org.springframework.amqp.rabbit.AsyncRabbitTemplate;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.rabbit.listener.DirectMessageListenerContainer;
import org.springframework.amqp.rabbit.listener.MessageListenerContainer;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class DomsManualCompanySyncReceiver extends BaseReceiver {
    public DomsManualCompanySyncReceiver(RabbitTemplate rabbitTemplate,
                                         AsyncRabbitTemplate asyncRabbitTemplate,
                                         AmqMessageFactory messageFactory) {
        super(rabbitTemplate, asyncRabbitTemplate, messageFactory, WorkflowBuilder.doDisManualCompanySync());


    }


    @RabbitListener(queues = "dis_manual_company_sync.doms.dis.manual.sync.answer.queue")
    public void onDisManualSyncAnswerReceived(Message message) {
        log.info("onDisManualSyncAnswerReceived");
        DisManualSyncAnswerModel model = (DisManualSyncAnswerModel) messageFactory.convertToObject(message, DisManualSyncAnswerModel.class);
        messageFactory.printMessageLog(message, model.getClass());
    }

    @RabbitListener(queues = "dis_manual_company_sync.doms.failover.queue")
    public void onDisManualSyncFailoverReceived(Message message) {

        log.info("Error in onDisManualSyncFailoverReceived");
    }

}
