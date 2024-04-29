package com.onlineexamportal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlineexamportal.dao.RegistrationDAO;
import com.onlineexamportal.entity.User;

@Service
public class RegistrationService {

	@Autowired
	RegistrationDAO dao;

	public void saveToDB(User user) {
		dao.saveToDB(user);
	}

}
