package com.onlineexamportal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlineexamportal.dao.ScoresDAO;
import com.onlineexamportal.entity.ScoresHistory;

@Service
public class ScoresService {
    @Autowired
    ScoresDAO scoresDAO;

    public void saveScores(ScoresHistory scoresHistory) {
        scoresDAO.saveScores(scoresHistory);
    }
}
