/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.pricing_engine;

/**
 *
 * @author Shehzab Ahammad
 */
public class Price {

    String frameType;
    int framePrice;
    String handleBarType;
    int handleBarPrice;

    public String getFrameType() {
        return frameType;
    }

    public void setFrameType(String frameType) {
        this.frameType = frameType;
    }

    public int getFramePrice() {
        return framePrice;
    }

    public void setFramePrice(int framePrice) {
        this.framePrice = framePrice;
    }

    public String getHandleBarType() {
        return handleBarType;
    }

    public void setHandleBarType(String handleBarType) {
        this.handleBarType = handleBarType;
    }

    public int getHandleBarPrice() {
        return handleBarPrice;
    }

    public void setHandleBarPrice(int handleBarPrice) {
        this.handleBarPrice = handleBarPrice;
    }

}
