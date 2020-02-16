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


    public static ArrayList<Student> repeatedStu(ArrayList<Student> originList) {
        ArrayList<Student> result = new ArrayList<Student>();
        for (int i = 0; i < originList.size(); i++) {
                for (int j = 0; j < originList.size(); j++) {
                    if (originList.get(i).getStuNum() == originList.get(j).getStuNum() && i!=j) {
                        result.add(originList.get(i));
                        break;
                    }
                }
            }
        return result;
    }
}
