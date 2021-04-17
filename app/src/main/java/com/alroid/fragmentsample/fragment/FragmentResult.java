package com.alroid.fragmentsample.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.airbnb.lottie.LottieAnimationView;
import com.airbnb.lottie.LottieDrawable;
import com.alroid.fragmentsample.Const;
import com.alroid.fragmentsample.R;

public class FragmentResult extends Fragment {

    LottieAnimationView iv_a, iv_c, iv_b;

    public void setIdA(int id_a) {
        switch (id_a) {
            case 0:
                iv_a.setAnimation(R.raw.bread1_lottie);
                iv_a.playAnimation();
                iv_a.loop(false);
                break;
            case 1:
                iv_a.setAnimation(R.raw.bread2_lottie);
                iv_a.playAnimation();
                iv_a.loop(false);
                break;
            case 2:
                iv_a.setAnimation(R.raw.bread3_lottie);
                iv_a.playAnimation();
                iv_a.loop(false);
            case 3:
                iv_a.setAnimation(R.raw.bread1_lottie);
                iv_a.playAnimation();
                iv_a.loop(false);
                break;
            case 4:
                iv_a.setAnimation(R.raw.bread2_lottie);
                iv_a.playAnimation();
                iv_a.loop(false);
                break;
            case 5:
                iv_a.setAnimation(R.raw.bread3_lottie);
                iv_a.playAnimation();
                iv_a.loop(false);
                break;
        }
    }

    public void setIdB(int id_b) {
        switch (id_b) {
            case 0:
                iv_b.setAnimation(R.raw.protein1_lottie);
                iv_b.playAnimation();
                iv_b.loop(false);
                break;
            case 1:
                iv_b.setAnimation(R.raw.protein2_lottie);
                iv_b.playAnimation();
                iv_b.loop(false);
                break;
            case 2:
                iv_b.setAnimation(R.raw.protein3_lottie);
                iv_b.playAnimation();
                iv_b.loop(false);
                break;
            case 3:
                iv_b.setAnimation(R.raw.protein1_lottie);
                iv_b.playAnimation();
                iv_b.loop(false);
                break;
            case 4:
                iv_b.setAnimation(R.raw.protein2_lottie);
                iv_b.playAnimation();
                iv_b.loop(false);
                break;
            case 5:
                iv_b.setAnimation(R.raw.protein3_lottie);
                iv_b.playAnimation();
                iv_b.loop(false);
                break;
        }
    }

    public void setIdC(int id_c) {
        switch (id_c) {
            case 0:
                iv_c.setAnimation(R.raw.lettuce1_lottie);
                iv_c.playAnimation();
                iv_c.loop(false);
                break;
            case 1:
                iv_c.setAnimation(R.raw.lettuce2_lottie);
                iv_c.playAnimation();
                iv_c.loop(false);
                break;
            case 2:
                iv_c.setAnimation(R.raw.lettuce3_lottie);
                iv_c.playAnimation();
                iv_c.loop(false);
                break;
            case 3:
                iv_c.setAnimation(R.raw.lettuce1_lottie);
                iv_c.playAnimation();
                iv_c.loop(false);
                break;
            case 4:
                iv_c.setAnimation(R.raw.lettuce2_lottie);
                iv_c.playAnimation();
                iv_c.loop(false);
                break;
            case 5:
                iv_c.setAnimation(R.raw.lettuce3_lottie);
                iv_c.playAnimation();
                iv_c.loop(false);
                break;
        }
    }

    public void resetFragmentResult() {
        iv_a.setAnimation(R.raw.reset_iv_a);
        iv_a.playAnimation();
        iv_a.loop(true);

        iv_b.setAnimation(R.raw.reset_iv_b);
        iv_b.playAnimation();
        iv_b.loop(true);

        iv_c.setAnimation(R.raw.reset_iv_c);
        iv_c.playAnimation();
        iv_c.loop(true);
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

    /*
    public static FragmentResult newInstance(String reset) {
        FragmentResult fragmentResult = new FragmentResult();
        Bundle bundle = new Bundle();
        bundle.putString(Const.KEY_RESET, reset);

        fragmentResult.setArguments(bundle);

        return fragmentResult;
    }*/
}
