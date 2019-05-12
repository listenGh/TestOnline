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
public class Admin {
    String id;
    String pwd;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public Admin() {
    }

    @Override
    public String toString() {
        return "Admin{" + "id=" + id + ", pwd=" + pwd + '}';
    }

    public Admin(String id, String pwd) {
        this.id = id;
        this.pwd = pwd;
    }
    
}
