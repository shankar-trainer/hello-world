package com.coforge.model;

import java.time.LocalDate;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Survey {
	private long surveyId;
	private String surveyName;
	private LocalDate surveyDate;
}
