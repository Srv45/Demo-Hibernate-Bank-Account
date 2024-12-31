package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Accounts;

public class MainClass {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Accounts.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		Accounts acc = new Accounts();

		acc.setAcc_Number(387898152);
		acc.setName("Shubham");
		acc.setMobile(707029795);
		acc.setAddress("Pune");
		acc.setAmmount(500000);

		ss.persist(acc);
		tr.commit();
		ss.close();

		System.out.println(acc);
	}

}
