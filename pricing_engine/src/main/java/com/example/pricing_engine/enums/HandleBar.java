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
public enum HandleBar {
    WithBrake(1),
    WithoutBrake(2);

    public final int value;

    HandleBar(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

}
