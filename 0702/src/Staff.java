
public class Staff extends Person {
	String jobTitle;

	public Staff(String name, int age, String jobTitle) {
		super(name, age);
		this.jobTitle = jobTitle;
	}
	
	
	public String getJobTitle() {
		return jobTitle;
	}


	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}


	public void status() {
		System.out.println("무한상사 " + getName() + getJobTitle() + "(" + getAge() + ") 님");
	}
	
}