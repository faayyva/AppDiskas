package com.example.diskas;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {
    private final LayoutInflater layoutInflater;
    private final List<String> kelasui;
    Adapter(Context context, List<String> kelasui){
        this.layoutInflater = LayoutInflater.from(context);
        this.kelasui = kelasui;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = layoutInflater.inflate(R.layout.custom_view_klsui, viewGroup,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int i) {

        String title = kelasui.get(i);
        holder.textTitle.setText(title);
    }

    @Override
    public int getItemCount() {
        return kelasui.size();
    }

    public class ViewHolder extends  RecyclerView.ViewHolder{
        TextView textTitle,textDescription;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textTitle = itemView.findViewById(R.id.textTitle);
            textDescription = itemView.findViewById(R.id.textDesc);
        }
    }
}
