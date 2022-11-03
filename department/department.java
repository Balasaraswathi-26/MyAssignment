package org.department;

import org.college.college;

public class department extends college {
public void dptname() {
	System.out.println("BCA");
}
public static void main(String[] args) {
	department dpt=new department();
	dpt.collegename();
	dpt.collegecode();
	dpt.collegerank();
	dpt.dptname();
}
}
