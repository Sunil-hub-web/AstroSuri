package com.in.adapter;

import android.content.Context;
import android.graphics.Paint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.in.astrosuri.R;
import com.in.modelclass.Astrologers_ModelClass;

import java.util.ArrayList;

public class AstrilogersAdapter extends RecyclerView.Adapter<AstrilogersAdapter.ViewHolder> {

    Context context;
    ArrayList<Astrologers_ModelClass> astrologers;
    public AstrilogersAdapter(ArrayList<Astrologers_ModelClass> astrologers, FragmentActivity activity) {

        this.context = activity;
        this.astrologers = astrologers;
    }

    @NonNull
    @Override
    public AstrilogersAdapter.ViewHolder onCreateViewHolder(@NonNull  ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.onlineastrologers,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull  AstrilogersAdapter.ViewHolder holder, int position) {

        Astrologers_ModelClass astro = astrologers.get(position);

        holder.name.setText(astro.getName());
        holder.speeklanguage.setText(astro.getSpeeklanguage());
        holder.typeAstrologers.setText(astro.getTypeAstrologers());
        holder.experiences.setText(astro.getExperience());
        holder.salesPrice.setText(astro.getSalesPrice());
        holder.regularPrice.setText(astro.getRegularPrice());

        holder.regularPrice.setPaintFlags(holder.regularPrice.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);


    }

    @Override
    public int getItemCount() {
        return astrologers.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView name,speeklanguage,typeAstrologers,experiences,salesPrice,regularPrice;

        public ViewHolder(@NonNull  View itemView) {
            super(itemView);

            regularPrice = itemView.findViewById(R.id.regularPrice);
            name = itemView.findViewById(R.id.name);
            speeklanguage = itemView.findViewById(R.id.speeklanguage);
            typeAstrologers = itemView.findViewById(R.id.typeAstrologers);
            experiences = itemView.findViewById(R.id.experiences);
            salesPrice = itemView.findViewById(R.id.salesPrice);
        }
    }
}
