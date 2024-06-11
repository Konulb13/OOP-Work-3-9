package sample;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

//		Scanner sc = new Scanner(System.in);
//		Group group = new Group();
//		Properties prStudent = new Properties();
//		System.out.println("enter studets count(max 10)");
//		int a = sc.nextInt();
//		Student[] students = new Student[10];
//		for(int i = 0; i <= a;i++) {
//			 students[i] = prStudent.propertiesOfStudents();
//			System.out.println(Arrays.toString(students));
//		}
//		System.out.println(Arrays.toString(students));

//		System.out.println("enter size of students(in numbers)");
//		Properties[] prStudent = new Properties[sc.nextInt()];
//		System.out.println("enter student properties(name,last name,gender,ID,group number)");
//		for(int i = 0;i< prStudent.lenght;i++) {
//			prStudent[i]=sc.nextLine();}
	
		
			Group group = new Group("Java" );
		Student s1 = new Student(123, "Java", "Konul", "Bairamova", Gender.FEMALE);
		Student s2 = new Student(132, "Java", "Jacob", "William", Gender.MALE);
		Student s3 = new Student(321, "Java", "Emily", "Taylo", Gender.FEMALE);
		Student s4 = new Student(231, "Java", "Sofi", "Jamal", Gender.FEMALE);
		Student s5 = new Student(213, "Java", "Hugh", "Laurie", Gender.MALE);
		Student s6 = new Student(312, "Java", "Robert", "Weston", Gender.MALE);
		Student s7 = new Student(312, "Java", "Robert", "Weston", Gender.MALE);

		try {		
		group.addStudent(s1);
		group.addStudent(s2);
		group.addStudent(s3);
		group.addStudent(s4);
		group.addStudent(s5);
		group.addStudent(s6);
		group.addStudent(s7);
		System.out.println(group);
		System.out.println(group.eqequivalentStudent());
		}
		
		catch(GroupOverflowException e) {
			e.printStackTrace();
			
		}
		
	
	
		
		
		
//		Student su1 = null; 
//		Student su2 = null;
//		Student su3 = null;
//		Student su4 = null;
//		Student su5 = null;
//		Student su6 = null;
//		try { su1 = s1.clone();
//		su2 = s2.clone();
//		su3 = s3.clone();
//	    su4 = s4.clone();
//		su5 = s5.clone();
//		su6 = s6.clone();
//		} catch
//		 (CloneNotSupportedException e) { e.printStackTrace(); }
//		try {
//			group.addStudent(su1);
//			group.addStudent(su2);
//			group.addStudent(su3);
//			group.addStudent(su4);
//			group.addStudent(su5);
//			group.addStudent(su6);
//			System.out.println(group);}
//			catch(GroupOverflowException e) {
//				e.printStackTrace();}

		
		
//		GroupFileStorage gfs = new GroupFileStorage();
//		try {
//			gfs.saveGroupToCSV(group);
//		}catch (IOException e) {
//			e.printStackTrace();
//		}

//		GroupFileStorage gfs = new GroupFileStorage();
//		try {
//			Group group = gfs.loadGroupFromCSV(new File ("null.csv"));
//			System.out.println(group);
//		}catch (IOException e) {
//			e.printStackTrace();
//		}

//		GroupFileStorage gfs = new GroupFileStorage();
//		
//		File file = new File("C:/java_project/OOPHomeWork#3");
//		
//		File fil = gfs.findFileByGroupName("null.csv", file);
//		System.out.println(fil);

//		
//		try {
//		Student s7 = group.searchStudentByLastName("William");
//		System.out.println(s7);
//		}catch(StudentNotFoundException e) {
//			e.printStackTrace();}
//		System.out.println();
//		System.out.println(group.removeStudentByID(312));
//		System.out.println();
//	System.out.println(group);
//	
//	group.sortStudentsByLastName();

	}
}