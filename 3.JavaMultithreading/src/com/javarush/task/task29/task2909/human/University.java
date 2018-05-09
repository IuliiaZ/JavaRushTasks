package com.javarush.task.task29.task2909.human;

import java.util.List;

public class University {
    private String name;
    private int age;
    private List<Student> students;

    public University(String name, int age) {
        this.name = name;
        this.age = age;
        students = StudentsDataBase.students;
    }

    public Student getStudentWithAverageGrade(double averageGrade) {
        for (Student student : students){
            if (student.getAverageGrade() == averageGrade){
                return student;
            }
        }
        return null;
    }

    public Student getStudentWithMaxAverageGrade() {
        Student maxAG = students.get(0);
        double av = students.get(0).getAverageGrade();
        for (Student student : students){
            if (student.getAverageGrade()>av){
                av = student.getAverageGrade();
                maxAG = student;
            }
        }
        return maxAG;
    }
    public Student getStudentWithMinAverageGrade(){
        Student minAG = students.get(0);
        double av = students.get(0).getAverageGrade();
        for (Student student : students){
            if (student.getAverageGrade()<av){
                av = student.getAverageGrade();
                minAG = student;
            }
        }
        return minAG;
    }
    public void expel(Student student){
        students.remove(student);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List getStudents() {
        return students;
    }

    public void setStudents(List students) {
        this.students = students;
    }
}