package com.example.southnews.TaluguNewsWebsites;

import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.browser.customtabs.CustomTabsIntent;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;

import com.example.southnews.R;

public class TeluguNewsFragment extends Fragment {

    View telugu_fragment_view = null;
    GridView telugu_news_gridView;
    TeluguNewsAdapter teluguNewsAdapter;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        telugu_fragment_view = inflater.inflate(R.layout.telugu_fragment,null);

        prepareview();
        initializeView();
        return telugu_fragment_view;
    }

    protected void prepareview(){

        telugu_news_gridView = telugu_fragment_view.findViewById(R.id.news_websites_GridView);
        teluguNewsAdapter = new TeluguNewsAdapter(telugu_fragment_view.getContext());
    }

    protected void initializeView(){

        telugu_news_gridView.setAdapter(teluguNewsAdapter);
        telugu_news_gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                if (position >-1){


                    Uri uri = Uri.parse(TeluguNewsWebsitesList.news_list.get(position).url);

// create an intent builder
                    CustomTabsIntent.Builder intentBuilder = new CustomTabsIntent.Builder();
                    intentBuilder.setShowTitle(true);

// Begin customizing
// set toolbar colors
                    intentBuilder.setToolbarColor(ContextCompat.getColor(telugu_fragment_view.getContext(), R.color.red));
                    intentBuilder.setSecondaryToolbarColor(ContextCompat.getColor(telugu_fragment_view.getContext(), R.color.colorPrimaryDark));

// set start and exit animations
//                    intentBuilder.setStartAnimations(fragmnet_view2.getContext(), android.R.anim.slide_out_right,android.R.anim.slide_in_left);
                    intentBuilder.setExitAnimations(telugu_fragment_view.getContext(), android.R.anim.slide_in_left,
                            android.R.anim.slide_out_right);

// build custom tabs intent
                    CustomTabsIntent customTabsIntent = intentBuilder.build();
                    customTabsIntent.intent.setPackage("com.android.chrome");


// launch the url
                    customTabsIntent.launchUrl(getActivity(), uri);
                }
            }
        });
    }
}







