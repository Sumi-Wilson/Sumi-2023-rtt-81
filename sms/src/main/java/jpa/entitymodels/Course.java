package jpa.entitymodels;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "courses")

public class Course {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer cId;

	@OneToMany(mappedBy = "course", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	List<StudentCourse> studentcourses;

	@Column(name = "name")
	private String cName;

	@Column(name = "instructor")
	private String cInstructorName;

	@Override
	public String toString() {
		return String.format("%5d%15s%15s", cId, cName, cInstructorName);
	}

	public Integer getcId() {
		return cId;
	}

	public void setcId(Integer cId) {
		this.cId = cId;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public String getcInstructorName() {
		return cInstructorName;
	}

	public void setcInstructorName(String cInstructorName) {
		this.cInstructorName = cInstructorName;
	}

	public List<StudentCourse> getStudentcourses() {
		return studentcourses;
	}

	public void setStudentcourses(List<StudentCourse> studentcourses) {
		this.studentcourses = studentcourses;
	}

}
