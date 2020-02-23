package com.geektech.todoapp.ui.gallery;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.geektech.todoapp.R;

import java.util.ArrayList;

public class NamesAdapter extends RecyclerView.Adapter<NamesViewHolder> {
    ArrayList<String> name;
    public NamesAdapter(){
        name = new ArrayList<>();
        name.add("Павел");
        name.add("Нуржамал");
        name.add("Нурсултан");
        name.add("Кундуз");
        name.add("Айгерим");
        name.add("Кубат");
    }
    @NonNull
    @Override
    public NamesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.viewholder_names,parent,false);
        return new NamesViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull NamesViewHolder holder, int position) {
holder.textView.setText(name.get(position));
    }

    @Override
    public int getItemCount() {
        return name.size();

    }
}
