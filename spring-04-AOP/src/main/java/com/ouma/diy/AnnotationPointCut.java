package com.ouma.diy;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class AnnotationPointCut {
    @Before("execution(* com.ouma.service.UserServiceImpl.*(..))")
    public void before(){
        System.out.println("执行前222");
    }
@After("execution(* com.ouma.service.UserServiceImpl.*(..))")
    public void after(){
        System.out.println("执行后222");
    }

    public void around(){

    }
}
