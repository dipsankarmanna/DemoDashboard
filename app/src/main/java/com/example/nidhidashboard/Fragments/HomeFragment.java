package com.example.nidhidashboard.Fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.CompositePageTransformer;
import androidx.viewpager2.widget.MarginPageTransformer;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.nidhidashboard.R;
import com.example.nidhidashboard.adapters.SliderAdapter;
import com.example.nidhidashboard.databinding.FragmentHomeBinding;
import com.example.nidhidashboard.models.SliderItems;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {

    FragmentHomeBinding binding;
    ArrayList<Integer> list;
    //ViewPagerAdapter viewPagerAdapter;
    ViewPager2 viewPager2;

    private Handler sliderHandler = new Handler();
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding=FragmentHomeBinding.inflate(getLayoutInflater());
        View view=binding.getRoot();//inflater.inflate(R.layout.fragment_home, container, false);
        //setViewReferences(view);


        List<SliderItems> sliderItems = new ArrayList<>();
        sliderItems.add(new SliderItems(R.drawable.pageimg1));
        sliderItems.add(new SliderItems(R.drawable.pageimg2));
        sliderItems.add(new SliderItems(R.drawable.pageimg3));
        sliderItems.add(new SliderItems(R.drawable.pageimg4));

        binding.viewpage.setAdapter(new SliderAdapter(sliderItems,binding.viewpage));

        binding.viewpage.setClipToPadding(false);
        binding.viewpage.setClipChildren(false);
        binding.viewpage.setOffscreenPageLimit(3);
        binding.viewpage.getChildAt(0).setOverScrollMode(RecyclerView.OVER_SCROLL_NEVER);

        CompositePageTransformer compositePageTransformer = new CompositePageTransformer();
        compositePageTransformer.addTransformer(new MarginPageTransformer(40));
        compositePageTransformer.addTransformer(new ViewPager2.PageTransformer() {
            @Override
            public void transformPage(@NonNull View page, float position) {
                float r = 1 - Math.abs(position);
                page.setScaleY(0.85f + r * 0.15f);
            }
        });

        binding.viewpage.setPageTransformer(compositePageTransformer);

        binding.viewpage.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                super.onPageSelected(position);
                sliderHandler.removeCallbacks(sliderRunnable);
                sliderHandler.postDelayed(sliderRunnable, 2000); // slide duration 2 seconds
            }
        });

        return view;
    }

    private final Runnable sliderRunnable = new Runnable() {
        @Override
        public void run() {
            binding.viewpage.setCurrentItem(binding.viewpage.getCurrentItem() + 1);
        }
    };
}