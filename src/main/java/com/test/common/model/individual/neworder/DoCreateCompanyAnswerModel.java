package com.test.common.model.individual.neworder;

import com.daou.amqp.model.AmqMessage;
import com.test.common.model.daouoffice.CompanyCreatedInfo;
import com.test.common.model.doms.CompanyCreatorModel;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DoCreateCompanyAnswerModel extends AmqMessage {

    private CompanyCreatorModel request;
    private CompanyCreatedInfo answer;
}
