/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.pricing_engine.util;

import com.example.pricing_engine.Main;
import com.example.pricing_engine.enums.Components;
import com.example.pricing_engine.enums.*;
import static com.example.pricing_engine.enums.Frame.STEEL;
import static com.example.pricing_engine.util.Constants.PeriodOne;
import static com.example.pricing_engine.util.Constants.PeriodTwo;

/**
 *
 * @author Shehzab Ahammad
 */
public class PriceList {

    public static void pricing(String itemComponent, String itemType, String purchaseDate) {
        switch (Components.valueOf(itemComponent)) {
            case Frame: {
                framePrice(itemType, purchaseDate);
                break;
            }
            case HandleBar: {
                handleBarPrice(itemType, purchaseDate);
                break;
            }
            case Seating: {
                seatPrice(itemType, purchaseDate);
                break;
            }
            case Wheels: {
                wheelPrice(itemType, purchaseDate);
                break;
            }
            case ChainAssembly: {
                chainPrice(itemType, purchaseDate);
                break;
            }
        }
    }

    private static void framePrice(String itemType, String purchaseDate) {
        switch (purchaseDate) {
            case PeriodOne: {
                switch (Frame.valueOf(itemType)) {
                    case STEEL: {
                        Main.getPriceInstance().setFramePrice(250);
                        break;
                    }
                    case ALUMINUM: {
                        Main.getPriceInstance().setFramePrice(400);
                        break;
                    }
                }
                break;
            }
            case PeriodTwo: {
                switch (Frame.valueOf(itemType)) {
                    case STEEL: {
                        Main.getPriceInstance().setFramePrice(300);
                        break;
                    }
                    case ALUMINUM: {
                        Main.getPriceInstance().setFramePrice(500);
                        break;
                    }
                }
                break;
            }
        }
    }

    private static void handleBarPrice(String itemType, String purchaseDate) {
        switch (purchaseDate) {
            case PeriodOne: {
                switch (HandleBar.valueOf(itemType)) {
                    case WithBrake: {
                        Main.getPriceInstance().setHandleBarPrice(250);
                        break;
                    }
                    case WithoutBrake: {
                        Main.getPriceInstance().setHandleBarPrice(400);
                        break;
                    }
                }
                break;
            }
            case PeriodTwo: {
                switch (HandleBar.valueOf(itemType)) {
                    case WithBrake: {
                        Main.getPriceInstance().setHandleBarPrice(300);
                        break;
                    }
                    case WithoutBrake: {
                        Main.getPriceInstance().setHandleBarPrice(500);
                        break;
                    }
                }
                break;
            }
        }
    }

    private static void seatPrice(String itemType, String purchaseDate) {
        switch (purchaseDate) {
            case PeriodOne: {
                switch (Seat.valueOf(itemType)) {
                    case Leather: {
                        Main.getPriceInstance().setSeatPrice(250);
                        break;
                    }
                    case Cloth: {
                        Main.getPriceInstance().setSeatPrice(400);
                        break;
                    }
                }
                break;
            }
            case PeriodTwo: {
                switch (Seat.valueOf(itemType)) {
                    case Leather: {
                        Main.getPriceInstance().setSeatPrice(300);
                        break;
                    }
                    case Cloth: {
                        Main.getPriceInstance().setSeatPrice(500);
                        break;
                    }
                }
                break;
            }
        }
    }

    private static void wheelPrice(String itemType, String purchaseDate) {
        switch (purchaseDate) {
            case PeriodOne: {
                switch (Wheels.valueOf(itemType)) {
                    case Tubeless: {
                        Main.getPriceInstance().setWheelPrice(250);
                        break;
                    }
                    case Tube: {
                        Main.getPriceInstance().setWheelPrice(400);
                        break;
                    }
                }
                break;
            }
            case PeriodTwo: {
                switch (Wheels.valueOf(itemType)) {
                    case Tubeless: {
                        Main.getPriceInstance().setWheelPrice(300);
                        break;
                    }
                    case Tube: {
                        Main.getPriceInstance().setWheelPrice(500);
                        break;
                    }
                }
                break;
            }
        }
    }

    private static void chainPrice(String itemType, String purchaseDate) {
        switch (purchaseDate) {
            case PeriodOne: {
                switch (ChainAssembly.valueOf(itemType)) {
                    case Gear4: {
                        Main.getPriceInstance().setChainPrice(250);
                        break;
                    }
                    case Gear8: {
                        Main.getPriceInstance().setChainPrice(400);
                        break;
                    }
                }
                break;
            }
            case PeriodTwo: {
                switch (ChainAssembly.valueOf(itemType)) {
                    case Gear4: {
                        Main.getPriceInstance().setChainPrice(250);
                        break;
                    }
                    case Gear8: {
                        Main.getPriceInstance().setChainPrice(400);
                        break;
                    }
                }
                break;
            }
        }
    }
}
