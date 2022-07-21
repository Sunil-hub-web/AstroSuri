package com.in.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.in.astrosuri.R;
import com.in.modelclass.HearCoustomer_Model;

import java.util.ArrayList;

public class HearCustomerAdapter extends RecyclerView.Adapter<HearCustomerAdapter.ViewHolder> {

    Context context;
    ArrayList<HearCoustomer_Model> coustomer;

    public HearCustomerAdapter(ArrayList<HearCoustomer_Model> hearcustomer, FragmentActivity activity) {

        this.context = activity;
        this.coustomer = hearcustomer;

    }

    @NonNull
    @Override
    public HearCustomerAdapter.ViewHolder onCreateViewHolder(@NonNull  ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.hearcustomer,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull  HearCustomerAdapter.ViewHolder holder, int position) {

        HearCoustomer_Model hear_coustomer = coustomer.get(position);

        holder.text_CustomerNmae.setText(hear_coustomer.getCoustomerName());
        holder.text_CustomerStatues.setText(hear_coustomer.getCoustomerStatues());
        holder.text_Description.setText(hear_coustomer.getCustomerdesc());


    }

    @Override
    public int getItemCount() {
        return coustomer.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView text_CustomerNmae,text_CustomerStatues,text_Description;
        public ViewHolder(@NonNull  View itemView) {
            super(itemView);

            text_Description = itemView.findViewById(R.id.text_Description);
            text_CustomerNmae = itemView.findViewById(R.id.text_CustomerNmae);
            text_CustomerStatues = itemView.findViewById(R.id.text_CustomerStatues);
        }
    }
}
