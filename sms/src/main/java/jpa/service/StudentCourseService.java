package jpa.service;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import jpa.dao.StudentCourseDAO;
import jpa.entitymodels.Student;
import jpa.entitymodels.StudentCourse;

public class StudentCourseService implements StudentCourseDAO {

	private SessionFactory factory = new Configuration().configure().buildSessionFactory();
	private Session session = factory.openSession();

	public List<StudentCourse> getAllStudentCourses(String sEmail) {

		String hql = "FROM StudentCourse sc where sc.studentEmail = email";
		TypedQuery<StudentCourse> query = session.createQuery(hql, StudentCourse.class);
		query.setParameter("email", sEmail);
		List<StudentCourse> result = query.getResultList();
		return result;

	}

}
