package model;

public class User {
	public String email;
	public String password;
	
	public User(String email, String password) {
		//super();
//		this.email = email;
//		this.password = password;
		setEmail(email);
		setPassword(password);
	}
	
	public String getEmail() {
		return email;
	}
	public String getPassword() {
		return password;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
