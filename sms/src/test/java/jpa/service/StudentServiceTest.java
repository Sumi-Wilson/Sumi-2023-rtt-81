package jpa.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import jpa.entitymodels.Course;
import jpa.entitymodels.Student;

public class StudentServiceTest {

	@Test
	public void getCourseByIdTest() {
		StudentService studentService = new StudentService();
		Course actual = studentService.getCourseById(4);
		Assertions.assertEquals(4, actual.getcId());
		Assertions.assertEquals("Organic Chemistry", actual.getcName());
	}

	@Test
	public void getStudentByEmailTest() {

		StudentService studentService = new StudentService();
		Student actual = studentService.getStudentByEmail("aiannitti7@is.gd");
		Assertions.assertEquals("aiannitti7@is.gd", actual.getsEmail());
		Assertions.assertEquals("Alexandra Iannitti", actual.getsName());
		Assertions.assertEquals("TWP4hf5j", actual.getsPass());

	}
}
