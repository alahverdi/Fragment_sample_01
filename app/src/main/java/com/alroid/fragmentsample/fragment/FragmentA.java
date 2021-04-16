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

public class FragmentA extends Fragment implements AdapterItem.selectedItem {
    RecyclerView rv_a;

    public interface OnIdPassA {
        public void OnIdPassA(int id);
    }

    OnIdPassA idPasser;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        idPasser = (OnIdPassA) context;
    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_a, null);

        rv_a = view.findViewById(R.id.rv_a);
        setupRecyclerViewItemsA();

        return view;
    }

    private void setupRecyclerViewItemsA() {
        AdapterItem adapter = new AdapterItem(getActivity(), DataGenerator.getItemsA(getActivity()), this);
        rv_a.setLayoutManager(new GridLayoutManager(getActivity(), 2, RecyclerView.HORIZONTAL, false));
        rv_a.setAdapter(adapter);
    }

    @Override
    public void selectedItem(Item item) {
        idPasser.OnIdPassA(item.getId());

       /* switch (item.getId()) {
            case 0:
                Toast.makeText(getActivity(), "0", Toast.LENGTH_SHORT).show();
                break;
            case 1:
                Toast.makeText(getActivity(), "1", Toast.LENGTH_SHORT).show();
                break;
            case 2:
                Toast.makeText(getActivity(), "2", Toast.LENGTH_SHORT).show();
                break;
            case 3:
                Toast.makeText(getActivity(), "3", Toast.LENGTH_SHORT).show();
                break;
            case 4:
                Toast.makeText(getActivity(), "4", Toast.LENGTH_SHORT).show();
                break;
            case 5:
                Toast.makeText(getActivity(), "5", Toast.LENGTH_SHORT).show();
                break;
            case 6:
                Toast.makeText(getActivity(), "6", Toast.LENGTH_SHORT).show();
                break;
            case 7:
                Toast.makeText(getActivity(), "7", Toast.LENGTH_SHORT).show();
                break;
        }*/
    }
}
