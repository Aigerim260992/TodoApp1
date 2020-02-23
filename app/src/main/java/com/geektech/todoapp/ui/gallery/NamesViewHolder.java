package com.geektech.todoapp.ui.gallery;

import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.geektech.todoapp.R;

public class NamesViewHolder extends RecyclerView.ViewHolder {
    TextView textView;

    public NamesViewHolder(@NonNull final View itemView) {
        super(itemView);
        textView = itemView.findViewById(R.id.text_vh_names);
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(itemView.getContext(), textView.getText().toString(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
