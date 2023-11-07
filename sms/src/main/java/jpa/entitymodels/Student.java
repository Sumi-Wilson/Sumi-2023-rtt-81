package jpa.entitymodels;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "students")

public class Student {
	@Id
    @Column(name = "email")
	private String sEmail;
	
	@OneToMany(mappedBy = "student", fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
	List<StudentCourse> studentcourses;

	@Column(name = "name")
	private String sName;

	@Column(name = "password")
	private String sPass;

	// Getters and Setters
	
	public String getsEmail() {
		return sEmail;
	}

	public void setsEmail(String sEmail) {
		this.sEmail = sEmail;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public String getsPass() {
		return sPass;
	}

	public void setsPass(String sPass) {
		this.sPass = sPass;
	}

	public List<StudentCourse> getStudentcourses() {
		return studentcourses;
	}

	public void setStudentcourses(List<StudentCourse> studentcourses) {
		this.studentcourses = studentcourses;
	}

	
	

	
	

}
