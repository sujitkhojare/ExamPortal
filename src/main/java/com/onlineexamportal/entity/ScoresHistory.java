package com.onlineexamportal.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "scores_history")
public class ScoresHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "score_id")
    private int scoreId;
    @Column(name = "username")
    private String username;
    @Column(name = "subject")
    private String subject;
    @Column(name = "marks")
    private int obtainedMarks;

    public ScoresHistory() {
    }

    public ScoresHistory(int scoreId, String username, String subject, int obtainedMarks) {
        this.scoreId = scoreId;
        this.username = username;
        this.subject = subject;
        this.obtainedMarks = obtainedMarks;
    }

    public int getScoreId() {
        return this.scoreId;
    }

    public void setScoreId(int scoreId) {
        this.scoreId = scoreId;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSubject() {
        return this.subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getObtainedMarks() {
        return this.obtainedMarks;
    }

    public void setObtainedMarks(int obtainedMarks) {
        this.obtainedMarks = obtainedMarks;
    }

    @Override
    public String toString() {
        return "{" +
                " scoreId='" + getScoreId() + "'" +
                ", username='" + getUsername() + "'" +
                ", subject='" + getSubject() + "'" +
                ", obtainedMarks='" + getObtainedMarks() + "'" +
                "}";
    }

}
