package com.example.kaoru.robolectriccustomshadow;

import org.robolectric.annotation.Implementation;
import org.robolectric.annotation.Implements;

/**
 * Created by kaoru on 15/01/11.
 */
@Implements(DemoClass.class)
public class ShadowDemoClass {

    @Implementation
    public int publicMethod() {
        return 2;
    }

    @Implementation
    public int privateMethod() {
        return 2;
    }

    @Implementation
    public static int publicStaticMethod() {
        return 2;
    }

    @Implementation
    public static int privateStaticMethod() {
        return 2;
    }

    @Implementation
    public int publicNativeMethod() {
        return 2;
    }

    @Implementation
    public int privateNativeMethod() {
        return 2;
    }
}
