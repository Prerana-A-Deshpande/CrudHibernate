package com.deeptech.hibernate.work;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.deeptech.hibernate.work.dto.Student;
import com.deeptech.hibernate.work.utility.HibernateUtil;

public class CreateStudent {
	public static void main(String[] args) 
	{
		Student s=new Student();
		s.setStudentname("Vanitha");
		s.setRollno(100);
        s.setCourse("BCA");
        SessionFactory sf=HibernateUtil.connection();
        Session ses=sf.openSession();
        ses.beginTransaction();
        ses.save(s);
        System.out.println("Success");
        ses.close();
        sf.close();
	}

}
