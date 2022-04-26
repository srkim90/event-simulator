package com.test.dis.configure;

import com.daou.amqp.base.BaseRabbitMQBindingConfig;
import com.daou.amqp.type.AmqNodeType;
import com.daou.amqp.type.AmqWorkflowType;
import com.test.common.builder.EventBuilder;
import com.test.common.builder.NodeBuilder;
import com.test.common.builder.WorkflowBuilder;
import org.springframework.amqp.core.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import static com.daou.amqp.type.AmqEventType.*;


@Configuration
public class DisCreateCompanyConfig extends BaseRabbitMQBindingConfig {

    public DisCreateCompanyConfig() {
        super(WorkflowBuilder.createCompany(), NodeBuilder.nodeDis());
    }

//    @Bean
//    public Queue disCompanyRegisterQueue() {
//        return getTopicQueue(EventBuilder.disCompanyRegistration());
//    }
//
//    @Bean
//    public Binding disCompanyRegisterBinding() {
//        return getTopicBinding(disCompanyRegisterQueue(), EventBuilder.disCompanyRegistration());
//    }
//
//    @Bean
//    public Queue disCompanySyncQueue() {
//        return getTopicQueue(EventBuilder.disCompanySync());
//    }
//
//    @Bean
//    public Binding disCompanySyncBinding() {
//        return getTopicBinding(disCompanyRegisterQueue(), EventBuilder.disCompanySync());
//    }
//
//
//    /* Failover Queue 생성 */
//    @Bean
//    public Queue disFailoverQueue() {
//        return getFailoverQueue();
//    }
//
//    /* Failover Queue 바인딩 */
//    @Bean
//    public Binding disFailoverBinding() {
//        return getFailoverBinding(disFailoverQueue());
//    }

}
