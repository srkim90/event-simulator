package com.test.doas.configure;

import com.daou.amqp.base.BaseRabbitMQBindingConfig;
import com.daou.amqp.type.AmqNodeType;
import com.test.common.builder.EventBuilder;
import com.test.common.builder.NodeBuilder;
import com.test.common.builder.WorkflowBuilder;
import org.springframework.amqp.core.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class DoasRabbitMQConfig extends BaseRabbitMQBindingConfig {

    public DoasRabbitMQConfig() {
        super(WorkflowBuilder.createCompany(), NodeBuilder.nodeDoas());
    }
//
//    @Bean
//    public Queue doasCompanyRegistrationQueue() {
//        return QueueBuilder.durable(generateEventQueueName(EventBuilder.doasCompanyRegistration()))
//                .deadLetterExchange(generateFailoverExchangeName())
//                .build();
//    }
//
//    @Bean
//    public Binding doasCompanyRegistrationBinding() {
//        return BindingBuilder.bind(doasCompanyRegistrationQueue())
//                .to(new TopicExchange(generateTopicExchangeName()))
//                .with(EventBuilder.doasCompanyRegistration().getRoutingKey());
//    }
//
//    @Bean
//    public Queue doasFailoverQueue() {
//        return QueueBuilder.durable(getFailoverQueueName())
//                .build();
//    }
//
//    @Bean
//    public Binding doasFailoverBinding() {
//        return BindingBuilder.bind(doasFailoverQueue())
//                .to(new FanoutExchange (generateFailoverExchangeName()));
//    }z

}
