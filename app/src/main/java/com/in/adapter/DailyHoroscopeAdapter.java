package com.in.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.in.astrosuri.R;
import com.in.modelclass.Horoscope_ModelClass;

import java.util.ArrayList;

public class DailyHoroscopeAdapter extends RecyclerView.Adapter<DailyHoroscopeAdapter.ViewHolder> {

    Context context;
    ArrayList<Horoscope_ModelClass> horoscope;

    public DailyHoroscopeAdapter(ArrayList<Horoscope_ModelClass> horoscope, FragmentActivity activity) {

        this.context = activity;
        this.horoscope = horoscope;
    }

    @NonNull
    @Override
    public DailyHoroscopeAdapter.ViewHolder onCreateViewHolder(@NonNull  ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.dailyhoroscope,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull  DailyHoroscopeAdapter.ViewHolder holder, int position) {

        Horoscope_ModelClass daily_horoscope = horoscope.get(position);

        holder.Show_text.setText(daily_horoscope.getName());
        holder.show_image.setImageResource(daily_horoscope.getImage());
    }

    @Override
    public int getItemCount() {
        return horoscope.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView show_image;
        TextView Show_text;

        public ViewHolder(@NonNull  View itemView) {
            super(itemView);

            Show_text = itemView.findViewById(R.id.Show_text);
            show_image = itemView.findViewById(R.id.show_image);
        }
    }
}
