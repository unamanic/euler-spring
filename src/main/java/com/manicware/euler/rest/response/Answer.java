package com.manicware.euler.rest.response;

/**
 * Created by unamanic on 10/8/16.
 */
public class Answer {
    String question;
    String answer;
    Long time = 0l;

    public Answer() {
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }
}
