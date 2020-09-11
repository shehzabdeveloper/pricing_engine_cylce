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
public enum Components {
    Frame(1),
    HandleBar(2),
    Seating(3),
    Wheels(4),
    ChainAssembly(5),
    Buy(6);

    public final int value;

    Components(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

}
