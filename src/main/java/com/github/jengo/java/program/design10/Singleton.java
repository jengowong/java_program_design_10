package com.github.jengo.java.program.design10;

public final class Singleton {
    private static final Singleton uniqueInstance = new Singleton();

    private Singleton() {
    }

    public static Singleton getInstance() {
        return uniqueInstance;
    }
}
