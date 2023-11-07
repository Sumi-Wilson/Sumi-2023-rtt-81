package jpa.dao;

import java.util.List;

import jpa.entitymodels.StudentCourse;

public interface StudentCourseDAO {
	public List<StudentCourse> getAllStudentCourses(String sEmail);

}
