package com.springaop.demo.dao;

import org.springframework.stereotype.Component;

@Component
public class MembershipDAO {
public String addMember() {
	System.out.println(getClass()+"doing stuff adding a membership account");
	return "member added";
}
}
