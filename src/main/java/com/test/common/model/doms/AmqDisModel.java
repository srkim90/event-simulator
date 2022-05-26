package com.test.common.model.doms;

import com.daou.amqp.model.AmqMessage;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class AmqDisModel extends AmqMessage {
    DisModel model;

    @Builder
    private AmqDisModel(DisModel model) {
        this.model = model;
    }
}
