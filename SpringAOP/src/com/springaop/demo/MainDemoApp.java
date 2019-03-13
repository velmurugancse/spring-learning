package com.springaop.demo;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import com.springaop.demo.dao.AccountDAO;
import com.springaop.demo.dao.MembershipDAO;
@Component
public class MainDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
		AccountDAO accountDAO = context.getBean(AccountDAO.class, "accountDAO");
		MembershipDAO membershipDAO=context.getBean(MembershipDAO.class,"membershipDAO");
//		MainDemoApp demo=context.getBean(MainDemoApp.class,"mainDemoApp");
		MainDemoApp demo=new MainDemoApp();
		Account account=new Account();
		demo.addDummy();
		accountDAO.doWork();
		accountDAO.addAccount(account,true);
		membershipDAO.addMember();
		context.close();

	}
	protected void addDummy() {
		System.out.println("dummy");
	}

}
