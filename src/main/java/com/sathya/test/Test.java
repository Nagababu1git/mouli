package com.sathya.test;

import java.util.Date;

import com.sathya.dao.PaymentDao;
import com.sathya.dao.PaymentDaoImpl;
import com.sathya.entity.Card;
import com.sathya.entity.Cheque;
import com.sathya.entity.Payment;

public class Test {
	public static void main(String[] args) {
		PaymentDao dao=new  PaymentDaoImpl();
				
		Payment  payment1=new Card(1709981, 5000.00, new Date(), 160028672007L, "VISA");
		dao.savePayment(payment1);
		
		Payment  payment2=new Cheque(2201123, 45000.00, new Date(), 405522198L, "order");
		dao.savePayment(payment2);
	}

}
