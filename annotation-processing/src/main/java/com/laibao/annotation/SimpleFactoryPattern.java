package com.laibao.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Annotation to indicate classes that are part of a certain factory pattern
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.CLASS)
public @interface SimpleFactoryPattern {

    /**
     * The name of the factory
     */
    Class type();

    /**
     * The identify name for determining which class should be instantiated
     */
    String name();
}
