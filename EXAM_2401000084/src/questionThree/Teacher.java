package questionThree;


public class Teacher {
	private int id;
	private String name;
	private int salary;
	private int salaryEarned;
	public Teacher(int id, String name, int salary) {

		this.id = id;
		this.name = name;
		this.salary = salary;
		this.salaryEarned=0;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getSalaryEarned() {
		return salaryEarned;
	}
	public void setSalaryEarned(int salaryEarned) {
		this.salaryEarned = salaryEarned;
	}
	//key public void receiveSalary
	public void receiveSalary(int salary) {
		if(School.getAvailableMoney()>salary) {
		this.salaryEarned+=salary;
		//trigger the school
		School.updateTotalMoneySpent(salary);
	}
		else {
		System.out.println("No enough money for this payment, Available money is:"+School.getAvailableMoney());	
		}
	}
	
	public String toString() {
		return "\nName of the Teacher: "+this.name+"\n Total salary earned so far Frw: "+this.getSalaryEarned();
	}
}
