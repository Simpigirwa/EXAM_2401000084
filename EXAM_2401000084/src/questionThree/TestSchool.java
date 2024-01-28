package questionThree;

import java.util.ArrayList;
import java.util.List;


public class TestSchool {
	public static void main(String[] args) {
		
		Teacher t1 =new Teacher(1, "INEZA Benitha", 300000);
		Teacher t2 =new Teacher(2, "Gisore Honore", 40000);
		Teacher t3 =new Teacher(3, "Tuyirate Donatien", 50000);

		List<Teacher>teacherList=new ArrayList<Teacher>();
		teacherList.add(t1);
		teacherList.add(t2);
		teacherList.add(t3);

		Student s1=new Student(1,"Muhoza Ruth",1);
		Student s2=new Student(2,"Nyiraneza Esperance",2);
		Student s3=new Student(3,"Dukuze Jackson",3);

		ArrayList<Student> studentList=new ArrayList<Student>();
		studentList.add(s1);
		studentList.add(s2);
		studentList.add(s3);

		//Information about school

		School school= new School(teacherList, studentList);

		Teacher t4=new Teacher(5, "UWINEZA Adeline", 4);
		school.addTeacher(t4);

		int amountToPay=350000;
		s2.payFees(amountToPay);
		
		System.out.println("*************Payment status**************");
		System.out.println();
		t1.receiveSalary(t1.getSalary());
		System.out.println("Student  "+s2.getName()+" pays "+amountToPay+" money received");
		System.out.println();
		System.out.println("Payment of  "+t1.getSalary()+" to "+t1.getName()+" has done");
		System.out.println();
		System.out.println("The school has earned Frw "+school.getTotalMoneyEarned());
		
		System.out.println();
		System.out.println("Available money:"+school.getTotalMoneyEarned());
	}
}
