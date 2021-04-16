package com.alroid.fragmentsample.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.alroid.fragmentsample.R;
import com.alroid.fragmentsample.entity.Item;

import java.util.List;

public class AdapterItem extends RecyclerView.Adapter<AdapterItem.ItemsViewHolder> {
    Context context;
    List<Item> items;
    AdapterItem.selectedItem selectedItem;

    public AdapterItem(Context context, List<Item> items, AdapterItem.selectedItem selectedItem) {
        this.context = context;
        this.items = items;
        this.selectedItem = selectedItem;
    }


    @NonNull
    @Override
    public ItemsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.rv_item, parent, false);

        return new AdapterItem.ItemsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemsViewHolder holder, int position) {
        Item item = items.get(position);
        holder.iv_item.setImageDrawable(item.getImg());
    }


    @Override
    public int getItemCount() {
        return items.size();
    }


    public class ItemsViewHolder extends RecyclerView.ViewHolder {
        private final ImageView iv_item;

        public ItemsViewHolder(@NonNull View itemView) {
            super(itemView);
            iv_item = itemView.findViewById(R.id.iv_item);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    selectedItem.selectedItem(items.get(getAdapterPosition()));
                }
            });
        }
    }

    public interface selectedItem {
        void selectedItem(Item item);
    }

}
