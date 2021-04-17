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

public class FragmentB extends Fragment implements AdapterItem.selectedItem {
    RecyclerView rv_b;

    public interface OnIdPassB {
        void OnIdPassB(int id);
    }

    OnIdPassB idPasser;

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        idPasser = (OnIdPassB) context;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_b, null);

        rv_b = view.findViewById(R.id.rv_b);
        setupRecyclerViewItemsB();

        return view;
    }

    private void setupRecyclerViewItemsB() {
        AdapterItem adapter = new AdapterItem(getActivity(), DataGenerator.getItemsB(getActivity()), this);
        rv_b.setLayoutManager(new GridLayoutManager(getActivity(), 1, RecyclerView.HORIZONTAL, false));
        rv_b.setAdapter(adapter);
    }

    @Override
    public void selectedItem(Item item) {
        idPasser.OnIdPassB(item.getId());
    }
}
