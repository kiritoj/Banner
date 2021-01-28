package com.example.bannerdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("ResourceAsColor")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BannerView bannerView = findViewById(R.id.banner);
        List<String> list = new ArrayList<>();
        list.add("http://p1.music.126.net/4sPwULqPLDc1e3evHf_wKg==/109951164982707736.jpg");
        list.add("http://p1.music.126.net/rgLldSBygekF9zwuFak83A==/109951164982605686.jpg");
        list.add("http://p1.music.126.net/h21c38RoFJjdFdFFY3UzQg==/109951164983162688.jpg");
        list.add("http://p1.music.126.net/4sPwULqPLDc1e3evHf_wKg==/109951164982707736.jpg");
        list.add("http://p1.music.126.net/h21c38RoFJjdFdFFY3UzQg==/109951164983162688.jpg");
        list.add("http://p1.music.126.net/4sPwULqPLDc1e3evHf_wKg==/109951164982707736.jpg");
        BannerView.BinnerAdapter adapter = new BannerView.BinnerAdapter(this,list);
        bannerView.setAdapter(adapter);

    }
}
