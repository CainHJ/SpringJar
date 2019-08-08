package com.base;

import org.springframework.beans.factory.annotation.Value;



public class Mouse {


    private Integer price;

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getPrice() {
        return price;
    }
}