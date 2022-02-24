package com.study.designpatterns._01_creational_patterns._02_factorymethod._02_after;

public class WhiteshipFactory extends DefaultShipFactory {

    @Override
    public Ship createShip() {
        return new Whiteship();
    }
}