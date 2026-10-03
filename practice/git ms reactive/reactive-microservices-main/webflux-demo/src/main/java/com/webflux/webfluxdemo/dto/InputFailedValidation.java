package com.webflux.webfluxdemo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class InputFailedValidation {

	private Integer errorCode;
	private String message;

}
