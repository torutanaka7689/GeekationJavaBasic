package objectPractice;

public class Sample {
	
	private String lastname;
	private String firstname;
	
	Sample(String lastname, String firstname){
		this.lastname = lastname;
		this.firstname = firstname;
	}
	
	public String getLastname() {
		return this.lastname;
	}
	
	public String getFirstname() {
		return this.firstname;
	}
	
	public void setLastname(String lastname) {
		this.lastname = lastname;
		
	}
	
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

}
