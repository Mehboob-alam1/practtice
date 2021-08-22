package com.example.realsexygirlsmobilenumbersforvideochat;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toolbar;

import com.Adapters.ContactsAdapter;
import com.Models.ContactsModel;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;

import java.util.ArrayList;

public class ContactsActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    private InterstitialAd mInterstitialAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacts);

        AdRequest adRequest = new AdRequest.Builder().build();

        InterstitialAd.load(this,"ca-app-pub-6406856513627612/5043549014", adRequest,
                new InterstitialAdLoadCallback() {
                    @Override
                    public void onAdLoaded(@NonNull InterstitialAd interstitialAd) {
                        // The mInterstitialAd reference will be null until
                        // an ad is loaded.
                        mInterstitialAd = interstitialAd;
                        Log.i("TAG", "onAdLoaded");
                    }

                    @Override
                    public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
                        // Handle the error
                        Log.i("TAG", loadAdError.getMessage());
                        mInterstitialAd = null;
                    }

                });

        recyclerView = findViewById(R.id.recycler_contact);

        int country_position = getIntent().getIntExtra("country", 0);

        if (country_position == 0) {

            ArrayList<ContactsModel> australia = new ArrayList<>();
            australia.add(new ContactsModel(R.drawable.image, R.drawable.whatsapp, "Lesbon","27","Austrailia"));
            australia.add(new ContactsModel(R.drawable.image_6, R.drawable.whatsapp, "Maria","22","Austrailia"));
            australia.add(new ContactsModel(R.drawable.image_7, R.drawable.whatsapp, "Kesandra Alex","26","Austrailia"));
            australia.add(new ContactsModel(R.drawable.image_8, R.drawable.whatsapp, "Sophia","24","Austrailia"));
            australia.add(new ContactsModel(R.drawable.image_10, R.drawable.whatsapp, "Albert Noah","33","Austrailia"));
            australia.add(new ContactsModel(R.drawable.image_12, R.drawable.whatsapp, "Willow","31","Austrailia"));
            australia.add(new ContactsModel(R.drawable.image_13, R.drawable.whatsapp, "Nairopi","29","Austrailia"));
            australia.add(new ContactsModel(R.drawable.image_14, R.drawable.whatsapp, "charlotte","24","Austrailia"));
            australia.add(new ContactsModel(R.drawable.image_15, R.drawable.whatsapp, "Olivia","28","Austrailia"));
            australia.add(new ContactsModel(R.drawable.index, R.drawable.whatsapp, "Amelia","23","Austrailia"));
            australia.add(new ContactsModel(R.drawable.img_2, R.drawable.whatsapp, "Isla","33","Austrailia"));
            australia.add(new ContactsModel(R.drawable.img_3, R.drawable.whatsapp, "Mia","29","Austrailia"));
            australia.add(new ContactsModel(R.drawable.img_5, R.drawable.whatsapp, "Ava","25","Austrailia"));
            australia.add(new ContactsModel(R.drawable.img_17, R.drawable.whatsapp, "Grace","31","Austrailia"));
            australia.add(new ContactsModel(R.drawable.a_1, R.drawable.whatsapp, "Siara","21","Austrailia"));
            australia.add(new ContactsModel(R.drawable.a_2, R.drawable.whatsapp, "Calito","26","Austrailia"));
            australia.add(new ContactsModel(R.drawable.a_3, R.drawable.whatsapp, "Pio","31","Austrailia"));
            australia.add(new ContactsModel(R.drawable.a_4, R.drawable.whatsapp, "Sena","29","Austrailia"));
            australia.add(new ContactsModel(R.drawable.a_5, R.drawable.whatsapp, "Alida","24","Austrailia"));
            australia.add(new ContactsModel(R.drawable.a_6, R.drawable.whatsapp, "Amie","20","Austrailia"));
            australia.add(new ContactsModel(R.drawable.a_7, R.drawable.whatsapp, "Mia","21","Austrailia"));
            australia.add(new ContactsModel(R.drawable.a_8, R.drawable.whatsapp, "Solia","22","Austrailia"));



            ContactsAdapter adapter0 = new ContactsAdapter(australia, this);
            recyclerView.setAdapter(adapter0);
            GridLayoutManager grid0 = new GridLayoutManager(this, 3);
            recyclerView.setLayoutManager(grid0);

        } else if (country_position == 1) {
            ArrayList<ContactsModel> bangladesh = new ArrayList<>();
            bangladesh.add(new ContactsModel(R.drawable.bang_3, R.drawable.whatsapp, "Khaisa","22","Bangladesh"));
            bangladesh.add(new ContactsModel(R.drawable.bang_1, R.drawable.whatsapp, "Aafiya","19","Bangladesh"));
            bangladesh.add(new ContactsModel(R.drawable.bang_2, R.drawable.whatsapp, "Babitah","23","Bangladesh"));
            bangladesh.add(new ContactsModel(R.drawable.bang_4, R.drawable.whatsapp, "Chime","25","Bangladesh"));
            bangladesh.add(new ContactsModel(R.drawable.bang_5, R.drawable.whatsapp, "Damini","23","Bangladesh"));
            bangladesh.add(new ContactsModel(R.drawable.bang_6, R.drawable.whatsapp, "Devi","30","Bangladesh"));
            bangladesh.add(new ContactsModel(R.drawable.bang_7, R.drawable.whatsapp, "Hara","26","Bangladesh"));
            bangladesh.add(new ContactsModel(R.drawable.bang_8, R.drawable.whatsapp, "Indra","22","Bangladesh"));
            bangladesh.add(new ContactsModel(R.drawable.bang_9, R.drawable.whatsapp, "Hanasa","19","Bangladesh"));
            bangladesh.add(new ContactsModel(R.drawable.bang_10, R.drawable.whatsapp, "Jaya","18","Bangladesh"));
            bangladesh.add(new ContactsModel(R.drawable.b_1, R.drawable.whatsapp, "Samrita","18","Bangladesh"));
            bangladesh.add(new ContactsModel(R.drawable.b_2, R.drawable.whatsapp, "Kahanam","18","Bangladesh"));
            bangladesh.add(new ContactsModel(R.drawable.b_3, R.drawable.whatsapp, "Pooja","18","Bangladesh"));
            bangladesh.add(new ContactsModel(R.drawable.b_4, R.drawable.whatsapp, "Simran","18","Bangladesh"));
            bangladesh.add(new ContactsModel(R.drawable.b_5, R.drawable.whatsapp, "Bano","18","Bangladesh"));
            bangladesh.add(new ContactsModel(R.drawable.b_6, R.drawable.whatsapp, "Maryam","18","Bangladesh"));
            bangladesh.add(new ContactsModel(R.drawable.b_7, R.drawable.whatsapp, "Ria","18","Bangladesh"));

            ContactsAdapter adapter1 = new ContactsAdapter(bangladesh, this);
            recyclerView.setAdapter(adapter1);
            GridLayoutManager grid1 = new GridLayoutManager(this, 3);
            recyclerView.setLayoutManager(grid1);


        } else if (country_position == 2) {
            ArrayList<ContactsModel> iceland = new ArrayList<>();
            iceland.add(new ContactsModel(R.drawable.il_1, R.drawable.whatsapp, "Anna","19","Iceland"));
            iceland.add(new ContactsModel(R.drawable.il_2, R.drawable.whatsapp, "Gourun","20","Iceland"));
            iceland.add(new ContactsModel(R.drawable.il_3, R.drawable.whatsapp, "Kristin","22","Iceland"));
            iceland.add(new ContactsModel(R.drawable.il_4, R.drawable.whatsapp, "Halga","26","Iceland"));
            iceland.add(new ContactsModel(R.drawable.il_5, R.drawable.whatsapp, "Sigriour","23","Iceland"));
            iceland.add(new ContactsModel(R.drawable.il_6, R.drawable.whatsapp, "Margret","27","Iceland"));
            iceland.add(new ContactsModel(R.drawable.il_7, R.drawable.whatsapp, "Ingibjorg","22","Iceland"));
            iceland.add(new ContactsModel(R.drawable.il_8, R.drawable.whatsapp, "PuriOur","28","Iceland"));
            iceland.add(new ContactsModel(R.drawable.il_9, R.drawable.whatsapp, "Kaolin","26","Iceland"));
            iceland.add(new ContactsModel(R.drawable.il_10, R.drawable.whatsapp, "Alex","24","Iceland"));
            iceland.add(new ContactsModel(R.drawable.ice_1, R.drawable.whatsapp, "Ketill","22","Iceland"));
            iceland.add(new ContactsModel(R.drawable.ice_2, R.drawable.whatsapp, "Auour","23","Iceland"));
            iceland.add(new ContactsModel(R.drawable.ice_3, R.drawable.whatsapp, "Systa","24","Iceland"));
            iceland.add(new ContactsModel(R.drawable.ice_4, R.drawable.whatsapp, "Lynd","22","Iceland"));
            iceland.add(new ContactsModel(R.drawable.ice_5, R.drawable.whatsapp, "Kona","20","Iceland"));
            iceland.add(new ContactsModel(R.drawable.ice_6, R.drawable.whatsapp, "Thurid","27","Iceland"));
            iceland.add(new ContactsModel(R.drawable.ice_7, R.drawable.whatsapp, "Funi","25","Iceland"));
            iceland.add(new ContactsModel(R.drawable.ice_8, R.drawable.whatsapp, "Uni","23","Iceland"));
            iceland.add(new ContactsModel(R.drawable.ice_9, R.drawable.whatsapp, "Hilmir","22","Iceland"));
            ContactsAdapter adapter2 = new ContactsAdapter(iceland, this);
            recyclerView.setAdapter(adapter2);
            GridLayoutManager grid2 = new GridLayoutManager(this, 3);
            recyclerView.setLayoutManager(grid2);
        } else if (country_position == 3) {
            ArrayList<ContactsModel> india = new ArrayList<>();
            india.add(new ContactsModel(R.drawable.india_1, R.drawable.whatsapp, "Aaditi","22","India"));
            india.add(new ContactsModel(R.drawable.india_2, R.drawable.whatsapp, "Aalia","23","India"));
            india.add(new ContactsModel(R.drawable.india_3, R.drawable.whatsapp, "Bano kumari","19","India"));
            india.add(new ContactsModel(R.drawable.india_4, R.drawable.whatsapp, "Divya","18","India"));
            india.add(new ContactsModel(R.drawable.india_5, R.drawable.whatsapp, "Chayaa","21","India"));
            india.add(new ContactsModel(R.drawable.india_6, R.drawable.whatsapp, "Biniti","20","India"));
            india.add(new ContactsModel(R.drawable.india_7, R.drawable.whatsapp, "Ekiya","23","India"));
            india.add(new ContactsModel(R.drawable.india_8, R.drawable.whatsapp, "Gauori","24","India"));
            india.add(new ContactsModel(R.drawable.india_9, R.drawable.whatsapp, "Mira","21","India"));
            india.add(new ContactsModel(R.drawable.india_10, R.drawable.whatsapp, "Nitara","24","India"));
            india.add(new ContactsModel(R.drawable.i_1, R.drawable.whatsapp, "Raishima","24","India"));
            india.add(new ContactsModel(R.drawable.i_2, R.drawable.whatsapp, "Queen","23","India"));
            india.add(new ContactsModel(R.drawable.i_3, R.drawable.whatsapp, "Kiyara","21","India"));
            india.add(new ContactsModel(R.drawable.i_4, R.drawable.whatsapp, "Puja","26","India"));
            india.add(new ContactsModel(R.drawable.i_5, R.drawable.whatsapp, "Anita","20","India"));
            india.add(new ContactsModel(R.drawable.i_6, R.drawable.whatsapp, "Basanti","24","India"));
            india.add(new ContactsModel(R.drawable.india_7, R.drawable.whatsapp, "Aalia","21","India"));
            ContactsAdapter adapter3 = new ContactsAdapter(india, this);
            recyclerView.setAdapter(adapter3);
            GridLayoutManager grid3 = new GridLayoutManager(this, 3);
            recyclerView.setLayoutManager(grid3);


        } else if (country_position == 4) {
            ArrayList<ContactsModel> italy = new ArrayList<>();
            italy.add(new ContactsModel(R.drawable.il_1, R.drawable.whatsapp, "Martina","29","Italy"));
            italy.add(new ContactsModel(R.drawable.il_2, R.drawable.whatsapp, "Chiara","28","Italy"));
            italy.add(new ContactsModel(R.drawable.il_3, R.drawable.whatsapp, "Vittoria","25","Italy"));
            italy.add(new ContactsModel(R.drawable.il_4, R.drawable.whatsapp, "Sara","24","Italy"));
            italy.add(new ContactsModel(R.drawable.il_5, R.drawable.whatsapp, "Nicole","23","Italy"));
            italy.add(new ContactsModel(R.drawable.il_6, R.drawable.whatsapp, "Matilde","30","Italy"));
            italy.add(new ContactsModel(R.drawable.il_7, R.drawable.whatsapp, "Bianca","31","Italy"));
            italy.add(new ContactsModel(R.drawable.il_8, R.drawable.whatsapp, "Ludovica","26","Italy"));
            italy.add(new ContactsModel(R.drawable.il_9, R.drawable.whatsapp, "Beatrice","22","Italy"));
            italy.add(new ContactsModel(R.drawable.il_10, R.drawable.whatsapp, "Emma","25","Italy"));
            italy.add(new ContactsModel(R.drawable.ita_1, R.drawable.whatsapp, "Bella","23","Italy"));
            italy.add(new ContactsModel(R.drawable.ita_2, R.drawable.whatsapp, "Emillia","22","Italy"));
            italy.add(new ContactsModel(R.drawable.ita_3, R.drawable.whatsapp, "Giana","25","Italy"));
            italy.add(new ContactsModel(R.drawable.ita_4, R.drawable.whatsapp, "Lucia","24","Italy"));
            italy.add(new ContactsModel(R.drawable.ita_5, R.drawable.whatsapp, "Gemma","25","Italy"));
            italy.add(new ContactsModel(R.drawable.ita_6, R.drawable.whatsapp, "Lia","27","Italy"));
            italy.add(new ContactsModel(R.drawable.ita_7, R.drawable.whatsapp, "Rosa","28","Italy"));
            italy.add(new ContactsModel(R.drawable.ita_8, R.drawable.whatsapp, "Teresa","23","Italy"));
            italy.add(new ContactsModel(R.drawable.ita_9, R.drawable.whatsapp, "Paola","20","Italy"));
            ContactsAdapter adapter4 = new ContactsAdapter(italy, this);
            recyclerView.setAdapter(adapter4);
            GridLayoutManager grid4 = new GridLayoutManager(this, 3);
            recyclerView.setLayoutManager(grid4);

        } else if (country_position == 5) {
            ArrayList<ContactsModel> japan = new ArrayList<>();
            japan.add(new ContactsModel(R.drawable.jap_1, R.drawable.whatsapp, "Himari","23","Japan"));
            japan.add(new ContactsModel(R.drawable.jap_2, R.drawable.whatsapp, "Hina greens","21","Japan"));
            japan.add(new ContactsModel(R.drawable.jap_3, R.drawable.whatsapp, "Yua ","20","Japan"));
            japan.add(new ContactsModel(R.drawable.jap_4, R.drawable.whatsapp, "Sakura ","22","Japan"));
            japan.add(new ContactsModel(R.drawable.jap_5, R.drawable.whatsapp, "Ichika ","20","Japan"));
            japan.add(new ContactsModel(R.drawable.jap_6, R.drawable.whatsapp, "Akari ","19","Japan"));
            japan.add(new ContactsModel(R.drawable.jap_7, R.drawable.whatsapp, "Yui","18","Japan"));
            japan.add(new ContactsModel(R.drawable.jap_8, R.drawable.whatsapp, "Aiko","26","Japan"));
            japan.add(new ContactsModel(R.drawable.jap_9, R.drawable.whatsapp, "Nazomi","23","Japan"));
            japan.add(new ContactsModel(R.drawable.jap_10, R.drawable.whatsapp, "Emili","22","Japan"));
            japan.add(new ContactsModel(R.drawable.j_1, R.drawable.whatsapp, "Yai Emili","23","Japan"));
            japan.add(new ContactsModel(R.drawable.j_2, R.drawable.whatsapp, "Fai","20","Japan"));
            japan.add(new ContactsModel(R.drawable.j_3, R.drawable.whatsapp, "Siew","19","Japan"));
            japan.add(new ContactsModel(R.drawable.j_4, R.drawable.whatsapp, "Timber","18","Japan"));
            japan.add(new ContactsModel(R.drawable.j_5, R.drawable.whatsapp, "Youew","25","Japan"));
            japan.add(new ContactsModel(R.drawable.j_6, R.drawable.whatsapp, "Sgea","23","Japan"));
            japan.add(new ContactsModel(R.drawable.jap_8, R.drawable.whatsapp, "Axsa","22","Japan"));
            ContactsAdapter adapter5 = new ContactsAdapter(japan, this);
            recyclerView.setAdapter(adapter5);
            GridLayoutManager grid5 = new GridLayoutManager(this, 3);
            recyclerView.setLayoutManager(grid5);

        } else if (country_position == 6) {
            ArrayList<ContactsModel> northKorea = new ArrayList<>();
            northKorea.add(new ContactsModel(R.drawable.nk_1, R.drawable.whatsapp, "Ae-Cha","25","North Korea"));
            northKorea.add(new ContactsModel(R.drawable.nk_2, R.drawable.whatsapp, "Bon-Hwa","23","North Korea"));
            northKorea.add(new ContactsModel(R.drawable.nk_3, R.drawable.whatsapp, "Chin","22","North Korea"));
            northKorea.add(new ContactsModel(R.drawable.nk_4, R.drawable.whatsapp, "Cho","27","North Korea"));
            northKorea.add(new ContactsModel(R.drawable.nk_5, R.drawable.whatsapp, "Eui","23","North Korea"));
            northKorea.add(new ContactsModel(R.drawable.nk_6, R.drawable.whatsapp, "Chin-Hwa","30","North Korea"));
            northKorea.add(new ContactsModel(R.drawable.nk_7, R.drawable.whatsapp, "Gi","19","North Korea"));
            northKorea.add(new ContactsModel(R.drawable.nk_8, R.drawable.whatsapp, "Hwa","20","North Korea"));
            northKorea.add(new ContactsModel(R.drawable.nk_9, R.drawable.whatsapp, "Joo","22","North Korea"));
            northKorea.add(new ContactsModel(R.drawable.nk_10, R.drawable.whatsapp, "Iseul","25","North Korea"));
            northKorea.add(new ContactsModel(R.drawable.nko_1, R.drawable.whatsapp, "Ja","24","North Korea"));
            northKorea.add(new ContactsModel(R.drawable.nko_2, R.drawable.whatsapp, "Ki","23","North Korea"));
            northKorea.add(new ContactsModel(R.drawable.nko_3, R.drawable.whatsapp, "Kwan","21","North Korea"));
            northKorea.add(new ContactsModel(R.drawable.nko_4, R.drawable.whatsapp, "Nam","25","North Korea"));
            northKorea.add(new ContactsModel(R.drawable.nko_5, R.drawable.whatsapp, "Soon-Book","26","North Korea"));
            northKorea.add(new ContactsModel(R.drawable.nko_6, R.drawable.whatsapp, "Sook","24","North Korea"));
            northKorea.add(new ContactsModel(R.drawable.nko_7, R.drawable.whatsapp, "Whan","23","North Korea"));
            northKorea.add(new ContactsModel(R.drawable.nko_8, R.drawable.whatsapp, "Young-Soon","22","North Korea"));
            ContactsAdapter adapter6 = new ContactsAdapter(northKorea, this);
            recyclerView.setAdapter(adapter6);
            GridLayoutManager grid6 = new GridLayoutManager(this, 3);
            recyclerView.setLayoutManager(grid6);

        } else if (country_position == 7) {
            ArrayList<ContactsModel> pak = new ArrayList<>();
            pak.add(new ContactsModel(R.drawable.pak_1, R.drawable.whatsapp, "Hina","19","Pakistan"));
            pak.add(new ContactsModel(R.drawable.pak_2, R.drawable.whatsapp, "Queen","18","Pakistan"));
            pak.add(new ContactsModel(R.drawable.pak_3, R.drawable.whatsapp, "Kainat","17","Pakistan"));
            pak.add(new ContactsModel(R.drawable.pak_4, R.drawable.whatsapp, "Hasina","20","Pakistan"));
            pak.add(new ContactsModel(R.drawable.pak_5, R.drawable.whatsapp, "Areej","23","Pakistan"));
            pak.add(new ContactsModel(R.drawable.pak_6, R.drawable.whatsapp, "Nida","19","Pakistan"));
            pak.add(new ContactsModel(R.drawable.pak_7, R.drawable.whatsapp, "Hamna","20","Pakistan"));
            pak.add(new ContactsModel(R.drawable.pak_8, R.drawable.whatsapp, "Rihana","25","Pakistan"));
            pak.add(new ContactsModel(R.drawable.pak_9, R.drawable.whatsapp, "Fatima","19","Pakistan"));
            pak.add(new ContactsModel(R.drawable.pak_10, R.drawable.whatsapp, "Hira","22","Pakistan"));
            pak.add(new ContactsModel(R.drawable.p_1, R.drawable.whatsapp, "Simra","22","Pakistan"));
            pak.add(new ContactsModel(R.drawable.p_2, R.drawable.whatsapp, "Farida","22","Pakistan"));
            pak.add(new ContactsModel(R.drawable.p_3, R.drawable.whatsapp, "Kiran","22","Pakistan"));
            pak.add(new ContactsModel(R.drawable.p_4, R.drawable.whatsapp, "Barira","22","Pakistan"));
            pak.add(new ContactsModel(R.drawable.p_5, R.drawable.whatsapp, "Halima","22","Pakistan"));
            pak.add(new ContactsModel(R.drawable.p_6, R.drawable.whatsapp, "Diana","22","Pakistan"));
            pak.add(new ContactsModel(R.drawable.p_7, R.drawable.whatsapp, "Tajally","22","Pakistan"));
            pak.add(new ContactsModel(R.drawable.p_8, R.drawable.whatsapp, "Yasmeen","22","Pakistan"));
            pak.add(new ContactsModel(R.drawable.p_9, R.drawable.whatsapp, "Batool","22","Pakistan"));
            pak.add(new ContactsModel(R.drawable.p_10, R.drawable.whatsapp, "Sunita","22","Pakistan"));
            ContactsAdapter adapter7 = new ContactsAdapter(pak, this);
            recyclerView.setAdapter(adapter7);
            GridLayoutManager grid7  = new GridLayoutManager(this, 3);
            recyclerView.setLayoutManager(grid7);

        } else if (country_position == 8) {
            ArrayList<ContactsModel> arab = new ArrayList<>();
            arab.add(new ContactsModel(R.drawable.arab_1, R.drawable.whatsapp, "Aisha.","25","Saudi Arab"));
            arab.add(new ContactsModel(R.drawable.arab_2, R.drawable.whatsapp, "Calla","26","Saudi Arab"));
            arab.add(new ContactsModel(R.drawable.arab_3, R.drawable.whatsapp, "Saira","24","Saudi Arab"));
            arab.add(new ContactsModel(R.drawable.arab_4, R.drawable.whatsapp, "Celina","31","Saudi Arab"));
            arab.add(new ContactsModel(R.drawable.arab_5, R.drawable.whatsapp, "Amal","28","Saudi Arab"));
            arab.add(new ContactsModel(R.drawable.arab_6, R.drawable.whatsapp, "Hafsa","25","Saudi Arab"));
            arab.add(new ContactsModel(R.drawable.arab_7, R.drawable.whatsapp, "Djamila","27","Saudi Arab"));
            arab.add(new ContactsModel(R.drawable.arab_8, R.drawable.whatsapp, "Elena","28","Saudi Arab"));
            arab.add(new ContactsModel(R.drawable.arab_9, R.drawable.whatsapp, "Hija","29","Saudi Arab"));
            arab.add(new ContactsModel(R.drawable.ara_1, R.drawable.whatsapp, "Amal","23","Saudi Arab"));
            arab.add(new ContactsModel(R.drawable.ara_2, R.drawable.whatsapp, "Jamila","25","Saudi Arab"));
            arab.add(new ContactsModel(R.drawable.ara_3, R.drawable.whatsapp, "Ezra","26","Saudi Arab"));
            arab.add(new ContactsModel(R.drawable.ara_4, R.drawable.whatsapp, "Dani","28","Saudi Arab"));
            arab.add(new ContactsModel(R.drawable.ara_5, R.drawable.whatsapp, "Hyat","21","Saudi Arab"));
            arab.add(new ContactsModel(R.drawable.ara_6, R.drawable.whatsapp, "Ida","22","Saudi Arab"));
            arab.add(new ContactsModel(R.drawable.ara_7, R.drawable.whatsapp, "Laila","25","Saudi Arab"));
            arab.add(new ContactsModel(R.drawable.ara_8, R.drawable.whatsapp, "Pakiza","26","Saudi Arab"));


            ContactsAdapter adapter8 = new ContactsAdapter(arab, this);
            recyclerView.setAdapter(adapter8);
            GridLayoutManager grid8 = new GridLayoutManager(this, 3);
            recyclerView.setLayoutManager(grid8);

        } else if (country_position == 9) {
            ArrayList<ContactsModel> senegal = new ArrayList<>();
            senegal.add(new ContactsModel(R.drawable.sene_1, R.drawable.whatsapp, "Nabou","25","Senegal"));
            senegal.add(new ContactsModel(R.drawable.sene_2, R.drawable.whatsapp, "Aminata.","26","Senegal"));
            senegal.add(new ContactsModel(R.drawable.sene_3, R.drawable.whatsapp, "Nafissatou","28","Senegal"));
            senegal.add(new ContactsModel(R.drawable.sene_4, R.drawable.whatsapp, "Ndioro","20","Senegal"));
            senegal.add(new ContactsModel(R.drawable.sene_5, R.drawable.whatsapp, "Zanibou","23","Senegal"));
            senegal.add(new ContactsModel(R.drawable.sene_6, R.drawable.whatsapp, "Safara","29","Senegal"));
            senegal.add(new ContactsModel(R.drawable.sene_7, R.drawable.whatsapp, "Thioro","24","Senegal"));
            senegal.add(new ContactsModel(R.drawable.sene_8, R.drawable.whatsapp, "Yande","28","Senegal"));
            senegal.add(new ContactsModel(R.drawable.sene_9, R.drawable.whatsapp, "Roukia","23","Senegal"));
            senegal.add(new ContactsModel(R.drawable.ka_1, R.drawable.whatsapp, "Ketill","24","Senegal"));
            senegal.add(new ContactsModel(R.drawable.ka_2, R.drawable.whatsapp, "Lia","23","Senegal"));
            senegal.add(new ContactsModel(R.drawable.ka_3, R.drawable.whatsapp, "Paola","22","Senegal"));
            senegal.add(new ContactsModel(R.drawable.ka_4, R.drawable.whatsapp, "Hilmir","27","Senegal"));

            ContactsAdapter adapter9 = new ContactsAdapter(senegal, this);
            recyclerView.setAdapter(adapter9);
            GridLayoutManager grid9 = new GridLayoutManager(this, 3);
            recyclerView.setLayoutManager(grid9);

        } else if (country_position == 10) {
            ArrayList<ContactsModel> southKorea = new ArrayList<>();
            southKorea.add(new ContactsModel(R.drawable.sk_1, R.drawable.whatsapp, "Bora","20","South korea"));
            southKorea.add(new ContactsModel(R.drawable.sk_2, R.drawable.whatsapp, "Ai_Ho","26","South korea"));
            southKorea.add(new ContactsModel(R.drawable.sk_3, R.drawable.whatsapp, "Boram","23","South korea"));
            southKorea.add(new ContactsModel(R.drawable.sk_4, R.drawable.whatsapp, "Mai_Chi","32","South korea"));
            southKorea.add(new ContactsModel(R.drawable.sk_5, R.drawable.whatsapp, "Kao","28","South korea"));
            southKorea.add(new ContactsModel(R.drawable.sk_6, R.drawable.whatsapp, "Mai","19","South korea"));
            southKorea.add(new ContactsModel(R.drawable.sk_7, R.drawable.whatsapp, "Ni-haw","26","South korea"));
            southKorea.add(new ContactsModel(R.drawable.sk_8, R.drawable.whatsapp, "Ting","22","South korea"));
            southKorea.add(new ContactsModel(R.drawable.sk_9, R.drawable.whatsapp, "Pi-chaw","18","South korea"));
            southKorea.add(new ContactsModel(R.drawable.sk_10, R.drawable.whatsapp, "kaw","25","South korea"));
            southKorea.add(new ContactsModel(R.drawable.sko_1, R.drawable.whatsapp, "Celina","25","South korea"));
            southKorea.add(new ContactsModel(R.drawable.sko_2, R.drawable.whatsapp, "Merina","25","South korea"));
            southKorea.add(new ContactsModel(R.drawable.sko_3, R.drawable.whatsapp, "Koi","24","South korea"));
            southKorea.add(new ContactsModel(R.drawable.sko_4, R.drawable.whatsapp, "Kewi","22","South korea"));
            southKorea.add(new ContactsModel(R.drawable.sko_5, R.drawable.whatsapp, "Kieq","23","South korea"));
            southKorea.add(new ContactsModel(R.drawable.sko_6, R.drawable.whatsapp, "Jsano","26","South korea"));
            southKorea.add(new ContactsModel(R.drawable.sko_7, R.drawable.whatsapp, "Biterece","25","South korea"));

            ContactsAdapter adapter10 = new ContactsAdapter(southKorea, this);
            recyclerView.setAdapter(adapter10);
            GridLayoutManager grid10 = new GridLayoutManager(this, 3);
            recyclerView.setLayoutManager(grid10);

        } else if (country_position == 11) {
            ArrayList<ContactsModel> turkey = new ArrayList<>();
            turkey.add(new ContactsModel(R.drawable.tur_1, R.drawable.whatsapp, "Ayelem","24","Turkey"));
            turkey.add(new ContactsModel(R.drawable.tur_2, R.drawable.whatsapp, "Banu","23","Turkey"));
            turkey.add(new ContactsModel(R.drawable.tur_4, R.drawable.whatsapp, "Beyza","25","Turkey"));
            turkey.add(new ContactsModel(R.drawable.tur_5, R.drawable.whatsapp, "Caria","21","Turkey"));
            turkey.add(new ContactsModel(R.drawable.tur_6, R.drawable.whatsapp, "Halima","22","Turkey"));
            turkey.add(new ContactsModel(R.drawable.tur_7, R.drawable.whatsapp, "Defne","24","Turkey"));
            turkey.add(new ContactsModel(R.drawable.tur_8, R.drawable.whatsapp, "Harikz","22","Turkey"));
            turkey.add(new ContactsModel(R.drawable.tur_9, R.drawable.whatsapp, "Nurgul","20","Turkey"));
            turkey.add(new ContactsModel(R.drawable.t_1, R.drawable.whatsapp, "Kiran Ha","23","Turkey"));
            turkey.add(new ContactsModel(R.drawable.t_2, R.drawable.whatsapp, "Farida ","25","Turkey"));
            turkey.add(new ContactsModel(R.drawable.t_3, R.drawable.whatsapp, "Byelem","28","Turkey"));
            turkey.add(new ContactsModel(R.drawable.t_4, R.drawable.whatsapp, "Gaga","20","Turkey"));
            turkey.add(new ContactsModel(R.drawable.t_5, R.drawable.whatsapp, "Chtia","19","Turkey"));


            ContactsAdapter adapter11 = new ContactsAdapter(turkey, this);
            recyclerView.setAdapter(adapter11);
            GridLayoutManager grid11 = new GridLayoutManager(this, 3);
            recyclerView.setLayoutManager(grid11);

        } else if (country_position == 12) {
            ArrayList<ContactsModel> uae = new ArrayList<>();
            uae.add(new ContactsModel(R.drawable.uae_1, R.drawable.whatsapp, "Aabida","27","UAE"));
            uae.add(new ContactsModel(R.drawable.uae_2, R.drawable.whatsapp, "Maryah","24","UAE"));
            uae.add(new ContactsModel(R.drawable.uae_3, R.drawable.whatsapp, "Bibi","23","UAE"));
            uae.add(new ContactsModel(R.drawable.uae_4, R.drawable.whatsapp, "Cally","24","UAE"));
            uae.add(new ContactsModel(R.drawable.uae_5, R.drawable.whatsapp, "Faizah","24","UAE"));
            uae.add(new ContactsModel(R.drawable.uae_6, R.drawable.whatsapp, "Emani","25","UAE"));
            uae.add(new ContactsModel(R.drawable.uae_8, R.drawable.whatsapp, "Hadil","26","UAE"));
            uae.add(new ContactsModel(R.drawable.uae_9, R.drawable.whatsapp, "Hana","25","UAE"));

            ContactsAdapter adapter12 = new ContactsAdapter(uae, this);
            recyclerView.setAdapter(adapter12);
            GridLayoutManager grid12 = new GridLayoutManager(this, 3);
            recyclerView.setLayoutManager(grid12);

        } else if (country_position == 13) {
            ArrayList<ContactsModel> usa = new ArrayList<>();
            usa.add(new ContactsModel(R.drawable.usa_1, R.drawable.whatsapp, "Liliana","28","USA"));
            usa.add(new ContactsModel(R.drawable.usa_2, R.drawable.whatsapp, "Hadley","29","USA"));
            usa.add(new ContactsModel(R.drawable.usa_3, R.drawable.whatsapp, "Reagan","25","USA"));
            usa.add(new ContactsModel(R.drawable.usa_4, R.drawable.whatsapp, "Adalynn","27","USA"));
            usa.add(new ContactsModel(R.drawable.usa_5, R.drawable.whatsapp, "Mackenzie","26","USA"));
            usa.add(new ContactsModel(R.drawable.usa_6, R.drawable.whatsapp, "Amaya","20","USA"));
            usa.add(new ContactsModel(R.drawable.usa_7, R.drawable.whatsapp, "Khloe","26","USA"));
            usa.add(new ContactsModel(R.drawable.usa_8, R.drawable.whatsapp, "Londyn","25","USA"));
            usa.add(new ContactsModel(R.drawable.usa_9, R.drawable.whatsapp, "Kehlani","24","USA"));
            usa.add(new ContactsModel(R.drawable.us_1, R.drawable.whatsapp, "Lila","26","USA"));
            usa.add(new ContactsModel(R.drawable.us_2, R.drawable.whatsapp, "Jira","20","USA"));
            usa.add(new ContactsModel(R.drawable.us_3, R.drawable.whatsapp, "Bita","23","USA"));
            usa.add(new ContactsModel(R.drawable.us_4, R.drawable.whatsapp, "Vgara","24","USA"));
            usa.add(new ContactsModel(R.drawable.us_5, R.drawable.whatsapp, "Sdfora","22","USA"));
            usa.add(new ContactsModel(R.drawable.us_6, R.drawable.whatsapp, "Waliue","20","USA"));
            usa.add(new ContactsModel(R.drawable.us_7, R.drawable.whatsapp, "Erdum","21","USA"));
            usa.add(new ContactsModel(R.drawable.us_8, R.drawable.whatsapp, "Bahmana","22","USA"));
            usa.add(new ContactsModel(R.drawable.us_9, R.drawable.whatsapp, "Tokyo","29","USA"));

            ContactsAdapter adapter13 = new ContactsAdapter(usa, this);
            recyclerView.setAdapter(adapter13);
            GridLayoutManager grid13 = new GridLayoutManager(this, 3);
            recyclerView.setLayoutManager(grid13);

        } else if (country_position == 14) {
            ArrayList<ContactsModel> uzbak = new ArrayList<>();
            uzbak.add(new ContactsModel(R.drawable.uzb_1, R.drawable.whatsapp, "Chinara","21","Uzbekistan"));
            uzbak.add(new ContactsModel(R.drawable.uzb_2, R.drawable.whatsapp, "Durdona","22","Uzbekistan"));
            uzbak.add(new ContactsModel(R.drawable.uzb_3, R.drawable.whatsapp, "Anora","23","Uzbekistan"));
            uzbak.add(new ContactsModel(R.drawable.uzb_4, R.drawable.whatsapp, "Azaliya","24","Uzbekistan"));
            uzbak.add(new ContactsModel(R.drawable.uzb_5, R.drawable.whatsapp, "Lola","24","Uzbekistan"));
            uzbak.add(new ContactsModel(R.drawable.uzb_6, R.drawable.whatsapp, "Umida","23","Uzbekistan"));
            uzbak.add(new ContactsModel(R.drawable.uzb_7, R.drawable.whatsapp, "Yulduz","22","Uzbekistan"));
            uzbak.add(new ContactsModel(R.drawable.uzb_8, R.drawable.whatsapp, "Zuhro","26","Uzbekistan"));
            uzbak.add(new ContactsModel(R.drawable.uzo_2, R.drawable.whatsapp, "Hina","23","Uzbekistan"));
            uzbak.add(new ContactsModel(R.drawable.uzo_3, R.drawable.whatsapp, "Khalida","22","Uzbekistan"));
            uzbak.add(new ContactsModel(R.drawable.uzo_4, R.drawable.whatsapp, "Diana","26","Uzbekistan"));
            uzbak.add(new ContactsModel(R.drawable.uzo_5, R.drawable.whatsapp, "Salina","27","Uzbekistan"));
            uzbak.add(new ContactsModel(R.drawable.uzo_6, R.drawable.whatsapp, "Wolim","25","Uzbekistan"));
            uzbak.add(new ContactsModel(R.drawable.uzo_7, R.drawable.whatsapp, "Aiza","23","Uzbekistan"));
            uzbak.add(new ContactsModel(R.drawable.uzo_8, R.drawable.whatsapp, "SOi","22","Uzbekistan"));


            ContactsAdapter adapter14 = new ContactsAdapter(uzbak, this);
            recyclerView.setAdapter(adapter14);
            GridLayoutManager grid14 = new GridLayoutManager(this, 3);
            recyclerView.setLayoutManager(grid14);

        }

    }
    @Override
    public void onBackPressed() {
        if (mInterstitialAd != null) {
            mInterstitialAd.show(ContactsActivity.this);
            finish();
        } else {
            Log.d("TAG", "The interstitial ad wasn't ready yet.");
        }


       }
}