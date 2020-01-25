package com.geektech.studentsjournal;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ViewHolder extends RecyclerView.ViewHolder {
TextView textView;
OnClickListener listener;

    public ViewHolder(@NonNull View itemView) {
        super(itemView);
        textView= itemView.findViewById(R.id.tv_holder);
itemView.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        listener.onClick(textView.getText().toString());

    }
});

    }
    public void setTextView(String data){
        textView.setText(data);
    }
}
