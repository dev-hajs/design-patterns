package com.study.designpatterns._01_creational_patterns._02_factorymethod._02_after;

public class Client {

    public static void main(String[] args) {
        Client client = new Client();

        Ship whiteship = new WhiteshipFactory().orderShip("Whiteship", "dev.hajs@gmail.com");
        System.out.println(whiteship);

        Ship blackship = new BlackshipFactory().orderShip("Blackship", "dev.hajs@gmail.com");
        System.out.println(blackship);
    }
}
