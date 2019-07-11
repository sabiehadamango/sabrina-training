package labs;

public class Labs2 {

	public static void main(String[] args) {
		Student stu1 = new Student("Janice", "10830308");
		
		stu1.enroll("Eng225");
		stu1.enroll("MTech108");
		
		//stu1.showCourses();
		//stu1.checkBalance();
		stu1.payTuition(600);
		//stu1.checkBalance();
		stu1.toString();
		System.out.println(stu1.toString());
	}

}


class Student {
	private static int iD = 0;
	private String userId;
	private String name;
	private String ssn;
	private String email;
	public String course = "";
	private static final int costofCourse = 800;
	private int balance=0;
	
	public Student(String name, String ssn) {
		iD++;
	this.name = name;
	this.ssn = ssn;
	setUserId();
	// setAccountID();
	setEmail();
	
	}
	
	private void setEmail() {
		email = name.toLowerCase() + "." + iD + "@surrey.ac.uk";
		System.out.println("Your email is: " + email);
	}
	
	private void setUserId() {
		int min = 1000;
		int max = 9000;
		int randNum = (int) (Math.random() * (max-min));
		randNum = randNum + min;
		userId = iD + "" + randNum + ssn.substring(5);
		System.out.println("Your User ID: " + userId);
	}
	
	public void enroll(String course) {
		this.course = this.course + "\n" + course;
		balance = balance + costofCourse;
	}
	
	public void payTuition(int amount) {
		System.out.println("Payment: £" + amount);
		balance = balance - amount;
		
		
	}
	
	public void checkBalance() {
		System.out.println("Balance: £" + balance);
		
	}
	public void showCourses() {
		System.out.println(course);
		
	}
	public String toString() { 
		return "[NAME: " + name + " ]\n[COURSES: " + course + "]\nBALANCE: " + balance + " ]";	}
	}

	