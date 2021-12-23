package com.vmax.samplegit

import android.app.Activity
import android.os.Bundle
import android.widget.Toast

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Toast.makeText(this,"Hellow",Toast.LENGTH_LONG).show();
        //Changes12345678910
        Toast.makeText(this,"Hello world",Toast.LENGTH_LONG).show();
    }
}