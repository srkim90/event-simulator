package com.test.common.model.dis;

import com.daou.amqp.model.AmqMessage;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class DisManualSyncApiAnswerModel extends AmqMessage {
   private ClientSyncCompanyModel payload;

}
