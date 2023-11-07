package jpa.mainrunner;

import java.util.List;
import java.util.Scanner;

import jpa.entitymodels.Course;
import jpa.entitymodels.Student;
import jpa.service.CourseService;
import jpa.service.StudentCourseService;
import jpa.service.StudentService;

public class SMSRunner {

	private Scanner sin;
	private StringBuilder sb;
	private CourseService courseService;
	private StudentService studentService;
	private Student currentStudent;
	private String currentPassword;
	private String currentStud;

	public SMSRunner() {
		sin = new Scanner(System.in);
		sb = new StringBuilder();
		courseService = new CourseService();
		studentService = new StudentService();
	}

	public static void main(String[] args) {

		SMSRunner sms = new SMSRunner();
		sms.run();
	}

	private void run() {

		switch (menu1()) {
		case 1:
			if (studentLogin()) {
				registerMenu();
			}
			break;
		case 2:
			System.out.println("Goodbye!");
			break;

		default:

		}
	}

	private int menu1() {
		sb.append("\n1.Student Login\n2. Quit Application\nPlease Enter Selection: ");
		System.out.print(sb.toString());
		sb.delete(0, sb.length());
		return sin.nextInt();
	}

	private boolean studentLogin() {

		boolean retValue = false;
		System.out.print("Enter your email address: ");
		String email = sin.next();
		System.out.print("Enter your password: ");
		String password = sin.next();
		Student students = studentService.getStudentByEmail(email);
		if (students != null) {

			currentStud = students.getsEmail();
			currentPassword = students.getsPass();

		}
		if (currentStud != null & currentPassword != null) {
			List<Course> courses = studentService.getStudentCourses(email);
			System.out.println("MyClasses");
			/*
			 * for (Course course : courses) { System.out.println(course); }
			 */
			System.out.printf("%1s%15S%45s\n", "ID", "Course", "Instructor");
			for (Course course : courses) {
				System.out.printf("%-10d%-40s%-60s\n", course.getcId(), course.getcName(), course.getcInstructorName());
			}

			retValue = true;
		} else {
			System.out.println("User Validation failed. GoodBye!");
		}
		return retValue;
	}

	private void registerMenu() {
		sb.append("\n1.Register a class\n2. Logout\nPlease Enter Selection: ");
		System.out.print(sb.toString());
		sb.delete(0, sb.length());

		switch (sin.nextInt()) {
		case 1:

			List<Course> allCourses = courseService.getAllCourses();
			List<Course> studentCourses = studentService.getStudentCourses(currentStud);
			allCourses.removeAll(studentCourses);
			System.out.printf("%1s%15S%45s\n", "ID", "Course", "Instructor");
			for (Course course : allCourses) {
				System.out.printf("%-10d%-40s%-60s\n", course.getcId(), course.getcName(), course.getcInstructorName());
			}
			System.out.println();
			System.out.print("Enter Course Number: ");
			int number = sin.nextInt();
			Course newCourse = courseService.getCourseById(number);
			Integer newCourse1 = newCourse.getcId();

			if (newCourse1 != null) {
				studentService.registerStudentToCourse(currentStud, newCourse1);
				Student temp = studentService.getStudentByEmail(currentStud);
				String temp1 = temp.getsEmail();
				List<Course> sCourses = studentService.getStudentCourses(temp1);
				System.out.println("MyClasses");
				System.out.printf("%1s%15S%45s\n", "ID", "Course", "Instructor");
				for (Course course : sCourses) {
					System.out.printf("%-10d%-40s%-60s\n", course.getcId(), course.getcName(),
							course.getcInstructorName());
				}
			}
			break;
		case 2:
		default:
			System.out.println("Goodbye!");
			System.exit(0);
		}
	}

}