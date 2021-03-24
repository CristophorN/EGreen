import java.util.Scanner;
import java.util.Arrays;



public class Guest {
		public static int compCase;
		private String lastName;
		private String firstName;
		private String email;
		private String phoneNumber;
	
	
		public Guest(String lastName, String firstName, String email, String phoneNumber) {
			this.lastName = lastName;
			this.firstName = firstName;
			this.email = email;
			this.phoneNumber = phoneNumber;
			
		}

		public Guest() {
			// TODO Auto-generated constructor stub
		}

	public String getLastName()	{
			return this.lastName;
		}
		
	public void setLastName(String lastName)	{
		this.lastName = lastName;
	}
	
	
	public String getFirstName() {
			return this.firstName;
		}

	
	public void setFirstName(String firstName)	{
		this.firstName = firstName;
	}
	
	
	
	public String getEmail() {
		return this.email;
	}

	
	public void setEmail(String email)	{
		this.email = email;
	}
	
	
	
	public String getPhoneNumber() {
		return this.phoneNumber;
	}

	public void setphoneNumber(String phoneNumber)	{
		this.phoneNumber = phoneNumber;
	}
	
	
	
	
	public boolean compareName(String auxLastName, String auxFirstName)	{
		if((lastName == null && auxLastName != null) ||
				(firstName == null && auxFirstName != null)) {
			return false;
		}
		if(lastName.equalsIgnoreCase(auxLastName) &&
				firstName.equalsIgnoreCase(auxFirstName)) {
			return true;
		}
	return false;
	}
	
	
	public String contains(String keyword) {
		keyword = keyword.toLowerCase();
		if (lastName.toLowerCase().contains(keyword)) {
			return "lastName " + lastName;
		}
	
		if (firstName.toLowerCase().contains(keyword)) {
			return "firstName " + firstName;
		}
	
		if (email.toLowerCase().contains(keyword)) {
			return "email " + email;
		}
	
		if (phoneNumber.toLowerCase().contains(keyword)) {
			return "phoneNumber " + phoneNumber;
		}
	
	return null;
	}
	
	@Override
	public String toString()	{
		return "[" + this.lastName + ", " + this.firstName + ", " + this.email + ", " + this.phoneNumber + "]"; 
	}
	
	
	
	public boolean updateField(String lastName, String firstName, String email, String phoneNumber) {
		if (lastName != null) {
			this.lastName = lastName;
			return true;
		}
		if (firstName != null) {
			this.firstName = firstName;
			return true;
		}
		if (email != null) {
			this.email = email;
			return true;
		}
		if (phoneNumber != null) {
			this.phoneNumber = phoneNumber;
			return true;
		}
		 System.out.println("Eroare: Aceasta operatiune nu a putut fi actualizata...");
		 return false; // Error Code
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (!(obj instanceof Guest))
			return false;
		Guest other = (Guest) obj;
		if (!lastName.equals(other.lastName) && !firstName.equals(other.firstName)) // de comparat !lastname.equals(other.lastName) ( sa pun not in fata
			return false;
		if (!email.equals(other.email))
			return false;
		if	(!phoneNumber.equals(other.phoneNumber)) 
			return false;
		
		return true;
	}


}
