package com.s3.movieflex;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    private final Context context;
    private final ArrayList<model> fList;

    public RecyclerViewAdapter(Context context, ArrayList<model> fList) {
        this.context = context;
        this.fList = fList;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private final TextView fTitle;
        private final ImageView fImage;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            fTitle = (TextView) itemView.findViewById(R.id.film_name);
            fImage = (ImageView) itemView.findViewById(R.id.film_img);

        }
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.resycler_view_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        model film = fList.get(position);
        holder.fTitle.setText(film.getTitle());
        holder.fImage.setImageResource(film.getImageId());



    }

    @Override
    public int getItemCount() {
        return fList.size();
    }


}
