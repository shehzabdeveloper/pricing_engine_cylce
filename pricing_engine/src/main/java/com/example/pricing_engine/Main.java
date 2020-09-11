/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.pricing_engine;

import com.example.pricing_engine.enums.ChainAssembly;
import com.example.pricing_engine.model.Price;
import com.example.pricing_engine.enums.Components;
import com.example.pricing_engine.enums.Frame;
import com.example.pricing_engine.enums.HandleBar;
import com.example.pricing_engine.enums.Seat;
import com.example.pricing_engine.enums.Wheels;
import com.example.pricing_engine.util.PriceList;
import com.example.pricing_engine.util.Constants;
import java.util.EnumSet;
import java.util.Scanner;

/**
 *
 * @author Shehzab Ahammad
 */
public class Main {

    public static Scanner sc = new Scanner(System.in);
    public static Price price = new Price();

    public static void main(String args[]) {

        System.out.println("Pricing Engine for Cycle");
        System.out.println("Select purechase month:");
        System.out.println("1.Jan/2016 - Nov/2016 \n2.Dec2-2016 - Onwards");
        int priceCycle = sc.nextInt();
        if (priceCycle == 1) {
            price.setPriceCycle(Constants.PeriodOne);
        } else {
            price.setPriceCycle(Constants.PeriodTwo);
        }

        callMethod();
    }

    private static void callMethod() {

        System.out.println("Select the components from list");
        EnumSet.allOf(Components.class)
                .forEach(type -> {
                    System.out.println(type.value + "." + type);
                });
        int option = sc.nextInt();
        Components[] components = Components.values();
        switch (components[option - 1]) {
            case Frame: {
                frameSelection(components[option - 1].toString());
                callMethod();
                break;
            }
            case HandleBar: {
                handleBarSelection(components[option - 1].toString());
                callMethod();
                break;
            }
            case Seating: {
                seatSelection(components[option - 1].toString());
                callMethod();
                break;
            }
            case Wheels: {
                wheelSelection(components[option - 1].toString());
                callMethod();
                break;
            }
            case ChainAssembly: {
                chainSelection(components[option - 1].toString());
                callMethod();
                break;
            }
            case Buy: {
                buyProduct();
                break;
            }
        }
    }

    private static void frameSelection(String itemComponent) {
        System.out.println("Select Frame type:");
        EnumSet.allOf(Frame.class)
                .forEach(type -> {
                    System.out.println(type.value + "." + type);
                });

        int option = sc.nextInt();
        Frame[] frameValues = Frame.values();

        String typ = frameValues[option - 1].toString();

        price.setFrameType(typ);
        PriceList.pricing(itemComponent, typ, price.getPriceCycle());
        System.out.println("Your cart: " + price.getFrameType() + " - " + price.getFramePrice());
    }

    private static void handleBarSelection(String itemComponent) {
        System.out.println("Select Handle Bar type:");
        EnumSet.allOf(HandleBar.class)
                .forEach(type -> {
                    System.out.println(type.value + "." + type);
                });

        int option = sc.nextInt();
        HandleBar[] handleBarValues = HandleBar.values();

        String typ = handleBarValues[option - 1].toString();

        price.setHandleBarType(typ);
        PriceList.pricing(itemComponent, typ, price.getPriceCycle());
        System.out.println("Your cart: " + price.getHandleBarType() + " - " + price.getHandleBarPrice());
    }

    private static void seatSelection(String itemComponent) {
        System.out.println("Select Seat type:");
        EnumSet.allOf(Seat.class)
                .forEach(type -> {
                    System.out.println(type.value + "." + type);
                });

        int option = sc.nextInt();
        Seat[] seatValues = Seat.values();
        String typ = seatValues[option - 1].toString();
        price.setSeatType(typ);
        PriceList.pricing(itemComponent, typ, price.getPriceCycle());
        System.out.println("Your cart: " + price.getSeatType() + " - " + price.getSeatPrice());
    }

    private static void wheelSelection(String itemComponent) {
        System.out.println("Select Wheel type:");
        EnumSet.allOf(Wheels.class)
                .forEach(type -> {
                    System.out.println(type.value + "." + type);
                });

        int option = sc.nextInt();
        Wheels[] seatValues = Wheels.values();
        String typ = seatValues[option - 1].toString();
        price.setWheelType(typ);
        PriceList.pricing(itemComponent, typ, price.getPriceCycle());
        System.out.println("Your cart: " + price.getWheelType() + " - " + price.getWheelPrice());
    }

    private static void chainSelection(String itemComponent) {
        System.out.println("Select Chain Assembly type:");
        EnumSet.allOf(ChainAssembly.class)
                .forEach(type -> {
                    System.out.println(type.value + "." + type);
                });

        int option = sc.nextInt();
        ChainAssembly[] seatValues = ChainAssembly.values();
        String typ = seatValues[option - 1].toString();
        price.setChainType(typ);
        PriceList.pricing(itemComponent, typ, price.getPriceCycle());
        System.out.println("Your cart: " + price.getChainType() + " - " + price.getChainPrice());
    }

    private static void buyProduct() {
        System.out.println("Your orders:");
        System.out.println("Frame type: " + price.getFrameType() + " - Price: " + price.getFramePrice());
        System.out.println("HandleBar type: " + price.getHandleBarType() + " - Price: " + price.getHandleBarPrice());
        System.out.println("Seat type: " + price.getSeatType() + " - Price: " + price.getSeatPrice());
        System.out.println("Wheel type: " + price.getWheelType() + " - Price: " + price.getWheelPrice());
        System.out.println("Chain type: " + price.getChainType() + " - Price: " + price.getChainPrice());
        int total = price.getFramePrice() + price.getHandleBarPrice() + price.getSeatPrice() + price.getWheelPrice() + price.getChainPrice();
        System.out.println("Total: " + total);
    }

    public static Price getPriceInstance() {
        return price;
    }
}
