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
public enum Seat {
    Leather(1),
    Cloth(2);

    public final int value;

    Seat(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
