package com.jdbc.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.jdbc.Student;

public class CreateStudent {

	public static void main(String[] args) {
		// create session factory
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class)
				.buildSessionFactory();
		// create session
		Session session = factory.getCurrentSession();
		try {
			// create an object
			Student student = new Student("somasundaram", "B", "somasundaram@gmail.com");
			Student student2 = new Student("raja", "B", "rajab@gmail.com");

			// begin a transaction
			session.beginTransaction();
			// save an obj
			session.save(student);
//			int id = (Integer) session.save(student2);
			session.save(student2);
//			System.out.println(id);
			// commit transaction
			System.out.println("done");
			session.getTransaction().commit();
		} finally {
			factory.close();
		}
	}

}
