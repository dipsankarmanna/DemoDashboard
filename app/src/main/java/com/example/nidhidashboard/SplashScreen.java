package com.example.nidhidashboard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.TransitionDrawable;
import android.os.Bundle;
import android.os.Handler;

import com.example.nidhidashboard.databinding.ActivitySplashScreenBinding;

public class SplashScreen extends AppCompatActivity {
    ActivitySplashScreenBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivitySplashScreenBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        //getSupportActionBar().hide();

        ColorDrawable[] colorDrawables = {new ColorDrawable(Color.CYAN),
                new ColorDrawable(Color.WHITE), new ColorDrawable(Color.BLUE)};
        TransitionDrawable transitionDrawable = new TransitionDrawable(colorDrawables);
        binding.lay.setBackground(transitionDrawable);
        transitionDrawable.startTransition(2000);

        binding.startImg.setTranslationY(700);
        binding.startImg.setAlpha(1);
        binding.lay.setTranslationX(800);
        binding.lay.setAlpha(1);
        binding.startImg.animate().translationY(0).alpha(1).setDuration(600).setStartDelay(200).start();
        binding.lay.animate().translationX(0).alpha(1).setDuration(600).setStartDelay(150).start();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(getApplicationContext(), LoginOptionsActivity.class));
                finish();
            }
        },3000);
    }
}