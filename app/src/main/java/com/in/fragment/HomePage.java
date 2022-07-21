package com.in.fragment;

import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.CompositePageTransformer;
import androidx.viewpager2.widget.MarginPageTransformer;
import androidx.viewpager2.widget.ViewPager2;

import com.in.adapter.AstrilogersAdapter;
import com.in.adapter.ChatHistoryadapter;
import com.in.adapter.DailyHoroscopeAdapter;
import com.in.adapter.HearCustomerAdapter;
import com.in.adapter.SliderAdpter;
import com.in.astrosuri.R;
import com.in.modelclass.Astrologers_ModelClass;
import com.in.modelclass.ChatHistory_Model;
import com.in.modelclass.HearCoustomer_Model;
import com.in.modelclass.Horoscope_ModelClass;
import com.in.modelclass.ShowImage_ModelClass;

import java.util.ArrayList;

public class HomePage extends Fragment {

    ArrayList<ShowImage_ModelClass> imageSlider = new ArrayList<>();

    SliderAdpter sliderAdpter;
    ViewPager2 sliderViewPager2;
    TextView[] dots;
    LinearLayout dots_container;
    Handler sliderhandler = new Handler();
    int currentPossition = 0;
    int arraysize;

    RecyclerView recyclerdailyhoroscope,recyclerHeraCustomer,recyclerAstrologers;
    DailyHoroscopeAdapter dailyHoroscopeAdapter;
    HearCustomerAdapter hearCustomerAdapter;
    AstrilogersAdapter astrilogersAdapter;
    ArrayList<Horoscope_ModelClass> horoscope = new ArrayList<>();
    ArrayList<HearCoustomer_Model> hearcustomer = new ArrayList<>();
    ArrayList<Astrologers_ModelClass> astrologers = new ArrayList<>();
    LinearLayoutManager linearLayoutManager,linearLayoutManager1,linearLayoutManager2;

    @Nullable
    @Override
    public View onCreateView(@NonNull  LayoutInflater inflater,
                             @Nullable  ViewGroup container,
                             @Nullable  Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.homepage_fragment,container,false);

        sliderViewPager2 = view.findViewById(R.id.sliderViewPager2);
        dots_container = view.findViewById(R.id.dots_container);
        recyclerdailyhoroscope = view.findViewById(R.id.recyclerdailyhoroscope);
        recyclerHeraCustomer = view.findViewById(R.id.recyclerHeraCustomer);
        recyclerAstrologers = view.findViewById(R.id.recyclerAstrologers);

        sliderViewPager2.setClipToPadding(false);
        sliderViewPager2.setClipChildren(false);
        sliderViewPager2.setOffscreenPageLimit(3);
        sliderViewPager2.getChildAt(0).setOverScrollMode(RecyclerView.OVER_SCROLL_NEVER);

        CompositePageTransformer compositePageTransformer = new CompositePageTransformer();
        compositePageTransformer.addTransformer(new MarginPageTransformer(40));
        compositePageTransformer.addTransformer(new ViewPager2.PageTransformer() {
            @Override
            public void transformPage(@NonNull  View page, float position) {

                float r = 1 - Math.abs(position);
                page.setScaleY(0.85f +  r * 0.15f);

            }
        });

        sliderViewPager2.setPageTransformer(compositePageTransformer);

        Runnable sliderRunable = new Runnable() {
            @Override
            public void run() {

                sliderViewPager2.setCurrentItem(sliderViewPager2.getCurrentItem() + 1);
            }
        };

        sliderViewPager2.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                //super.onPageSelected(position);

                if (currentPossition >= arraysize)
                    currentPossition = 0;
                selectedIndicatorPosition (currentPossition++);

                sliderhandler.removeCallbacks(sliderRunable);
                sliderhandler.postDelayed(sliderRunable,2000);

            }
        });

        imageSlider.add(new ShowImage_ModelClass(R.drawable.slide1));
        imageSlider.add(new ShowImage_ModelClass(R.drawable.slide2));
        imageSlider.add(new ShowImage_ModelClass(R.drawable.slide3));

        sliderAdpter = new SliderAdpter(getContext(),imageSlider,sliderViewPager2);
        sliderViewPager2.setAdapter(sliderAdpter);

        arraysize = imageSlider.size();
        dots = new TextView[arraysize];
        dotsIndicator();
        selectedIndicatorPosition(currentPossition);

        horoscope.add(new Horoscope_ModelClass("ARIES",R.drawable.aries));
        horoscope.add(new Horoscope_ModelClass("TAURUS",R.drawable.taurus));
        horoscope.add(new Horoscope_ModelClass("GEMINI",R.drawable.gemini));
        horoscope.add(new Horoscope_ModelClass("CAPRICON",R.drawable.capricon));
        horoscope.add(new Horoscope_ModelClass("AQUARIUS",R.drawable.aquarius));
        horoscope.add(new Horoscope_ModelClass("CANCER",R.drawable.cancer));
        horoscope.add(new Horoscope_ModelClass("LEO",R.drawable.leo));
        horoscope.add(new Horoscope_ModelClass("LIBRA",R.drawable.libra));
        horoscope.add(new Horoscope_ModelClass("PISCES",R.drawable.pisces));
        horoscope.add(new Horoscope_ModelClass("SAGITARUS",R.drawable.sagitarus));
        horoscope.add(new Horoscope_ModelClass("SCORPIO",R.drawable.scorpio));
        horoscope.add(new Horoscope_ModelClass("TAURUS",R.drawable.taurus));
        horoscope.add(new Horoscope_ModelClass("VIRGO",R.drawable.virgo));


        linearLayoutManager = new LinearLayoutManager(getActivity(),LinearLayoutManager.HORIZONTAL,false);
        dailyHoroscopeAdapter = new DailyHoroscopeAdapter(horoscope,getActivity());
        recyclerdailyhoroscope.setLayoutManager(linearLayoutManager);
        recyclerdailyhoroscope.setHasFixedSize(true);
        recyclerdailyhoroscope.setItemAnimator(new DefaultItemAnimator());
        recyclerdailyhoroscope.setAdapter(dailyHoroscopeAdapter);

        hearcustomer.add(new HearCoustomer_Model(R.drawable.profileimage,"Sundar Pichai","C.E.O Google","Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard"));
        hearcustomer.add(new HearCoustomer_Model(R.drawable.profileimage,"Sundar Pichai","C.E.O Google","Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard"));
        hearcustomer.add(new HearCoustomer_Model(R.drawable.profileimage,"Sundar Pichai","C.E.O Google","Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard"));
        hearcustomer.add(new HearCoustomer_Model(R.drawable.profileimage,"Sundar Pichai","C.E.O Google","Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard"));

        linearLayoutManager1 = new LinearLayoutManager(getActivity(),LinearLayoutManager.HORIZONTAL,false);
        hearCustomerAdapter = new HearCustomerAdapter(hearcustomer,getActivity());
        recyclerHeraCustomer.setLayoutManager(linearLayoutManager1);
        recyclerHeraCustomer.setHasFixedSize(true);
        recyclerHeraCustomer.setItemAnimator(new DefaultItemAnimator());
        recyclerHeraCustomer.setAdapter(hearCustomerAdapter);

        astrologers.add(new Astrologers_ModelClass("Riya Deepsi","Hindi, English, Marathi","Vastu, Vedic Astrology","2+ Years","Rs 55.00/Min","55.00/Min"));
        astrologers.add(new Astrologers_ModelClass("Riya Deepsi","Hindi, English, Marathi","Vastu, Vedic Astrology","2+ Years","Rs 55.00/Min","55.00/Min"));
        astrologers.add(new Astrologers_ModelClass("Riya Deepsi","Hindi, English, Marathi","Vastu, Vedic Astrology","2+ Years","Rs 55.00/Min","55.00/Min"));

        linearLayoutManager2 = new LinearLayoutManager(getActivity(),LinearLayoutManager.HORIZONTAL,false);
        astrilogersAdapter = new AstrilogersAdapter(astrologers,getActivity());
        recyclerAstrologers.setLayoutManager(linearLayoutManager2);
        recyclerAstrologers.setHasFixedSize(true);
        recyclerAstrologers.setItemAnimator(new DefaultItemAnimator());
        recyclerAstrologers.setAdapter(astrilogersAdapter);

        return view;
    }

    private void dotsIndicator() {

        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT);
        params.setMargins(5,5,5,5);

        for(int i=0;i<dots.length;i++){

            dots[i] = new TextView(getContext());
            dots[i].setText(Html.fromHtml("&#9679;"));
            dots[i].setTextSize(20);
            dots[i].setPadding(5, 0, 5, 0);
            dots[i].setLayoutParams(params);
            dots_container.addView(dots[i]);
        }
    }

    private void selectedIndicatorPosition(int position) {


        for(int i=0;i<dots.length;i++){


            if(i == position){

                dots[i].setTextColor(ContextCompat.getColor(getActivity(), R.color.astrocolor_buttom));

            }else{

                dots[i].setTextColor(ContextCompat.getColor(getActivity(), android.R.color.darker_gray));
            }
        }

    }
}
