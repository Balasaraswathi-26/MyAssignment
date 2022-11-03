package org.student;


import org.department.department;

public class student extends department {
	public void studentname() {
		System.out.println("bala");
	}
	public void Studentdept() {
		System.out.println("computer application");
	}
	public void Studentid() {
		System.out.println("u192443");
	}
	public static void main(String[] args) {
		student std=new student();
		std.studentname();
		std.Studentdept();
		std.Studentid();
	}
}
