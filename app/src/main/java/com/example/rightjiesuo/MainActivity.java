package com.example.rightjiesuo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private SlideLock slideLock;
    private ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        slideLock = (SlideLock) findViewById(R.id.slideLock);
        img = (ImageView) findViewById(R.id.img);
        slideLock.setOnUnlockListener(new OnUnlockListener() {
            @Override
            public void setUnlock(boolean unlock) {
                if (unlock){
                    slideLock.setVisibility(View.GONE);
                    img.setVisibility(View.VISIBLE);
                }
            }
        });
    }
}
