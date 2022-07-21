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
import com.in.modelclass.CallHistory_Model;

import java.util.ArrayList;

public class CallHistoryAdapter extends RecyclerView.Adapter<CallHistoryAdapter.ViewHolder> {

    Context context;
    ArrayList<CallHistory_Model> call_history;

    public CallHistoryAdapter(ArrayList<CallHistory_Model> callHistory, FragmentActivity activity) {

        this.context = activity;
        this.call_history = callHistory;
    }

    @NonNull
    @Override
    public CallHistoryAdapter.ViewHolder onCreateViewHolder(@NonNull  ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.callhistory_layout,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull  CallHistoryAdapter.ViewHolder holder, int position) {

        CallHistory_Model callmodel = call_history.get(position);

        holder.text_dateTime.setText(callmodel.getDatetime());
        //holder.text_SessionID.setText(callmodel.getSessionid());
        holder.text_CallLogID.setText(callmodel.getCalllogid());
        holder.text_Astrologer.setText(callmodel.getAstrologerName());
        holder.text_PerMinCharges.setText(callmodel.getMinCharges());
        holder.text_CallDuration.setText(callmodel.getCalldurations());
        holder.text_AmountCharged.setText(callmodel.getAmount());
        holder.text_Reviews.setText(callmodel.getReviews());
    }

    @Override
    public int getItemCount() {
        return call_history.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView text_dateTime,text_SessionID,text_CallLogID,text_Astrologer,text_PerMinCharges,text_CallDuration,
                text_AmountCharged,text_Reviews;

        public ViewHolder(@NonNull  View itemView) {
            super(itemView);

            text_Reviews = itemView.findViewById(R.id.text_Reviews);
            text_dateTime = itemView.findViewById(R.id.text_dateTime);
           // text_SessionID = itemView.findViewById(R.id.text_SessionID);
            text_CallLogID = itemView.findViewById(R.id.text_CallLogID);
            text_Astrologer = itemView.findViewById(R.id.text_Astrologer);
            text_PerMinCharges = itemView.findViewById(R.id.text_PerMinCharges);
            text_CallDuration = itemView.findViewById(R.id.text_CallDuration);
            text_AmountCharged = itemView.findViewById(R.id.text_AmountCharged);
        }
    }
}
