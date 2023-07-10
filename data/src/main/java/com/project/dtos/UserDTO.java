package com.project.dtos;

import lombok.Data;


public class UserDTO {

	private Long id;

    private String name;

    private String email;
    private String role;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public UserDTO(Long id, String name, String email, String role) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.role = role;
	}
	public UserDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "UserDTO [id=" + id + ", name=" + name + ", email=" + email + ", role=" + role + "]";
	}
    

}