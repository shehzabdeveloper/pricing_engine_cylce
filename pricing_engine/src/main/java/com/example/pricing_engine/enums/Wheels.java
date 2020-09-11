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
public enum Wheels {
    Tubeless(1),
    Tube(2);

    public final int value;

    Wheels(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
