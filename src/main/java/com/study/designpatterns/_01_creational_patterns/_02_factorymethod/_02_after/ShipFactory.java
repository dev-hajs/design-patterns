package com.study.designpatterns._01_creational_patterns._02_factorymethod._02_after;

public interface ShipFactory {

    default Ship orderShip(String name, String email) {
        validate(name, email);
        prepareFor(name);
        Ship ship = createShip();
        sendEmailTo(email, ship);
        return ship;
    }

    Ship createShip();

    private void validate(String name, String email) {
        // validate
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("배 이름을 지어주세요.");
        }
        if (email == null || email.isBlank()) {
            throw new IllegalArgumentException("연락처를 남겨주세요.");
        }
    }

    private void prepareFor(String name) {
        System.out.println(name + " 만들 준비 중");
    }

    // interface 에 private 메소드는 1.9 에 등장했다.
    // 따라서 1.8 이하는 DefaultShipFactory 처럼 계층구조를 하나 더 만들어서 진행하면 된다.
    void sendEmailTo(String email, Ship ship);
}
