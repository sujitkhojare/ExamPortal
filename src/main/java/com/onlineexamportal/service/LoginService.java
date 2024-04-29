package com.onlineexamportal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlineexamportal.dao.LoginDAO;
import com.onlineexamportal.entity.User;

@Service
public class LoginService {

	@Autowired
	LoginDAO logindao;

	public Boolean validate(User user) {
		String password = logindao.getPassword(user.getUsername());

		if (password == null)
			return null;

		else if (password.equals(user.getPassword()))
			return true;

		else
			return false;

	}
}
