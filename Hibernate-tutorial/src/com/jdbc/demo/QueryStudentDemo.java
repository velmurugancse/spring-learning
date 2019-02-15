package com.jdbc.demo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.jdbc.Student;

public class QueryStudentDemo {

	public static void main(String[] args) {
		// create session factory
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class)
				.buildSessionFactory();
		// create session object
		Session session = factory.getCurrentSession();
		try {
		// begin transaction
		session.beginTransaction();
		
		// query DB
	List<Student> students = session.createQuery("FROM Student").list();
//		Student myStu=session.get(Student.class, 3);
//		System.out.println(myStu);
		// display DB
		for (Student student1 : students) {
			System.out.println(student1);
		}
		// commit transaction
//		session.getTransaction().commit();
		}
		finally {
			// close factory
			factory.close();
		}
		
	}
}
