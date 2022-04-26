package com.test.dis.amq;


import com.daou.amqp.base.BaseProducer;
import com.daou.amqp.component.AmqMessageFactory;
import com.daou.amqp.model.AmqMessage;
import com.daou.amqp.model.AmqRoutingInfo;
import com.test.common.model.individual.neworder.DisCompanySyncModel;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.AsyncRabbitTemplate;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Component;

import static com.test.common.builder.WorkflowBuilder.*;
import static com.test.common.builder.EventBuilder.*;

@Slf4j
//@Component
public class DisCreateCompanyProducer extends BaseProducer {

    public DisCreateCompanyProducer(RabbitTemplate rabbitTemplate, AsyncRabbitTemplate asyncRabbitTemplate, AmqMessageFactory messageFactory) {
        super(rabbitTemplate, asyncRabbitTemplate, messageFactory, createCompany());
    }

    /* 1. DO DIS 동기화 수행
    -> 트렌젝션 진행
    -> 응답 데이터 수신 방법 : 함수 리턴 (동기)
   * */
    public DisCompanySyncModel sendDisCompanySyncMessage(AmqMessage prevMessage, DisCompanySyncModel model, AmqRoutingInfo routingInfo) {
        return (DisCompanySyncModel)sendNextMessageAndWaitResponse(disCompanySync(),
                prevMessage,
                model,
                routingInfo);
    }

}
