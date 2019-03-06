package com.jdbc.demo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.jdbc.Student;

public class RetrieveStudentDemo {
  public static void main(String[] args) {
    SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class)
        .buildSessionFactory();
    Session session = factory.getCurrentSession();
    try {
      System.out.println("Creating new Student object");
      Student tempStudent = new Student("lavana", "rathan", "lavaniya1996@gmail.com");
//    Student tempStudent1=new Student("dinesh","veera","lavaniya1996@gmail.com");
//    Student tempStudent2=new Student("veera","dinesh","lavaniya1996@gmail.com");
      session.beginTransaction();
      System.out.println("saving the student");
      System.out.println(tempStudent);
      session.save(tempStudent);
//    session.save(tempStudent1);
//    session.save(tempStudent2);
//      session.createQuery("update Student set email='lav@123'").executeUpdate();
    //  session.delete(tempStudent);
      session.getTransaction().commit();

      System.out.println("Generated id" + tempStudent.getId());
      System.out.println("Done!!!!");
      session = factory.getCurrentSession();
      session.beginTransaction();
      Student myStudent = session.get(Student.class, tempStudent.getId());
      myStudent.setFirstName("dharanir");
      session.createQuery("update Student set email='lav@123'").executeUpdate();
      System.out.println("get complete" + myStudent);
      List<Student> theStudents = session.createQuery("From Student").list();
      List<Student> students=session.createQuery("from Student s where "+"s.email LIKE '%1996@gmail.com'").list();
      List<Student> stud=session.createQuery("from Student s where s.lastName='rathan'").getResultList();
      System.out.println(theStudents);
      System.out.println(students);
      System.out.println(stud);
      session.getTransaction().commit();

    } finally {
      factory.close();
    }
  }
}