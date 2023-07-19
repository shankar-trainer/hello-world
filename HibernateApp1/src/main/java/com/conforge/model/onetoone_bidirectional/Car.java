package com.conforge.model.onetoone_bidirectional;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Car {

	@Id
	@GeneratedValue
	private int cardId;
	private String cardModel;
	private float cardCost;

	public int getCardId() {
		return cardId;
	}

	public void setCardId(int cardId) {
		this.cardId = cardId;
	}

	public String getCardModel() {
		return cardModel;
	}

	public void setCardModel(String cardModel) {
		this.cardModel = cardModel;
	}

	public float getCardCost() {
		return cardCost;
	}

	public void setCardCost(float cardCost) {
		this.cardCost = cardCost;
	}

}
