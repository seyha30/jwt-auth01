package me.jwtutils;

import java.io.Serializable;

public class JwtResponseModel implements Serializable {

	private static final long serialVersionUID = 1L;

	public String token;

	public JwtResponseModel(String token) {
		this.token = token;
	}

	public String getToken() {
		return token;
	}

}
