package com.onlineexamportal.dao;

import org.hibernate.*;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.onlineexamportal.entity.User;

@Repository
public class RegistrationDAO {
	@Autowired
	SessionFactory factory;

	public void saveToDB(User user) {
		Session session = factory.openSession();

		Transaction tx = session.beginTransaction();

		session.save(user);

		tx.commit();

	}

}
