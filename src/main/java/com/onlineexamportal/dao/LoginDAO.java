package com.onlineexamportal.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.onlineexamportal.entity.User;

@Repository
public class LoginDAO {
	@Autowired
	SessionFactory factory;

	public String getPassword(String username) {
		Session session = factory.openSession();

		User userFromDB = session.get(User.class, username);

		if (userFromDB == null)
			return null;

		else
			return userFromDB.getPassword();

	}

}
