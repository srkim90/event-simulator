package com.test.common.model.individual.neworder;

import com.daou.amqp.model.AmqMessage;
import com.test.common.model.doms.CompanyCreatorModel;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DisCompanyRegisterModel extends AmqMessage {
    private CompanyCreatorModel request;
    private String answer;
}
