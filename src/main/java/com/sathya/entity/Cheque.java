package com.sathya.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("CH")
public class Cheque extends Payment {
	private  Long  chequeNo;
	@Column(length=10)
	private String chequeType;
	
	public Cheque() {}
	public Cheque(Integer txId,Double amount,Date txDate,Long chequeNo,String chequeType) {
		super(txId, amount, txDate);
		this.chequeNo=chequeNo;
		this.chequeType=chequeType;
	}
	public Long getChequeNo() {
		return chequeNo;
	}
	public void setChequeNo(Long chequeNo) {
		this.chequeNo = chequeNo;
	}
	public String getChequeType() {
		return chequeType;
	}
	public void setChequeType(String chequeType) {
		this.chequeType = chequeType;
	}
	

}
