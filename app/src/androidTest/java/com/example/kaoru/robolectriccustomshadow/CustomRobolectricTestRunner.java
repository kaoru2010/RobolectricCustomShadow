package com.example.kaoru.robolectriccustomshadow;

import org.junit.runners.model.InitializationError;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.bytecode.ClassInfo;
import org.robolectric.bytecode.Setup;

/**
 * Created by kaoru on 15/01/11.
 */
public class CustomRobolectricTestRunner extends RobolectricTestRunner {
    public CustomRobolectricTestRunner(Class<?> testClass) throws InitializationError {
        super(testClass);
    }

    @Override
    public Setup createSetup() {
        return new Setup() {
            @Override
            public boolean shouldInstrument(ClassInfo classInfo) {
                if (super.shouldInstrument(classInfo)) return true;

                return classInfo.hasAnnotation(HasShadow.class);
            }
        };
    }
}
