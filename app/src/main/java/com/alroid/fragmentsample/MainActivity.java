package com.alroid.fragmentsample;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
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

public class MainActivity extends AppCompatActivity implements FragmentA.OnIdPassA, FragmentB.OnIdPassB, FragmentC.OnIdPassC {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void OnIdPassA(int id) {
        //Toast.makeText(this, "id : " + Integer.valueOf(id).toString(), Toast.LENGTH_SHORT).show();
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

                Toast msg = Toast.makeText(MainActivity.this, "reset", Toast.LENGTH_LONG);
                msg.show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

}
