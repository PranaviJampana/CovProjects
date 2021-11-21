package com.covalense.app;

import java.util.HashMap;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.covalense.beans.Question;

public class App_01 {

	public static void main(String[] args) {
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
		SessionFactory sessionFactory = meta.getSessionFactoryBuilder().build();
		Session session = sessionFactory.openSession();

		Transaction transaction = session.beginTransaction();

		HashMap<String, String> map1 = new HashMap<String, String>();

		map1.put("Lekshmi", "Java is a programming language");
		map1.put("Sooraj", "Java is a platform");

		HashMap<String, String> map2 = new HashMap<String, String>();

		map2.put("Lakshmi", "Servlet technology is a server side programming");
		map2.put("Sooraj", "Servlet is an Interface");
		map2.put("Arathi", "Servlet is a package");

		Question question1 = new Question("What is Java?", "Kishor", map1);
		Question question2 = new Question("What is Servlet?", "Sahdhan", map2);
		session.persist(question1);
		session.persist(question2);
		transaction.commit();
		session.close();
		sessionFactory.close();
		System.out.println("successfully stored");

	}

}
