package com.onlineexamportal.dao;

import org.hibernate.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.onlineexamportal.entity.ScoresHistory;

@Repository
public class ScoresDAO {
    @Autowired
    SessionFactory factory;
    ScoresHistory scoresHistoryObject = new ScoresHistory();

    public void saveScores(ScoresHistory scoresHistory) {
        Session session = factory.openSession();

        Transaction tx = session.beginTransaction();
        scoresHistoryObject.setSubject(scoresHistory.getSubject());
        scoresHistoryObject.setUsername(scoresHistory.getUsername());
        scoresHistoryObject.setObtainedMarks(scoresHistory.getObtainedMarks());
        session.save(scoresHistoryObject);

        tx.commit();

    }

}
