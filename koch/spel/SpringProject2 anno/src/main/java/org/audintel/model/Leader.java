package org.audintel.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Component("leader1")
@ComponentScan(basePackages = { "org.audintel.model" })
public class Leader {
	@Value("10001")
	private long leaderId;
	
	@Value("a k balu")
	private String leaderName;
	
	@Value("40")
	private int leaderAge;

	@Value("#{speech1}")
	private Speech speech;
	
	@Value("#{speech1.SpeechId}")
	private int speech_id;
	
	@Value("#{speech1.speechSubject}")
	private String speech_subject;
	
	
}
