package com.udacity.gradle.builditbigger;

import android.support.test.runner.AndroidJUnit4;

import com.udacity.gradle.builditbigger.free.MainActivityFragment;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertTrue;

/**
 * Created by Mahmoud on 8/11/2017.
 */
@RunWith(AndroidJUnit4.class)
public class EndPointAsyncTaskTest {
    @Test
    public void testDoInBackground() throws Exception {
        MainActivityFragment fragment = new MainActivityFragment();
        fragment.testFlag = true;
        new EndpointAsyncTask().execute(fragment);
        Thread.sleep(5000);
        assertTrue("error= " + fragment.loadedJoke, fragment.loadedJoke != null);
    }
}
