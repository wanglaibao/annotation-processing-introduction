package com.laibao.annotation.processor.client.domain;

import com.laibao.annotation.Builder;

@Builder
public class Person {
    int age;
    String name;

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}
