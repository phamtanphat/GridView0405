package com.ptp.phamtanphat.gridview0405;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import java.util.List;

/**
 * Created by KhoaPhamPC on 1/6/2018.
 */

public class ThuvienanhAdapter extends ArrayAdapter<Thuvienanh> {

    public ThuvienanhAdapter(@NonNull Context context, int resource, @NonNull List<Thuvienanh> objects) {
        super(context, resource, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(getContext());
        convertView = inflater.inflate(R.layout.dong_item_listview_thuvienanh,null);

        ImageView imageView = convertView.findViewById(R.id.imageviewThuvienanh);

        Thuvienanh thuvienanh = getItem(position);

        imageView.setImageResource(thuvienanh.getHinhanh());
        return convertView;
    }
}
