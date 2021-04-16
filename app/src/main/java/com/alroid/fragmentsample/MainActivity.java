package com.alroid.fragmentsample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.alroid.fragmentsample.fragment.FragmentA;

public class MainActivity extends AppCompatActivity implements FragmentA.OnIdPassA {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void OnIdPassA(int id) {
        Toast.makeText(this, "id : " + Integer.valueOf(id).toString(), Toast.LENGTH_SHORT).show();
    }
}