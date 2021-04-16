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

    public static FragmentResult newInstance(int id) {
        FragmentResult fragmentResult = new FragmentResult();
        Bundle bundle = new Bundle();
        bundle.putInt(Const.KEY_ID, id);
        fragmentResult.setArguments(bundle);

        return fragmentResult;
    }


    public void setIdA(int id_a) {
        if (id_a == 0) {
            iv_a.setImageResource(R.drawable.ic_launcher_background);
        }
    }

    public void setIdB(int id_b) {
        if (id_b == 0) {
            iv_b.setImageResource(R.drawable.ic_launcher_background);
        }
    }

    public void setIdC(int id_c) {
        if (id_c == 0) {
            iv_c.setImageResource(R.drawable.ic_launcher_background);
        }
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
