package sample;
import java.util.Scanner;
public class Properties {
public Student propertiesOfStudents() {
Scanner sc = new Scanner(System.in);
Student  students = new Student();
System.out.println("enter student name(in text)");
students.setName(sc.nextLine());
System.out.println("enter student last name (in text)");
students.setLastName(sc.nextLine());
System.out.println("enter student's gender(MALE/FEMALE)");
if(sc.nextLine().equals(Gender.FEMALE)) {
	students.setGender(Gender.FEMALE);}
	else {
		students.setGender(Gender.MALE);}
System.out.println("enter student ID(in numbers) ");
students.setId(sc.nextInt());
System.out.println("enter student group name(in text)");
sc.nextLine();
students.setGroupName(sc.nextLine());
return students;}
public boolean studentToGroup(Student students,Group gr) {
	try {gr.addStudent(students);
	
	}catch(GroupOverflowException e) {
		e.printStackTrace();}
	return false;}}