package org.com.onlinetest.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
@Table(name = "answers")
public class Answer {

	
	@ManyToOne
	@JsonBackReference
private	Question question;
	
	@Id
        @GeneratedValue(strategy = GenerationType.AUTO)

	private int id;
	private String value;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public Answer(int id, String value) {

		this.id = id;
		this.value = value;
	}

	public Answer() {

	}

    @Override
    public String toString() {
        return "Answer{" + "question=" + question + ", id=" + id + ", value=" + value + '}';
    }

        

}
