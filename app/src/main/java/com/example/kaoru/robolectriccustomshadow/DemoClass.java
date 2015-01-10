package com.example.kaoru.robolectriccustomshadow;

/**
 * Created by kaoru on 15/01/11.
 */
@HasShadow
public class DemoClass {

    public int publicMethod() {
        return 1;
    }

    private int privateMethod() {
        return 1;
    }

    public int callPrivateMethod() {
        return privateMethod();
    }

    public static int publicStaticMethod() {
        return 1;
    }

    private static int privateStaticMethod() {
        return 1;
    }

    public static int callPrivateStaticMethod() {
        return privateStaticMethod();
    }

    public native int publicNativeMethod();

    private native int privateNativeMethod();

    public int callPrivateNativeMethod() {
        return privateNativeMethod();
    }
}
