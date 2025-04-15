package org.audintel;

import org.audintel.model.Leader;
import org.audintel.model.Speech;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = { "org.audintel.model" })
public class SpeechMain {

	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(Speech.class);
		Speech speech = ctx.getBean("speech1", Speech.class);
		System.out.println(speech);

	}
}
