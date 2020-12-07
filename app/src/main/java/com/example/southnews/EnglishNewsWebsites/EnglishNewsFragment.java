package com.example.southnews.EnglishNewsWebsites;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.southnews.R;

public class EnglishNewsFragment extends Fragment {

    View english_news_view;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        english_news_view = inflater.inflate(R.layout.english_fragment,null);
        return english_news_view;

    }
}
