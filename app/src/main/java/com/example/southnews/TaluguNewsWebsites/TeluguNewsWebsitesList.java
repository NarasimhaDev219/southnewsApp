package com.example.southnews.TaluguNewsWebsites;

import com.example.southnews.R;

import java.util.ArrayList;

public class TeluguNewsWebsitesList {

   public static ArrayList<TeluguModel> news_list ;

    public TeluguNewsWebsitesList(){

        news_list = new ArrayList<>();
        /*news_list.add(new TeluguModel("sakshi", R.drawable.sakshi_tv,"https://epaper.sakshi.com"));*/
        news_list.add(new TeluguModel("Eenadu",R.drawable.eenadu,"https://www.eenadu.net"));
        news_list.add(new TeluguModel("Vaartha",R.drawable.vaartha,"https://www.vaartha.com"));
        news_list.add(new TeluguModel("Andhra Prabha",R.drawable.andhra_prabha,"https://www.prabhanews.com"));
        news_list.add(new TeluguModel("Tupaki",R.drawable.tupaki,"https://m.tupaki.com"));
        news_list.add(new TeluguModel("Andhra Jyothi",R.drawable.andhra_jyothy_icon,"https://www.andhrajyothy.com"));
//        news_websites_array.add(new NewswebsitesModel("ETV Bharath", R.drawable.etv_bharath, "https://m.etvbharat.com"));
        news_list.add(new TeluguModel("10TV", R.drawable.tentv_telugu_news, "http://10tv.in"));
        news_list.add(new TeluguModel("Mana Telangana", R.drawable.mana_telangana, "https://m.manatelangana.news"));
        news_list.add(new TeluguModel("Namasthe Andhra", R.drawable.namaste_andhra, "http://www.namasteandhra.com/"));
        news_list.add(new TeluguModel("Andhra Bhumi", R.drawable.andhra_bhoomi, "http://www.andhrabhoomi.net/"));
        news_list.add(new TeluguModel("BBC News Telugu", R.drawable.bbc_telugu, "https://www.bbc.com/telugu"));
        news_list.add(new TeluguModel("Gulte ", R.drawable.glute_telugu_news, "https://m.gulte.com/"));
        news_list.add(new TeluguModel("Great Andhra ", R.drawable.great_andhra_telugu, "https://m.greatandhra.com"));
        news_list.add(new TeluguModel("Namasthe Telangana ", R.drawable.namasthe_telangana, "https://epaper.ntnews.com/"));
        news_list.add(new TeluguModel("Nava Telangana ", R.drawable.nava_telangana, "http://epaper.navatelangana.com/"));
        news_list.add(new TeluguModel("One India ", R.drawable.oneindia_telugu, "https://telugu.oneindia.com/"));
        news_list.add(new TeluguModel("Praja Sakthi ", R.drawable.prajasakti, "http://epaper.prajasakti.com/"));
        news_list.add(new TeluguModel("Surya", R.drawable.surya, "http://epaper.suryaa.com/"));
        news_list.add(new TeluguModel("Telugu 360 ", R.drawable.telugu_360, "https://www.telugu360.com/home/"));
        news_list.add(new TeluguModel("Telugu Mirchi ", R.drawable.telugu_mirchi, "http://www.telugumirchi.com/telugu/"));
        news_list.add(new TeluguModel("Telugu Times ", R.drawable.telugu_times, "http://www.telugutimes.net/"));
//        news_websites_array.add(new NewswebsitesModel("Samayam ", R.drawable.timesofindia_telugu, "https://telugu.samayam.com/"));
        news_list.add(new TeluguModel("Visalaandra ", R.drawable.visalaandhra, "http://visalaandhra.com/"));


    }
}
