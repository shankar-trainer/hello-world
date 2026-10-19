package com.webflux.webfluxdemo.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class MultiplyRequest {

	private Integer first;
	private Integer second;

}
