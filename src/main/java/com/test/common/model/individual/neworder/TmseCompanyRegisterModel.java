package com.test.common.model.individual.neworder;


import com.daou.amqp.model.AmqMessage;
import com.test.common.model.doms.DomainSaveModel;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TmseCompanyRegisterModel extends AmqMessage {
    DomainSaveModel request;
    String answer;
}
