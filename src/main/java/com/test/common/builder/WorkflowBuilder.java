package com.test.common.builder;

import com.daou.amqp.type.AmqWorkflowType;

public class WorkflowBuilder {

    public static AmqWorkflowType doDisManualCompanySync() {
        return AmqWorkflowType.buildWorkflow("DIS_MANUAL_COMPANY_SYNC", "dis.manual.company.sync");
    }

    public static AmqWorkflowType doDisBatchCompanySync() {
        return AmqWorkflowType.buildWorkflow("DIS_BATCH_COMPANY_SYNC", "dis.batch.company.sync");
    }

    public static AmqWorkflowType newOrder() {
        return AmqWorkflowType.buildWorkflow("NEW_ORDER", "new.order");
    }

    public static AmqWorkflowType alterOrder() {
        return AmqWorkflowType.buildWorkflow("ALTER_ORDER", "alter.order");
    }


    public static AmqWorkflowType createCompany() {
        return AmqWorkflowType.buildWorkflow("CREATE_COMPANY", "create.company");
    }

    public static AmqWorkflowType deleteCompany() {
        return AmqWorkflowType.buildWorkflow("DELETE_COMPANY", "delete.company");
    }

    public static AmqWorkflowType alterCompany() {
        return AmqWorkflowType.buildWorkflow("ALTER_COMPANY", "alter.company");
    }

    public static AmqWorkflowType partialRefund() {
        return AmqWorkflowType.buildWorkflow("PARTIAL_REFUND", "partial.refund");
    }

    public static AmqWorkflowType fullRefund() {
        return AmqWorkflowType.buildWorkflow("FULL_REFUND", "full.refund");
    }

    public static AmqWorkflowType domainUpdate() {
        return AmqWorkflowType.buildWorkflow("DOMAIN_UPDATE", "domain.update");
    }

    public static AmqWorkflowType alterBusinessNumber() {
        return AmqWorkflowType.buildWorkflow("ALTER_BUSINESS_NUMBER", "alter.business.number");
    }

    public static AmqWorkflowType expiredCompany() {
        return AmqWorkflowType.buildWorkflow("EXPIRED_COMPANY", "expired.company");
    }

    public static AmqWorkflowType autoPayment() {
        return AmqWorkflowType.buildWorkflow("AUTO_PAYMENT", "auto.payment");
    }

    public static AmqWorkflowType reSyncOrder() {
        return AmqWorkflowType.buildWorkflow("RE_SYNC_ORDER", "re.sync.order");
    }




}
