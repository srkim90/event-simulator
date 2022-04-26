package com.test.doms.configure;

import com.daou.amqp.base.BaseRabbitMQExchangeConfig;
import com.test.common.builder.WorkflowBuilder;
import org.springframework.amqp.core.Exchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/* 각 Workflow에 속하는 Exchange를 생성하는 설정 */
@Configuration
public class DomsRabbitMQExchangeConfig extends BaseRabbitMQExchangeConfig {

    /* Exchange 생성 : CREATE_COMPANY_TOPIC */
    @Bean
    public Exchange createCompanyTopicExchange() {
        return createTopicExchange(WorkflowBuilder.createCompany());
    }

    /* Exchange 생성 : CREATE_COMPANY_FAILOVER */
    @Bean
    public Exchange createCompanyFailoverExchange() {
        return createFailoverExchange(WorkflowBuilder.createCompany());
    }
//
//    /* Exchange 생성 : NEW_ORDER */
//    @Bean
//    public Exchange newOrderTopicExchange() {
//        return createTopicExchange(WorkflowBuilder.newOrder());
//    }
//
//    /* Exchange 생성 : NEW_ORDER */
//    @Bean
//    public Exchange newOrderFailoverExchange() {
//        return createFailoverExchange(WorkflowBuilder.newOrder());
//    }
//
//    /* Exchange 생성 : ALTER_ORDER */
//    @Bean
//    public Exchange alterOrderTopicExchange() {
//        return createTopicExchange(WorkflowBuilder.alterOrder());
//    }
//
//    /* Exchange 생성 : ALTER_ORDER */
//    @Bean
//    public Exchange alterOrderFailoverExchange() {
//        return createFailoverExchange(WorkflowBuilder.alterOrder());
//    }
//
//    /* Exchange 생성 : DELETE_COMPANY */
//    @Bean
//    public Exchange deleteCompanyTopicExchange() {
//        return createTopicExchange(WorkflowBuilder.deleteCompany());
//    }
//
//    /* Exchange 생성 : DELETE_COMPANY */
//    @Bean
//    public Exchange deleteCompanyFailoverExchange() {
//        return createFailoverExchange(WorkflowBuilder.deleteCompany());
//    }
//
//    /* Exchange 생성 : ALTER_COMPANY */
//    @Bean
//    public Exchange alterCompanyTopicExchange() {
//        return createTopicExchange(WorkflowBuilder.alterCompany());
//    }
//
//    /* Exchange 생성 : ALTER_COMPANY */
//    @Bean
//    public Exchange alterCompanyFailoverExchange() {
//        return createFailoverExchange(WorkflowBuilder.alterCompany());
//    }
//
//    /* Exchange 생성 : PARTIAL_REFUND */
//    @Bean
//    public Exchange partialRefundTopicExchange() {
//        return createTopicExchange(WorkflowBuilder.partialRefund());
//    }
//
//    /* Exchange 생성 : PARTIAL_REFUND */
//    @Bean
//    public Exchange partialRefundFailoverExchange() {
//        return createFailoverExchange(WorkflowBuilder.partialRefund());
//    }
//
//    /* Exchange 생성 : FULL_REFUND */
//    @Bean
//    public Exchange fullRefundTopicExchange() {
//        return createTopicExchange(WorkflowBuilder.fullRefund());
//    }
//
//    /* Exchange 생성 : FULL_REFUND */
//    @Bean
//    public Exchange fullRefundFailoverExchange() {
//        return createFailoverExchange(WorkflowBuilder.fullRefund());
//    }
//
//    /* Exchange 생성 : DOMAIN_UPDATE */
//    @Bean
//    public Exchange domainUpdateTopicExchange() {
//        return createTopicExchange(WorkflowBuilder.domainUpdate());
//    }
//
//    /* Exchange 생성 : DOMAIN_UPDATE */
//    @Bean
//    public Exchange domainUpdateFailoverExchange() {
//        return createFailoverExchange(WorkflowBuilder.domainUpdate());
//    }
//
//    /* Exchange 생성 : ALTER_BUSINESS_NUMBER */
//    @Bean
//    public Exchange alterBusinessNumberTopicExchange() {
//        return createTopicExchange(WorkflowBuilder.alterBusinessNumber());
//    }
//
//    /* Exchange 생성 : ALTER_BUSINESS_NUMBER */
//    @Bean
//    public Exchange alterBusinessNumberFailoverExchange() {
//        return createFailoverExchange(WorkflowBuilder.alterBusinessNumber());
//    }
//
//    /* Exchange 생성 : EXPIRED_COMPANY */
//    @Bean
//    public Exchange expiredCompanyTopicExchange() {
//        return createTopicExchange(WorkflowBuilder.expiredCompany());
//    }
//
//    /* Exchange 생성 : EXPIRED_COMPANY */
//    @Bean
//    public Exchange expiredCompanyFailoverExchange() {
//        return createFailoverExchange(WorkflowBuilder.expiredCompany());
//    }
//
//    /* Exchange 생성 : AUTO_PAYMENT */
//    @Bean
//    public Exchange autoPaymentTopicExchange() {
//        return createTopicExchange(WorkflowBuilder.autoPayment());
//    }
//
//    /* Exchange 생성 : AUTO_PAYMENT */
//    @Bean
//    public Exchange autoPaymentFailoverExchange() {
//        return createFailoverExchange(WorkflowBuilder.autoPayment());
//    }
//
//    /* Exchange 생성 : RE_SYNC_ORDER */
//    @Bean
//    public Exchange reSyncOrderTopicExchange() {
//        return createTopicExchange(WorkflowBuilder.reSyncOrder());
//    }
//
//    /* Exchange 생성 : RE_SYNC_ORDER */
//    @Bean
//    public Exchange reSyncOrderFailoverExchange() {
//        return createFailoverExchange(WorkflowBuilder.reSyncOrder());
//    }

    @Bean
    public Exchange doDisBatchCompanySyncTopicExchange() {
        return createTopicExchange(WorkflowBuilder.doDisBatchCompanySync());
    }

    @Bean
    public Exchange doDisBatchCompanySyncFailoverExchange() {
        return createFailoverExchange(WorkflowBuilder.doDisBatchCompanySync());
    }

    @Bean
    public Exchange doDisManualCompanySyncTopicExchange() {
        return createTopicExchange(WorkflowBuilder.doDisManualCompanySync());
    }

    @Bean
    public Exchange doDisManualCompanySyncFailoverExchange() {
        return createFailoverExchange(WorkflowBuilder.doDisManualCompanySync());
    }

}
