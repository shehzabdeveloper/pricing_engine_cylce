/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.pricing_engine.model;

/**
 *
 * @author Shehzab Ahammad
 */
public class Price {

    String priceCycle;
    String frameType;
    int framePrice;
    String handleBarType;
    int handleBarPrice;
    String seatType;
    int seatPrice;
    String wheelType;
    int wheelPrice;
    String chainType;
    int chainPrice;

    public String getPriceCycle() {
        return priceCycle;
    }

    public void setPriceCycle(String priceCycle) {
        this.priceCycle = priceCycle;
    }

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

    public String getSeatType() {
        return seatType;
    }

    public void setSeatType(String seatType) {
        this.seatType = seatType;
    }

    public int getSeatPrice() {
        return seatPrice;
    }

    public void setSeatPrice(int seatPrice) {
        this.seatPrice = seatPrice;
    }

    public String getWheelType() {
        return wheelType;
    }

    public void setWheelType(String wheelType) {
        this.wheelType = wheelType;
    }

    public int getWheelPrice() {
        return wheelPrice;
    }

    public void setWheelPrice(int wheelPrice) {
        this.wheelPrice = wheelPrice;
    }

    public String getChainType() {
        return chainType;
    }

    public void setChainType(String chainType) {
        this.chainType = chainType;
    }

    public int getChainPrice() {
        return chainPrice;
    }

    public void setChainPrice(int chainPrice) {
        this.chainPrice = chainPrice;
    }

}
