package com.alroid.fragmentsample;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import com.alroid.fragmentsample.fragment.FragmentA;
import com.alroid.fragmentsample.fragment.FragmentB;
import com.alroid.fragmentsample.fragment.FragmentC;
import com.alroid.fragmentsample.fragment.FragmentResult;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity implements FragmentA.OnIdPassA, FragmentB.OnIdPassB, FragmentC.OnIdPassC {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // disable dark mode:
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
    }

    // send id from FragmentA to FragmentResult:
    @Override
    public void OnIdPassA(int id) {
        FragmentManager manager = getSupportFragmentManager();
        FragmentResult fragmentResult = (FragmentResult) manager.findFragmentById(R.id.fragment_result);
        if (fragmentResult != null) {
            fragmentResult.setIdA(id);
        }
    }

    // send id from FragmentB to FragmentResult:
    @Override
    public void OnIdPassB(int id) {
        FragmentManager manager = getSupportFragmentManager();
        FragmentResult fragmentResult = (FragmentResult) manager.findFragmentById(R.id.fragment_result);
        if (fragmentResult != null) {
            fragmentResult.setIdB(id);
        }
    }

    // send id from FragmentC to FragmentResult:
    @Override
    public void onIdPassC(int id) {
        FragmentManager manager = getSupportFragmentManager();
        FragmentResult fragmentResult = (FragmentResult) manager.findFragmentById(R.id.fragment_result);
        if (fragmentResult != null) {
            fragmentResult.setIdC(id);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(1, 1, 1, "reset");
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case 1:
                FragmentManager manager = getSupportFragmentManager();
                FragmentResult fragmentResult = (FragmentResult) manager.findFragmentById(R.id.fragment_result);
                if (fragmentResult != null) {
                    fragmentResult.resetFragmentResult();
                }
                Toast msg = Toast.makeText(MainActivity.this, "reset", Toast.LENGTH_SHORT);
                msg.show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

}
