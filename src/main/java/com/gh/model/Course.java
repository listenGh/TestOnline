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
public class Course {
    String id;
    String name;
    String remarks;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public Course() {
    }

    @Override
    public String toString() {
        return "Course{" + "id=" + id + ", name=" + name + ", remarks=" + remarks + '}';
    }

    public Course(String id, String name, String remarks) {
        this.id = id;
        this.name = name;
        this.remarks = remarks;
    }
    
}
