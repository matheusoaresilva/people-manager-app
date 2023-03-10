package com.matheus.peoplemanager.model;


public class Student {

    private Long id;
    private String name;
    private String email;
    private String jobTitle;
    private String phone;
    private String imageUrl;
    private String studentCode;

    public Student(){

    }

    public Student(Long id, String name, String email, String jobTitle, String phone, String imageUrl, String studentCode) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.jobTitle = jobTitle;
        this.phone = phone;
        this.imageUrl = imageUrl;
        this.studentCode = studentCode;
    }
}
