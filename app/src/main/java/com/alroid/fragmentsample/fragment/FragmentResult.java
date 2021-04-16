package com.alroid.fragmentsample.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.alroid.fragmentsample.Const;
import com.alroid.fragmentsample.R;

public class FragmentResult extends Fragment {

    ImageView iv_a, iv_b, iv_c;

    public static FragmentResult newInstance(String reset) {
        FragmentResult fragmentResult = new FragmentResult();
        Bundle bundle = new Bundle();
        bundle.putString(Const.KEY_RESET, reset);

        fragmentResult.setArguments(bundle);

        return fragmentResult;
    }

    public void setIdA(int id_a) {
        switch (id_a) {
            case 0:
                iv_a.setImageResource(R.drawable.ic_launcher_background);
                break;
            case 1:
                iv_a.setImageResource(R.drawable.ic_android);
                break;
            case 2:
                iv_a.setImageResource(R.drawable.ic_baseline_cast_24);
                break;
            case 3:
                iv_a.setImageResource(R.drawable.ic_launcher_background);
                break;
            case 4:
                iv_a.setImageResource(R.drawable.ic_android);
                break;
            case 5:
                iv_a.setImageResource(R.drawable.ic_launcher_background);
                break;
            case 6:
                iv_a.setImageResource(R.drawable.ic_android);
                break;
            case 7:
                iv_a.setImageResource(R.drawable.ic_baseline_cast_24);
                break;
        }
    }

    public void setIdB(int id_b) {
        switch (id_b) {
            case 0:
                iv_b.setImageResource(R.drawable.ic_launcher_background);
                break;
            case 1:
                iv_b.setImageResource(R.drawable.ic_android);
                break;
            case 2:
                iv_b.setImageResource(R.drawable.ic_baseline_cast_24);
                break;
            case 3:
                iv_b.setImageResource(R.drawable.ic_launcher_background);
                break;
            case 4:
                iv_b.setImageResource(R.drawable.ic_android);
                break;
            case 5:
                iv_b.setImageResource(R.drawable.ic_launcher_background);
                break;
            case 6:
                iv_b.setImageResource(R.drawable.ic_android);
                break;
            case 7:
                iv_b.setImageResource(R.drawable.ic_baseline_cast_24);
                break;
        }
    }

    public void setIdC(int id_c) {
        switch (id_c) {
            case 0:
                iv_c.setImageResource(R.drawable.ic_launcher_background);
                break;
            case 1:
                iv_c.setImageResource(R.drawable.ic_android);
                break;
            case 2:
                iv_c.setImageResource(R.drawable.ic_baseline_cast_24);
                break;
            case 3:
                iv_c.setImageResource(R.drawable.ic_launcher_background);
                break;
            case 4:
                iv_c.setImageResource(R.drawable.ic_android);
                break;
            case 5:
                iv_c.setImageResource(R.drawable.ic_launcher_background);
                break;
            case 6:
                iv_c.setImageResource(R.drawable.ic_android);
                break;
            case 7:
                iv_c.setImageResource(R.drawable.ic_baseline_cast_24);
                break;
        }
    }

    public void resetFragmentResult() {
        iv_a.setImageResource(R.drawable.ic_launcher_background);
        iv_b.setImageResource(R.drawable.ic_launcher_background);
        iv_c.setImageResource(R.drawable.ic_launcher_background);

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_result, null);
        iv_a = view.findViewById(R.id.iv_a);
        iv_b = view.findViewById(R.id.iv_b);
        iv_c = view.findViewById(R.id.iv_c);



        return view;
    }
}
