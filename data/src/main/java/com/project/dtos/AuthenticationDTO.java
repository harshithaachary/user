package com.project.dtos;



public class AuthenticationDTO {

    @Override
	public String toString() {
		return "AuthenticationDTO [email=" + email + ", password=" + password + "]";
	}

	public AuthenticationDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AuthenticationDTO(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	private String email;

    private String password;

}