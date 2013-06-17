package com.thecorpora.qbo.androidapk;

import android.app.Activity;
import android.os.Bundle;
import com.robotsandtweets.r2builders.Qbo;
/**
 * Created by pablo_001 on 13/06/13.
 */
public class SplashActivity extends Activity {
    private Qbo qbo;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.qbo = new Qbo();
    }
}