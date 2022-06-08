package com.test.common.builder;

import com.daou.amqp.type.AmqNodeType;

public class NodeBuilder {
    public static AmqNodeType nodeDags() {
        return AmqNodeType.buildNode("dags");
    }

    public static AmqNodeType nodeDis() {
        return AmqNodeType.buildNode("dis");
    }

    public static AmqNodeType nodeDoas() {
        return AmqNodeType.buildNode("doas");
    }

    public static AmqNodeType nodeDoms() {
        return AmqNodeType.buildNode("doms");
    }

    public static AmqNodeType nodePay() {
        return AmqNodeType.buildNode("Pay");
    }

    public static AmqNodeType nodeDo() {
        return AmqNodeType.buildNode("do");
    }

    public static AmqNodeType nodeDoacc() {
        return AmqNodeType.buildNode("doacc");
    }
}
