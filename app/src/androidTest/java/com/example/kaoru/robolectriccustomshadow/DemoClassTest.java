package com.example.kaoru.robolectriccustomshadow;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

import java.util.Objects;

import static org.junit.Assert.*;

/**
 * Created by kaoru on 15/01/11.
 */
@RunWith(CustomRobolectricTestRunner.class)
@Config(emulateSdk = 16, shadows = ShadowDemoClass.class)
public class DemoClassTest {

    private DemoClass mDemoClass;
    private ShadowDemoClass mShadowDemoClass;

    @Before
    public void setUp() {
        mDemoClass = new DemoClass();

        ShadowDemoClass mShadowDemoClass = Robolectric.shadowOf_(mDemoClass);
        assertNotNull(mShadowDemoClass);
    }

    @Test
    public void publicMethod() {
        assertEquals(2, mDemoClass.publicMethod());
    }

    @Test
    public void callPrivateMethod() {
        assertEquals(2, mDemoClass.callPrivateMethod());
    }

    @Test
    public void publicStaticMethod() {
        assertEquals(2, DemoClass.publicStaticMethod());
    }

    @Test
    public void callPrivateStaticMethod() {
        assertEquals(2, DemoClass.callPrivateStaticMethod());
    }

    @Test
    public void publicNativeMethod() {
        assertEquals(2, mDemoClass.publicNativeMethod());
    }

    @Test
    public void callPrivateNativeMethod() {
        assertEquals(2, mDemoClass.callPrivateNativeMethod());
    }
}
