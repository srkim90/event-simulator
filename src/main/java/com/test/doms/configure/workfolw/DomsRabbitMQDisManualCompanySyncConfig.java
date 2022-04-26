package com.test.doms.configure.workfolw;

import com.daou.amqp.base.BaseRabbitMQBindingConfig;
import com.test.common.builder.EventBuilder;
import com.test.common.builder.NodeBuilder;
import com.test.common.builder.WorkflowBuilder;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.MessageListener;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.listener.DirectMessageListenerContainer;
import org.springframework.amqp.rabbit.listener.MessageListenerContainer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/* 각 Workflow에 속하는 메시지 큐들을 생성하는 설정 */
@Configuration
public class DomsRabbitMQDisManualCompanySyncConfig extends BaseRabbitMQBindingConfig {
    public DomsRabbitMQDisManualCompanySyncConfig() {
        super(WorkflowBuilder.doDisManualCompanySync(), NodeBuilder.nodeDoms());
    }

    /* manual dis 회사 동기화 이벤트 응답 수신 큐 생성 */
    @Bean
    public Queue disManualSyncAnswerQueue() {
        return getTopicQueue(EventBuilder.disManualSyncAnswer());
    }

    /* manual dis 회사 동기화 이벤트 응답 수신 큐 바인딩 */
    @Bean
    public Binding disManualSyncAnswerBinding() {
        return getTopicBinding(disManualSyncAnswerQueue(), EventBuilder.disManualSyncAnswer());
    }

    /* Failover Queue 생성 */
    @Bean
    public Queue disDisManualCompanyFailoverQueue() {
        return getFailoverQueue();
    }

    /* Failover Queue 바인딩 */
    @Bean
    public Binding disDisManualCompanyFailoverBinding() {
        return getFailoverBinding(disDisManualCompanyFailoverQueue());
    }


//    @Bean
//    public MessageListenerContainer disManualSyncAnswerListener(ConnectionFactory connectionFactory, MessageListener replicationMessageListener) {
//        DirectMessageListenerContainer container = new DirectMessageListenerContainer();
//        container.setConnectionFactory(connectionFactory);
//        container.setQueueNames(generateEventQueueName(EventBuilder.disManualSyncAnswer()));
//        container.setMessageListener(replicationMessageListener);
//        return container;
//    }
}