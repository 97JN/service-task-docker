package com.example.carservice.annotation;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.Configuration;

@Configuration
@Aspect
public class PointCut {

    @Around("@annotation(com.example.carservice.annotation.AnnotationClass)")
    public Object addCarAdvice(ProceedingJoinPoint joinPoint)
            throws Throwable {
        System.out.println("info before");
        Object proceed = joinPoint.proceed();
        System.out.println("info after");
        return proceed;
}}
