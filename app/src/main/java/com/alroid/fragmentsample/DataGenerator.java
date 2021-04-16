package com.alroid.fragmentsample;

import android.content.Context;

import androidx.core.content.ContextCompat;

import com.alroid.fragmentsample.entity.Item;

import java.util.ArrayList;
import java.util.List;

public class DataGenerator {
    public static List<Item> getItemsA(Context context) {
        List<Item> items = new ArrayList<>();

        for (int i = 0; i < 8; i++) {
            Item item = new Item();
            item.setId(i);
            switch (i) {
                case 0 :
                    item.setImg(ContextCompat.getDrawable(context, R.drawable.ic_launcher_background));
                    break;
                case 1 :
                    item.setImg(ContextCompat.getDrawable(context, R.drawable.ic_launcher_background));
                    break;
                case 2 :
                    item.setImg(ContextCompat.getDrawable(context, R.drawable.ic_launcher_background));
                    break;
                case 3 :
                    item.setImg(ContextCompat.getDrawable(context, R.drawable.ic_launcher_background));
                    break;
                case 4 :
                    item.setImg(ContextCompat.getDrawable(context, R.drawable.ic_launcher_background));
                    break;
                case 5 :
                    item.setImg(ContextCompat.getDrawable(context, R.drawable.ic_launcher_background));
                    break;
                case 6 :
                    item.setImg(ContextCompat.getDrawable(context, R.drawable.ic_launcher_background));
                    break;
                case 7 :
                    item.setImg(ContextCompat.getDrawable(context, R.drawable.ic_launcher_background));
                    break;
            }
            items.add(item);
        }
        return items;
    }
}
