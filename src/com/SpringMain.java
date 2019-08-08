package com;

import com.base.Computer;
import com.scan.Child;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringMain {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        Child child=ac.getBean("child",Child.class);
        child.say();
        Computer computer=ac.getBean("myComputer",Computer.class);
        System.out.println(computer.getMembers().get("主人"));
        System.out.println(computer.getMembers().get("日期"));

    }

}