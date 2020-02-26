package com.thoughtworks;

import java.util.ArrayList;

public class Teacher {
    private String name;
    private ArrayList<Student> stuList = new ArrayList<>();

    public Teacher() {
    }

    public Teacher(String name, ArrayList<Student> stuList) {
        this.name = name;
        this.stuList = stuList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Student> getStuList() {
        return stuList;
    }

    public void setStuList(ArrayList<Student> stuList) {
        this.stuList = stuList;
    }

    public void addStu(Student student) {
        this.stuList.add(student);
    }


    public ArrayList<Student> checkRepeatedStu(ArrayList<Student> originList) {
        ArrayList<Student> repeatedStuList = new ArrayList<>();
        for (Student student1 : originList) {
            for (Student student2 : originList) {
                if (student1.equals(student2) && !repeatedStuList.contains(student1)) {
                    repeatedStuList.add(student1);
                }
            }
        }
        return repeatedStuList;
    }

    public void printRepeatedList(ArrayList<Student> repeatedStuList) {
        StringBuilder summary = new StringBuilder();
        summary.append("重复学生名单如下:\n");
        for (Student student : repeatedStuList) {
            summary.append(student.getName() + ",").append(student.getStuNum() + ",")
                    .append(student.getDateOfEnroll() + "\n");
        }
        System.out.println(summary.toString());
    }
}
