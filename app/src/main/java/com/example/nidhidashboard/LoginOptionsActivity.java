package com.example.nidhidashboard;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.nidhidashboard.admin.AdminDashboardActivity;
import com.example.nidhidashboard.arranger.ArrangerDashboardActivity;
import com.example.nidhidashboard.databinding.ActivityLoginOptionsBinding;
import com.example.nidhidashboard.member.MainActivity;

public class LoginOptionsActivity extends AppCompatActivity {
    ActivityLoginOptionsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityLoginOptionsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());



        binding.adminloginbtn.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View view) {
                binding.admincard.setVisibility(View.VISIBLE);
                binding.empcard.setVisibility(View.GONE);
                binding.memberCard.setVisibility(View.GONE);
                binding.loginhead.setText("~Admin Login~");

                binding.adminloginbtn.setTextColor(R.color.btn_back);
                binding.adminloginbtn.setBackgroundColor(getResources().getColor(R.color.white));

                binding.arrangerloginbtn.setTextColor(R.color.white);
                binding.arrangerloginbtn.setBackgroundColor(getResources().getColor(R.color.btn_back));

                binding.memberloginbtn.setTextColor(R.color.white);
                binding.memberloginbtn.setBackgroundColor(getResources().getColor(R.color.btn_back));
            }
        });
        binding.memberloginbtn.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View view) {
                binding.admincard.setVisibility(View.GONE);
                binding.empcard.setVisibility(View.GONE);
                binding.memberCard.setVisibility(View.VISIBLE);
                binding.loginhead.setText("~Member Login~");

                binding.memberloginbtn.setTextColor(R.color.btn_back);
                binding.memberloginbtn.setBackgroundColor(getResources().getColor(R.color.white));

                binding.adminloginbtn.setTextColor(R.color.white);
                binding.adminloginbtn.setBackgroundColor(getResources().getColor(R.color.btn_back));

                binding.arrangerloginbtn.setTextColor(R.color.white);
                binding.arrangerloginbtn.setBackgroundColor(getResources().getColor(R.color.btn_back));
            }
        });
        binding.arrangerloginbtn.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View view) {
                binding.admincard.setVisibility(View.GONE);
                binding.empcard.setVisibility(View.VISIBLE);
                binding.memberCard.setVisibility(View.GONE);
                binding.loginhead.setText("~Executive Login~");


                binding.arrangerloginbtn.setTextColor(R.color.btn_back);
                binding.arrangerloginbtn.setBackgroundColor(getResources().getColor(R.color.white));

                binding.adminloginbtn.setTextColor(R.color.white);
                binding.adminloginbtn.setBackgroundColor(getResources().getColor(R.color.btn_back));

                binding.memberloginbtn.setTextColor(R.color.white);
                binding.memberloginbtn.setBackgroundColor(getResources().getColor(R.color.btn_back));
            }
        });
        binding.btnmem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), MainActivity.class));
                finish();
            }
        });
        binding.btnemp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), ArrangerDashboardActivity.class));
                finish();
            }
        });
        binding.btnadmin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), AdminDashboardActivity.class));
                finish();
            }
        });
    }
}