package com.thoughtworks;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
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

    public String getStuNum() {
        return stuNum;
    }

    public String getDateOfEnroll() {
        return dateOfEnroll;
    }

    @Override
    public String toString() {
        try {
            return "我叫" + name +
                    "，我的学号是" + stuNum +
                    "，" + getDateString(dateOfEnroll) +
                    "入学，学龄" + studyYear(dateOfEnroll) + "年\n";
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }

    public String getDateString(String dateOfEnroll) throws ParseException {
        SimpleDateFormat s1 = new SimpleDateFormat("yyyy.MM.dd");
        Date date = (Date) s1.parse(dateOfEnroll);
        s1 = new SimpleDateFormat("yyyy年MM月dd日");
        String printDate = s1.format(date);
        return printDate;
    }

    public int studyYear(String dateOfEnroll) {
        String[] splitDate = dateOfEnroll.split("\\.");
        int year = Integer.parseInt(splitDate[0]);
        int month = Integer.parseInt(splitDate[1]);
        int day = Integer.parseInt(splitDate[2]);
        int studyYear = Period.between(LocalDate.of(year, month, day), LocalDate.now()).getYears();
        return studyYear;
    }


}
