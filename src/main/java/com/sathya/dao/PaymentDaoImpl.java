package com.sathya.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.sathya.entity.Payment;
import com.sathya.util.HibernateUtil;

public class PaymentDaoImpl implements PaymentDao {
	private  SessionFactory factory;
	public PaymentDaoImpl() {
		factory=HibernateUtil.getSessionFactory();
	}

	public void savePayment(Payment payment) {
		Session  session=factory.openSession();
		Transaction tx=session.beginTransaction();
		session.save(payment);
		tx.commit();
		session.close();
	}

}
