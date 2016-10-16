package com.manicware.euler.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by unamanic on 10/15/16.
 */
@Entity
public class Question {
    @Id
    @GeneratedValue
    Long id;

    String questionName;
    String endpoint;

    public Question() {
    }

    public Question(String questionName, String endpoint) {
        this.questionName = questionName;
        this.endpoint = endpoint;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getQuestionName() {
        return questionName;
    }

    public void setQuestionName(String questionName) {
        this.questionName = questionName;
    }

    public String getEndpoint() {
        return endpoint;
    }

    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }
}
