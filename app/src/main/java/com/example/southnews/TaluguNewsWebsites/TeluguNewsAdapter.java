package com.example.southnews.TaluguNewsWebsites;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.core.graphics.drawable.RoundedBitmapDrawable;
import androidx.core.graphics.drawable.RoundedBitmapDrawableFactory;

import com.bumptech.glide.request.RequestOptions;
import com.example.southnews.R;

public class TeluguNewsAdapter extends BaseAdapter {

    TeluguNewsWebsitesList tnl = new TeluguNewsWebsitesList();
    private Context context;

    public TeluguNewsAdapter(Context mcontext){
        this.context = mcontext;
    }

    @Override
    public int getCount() {
        return TeluguNewsWebsitesList.news_list.size();
    }
    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        TeluguModel teluguModel = TeluguNewsWebsitesList.news_list.get(position);

        if (convertView == null){

            convertView = LayoutInflater.from(context).inflate(R.layout.telugu_news_icon_templete,parent,false);
        }

        RequestOptions requestOptions = new RequestOptions();
        requestOptions.autoClone();

        ImageView web_channel_img = convertView.findViewById(R.id.cnl_img);
        TextView web_channel_name = convertView.findViewById(R.id.cnl_name);

        web_channel_name.setText(teluguModel.name);
        web_channel_img.setImageLevel(teluguModel.image);


        Bitmap cnl_logo_bitmap = BitmapFactory.decodeResource(context.getResources(),teluguModel.image);
        RoundedBitmapDrawable dr = RoundedBitmapDrawableFactory.create(context.getResources(),cnl_logo_bitmap);
        /*dr.setCornerRadius(20f);*/
        /*dr.setCircular(true);*/
        web_channel_img.setImageDrawable(dr);
        return convertView;
    }
}













