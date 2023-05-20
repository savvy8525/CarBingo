package com.savannahyost.carbingo;

import android.content.Context;
import android.content.ContextWrapper;
import android.widget.Button;

import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

import com.savannahyost.carbingo.Controller.ButtonFactory;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
    @Test
    public void useAppContext() {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getInstrumentation().getTargetContext();
        assertEquals("com.savannahyost.carbingo", appContext.getPackageName());
    }

    //TODO:fix this test to simulated a button pressed true state
    @Test
    public void checkColumnWinIsWorking() {
        Context appContext = InstrumentationRegistry.getInstrumentation().getTargetContext();
        Button button = new Button(appContext);

        for (int i = 0; i < 5; i++) {
            ButtonFactory.updateGameMatrix(button, 0, i);
        }

        assertEquals(true, ButtonFactory.checkColumnWin());
    }
}