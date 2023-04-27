package app.controller;

import org.springframework.stereotype.Component;

@Component
public class Customer {
	String cname;
	String password;
	String email;
	String contact;
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	@Override
	public String toString() {
		return "Customer [cname=" + cname + ", password=" + password + ", email=" + email + ", contact=" + contact
				+ "]";
	}
	
	

}
