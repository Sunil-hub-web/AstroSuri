 package com.in.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.in.adapter.CallHistoryAdapter;
import com.in.adapter.ChatHistoryadapter;
import com.in.astrosuri.R;
import com.in.modelclass.CallHistory_Model;
import com.in.modelclass.ChatHistory_Model;

import java.util.ArrayList;

public class History extends Fragment {

    RecyclerView recyclerHistory;
    LinearLayoutManager linearLayoutManager,linearLayoutManager1;
    CallHistoryAdapter callHistoryAdapter;
    ChatHistoryadapter chatHistoryadapter;
    ArrayList<CallHistory_Model> callHistory = new ArrayList<>();
    ArrayList<ChatHistory_Model> chatHistory = new ArrayList<>();

    TextView text_ChatHistory,text_CallHistory;

    @Nullable
    @Override
    public View onCreateView(@NonNull  LayoutInflater inflater,
                             @Nullable  ViewGroup container,
                             @Nullable  Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.history_fragment,container,false);

        recyclerHistory = view.findViewById(R.id.recyclerHistory);
        text_CallHistory = view.findViewById(R.id.text_CallHistory);
        text_ChatHistory = view.findViewById(R.id.text_ChatHistory);

        text_ChatHistory.setBackgroundResource(R.drawable.history_bg1);
        text_CallHistory.setBackgroundResource(R.drawable.history_bg2);

        text_ChatHistory.setTextColor(ContextCompat.getColor(getActivity(), R.color.white));
        text_CallHistory.setTextColor(ContextCompat.getColor(getActivity(), R.color.black));

        chatHistory.add(new ChatHistory_Model("12/02/2022 10:35:58","ASC-87895 858 96","Sunil kumar","Rs 235.00","To use a custom drawable background with"));
        chatHistory.add(new ChatHistory_Model("13/02/2022 10:35:58","ASC-87895 858 94","Sunil","Rs 235.00","To use a custom drawable background with"));
        chatHistory.add(new ChatHistory_Model("14/02/2022 10:35:58","ASC-87895 858 93","Sunil kumar","Rs 235.00","To use a custom drawable background with"));
        chatHistory.add(new ChatHistory_Model("15/02/2022 10:35:58","ASC-87895 858 92","Sunil kumar dash","Rs 235.00","To use a custom drawable background with"));
        chatHistory.add(new ChatHistory_Model("16/02/2022 10:35:58","ASC-87895 858 91","Sunil kumar dash","Rs 235.00","To use a custom drawable background with"));

        linearLayoutManager1 = new LinearLayoutManager(getActivity(),LinearLayoutManager.VERTICAL,false);
        chatHistoryadapter = new ChatHistoryadapter(chatHistory,getActivity());
        recyclerHistory.setLayoutManager(linearLayoutManager1);
        recyclerHistory.setHasFixedSize(true);
        recyclerHistory.setItemAnimator(new DefaultItemAnimator());
        recyclerHistory.setAdapter(chatHistoryadapter);

        text_CallHistory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                text_CallHistory.setBackgroundResource(R.drawable.history_bg1);
                text_ChatHistory.setBackgroundResource(R.drawable.history_bg2);

                text_CallHistory.setTextColor(ContextCompat.getColor(getActivity(), R.color.white));
                text_ChatHistory.setTextColor(ContextCompat.getColor(getActivity(), R.color.black));

                callHistory.add(new CallHistory_Model("12/02/2022 10:35:58","ASC-87895 858 96","ASC-87895 858 96","Sunil kumar","Rs 35.00","00:05:32","Rs 235.00","To use a custom drawable background with"));
                callHistory.add(new CallHistory_Model("13/02/2022 10:35:58","ASC-87895 858 94","ASC-87895 858 94","Sunil","Rs 35.00","00:05:32","Rs 235.00","To use a custom drawable background with"));
                callHistory.add(new CallHistory_Model("14/02/2022 10:35:58","ASC-87895 858 93","ASC-87895 858 93","Sunil kumar","Rs 35.00","00:05:32","Rs 235.00","To use a custom drawable background with"));
                callHistory.add(new CallHistory_Model("15/02/2022 10:35:58","ASC-87895 858 92","ASC-87895 858 92","Sunil kumar dash","Rs 35.00","00:05:32","Rs 235.00","To use a custom drawable background with"));
                callHistory.add(new CallHistory_Model("16/02/2022 10:35:58","ASC-87895 858 91","ASC-87895 858 91","Sunil kumar dash","Rs 35.00","00:05:32","Rs 235.00","To use a custom drawable background with"));

                linearLayoutManager = new LinearLayoutManager(getActivity(),LinearLayoutManager.VERTICAL,false);
                callHistoryAdapter = new CallHistoryAdapter(callHistory,getActivity());
                recyclerHistory.setLayoutManager(linearLayoutManager);
                recyclerHistory.setHasFixedSize(true);
                recyclerHistory.setItemAnimator(new DefaultItemAnimator());
                recyclerHistory.setAdapter(callHistoryAdapter);

            }
        });

        text_ChatHistory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                text_ChatHistory.setBackgroundResource(R.drawable.history_bg1);
                text_CallHistory.setBackgroundResource(R.drawable.history_bg2);

                text_ChatHistory.setTextColor(ContextCompat.getColor(getActivity(), R.color.white));
                text_CallHistory.setTextColor(ContextCompat.getColor(getActivity(), R.color.black));

                chatHistory.add(new ChatHistory_Model("12/02/2022 10:35:58","ASC-87895 858 96","Sunil kumar","Rs 235.00","To use a custom drawable background with"));
                chatHistory.add(new ChatHistory_Model("13/02/2022 10:35:58","ASC-87895 858 94","Sunil","Rs 235.00","To use a custom drawable background with"));
                chatHistory.add(new ChatHistory_Model("14/02/2022 10:35:58","ASC-87895 858 93","Sunil kumar","Rs 235.00","To use a custom drawable background with"));
                chatHistory.add(new ChatHistory_Model("15/02/2022 10:35:58","ASC-87895 858 92","Sunil kumar dash","Rs 235.00","To use a custom drawable background with"));
                chatHistory.add(new ChatHistory_Model("16/02/2022 10:35:58","ASC-87895 858 91","Sunil kumar dash","Rs 235.00","To use a custom drawable background with"));

                linearLayoutManager1 = new LinearLayoutManager(getActivity(),LinearLayoutManager.VERTICAL,false);
                chatHistoryadapter = new ChatHistoryadapter(chatHistory,getActivity());
                recyclerHistory.setLayoutManager(linearLayoutManager1);
                recyclerHistory.setHasFixedSize(true);
                recyclerHistory.setItemAnimator(new DefaultItemAnimator());
                recyclerHistory.setAdapter(chatHistoryadapter);

            }
        });

        return view;
    }
}
