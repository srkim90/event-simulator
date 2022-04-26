package com.test.doms.configure.workfolw;

import com.daou.amqp.base.BaseRabbitMQBindingConfig;
import com.test.common.builder.NodeBuilder;
import com.test.common.builder.WorkflowBuilder;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.Queue;


/* 각 Workflow에 속하는 메시지 큐들을 생성하는 설정 */
//@Configuration
public class DomsRabbitMQFullRefundConfig  extends BaseRabbitMQBindingConfig {
    public DomsRabbitMQFullRefundConfig() {
        super(WorkflowBuilder.fullRefund(), NodeBuilder.nodeDoms());
    }

    /* Failover Queue 생성 */
    @Bean
    public Queue domsFullRefundFailoverQueue() {
        return getFailoverQueue();
    }

    /* Failover Queue 바인딩 */
    @Bean
    public Binding domsFullRefundFailoverBinding() {
        return getFailoverBinding(domsFullRefundFailoverQueue());
    }

}
