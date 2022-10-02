package com.example.medicalplanrestapi.model;

public class AuthResponse {

	public AuthResponse(String jwt) {
		super();
		this.jwt = jwt;
	}

	private String jwt;

	public String getJwt() {
		return jwt;
	}

	public void setJwt(String jwt) {
		this.jwt = jwt;
	}

}
