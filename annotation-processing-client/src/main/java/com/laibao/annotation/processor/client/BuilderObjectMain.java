package com.laibao.annotation.processor.client;

import com.laibao.annotation.processor.client.domain.Order;
import com.laibao.annotation.processor.builder.pattern.OrderBuilder;

public class BuilderObjectMain {

    public static void main(String[] args) {
        Order build = new OrderBuilder().buildId(2).buildAddTime(System.currentTimeMillis()).build();
        System.out.println(build);
    }
}
