package com.onlineexamportal.controller;

import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.onlineexamportal.dao.QuestionDAO;
import com.onlineexamportal.entity.Answer;
import com.onlineexamportal.entity.Question;
import com.onlineexamportal.entity.User;
import com.onlineexamportal.service.LoginService;
import com.onlineexamportal.service.QuestionService;

@RestController
@CrossOrigin("http://localhost:4200")
public class LoginController {
	@Autowired
	SessionFactory factory;

	@Autowired
	LoginService loginService;

	static HttpSession httpsession;

	public LoginController() {
		System.out.println("Constructor called");
	}

	@RequestMapping("validate")
	public ResponseEntity<Boolean> validate(@RequestBody User userFromAngular, HttpServletRequest request) {

		Boolean answer = loginService.validate(userFromAngular);

		if (answer) {
			httpsession = request.getSession();

			System.out.println(httpsession.getId());

			httpsession.setAttribute("qno", 0);
			httpsession.setAttribute("score", 0);

			HashMap<Integer, Answer> hashmap = new HashMap<Integer, Answer>();
			httpsession.setAttribute("submittedDetails", hashmap);

			System.out.println("All attributes are set");

			return new ResponseEntity<Boolean>(true, HttpStatus.OK);

		}

		else {
			return new ResponseEntity<Boolean>(false, HttpStatus.OK);
		}

	}
}
