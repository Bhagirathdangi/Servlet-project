package com.nt.register;

public class Member {
	
	private String Uname,password,email,phoneNo;

	public Member() {
		super();
		
	}

	public Member(String uname, String password, String email, String phoneNo) {
		super();
		Uname = uname;
		this.password = password;
		this.email = email;
		this.phoneNo = phoneNo;
	}

	public String getUname() {
		return Uname;
	}

	public void setUname(String uname) {
		Uname = uname;
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

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	

}//class
