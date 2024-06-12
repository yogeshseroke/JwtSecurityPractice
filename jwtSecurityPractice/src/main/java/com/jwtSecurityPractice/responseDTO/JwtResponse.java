package com.jwtSecurityPractice.responseDTO;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class JwtResponse {
	private String jwtToken;
	private String status;
	private String username;
	private int statusCode;
	private Object data;
}
