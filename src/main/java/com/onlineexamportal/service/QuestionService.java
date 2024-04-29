package com.onlineexamportal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlineexamportal.dao.QuestionDAO;
import com.onlineexamportal.entity.Question;

@Service
public class QuestionService {
	@Autowired
	QuestionDAO dao;

	public List<Question> getAllQuestions(String subject) {
		return dao.getAllQuestions(subject);
	}

}
