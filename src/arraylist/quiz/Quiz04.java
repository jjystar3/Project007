package arraylist.quiz;

import java.util.ArrayList;

public class Quiz04 {

	public static void main(String[] args) {

		ArrayList<Student> list = new ArrayList<Student>();

		list.add(new Student(1001, "둘리"));
		list.add(new Student(1002, "또치"));
		list.add(new Student(1003, "도우너"));
		
		for(Student student : list) {
			student.showInfo();
		}

	}

}

class Student {
	int studentID;
	String studentName;

	public Student(int studentID, String studentName) {
		super();
		this.studentID = studentID;
		this.studentName = studentName;
	}

	public void showInfo() {
		System.out.println(studentID + ", " + studentName);
	}
}