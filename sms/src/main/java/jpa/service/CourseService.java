package jpa.service;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import jpa.dao.CourseDAO;
import jpa.entitymodels.Course;
import jpa.entitymodels.Student;

public class CourseService implements CourseDAO {

	private SessionFactory factory = new Configuration().configure().buildSessionFactory();
	private Session session = factory.openSession();

	public List<Course> getAllCourses() {
		String hql = "FROM Course";
		TypedQuery<Course> query = session.createQuery(hql, Course.class);
		List<Course> result = query.getResultList();
		return result;

	}
	public Course getCourseById(Integer cId) {
		String hql = "FROM Course c where c.cId = :id";
		TypedQuery<Course> query = session.createQuery(hql, Course.class);
		query.setParameter("id", cId);
		Course result = query.getSingleResult();
		return result;
	}

}
