package com.example.nidhidashboard.arranger;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.nidhidashboard.R;
import com.example.nidhidashboard.databinding.ActivityArrangerDashboardBinding;

public class ArrangerDashboardActivity extends AppCompatActivity {
    ActivityArrangerDashboardBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityArrangerDashboardBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setAnim();
    }

    private void setAnim() {
        binding.logo.setTranslationX(700);
        binding.logo.setAlpha(1);
        binding.logo.animate().translationX(0).alpha(1).setDuration(600).setStartDelay(200).start();

        binding.header.setTranslationX(800);
        binding.header.setAlpha(1);
        binding.header.animate().translationX(0).alpha(1).setDuration(600).setStartDelay(150).start();
    }
}