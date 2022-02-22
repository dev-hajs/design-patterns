package com.study.designpatterns.singleton;

import java.io.Serializable;

public class Settings implements Serializable {

    private static volatile Settings instance;

    private Settings() {}

    public static Settings getInstance() {
        if (instance == null) {
            synchronized (Settings.class) {
                if (instance == null) {
                    instance = new Settings();
                }
            }
        }

        return instance;
    }

//    protected Object readResolve() {
//        return getInstance();
//    }
}
