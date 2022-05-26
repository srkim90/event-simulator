package com.test.doms.configure.workfolw;

import com.daou.amqp.base.BaseRabbitMQBindingConfig;
import com.test.common.builder.EventBuilder;
import com.test.common.builder.NodeBuilder;
import com.test.common.builder.WorkflowBuilder;
import org.springframework.amqp.core.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/* 각 Workflow에 속하는 메시지 큐들을 생성하는 설정 */
@Configuration
public class DomsRabbitMQCreateCompanyConfig extends BaseRabbitMQBindingConfig {
    public DomsRabbitMQCreateCompanyConfig() {
        super(WorkflowBuilder.createCompany(), NodeBuilder.nodeDoms());
    }


    @Bean
    public Queue arecordDnsRegistrationAnswerQueue() {
        return getTopicQueue(EventBuilder.arecordDnsRegistrationAnswer());
    }

    @Bean
    public Binding arecordDnsRegistrationAnswerBinding() {
        return getTopicBinding(arecordDnsRegistrationAnswerQueue(), EventBuilder.arecordDnsRegistrationAnswer());
    }

    /* Failover Queue 생성 */
    @Bean
    public Queue domsCreateCompanyFailoverQueue() {
        return getFailoverQueue();
    }

    /* Failover Queue 바인딩 */
    @Bean
    public Binding domsCreateCompanyFailoverBinding() {
        return getFailoverBinding(domsCreateCompanyFailoverQueue());
    }


}
