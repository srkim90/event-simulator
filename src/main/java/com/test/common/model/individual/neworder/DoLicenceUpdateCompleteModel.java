package com.test.common.model.individual.neworder;

import com.daou.amqp.model.AmqMessage;
import com.test.common.model.doms.LicenseUpdateModel;

public class DoLicenceUpdateCompleteModel extends AmqMessage {
    LicenseUpdateModel request;
}
