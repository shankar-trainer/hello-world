package org.audintel;

import org.audintel.model.Leader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

public class LeaderMain {
//mvn exec:java -Dexec.mainClass="com.example.Main"

	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(Leader.class);
		Leader leader = ctx.getBean("leader1",Leader.class);
	
	    System.out.println(leader.getLeaderId()+"\t"+leader.getLeaderName()+"\t"+leader.getLeaderAge());
	    
	    System.out.println("speech ");
	    
	    System.out.println("speech id "+leader.getSpeech_id()+"\t"+leader.getSpeech_subject());
	}	
}
