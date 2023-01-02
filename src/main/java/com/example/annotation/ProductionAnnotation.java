package com.example.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.springframework.context.annotation.Profile;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Profile("production")
public @interface ProductionAnnotation {
	
}
