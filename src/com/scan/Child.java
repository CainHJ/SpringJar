package com.scan;

import org.springframework.stereotype.Component;

@Component("child")
public class Child {
    public Child(){
        System.out.println("创建Child");
    }

    public void say(){
        System.out.println("Child说");
    }

}