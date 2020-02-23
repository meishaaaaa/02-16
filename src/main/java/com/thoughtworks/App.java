package com.thoughtworks;

import java.text.ParseException;

public class App {

    public static void main(String[] args) throws ParseException {
        Student zhangS = new Student("张三", "001", "2019.02.11");
        Student liS = new Student("李四", "002", "2019.02.10");
        Student wangW = new Student("王五", "001", "2019.02.09");

        Teacher zhangL = new Teacher();
        zhangL.setName("张龙");
        zhangL.addStu(zhangS);
        zhangL.addStu(liS);
        zhangL.addStu(wangW);

        System.out.println(zhangL.checkRepeatedStu(zhangL.getStuList()));
    }
}

