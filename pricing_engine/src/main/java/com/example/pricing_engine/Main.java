/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.pricing_engine;

import com.example.pricing_engine.enums.Components;
import com.example.pricing_engine.enums.Frame;
import com.example.pricing_engine.enums.FramePrice;
import com.example.pricing_engine.enums.HandleBar;
import com.example.pricing_engine.enums.HandleBarPrice;
import com.example.pricing_engine.enums.Seat;
import com.example.pricing_engine.enums.SeatPrice;
import java.util.EnumSet;
import java.util.Scanner;

/**
 *
 * @author Shehzab Ahammad
 */
public class Main {

    static Scanner sc = new Scanner(System.in);
    static Price price = new Price();

    public static void main(String args[]) {

        System.out.println("Pricing Engine for Cycle");
        callMethod();
    }

//    private <T extends Enum<T>> void enumSetting(Class<T> enumType) {
//        EnumSet.allOf(enumType.)
//                .forEach(type -> {
//            System.out.println(type.value + "." + type);
//        });
//
//    }
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
                frameSelection();
                callMethod();
                break;
            }
            case HandleBar: {
                handleBarSelection();
                callMethod();
                break;
            }
            case Seating: {
                seatSelection();
                callMethod();
                break;
            }
            case Wheels: {
                frameSelection();
                callMethod();
                break;
            }
            case ChainAssembly: {
                frameSelection();
                callMethod();
                break;
            }

            default:
                break;

        }
    }

    private static void frameSelection() {
        System.out.println("Select Frame type:");
        EnumSet.allOf(Frame.class)
                .forEach(type -> {
                    System.out.println(type.value + "." + type);
                });

        int frameOption = sc.nextInt();
        Frame[] frameValues = Frame.values();
//        System.out.println(frameValues[frameOption - 1]);

        String typ = frameValues[frameOption - 1].toString();

//        System.out.println(FramePrice.valueOf(typ).getPrice());
        price.setFrameType(typ);
        price.setFramePrice(FramePrice.valueOf(typ).getPrice());
    }

    private static void handleBarSelection() {
        System.out.println("Select Handle Bar type:");
        EnumSet.allOf(HandleBar.class)
                .forEach(type -> {
                    System.out.println(type.value + "." + type);
                });

        int handleBarOption = sc.nextInt();
        HandleBar[] handleBarValues = HandleBar.values();
        System.out.println(handleBarValues[handleBarOption - 1]);

        String typ = handleBarValues[handleBarOption - 1].toString();

        System.out.println(HandleBarPrice.valueOf(typ).getPrice());
        price.setHandleBarType(typ);
        price.setHandleBarPrice(HandleBarPrice.valueOf(typ).getPrice());
    }

    private static void seatSelection() {
        System.out.println("Select Seat type:");
        EnumSet.allOf(Seat.class)
                .forEach(type -> {
                    System.out.println(type.value + "." + type);
                });

        int handleBarOption = sc.nextInt();
        Seat[] seatValues = Seat.values();
        System.out.println(seatValues[handleBarOption - 1]);

        String typ = seatValues[handleBarOption - 1].toString();

        System.out.println(SeatPrice.valueOf(typ).getPrice());
        price.setHandleBarType(typ);
        price.setHandleBarPrice(SeatPrice.valueOf(typ).getPrice());
    }
}
