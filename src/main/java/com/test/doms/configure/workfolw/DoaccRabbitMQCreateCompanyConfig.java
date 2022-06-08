package com.test.doms.configure.workfolw;

import com.daou.amqp.base.BaseRabbitMQBindingConfig;
import com.test.common.builder.EventBuilder;
import com.test.common.builder.NodeBuilder;
import com.test.common.builder.WorkflowBuilder;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/* 각 Workflow에 속하는 메시지 큐들을 생성하는 설정 */
@Configuration
public class DoaccRabbitMQCreateCompanyConfig extends BaseRabbitMQBindingConfig {
    public DoaccRabbitMQCreateCompanyConfig() {
        super(WorkflowBuilder.createCompany(), NodeBuilder.nodeDoacc());
    }
    

    @Bean
    public Queue doaccCompanyRegistrationQueue() {
        return getTopicQueue(EventBuilder.doaccCompanyRegistrationRequest());
    }

    @Bean
    public Binding doaccCompanyRegistrationBinding() {
        return getTopicBinding(doaccCompanyRegistrationQueue(), EventBuilder.doaccCompanyRegistrationRequest());
    }

    /* Failover Queue 생성 */
    @Bean
    public Queue doaccCreateCompanyFailoverQueue() {
        return getFailoverQueue();
    }

    /* Failover Queue 바인딩 */
    @Bean
    public Binding doaccCreateCompanyFailoverBinding() {
        return getFailoverBinding(doaccCreateCompanyFailoverQueue());
    }


}
