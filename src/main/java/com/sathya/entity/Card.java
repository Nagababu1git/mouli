package com.sathya.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("CD")
public class Card  extends Payment {
	private  Long  cardNo;
	@Column(length=10)
	private  String cardType;
	
	public Card() { }
	
	public Card(Integer txId,Double amount,Date txDate,Long cardNo,String cardType) {
		super(txId,amount,txDate);
		this.cardNo=cardNo;
		this.cardType=cardType;
	}

	public Long getCardNo() {
		return cardNo;
	}

	public void setCardNo(Long cardNo) {
		this.cardNo = cardNo;
	}

	public String getCardType() {
		return cardType;
	}

	public void setCardType(String cardType) {
		this.cardType = cardType;
	}
	
	

}
