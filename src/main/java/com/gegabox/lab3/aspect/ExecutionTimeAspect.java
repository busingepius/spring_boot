package com.gegabox.lab3.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Aspect
//@Component
@Configuration
public class ExecutionTimeAspect {

    @Pointcut("@annotation(com.gegabox.lab3.aspect.annotation.ExecutionTime)")
    public void executionTimeAnnotation() {
    }

    //    @Around("execution(public void com.gegabox.lab3.controller.UserController.*(String, int))")
    @Around("executionTimeAnnotation()")//--> can use ProceedingJoinPoint
    public Object calculateExecutionTime(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        long start = System.nanoTime();
        var result = proceedingJoinPoint.proceed();
        long finish = System.nanoTime();
        System.out.println(proceedingJoinPoint.getSignature().getName() + " takes ns: " + (finish - start));
        return result;
    }

//    @AfterReturning(
//            pointcut = "execution(public void com.gegabox.lab3.controller.UserController.*(String, int))",
//            returning = "retValue")// ------> after returning cannot have an exception
//    @AfterThrowing(pointcut = "execution(protected * com.gegabox.lab3.controller.UserController.*(..))", throwing = "exception")
//    public Object calculateExecutionTimeA(JoinPoint joinPoint, int retValue,Exception exception) throws Throwable {
//        long start = System.nanoTime();
//        var result = joinPoint.getClass();
//        long finish = System.nanoTime();
//        System.out.println(joinPoint.getSignature().getName() + " takes ns: " + (finish - start));
//        System.out.println(exception.getMessage());
//        System.out.println(Arrays.toString(joinPoint.getArgs()));
//        return result;
//    }
}
