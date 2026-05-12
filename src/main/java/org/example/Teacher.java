package org.example;

public class Teacher {

    private String name;
    private String subject;

    // Constructor
    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getSubject() {
        return subject;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    // Teacher action
    public void teach() {
        System.out.println(name + " teaches " + subject);
    }

    // Print/display teacher information
    @Override
    public String toString() {
        return "Name: " + name + ", Subject: " + subject;
    }
}