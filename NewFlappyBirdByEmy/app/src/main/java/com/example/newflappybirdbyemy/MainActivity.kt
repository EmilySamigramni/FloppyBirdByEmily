package com.example.newflappybirdbyemy

import androidx.appcompat.app.AppCompatActivity
import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        this.window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN)
        setContentView(R.layout.activity_main)
    }
}