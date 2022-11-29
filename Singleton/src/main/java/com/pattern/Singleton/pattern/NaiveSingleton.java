package com.pattern.Singleton.pattern;

public final class NaiveSingleton {

    private static NaiveSingleton instance;

    public String value;

    private NaiveSingleton(String value) {
        // The following code emulates slow initialization.
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.value = value;
    }

    public static NaiveSingleton getInstance(String value) {

        if (instance == null) {
            instance = new NaiveSingleton(value);
        }

        return instance;
    }

}
