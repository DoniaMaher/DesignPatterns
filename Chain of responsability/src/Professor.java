

import java.sql.Date;

public class Professor
{
	String name;
	String department;
	String PhDTopic;
	String email;
	String phoneNumber;
	
	
	public Professor(String name, String department, String phDTopic, String email,
			String phoneNumber)
	{
		super();
		this.name = name;
		this.department = department;
		PhDTopic = phDTopic;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getPhDTopic() {
		return PhDTopic;
	}
	public void setPhDTopic(String phDTopic) {
		PhDTopic = phDTopic;
	}
	
	
	public void notifyProfessor(String message) {
		// do some stuff
		
	}
	
	
	
}
