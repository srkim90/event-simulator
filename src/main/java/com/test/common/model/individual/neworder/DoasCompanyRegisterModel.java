package com.test.common.model.individual.neworder;

import com.daou.amqp.model.AmqMessage;
import com.test.common.model.doms.DoasLicenseModel;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class DoasCompanyRegisterModel extends AmqMessage {
    List<DoasLicenseModel> request;
    String answer;
}
