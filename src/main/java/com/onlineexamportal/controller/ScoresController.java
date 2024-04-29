package com.onlineexamportal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.onlineexamportal.entity.ScoresHistory;
import com.onlineexamportal.service.ScoresService;

@RestController
@CrossOrigin("http://localhost:4200")
public class ScoresController {
    @Autowired
    ScoresService scoresService;

    @RequestMapping("saveScores")
    public ResponseEntity<Boolean> saveScores(@RequestBody ScoresHistory scoresHistory) {

        System.out.println(scoresHistory);

        scoresService.saveScores(scoresHistory);

        return new ResponseEntity<Boolean>(true, HttpStatus.CREATED);

    }
}
