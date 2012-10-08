package com.example.jqmobilecalculator;
import org.apache.cordova.*;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class Calculator extends DroidGap {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.loadUrl("file:///android_asset/www/index.html");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_calculator, menu);
        return true;
    }
}
