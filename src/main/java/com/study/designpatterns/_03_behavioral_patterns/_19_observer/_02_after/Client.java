package com.study.designpatterns._03_behavioral_patterns._19_observer._02_after;

public class Client {

    public static void main(String[] args) {
        ChatServer chatServer = new ChatServer();
        User user1 = new User("jisuha");
        User user2 = new User("hajs");

        chatServer.register("오징어게임", user1);
        chatServer.register("오징어게임", user2);

        chatServer.register("디자인패턴", user1);

        chatServer.sendMessage(user1, "오징어게임", "이름이 기억났어..");
        chatServer.sendMessage(user2, "디자인패턴", "옵저버 패턴 구현 중..");
    }
}
