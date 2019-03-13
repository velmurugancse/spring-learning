package com.springaop.demo.dao;

import org.springframework.stereotype.Component;

import com.springaop.demo.Account;

@Component
public class AccountDAO {
	public void addAccount(Account theAccount,boolean flag) {
	
		System.out.println(getClass() + "doing my db work");
	}
	public void doWork() {
		System.out.println("doing my work");
	}
}
