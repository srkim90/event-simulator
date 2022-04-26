package com.test.common.model.individual.neworder;

import com.daou.amqp.model.AmqMessage;
import com.test.common.model.dis.DisCompanyModel;
import lombok.Setter;

@Setter
public class DisCompanySyncModel extends AmqMessage {
        DisCompanyModel request;
        String answer;
}
