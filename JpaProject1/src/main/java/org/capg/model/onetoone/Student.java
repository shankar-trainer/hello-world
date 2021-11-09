package org.capg.model.onetoone;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity

public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int roll;

	private String name;
	private float marks;
	private String subject;

	@OneToOne
	@JoinColumn(name = "game_id")
	private Game game;

	public Game getGame() {
		return game;
	}

	public void setGame(Game game) {
		this.game = game;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getMarks() {
		return marks;
	}

	public void setMarks(float marks) {
		this.marks = marks;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	@Override
	public String toString() {
		return "\nStudent [roll=" + roll + ", name=" + name + ", marks=" + marks + ", subject=" + subject + " \n"
				+ game + "]";
	}
	

}
