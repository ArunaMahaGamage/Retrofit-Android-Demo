package com.example.retrofitdemo;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by aruna on 12/10/17.
 */

public class GitHubRepoAdapter extends ArrayAdapter<GitHubRepo> {

    private Context context;
    List<GitHubRepo> list;

    public GitHubRepoAdapter(Context context, List<GitHubRepo> list) {
        super(context, R.layout.list_item_pagination,list);

        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View view = convertView;

        if (view == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.list_item_pagination,parent,false);
        }

        TextView textView = view.findViewById(R.id.list_item_pagination_text);

        GitHubRepo item = list.get(position);

        textView.setText(item.getName());

        return view;
    }
}
