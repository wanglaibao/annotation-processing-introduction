package com.laibao.annotation.processor.client;


import com.laibao.annotation.processor.client.domain.Order;
import com.laibao.annotation.processor.client.domain.Person;
import com.laibao.annotation.processor.client.domain.PersonBuilder;

public class BuilderObjectMain {

    public static void main(String[] args) {
        Order build = new com.laibao.annotation.processor.builder.pattern.OrderBuilder().buildId(2).buildAddTime(System.currentTimeMillis()).build();
        System.out.println(build);
        Person person = PersonBuilder.having().name("金戈").age(1000).get();
        System.out.println(person.getAge());
        System.out.println(person.getName());

    }
}
