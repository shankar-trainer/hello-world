package com.webflux.webfluxdemo.dto;

import java.util.Date;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Response {

	private Date date = new Date();
	private Integer input;

	public Response(Integer input) {
		this.input = input;
	}

}
