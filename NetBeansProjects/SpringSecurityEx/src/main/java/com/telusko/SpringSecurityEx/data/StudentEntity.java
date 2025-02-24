/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.telusko.SpringSecurityEx.data;

/**
 *
 * @author Murilo
 */
public class StudentEntity {
    private int id;
    private String name;
    private int marks;

    public StudentEntity(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    
    @Override
    public String toString() {
        return "StudentEntity{" + "id=" + id + ", name=" + name + ", marks=" + marks + '}';
    }
    
    
}
