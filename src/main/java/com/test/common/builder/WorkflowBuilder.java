package com.test.common.builder;

import com.daou.amqp.type.AmqWorkflowType;

public class WorkflowBuilder {

    public static AmqWorkflowType doDisManualCompanySync() {
        return AmqWorkflowType.buildWorkflow("DIS_MANUAL_COMPANY_SYNC", "dis.manual.company.sync");
    }

    public static AmqWorkflowType doDisBatchCompanySync() {
        return AmqWorkflowType.buildWorkflow("DIS_BATCH_COMPANY_SYNC", "dis.batch.company.sync");
    }

    public static AmqWorkflowType createCompany() {
        return AmqWorkflowType.buildWorkflow("CREATE_COMPANY", "create.company");
    }

}
