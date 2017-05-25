package com.example.humor.porteriapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ConnectActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_connect);
    }

    public void connect(View view){
        Intent intent = new Intent(ConnectActivity.this, DeviceListActivity.class);
        startActivity(intent);
        finish();
    }
}
