package com.study.designpatterns._03_behavioral_patterns._23_visitor._01_before;

public class Client {

    public static void main(String[] args) {
        Shape rectangle = new Rectangle();
        rectangle.printTo(new Phone());
    }
}
