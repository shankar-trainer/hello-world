package org.audintel.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component("speech1")
public class Speech {
	@Value("1001")
	private int SpeechId;
	
	@Value("literacy")
	private String speechSubject;
	
	@Value("30")
	private int speechDuration;
	
	@Value("hyderabad")
	private String speechLocation;
	
	
}
