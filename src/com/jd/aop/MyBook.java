package com.jd.aop;

import org.aspectj.lang.ProceedingJoinPoint;

public class MyBook {
	
	public void before1(){
		System.out.println("before1....");
	}
	
	public void after1(){
		System.out.println("after returning....");
	}
	
	public void around1(ProceedingJoinPoint pjp) throws Throwable{
		
		System.out.println("前环绕。。。。");
		pjp.proceed();
		System.out.println("后环绕。。。。");
		
	}
}
