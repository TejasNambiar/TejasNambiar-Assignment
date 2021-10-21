package com.SipringCore.Assignment6;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

/**
 * @component tells its a bean
 * @PropertySource to define the class path and
 * @Value to inject values
 */
@Component
@PropertySource("classpath:dbConfig.properties")
public class project {

	// getting value from dbConfig.properties
	@Value("${project.name}")
	private String projectName;
	
	@Autowired
	private student student;
	
	@Autowired
	Environment env;

	public project() {

	}

	public project(String projectName, student student) {
		super();
		this.projectName = projectName;
		this.student = student;

	}

	// getters
	public String getProjectName() {
		return projectName;
	}

	public student getStudent() {
		return student;
	}

	// setters
	@Value("website for college")
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	@Resource
	public void setStudent(student student) {
		this.student = student;
	}

	// methods
	public void projectInfo() {
		System.out.println("Project Information:\nProject Name: " + getProjectName() + "\nStudent : "
				+ getStudent().getName() + "," + getStudent().getRegNo());
	}

	public String toString() {
		return env.getProperty("user.Name") + " Project [projectName=" + getProjectName() + ", \nstudent=" + student + "]";
	}

}
