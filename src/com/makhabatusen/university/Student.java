package com.makhabatusen.university;

public class Student {
    private String studentName;
    private int studentAge;
    private double studentGrade;
    private String comment;

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(int studentAge) {
        this.studentAge = studentAge;
    }

    public double getStudentGrade() {
        return studentGrade;
    }

    public void setStudentGrade(double studentGrade) {
        this.studentGrade = studentGrade;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(Double studentGrade) {
        if (studentGrade >= 5) comment = "Excellent student.";
        else comment = "Average student.";    }
}
