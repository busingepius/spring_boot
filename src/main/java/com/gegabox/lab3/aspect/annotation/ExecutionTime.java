package com.gegabox.lab3.annotation;

import org.aspectj.lang.annotation.Aspect;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
public @interface ExecutionTime {
}
