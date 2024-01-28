package questionThree;

import java.util.ArrayList;
import java.util.List;

public class School {

	private List<Teacher> teachers;
	private ArrayList<Student> students;
	private static int  TotalMoneyEarned;
	private static int totalMoneySpent;
	public School(List<Teacher> teachers, ArrayList<Student> students) {
		super();
		this.teachers = teachers;
		this.students = students;
	}
	public List<Teacher> getTeachers() {
		return teachers;
	}
	public void setTeachers(List<Teacher> teachers) {
		this.teachers = teachers;
	}
	public ArrayList<Student> getStudents() {
		return students;
	}
	public void setStudents(ArrayList<Student> students) {
		this.students = students;
	}
	public void addTeacher(Teacher teacher) {
		teachers.add(teacher);
	}
	public void addStudent(Student student) {
		students.add(student);
	}
	
	public static int getTotalMoneyEarned() {
		return TotalMoneyEarned;
	}
	public static void setTotalMoneyEarned(int totalMoneyEarned) {
		TotalMoneyEarned = totalMoneyEarned;
	}
	public static void updateTotalMoneyEarned(int moneyEarned) {
		TotalMoneyEarned+=moneyEarned;
	}
	public int getTotalMoneySpent() {
		return totalMoneySpent;
	}
	public static void updateTotalMoneySpent(int moneySpent) {
		TotalMoneyEarned-=moneySpent;
	}
	public static int getAvailableMoney() {
		return TotalMoneyEarned;
	}
}
