package jpa.service;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import jpa.dao.StudentDAO;
import jpa.entitymodels.Course;
import jpa.entitymodels.Student;
import jpa.entitymodels.StudentCourse;

public class StudentService implements StudentDAO {

	private SessionFactory factory = new Configuration().configure().buildSessionFactory();
	private Session session = factory.openSession();
	private List<Course> course;

	public List<Student> getAllStudents() {

		String hql = "FROM Student s";
		TypedQuery<Student> query = session.createQuery(hql, Student.class);
		List<Student> result = query.getResultList();
		return result;

	}

	public Student getStudentByEmail(String sEmail) {

		String hql = "FROM Student s where s.sEmail = :email";
		TypedQuery<Student> query = session.createQuery(hql, Student.class);
		query.setParameter("email", sEmail);
		try {
			Student result = query.getSingleResult();
			return result;
		} catch (NoResultException nre) {
			return null;
		}
	}

	public boolean validateStudent(String sEmail, String sPassword) {

		String hql = "FROM Student s where s.sEmail = :email and s.sPass = :password";
		TypedQuery<Student> query = session.createQuery(hql, Student.class);
		query.setParameter("email", sEmail);
		query.setParameter("password", sPassword);
		try {
			Student result = query.getSingleResult();
			return true;
		} catch (NoResultException nre) {
			return false;

		}

	}

	public Course getCourseById(Integer cId) {

		String hql = "FROM Course c where c.cId = :courseid";
		TypedQuery<Course> query = session.createQuery(hql, Course.class);
		query.setParameter("courseid", cId);
		Course result = query.getSingleResult();
		return result;

	}

	public void registerStudentToCourse(String sEmail, int cId) {

		StudentService ss = new StudentService();
		Student student = ss.getStudentByEmail(sEmail);
		for (StudentCourse studentCourse : student.getStudentcourses()) {
			if (studentCourse.getCourse().getcId().equals(cId)) {
				System.out.println("Student has already resgistered for this course");
				return;
			}
		}
		Course course = ss.getCourseById(cId);
		StudentCourse sc = new StudentCourse();
		sc.setCourse(course);
		sc.setStudent(student);
		Transaction t = session.beginTransaction();
		session.saveOrUpdate(sc);
		t.commit();

	}

	public List<Course> getStudentCourses(String sEmail) {

		String hql = "FROM StudentCourse sc where sc.student.sEmail = :semail";
		TypedQuery<StudentCourse> query = session.createQuery(hql, StudentCourse.class);
		query.setParameter("semail", sEmail);
		List<StudentCourse> result = query.getResultList();

		List<Course> courses = new ArrayList<>();

		for (StudentCourse studentCourse : result) {
			Course course = studentCourse.getCourse();
			courses.add(course);
		}

		return courses;
	}

}
