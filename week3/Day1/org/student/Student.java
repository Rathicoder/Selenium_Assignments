package org.student;

import org.department.Department;

public class Student extends Department {

	public void studentName() {
		System.out.println("MethodS1:studentname");
	}

	public void studentDept() {
		System.out.println("MethodS1:studentDept");
	}
	
	public void studentId() {
		System.out.println("MethodS1:studentId");
	}
	
	public static void main(String args[]) {
		Student ST = new Student();
		ST.collegeName();
		ST.collegeCode();
		ST.collegeRank();
		ST.deptName();
		ST.studentName();
		ST.studentDept();
		ST.studentId();	
		
		
	}
}
