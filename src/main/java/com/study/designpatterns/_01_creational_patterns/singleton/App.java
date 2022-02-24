package com.study.designpatterns._01_creational_patterns.singleton;

import java.io.*;
import java.lang.reflect.InvocationTargetException;

public class App {

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, IOException, ClassNotFoundException {
        Settings settings1 = Settings.INSTANCE;
        Settings settings2 = Settings.INSTANCE;
        System.out.println(settings1 == settings2);

        // reflection
//        Settings settings3 = null;
//        Constructor<?>[] declaredConstructors = Settings.class.getDeclaredConstructors();
//        for (Constructor<?> constructor : declaredConstructors) {
//            constructor.setAccessible(true);
//            settings1 = (Settings) constructor.newInstance("INSTANCE");
//        }
//        System.out.println(settings1 == settings3);

        // serializable
        Settings settings4 = null;
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("settings.obj"))) {
            out.writeObject(settings1);
        }
        try (ObjectInput in = new ObjectInputStream(new FileInputStream("settings.obj"))) {
            settings4 = (Settings) in.readObject();
        }
        System.out.println(settings1 == settings4);

    }
}
