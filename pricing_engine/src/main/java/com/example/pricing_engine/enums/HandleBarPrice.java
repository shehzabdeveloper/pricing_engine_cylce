/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.pricing_engine.enums;

/**
 *
 * @author Shehzab Ahammad
 */
public enum HandleBarPrice {
    WithBrake(600),
    WithoutBrake(400);

    public final int price;

    HandleBarPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
