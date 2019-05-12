/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gh.model;

/**
 *
 * @author lenovo
 */
public class testPaper {
    String id;
    String tc;
    String sc;
    String answer;
    int score;
    int flag;

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTc() {
        return tc;
    }

    public void setTc(String tc) {
        this.tc = tc;
    }

    public String getSc() {
        return sc;
    }

    public void setSc(String sc) {
        this.sc = sc;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public testPaper() {
    }

    public testPaper(String id, String tc, String sc, String answer, int score) {
        this.id = id;
        this.tc = tc;
        this.sc = sc;
        this.answer = answer;
        this.score = score;
    }

    @Override
    public String toString() {
        return "testPaper{" + "id=" + id + ", tc=" + tc + ", sc=" + sc + ", answer=" + answer + ", score=" + score + ", flag=" + flag + '}';
    }

    
    
}
