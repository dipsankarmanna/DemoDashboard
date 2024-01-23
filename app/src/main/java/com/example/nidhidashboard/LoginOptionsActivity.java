package com.example.nidhidashboard;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.TranslateAnimation;

import com.example.nidhidashboard.databinding.ActivityLoginOptionsBinding;

public class LoginOptionsActivity extends AppCompatActivity {
    ActivityLoginOptionsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityLoginOptionsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());



        binding.adminloginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.admincard.setVisibility(View.VISIBLE);
                binding.empcard.setVisibility(View.GONE);
                binding.memberCard.setVisibility(View.GONE);
            }
        });
        binding.memberloginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.admincard.setVisibility(View.GONE);
                binding.empcard.setVisibility(View.GONE);
                binding.memberCard.setVisibility(View.VISIBLE);
            }
        });
        binding.arrangerloginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.admincard.setVisibility(View.GONE);
                binding.empcard.setVisibility(View.VISIBLE);
                binding.memberCard.setVisibility(View.GONE);
            }
        });
    }
}