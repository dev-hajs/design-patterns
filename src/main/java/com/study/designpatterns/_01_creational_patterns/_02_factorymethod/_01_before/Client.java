package com.study.designpatterns._01_creational_patterns._02_factorymethod._01_before;

public class Client {

    public static void main(String[] args) {
        Client client = new Client();

        Ship whiteship = WhiteshipFactory.orderShip("Whiteship", "dev.hajs@gmail.com");
        System.out.println(whiteship);

        Ship blackship = WhiteshipFactory.orderShip("Blackship", "dev.hajs@gmail.com");
        System.out.println(blackship);
    }
}
