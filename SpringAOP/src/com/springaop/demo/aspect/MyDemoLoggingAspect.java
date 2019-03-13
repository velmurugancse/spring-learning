package com.springaop.demo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {
@Before("execution(   * com.springaop.demo.dao.*.*(..))")
//@Before("execution(public void updateAccount())")
public void beforeAddAccountAdvice() {
	System.out.println("\n ======>>>>  executing @before updateaccount advice");
}
}
