package com.jdbc.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.jdbc.Student;

public class ReadStudentDemo {

	public static void main(String[] args) {
		// create session factory
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class)
				.buildSessionFactory();
		// create session object
		Session session = factory.getCurrentSession();
		try {
			// create student object
			Student createStud = new Student("vetri", "a", "vetri@gmail.com");
//			Student createStud1 = new Student("murugann", "a", "vmurugan@gmail.com");

			// begin a transaction
			session.beginTransaction();

			// save a object
			System.out.println(createStud);
			int id=(int)session.save(createStud);
			// commit a transaction
			session.getTransaction().commit();

			// Retrieve an object from DB

			// create a session object
			
			  session = factory.getCurrentSession(); session.beginTransaction();
			  System.out.println("getting student with id " + id); 
			  // find an object using primary key 
			  Student retrieveStud = session.get(Student.class, 26); 
			  System.out.println("Get complete: " + retrieveStud); 
			  // commit transaction 
//			  session.getTransaction().commit();
			 
			System.out.println("Done");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// close factory
			factory.close();
		}
	}

}
