package com.study.designpatterns._02_structural_patterns._12_proxy._02_after;

public class GameServiceProxy implements GameService {

    private GameService gameService;

    // lazy initialize 로 인해 생략 가능해졌음
//    public GameServiceProxy(GameService gameService) {
//        this.gameService = gameService;
//    }

    @Override
    public void startGame() {
        long before = System.currentTimeMillis();

        // (optional) lazy initialize
        if (this.gameService == null) {
            this.gameService = new DefaultGameService();
        }
        // (optional) security method

        gameService.startGame();
        System.out.println(System.currentTimeMillis() - before);
    }
}
