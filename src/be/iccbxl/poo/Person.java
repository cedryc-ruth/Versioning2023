package be.iccbxl.poo;

public class Person {
	private String firstname;
	private String lastname;
	
	public Person(String firstname, String lastname) {
		this.firstname = firstname;
		this.lastname = lastname;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		if(firstname.trim().length()==0) {
			throw new RuntimeException("Le prénom ne peut être vide!");
		}
		
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		if(lastname.trim().length()==0) {
			throw new RuntimeException("Le nom ne peut être vide!");
		}
		
		this.lastname = lastname;
	}

	@Override
	public String toString() {
		return "Person [firstname=" + firstname + ", lastname=" + lastname + "]";
	}
	
}
