package com.alroid.fragmentsample;

import android.content.Context;

import androidx.core.content.ContextCompat;

import com.alroid.fragmentsample.entity.Item;

import java.util.ArrayList;
import java.util.List;

public class DataGenerator {
    public static List<Item> getItemsA(Context context) {
        List<Item> items = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            Item item = new Item();
            item.setId(i);
            switch (i) {
                case 0:
                    item.setImg(ContextCompat.getDrawable(context, R.drawable.bread1));
                    break;
                case 1:
                    item.setImg(ContextCompat.getDrawable(context, R.drawable.bread2));
                    break;
                case 2:
                    item.setImg(ContextCompat.getDrawable(context, R.drawable.bread3));
                    break;
                case 3:
                    item.setImg(ContextCompat.getDrawable(context, R.drawable.bread1));
                    break;
                case 4:
                    item.setImg(ContextCompat.getDrawable(context, R.drawable.bread2));
                    break;
                case 5:
                    item.setImg(ContextCompat.getDrawable(context, R.drawable.bread3));
                    break;
            }
            items.add(item);
        }
        return items;
    }

    public static List<Item> getItemsB(Context context) {
        List<Item> items = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            Item item = new Item();
            item.setId(i);
            switch (i) {
                case 0:
                    item.setImg(ContextCompat.getDrawable(context, R.drawable.protein1));
                    break;
                case 1:
                    item.setImg(ContextCompat.getDrawable(context, R.drawable.protein2));
                    break;
                case 2:
                    item.setImg(ContextCompat.getDrawable(context, R.drawable.protein3));
                    break;
                case 3:
                    item.setImg(ContextCompat.getDrawable(context, R.drawable.protein1));
                    break;
                case 4:
                    item.setImg(ContextCompat.getDrawable(context, R.drawable.protein2));
                    break;
                case 5:
                    item.setImg(ContextCompat.getDrawable(context, R.drawable.protein3));
                    break;
            }
            items.add(item);
        }
        return items;
    }

    public static List<Item> getItemsC(Context context) {
        List<Item> items = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            Item item = new Item();
            item.setId(i);
            switch (i) {
                case 0:
                    item.setImg(ContextCompat.getDrawable(context, R.drawable.lettuce1));
                    break;
                case 1:
                    item.setImg(ContextCompat.getDrawable(context, R.drawable.lettuce2));
                    break;
                case 2:
                    item.setImg(ContextCompat.getDrawable(context, R.drawable.lettuce3));
                    break;
                case 3:
                    item.setImg(ContextCompat.getDrawable(context, R.drawable.lettuce1));
                    break;
                case 4:
                    item.setImg(ContextCompat.getDrawable(context, R.drawable.lettuce2));
                    break;
                case 5:
                    item.setImg(ContextCompat.getDrawable(context, R.drawable.lettuce3));
                    break;
            }
            items.add(item);
        }
        return items;
    }

}
