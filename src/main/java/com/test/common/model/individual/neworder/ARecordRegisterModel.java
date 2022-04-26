package com.test.common.model.individual.neworder;

import com.daou.amqp.model.AmqMessage;
import com.test.common.model.dags.ArecordResModel;
import com.test.common.model.doms.ArecordModel;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ARecordRegisterModel extends AmqMessage {
    ArecordModel request;
    ArecordResModel answer;
}
