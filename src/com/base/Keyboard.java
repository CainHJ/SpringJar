package com.base;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


public class Keyboard {

    private Integer price;

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getPrice() {
        return price;
    }
}