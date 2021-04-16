package com.alroid.fragmentsample.fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.alroid.fragmentsample.DataGenerator;
import com.alroid.fragmentsample.R;
import com.alroid.fragmentsample.adapter.AdapterItem;
import com.alroid.fragmentsample.entity.Item;

public class FragmentC extends Fragment implements AdapterItem.selectedItem {
    RecyclerView rv_c;

    public interface OnIdPassC {
        void onIdPassC(int id);
    }

    OnIdPassC idPasser;

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        idPasser = (OnIdPassC) context;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_c, null);

        rv_c = view.findViewById(R.id.rv_c);
        setupRecyclerViewItemsC();

        return view;
    }

    private void setupRecyclerViewItemsC() {
        AdapterItem adapter = new AdapterItem(getActivity(), DataGenerator.getItemsC(getActivity()), this);
        rv_c.setLayoutManager(new GridLayoutManager(getActivity(), 2, RecyclerView.HORIZONTAL, false));
        rv_c.setAdapter(adapter);
    }

    @Override
    public void selectedItem(Item item) {
        idPasser.onIdPassC(item.getId());
    }

}
