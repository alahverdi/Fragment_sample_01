package com.alroid.fragmentsample.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import com.alroid.fragmentsample.Const;

public class FragmentResult extends Fragment {

    public static FragmentResult newInstance(int id) {
        FragmentResult fragmentResult = new FragmentResult();
        Bundle bundle = new Bundle();
        bundle.putInt(Const.KEY_ID, id);
        fragmentResult.setArguments(bundle);

        return fragmentResult;
    }


}
