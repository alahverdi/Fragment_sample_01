package com.alroid.fragmentsample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.widget.Toast;

import com.alroid.fragmentsample.fragment.FragmentA;
import com.alroid.fragmentsample.fragment.FragmentB;
import com.alroid.fragmentsample.fragment.FragmentC;
import com.alroid.fragmentsample.fragment.FragmentResult;

public class MainActivity extends AppCompatActivity implements FragmentA.OnIdPassA, FragmentB.OnIdPassB, FragmentC.OnIdPassC {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void OnIdPassA(int id) {
        Toast.makeText(this, "id : " + Integer.valueOf(id).toString(), Toast.LENGTH_SHORT).show();
        //FragmentResult fragmentResult = FragmentResult.newInstance(id);

        FragmentManager manager = getSupportFragmentManager();
        FragmentResult fragmentResult = (FragmentResult) manager.findFragmentById(R.id.fragment_result);
        if (fragmentResult != null) {
            fragmentResult.setIdA(id);
        }
    }


    @Override
    public void OnIdPassB(int id) {
        FragmentManager manager = getSupportFragmentManager();
        FragmentResult fragmentResult = (FragmentResult) manager.findFragmentById(R.id.fragment_result);
        if (fragmentResult != null) {
            fragmentResult.setIdB(id);
        }
    }

    @Override
    public void onIdPassC(int id) {
        FragmentManager manager = getSupportFragmentManager();
        FragmentResult fragmentResult = (FragmentResult) manager.findFragmentById(R.id.fragment_result);
        if (fragmentResult != null) {
            fragmentResult.setIdC(id);
        }
    }
}