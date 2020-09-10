/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.pricing_engine.enums;

import java.util.stream.Stream;

/**
 *
 * @author Shehzab Ahammad
 */
public enum Frame {
    STEEL(1),
    ALUMINUM(2);

    public final int value;

    Frame(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
    
}
