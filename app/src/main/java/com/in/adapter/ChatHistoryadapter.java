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
import com.in.modelclass.ChatHistory_Model;

import java.util.ArrayList;

public class ChatHistoryadapter extends RecyclerView.Adapter<ChatHistoryadapter.ViewHolder> {

    Context context;
    ArrayList<ChatHistory_Model> chatHistory;

    public ChatHistoryadapter(ArrayList<ChatHistory_Model> callHistory, FragmentActivity activity) {

        this.context = activity;
        this.chatHistory = callHistory;
    }

    @NonNull
    @Override
    public ChatHistoryadapter.ViewHolder onCreateViewHolder(@NonNull  ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.chatistory_layout,parent,false);
        return new ChatHistoryadapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull  ChatHistoryadapter.ViewHolder holder, int position) {

        ChatHistory_Model chathistory = chatHistory.get(position);

        holder.text_dateTime.setText(chathistory.getDatetime());
        holder.text_SessionID.setText(chathistory.getChatId());
        holder.text_Astrologer.setText(chathistory.getAstrologerName());
        holder.text_PerMinCharges.setText(chathistory.getAmountCharged());
        holder.text_Reviews.setText(chathistory.getReviews());

    }

    @Override
    public int getItemCount() {
        return chatHistory.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView text_dateTime,text_SessionID,text_Astrologer,text_PerMinCharges,text_Reviews;

        public ViewHolder(@NonNull  View itemView) {
            super(itemView);

            text_Reviews = itemView.findViewById(R.id.text_Reviews);
            text_dateTime = itemView.findViewById(R.id.text_dateTime);
            text_SessionID = itemView.findViewById(R.id.text_SessionID);
            text_Astrologer = itemView.findViewById(R.id.text_Astrologer);
            text_PerMinCharges = itemView.findViewById(R.id.text_PerMinCharges);
        }
    }
}
