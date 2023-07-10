package com.project.dtos;

//import lombok.AllArgsConstructor;
//import lombok.Data;


//@AllArgsConstructor
public class AuthenticationResponse {

    @Override
	public String toString() {
		return "AuthenticationResponse [jwtToken=" + jwtToken + "]";
	}

	public AuthenticationResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AuthenticationResponse(String jwtToken) {
		super();
		this.jwtToken = jwtToken;
	}

	public String getJwtToken() {
		return jwtToken;
	}

	public void setJwtToken(String jwtToken) {
		this.jwtToken = jwtToken;
	}

	private String jwtToken;

}