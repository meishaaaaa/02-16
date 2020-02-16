package com.thoughtworks;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class App {

    public static void main(String[] args) throws ParseException {
        Student one = new Student("张三", "001", "2019.02.11");
        Student two = new Student("李四", "002", "2019.02.10");
        Student three = new Student("王五", "001", "2019.02.09");

        Teacher zhangL = new Teacher();
        zhangL.setName("张龙");
        zhangL.addStu(one);
        zhangL.addStu(two);
        zhangL.addStu(three);


        System.out.println(zhangL.repeatedStu(zhangL.getStuList()));

    }
}

