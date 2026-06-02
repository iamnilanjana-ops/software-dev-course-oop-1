package org.example;

public class Student {

    private String name;
    private double grade;
    private int daysAbsent;

    // Constructor
    public Student(String name, double grade, int daysAbsent) {
        this.name = name;
        this.grade = grade;
        this.daysAbsent = daysAbsent;
    }

    // Getters
    public String getName() {
        return name;
    }

    public double getGrade() {
        return grade;
    }

    public int getDaysAbsent() {
        return daysAbsent;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public void setDaysAbsent(int daysAbsent) {
        this.daysAbsent = daysAbsent;
    }

    // Add one absence
    public void addAbsence() {
        daysAbsent++;
    }

    // Add bonus points
    public void addBonusPoints(double bonusPoints) {
        grade += bonusPoints;
    }

    // String representation
    @Override
    public String toString() {
        return name + " " + grade;
    }
}