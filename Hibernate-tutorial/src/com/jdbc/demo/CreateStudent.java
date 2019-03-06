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
			Student s = new Student("murugan", "v", "murugan@gmail.com");
			Student student2 = new Student("murugan", "a", "ucetmurugan@gmail.com");
//			student2.setId(19);

			// begin a transaction
			session.beginTransaction();
			// save an obj
			session.save(s);
//			int id = (Integer) session.save(student2);
//			session.save(student2);
//			System.out.println(id);
			// commit transaction
			session.getTransaction().commit();

			System.out.println("done");
		} finally {
			session.close();

			factory.close();
		}
	}

}
