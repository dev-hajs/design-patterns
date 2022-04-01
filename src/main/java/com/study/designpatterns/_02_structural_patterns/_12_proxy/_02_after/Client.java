package com.study.designpatterns._02_structural_patterns._12_proxy._02_after;

public class Client {

    public static void main(String[] args) {
        // lazy initialize 로 생성자 매개변수를 보내지 않아도 됨
//        GameService gameService = new GameServiceProxy(new DefaultGameService());
        GameService gameService = new GameServiceProxy();
        gameService.startGame();
    }
}
