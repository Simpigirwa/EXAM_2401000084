package questionThree;


public class Student {
	private int id;
	private String name;
	private int grade;
	private int feesPaid;
	private int feesTotal;
	public Student(int id, String name, int grade) {

		this.id = id;
		this.name = name;
		this.grade = grade;
		this.feesPaid=0;
		this.feesTotal=50000;
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
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}

	public int getFeesPaid() {
		return feesPaid;
	}
	public void setFeesPaid(int feesPaid) {
		this.feesPaid = feesPaid;
	}
	public int getFeesTotal() {
		return feesTotal;
	}
	public void setFeesTotal(int feesTotal) {
		this.feesTotal = feesTotal;
	}
	public void payFees(int fees) {
		feesPaid+=fees;
		//Trigger update in school
		School.updateTotalMoneyEarned(fees);
	}
	public int getRemainingFees() {
		return feesTotal-feesPaid;
	}
	@Override
	public String toString() {
		return "Student's name:" + name + "\n, Total fees paid so far Frw: "+feesPaid;
	}

}
