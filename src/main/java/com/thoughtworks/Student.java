package com.thoughtworks;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Student {
    private String name;
    private String stuNum;
    private String dateOfEnroll;

    public Student() {
    }

    public Student(String name, String stuNum, String dateOfEnroll) {
        this.name = name;
        this.stuNum = stuNum;
        this.dateOfEnroll = dateOfEnroll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStuNum() {
        return stuNum;
    }

    public void setStuNum(String stuNum) {
        this.stuNum = stuNum;
    }

    public String getDateOfEnroll() {
        return dateOfEnroll;
    }

    public void setDateOfEnroll(String dateOfEnroll) {
        this.dateOfEnroll = dateOfEnroll;
    }

    @Override
    public String toString() {
        try {
            return "我叫" + name +
                    "，我的学号是" + stuNum +
                    "，" + printDate(dateOfEnroll) +
                    "入学，学龄" + studyYear(dateOfEnroll) + "年";
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }

    public String printDate(String dateOfEnroll) throws ParseException {
        SimpleDateFormat s1 = new SimpleDateFormat("yyyy.MM.dd");
        Date date = (Date) s1.parse(dateOfEnroll);
        s1 = new SimpleDateFormat("yyyy年MM月dd日");
        String printDate = s1.format(date);
        return printDate;
    }

    public int studyYear(String dateOfEnroll) throws ParseException {
        SimpleDateFormat s1 = new SimpleDateFormat("yyyy.MM.dd");
        Date date1 = s1.parse(dateOfEnroll);
        Date date = new Date();
        long day = ((date.getTime() - date1.getTime()) / (24 * 60 * 60 * 1000));
        double year1 = day / 365 + 1;
        int year = (int) year1;
        return year;
    }

}
