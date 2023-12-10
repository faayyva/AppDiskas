package com.example.diskas;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter2 extends RecyclerView.Adapter<Adapter2.ViewHolder> {
    private final LayoutInflater layoutInflater;
    private final List<String> kelasbea;

    Adapter2 (Context context, List<String> kelasbea){
        this.layoutInflater = LayoutInflater.from(context);
        this.kelasbea = kelasbea;

    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = layoutInflater.inflate(R.layout.custom_view_klsbea, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int i) {
        String title = kelasbea.get(i);
        holder.textTitle.setText(title);
    }

    @Override
    public int getItemCount() {

        return kelasbea.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView textTitle, textDescription;
        public ViewHolder(View itemView) {
            super(itemView);
            textTitle= itemView.findViewById(R.id.textTitle1);
            textDescription = itemView.findViewById(R.id.textDesc1);
        }
    }
}
