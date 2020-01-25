package com.geektech.studentsjournal;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainAdapter extends RecyclerView.Adapter<ViewHolder> {
    ArrayList<String> students;

    public MainAdapter() {
        students = new ArrayList<>();
        students.add("Aigerim");
        students.add("Joodar");
        students.add("Kubat");
    }

    OnClickListener listener;

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View v = inflater.inflate(R.layout.holder, parent, false);
        ViewHolder viewHolder = new ViewHolder(v);
        viewHolder.listener = listener;
        return  viewHolder;

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.setTextView(students.get(position));
    }

    @Override
    public int getItemCount() {
        return students.size();

    }

    public void addInfo(String info) {
        students.add(info);
        notifyDataSetChanged();
    }
}
