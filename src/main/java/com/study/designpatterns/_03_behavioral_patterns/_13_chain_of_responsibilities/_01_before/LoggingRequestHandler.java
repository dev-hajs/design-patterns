package com.study.designpatterns._03_behavioral_patterns._13_chain_of_responsibilities._01_before;

public class LoggingRequestHandler extends RequestHandler {

    @Override
    public void handle(Request request) {
        System.out.println("로깅1");
        System.out.println("로깅2");

        super.handle(request);
    }
}
