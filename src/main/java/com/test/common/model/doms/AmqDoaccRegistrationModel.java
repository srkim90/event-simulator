package com.test.common.model.doms;

import com.daou.amqp.model.AmqMessage;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class AmqDoaccRegistrationModel extends AmqMessage {
    AddonModel model;

    @Builder
    private AmqDoaccRegistrationModel(AddonModel model) {
        this.model = model;
    }
}
