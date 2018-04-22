package com.droidverine.nearbyplaces.Activities;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.droidverine.nearbyplaces.R;
import com.droidverine.nearbyplaces.utils.DetailsManager;
import com.droidverine.nearbyplaces.utils.OfflineDatabase;
import com.google.android.gms.auth.api.Auth;

import java.util.HashMap;


public class HomeActivity extends AppCompatActivity implements View.OnClickListener {
    Button wadalabtn,dadarbtn,mahimbtn;
    OfflineDatabase offlineDatabase;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        wadalabtn=(Button)findViewById(R.id.btnwadala);
        dadarbtn=(Button)findViewById(R.id.btndadar);
        mahimbtn=(Button)findViewById(R.id.btnmahim);
        wadalabtn.setOnClickListener(this);
        dadarbtn.setOnClickListener(this);
        mahimbtn.setOnClickListener(this);
         offlineDatabase=new OfflineDatabase(getApplicationContext());
       offlineDatabase.truncateSponsors();
       hotels();
        garages();
        banks();
        hospitals();
        petrolpumps();
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.menu_home, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        int id = item.getItemId();

        if (id == R.id.action_sign_out)
        {
          startActivity(new Intent(HomeActivity.this,ContactsActivity.class));

            return true;
        }


        else
        {
            //  startActivity(new Intent(HomeActivity.this, Sponsors.class));
        }

        return super.onOptionsItemSelected(item);
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnwadala:
                Intent intent=new Intent(HomeActivity.this,DomainsActivity.class);
                intent.putExtra("placelocality","WADALA");
                startActivity(intent);
                break;
            case R.id.btndadar:
                Intent intent1=new Intent(HomeActivity.this,DomainsActivity.class);
                intent1.putExtra("placelocality","DADAR");
                startActivity(intent1);
                break;
            case R.id.btnmahim:
                Intent intent2=new Intent(HomeActivity.this,DomainsActivity.class);
                intent2.putExtra("placelocality","MAHIM");
                startActivity(intent2);
                break;


        }

    }
    public void petrolpumps()
    {
        //petrol pumps begin wadala
        HashMap<String,String> hashMapwdlhot12=new HashMap<String, String>();
        hashMapwdlhot12.put(DetailsManager.PLACE_LOCATIONS,"WADALA");
        hashMapwdlhot12.put(DetailsManager.PLACES_NAMES,"Uganda Petrol Pump");
        hashMapwdlhot12.put(DetailsManager.PLACES_LAN,"19.0141723");
        hashMapwdlhot12.put(DetailsManager.PLACES_LONG,"72.8531983");
        hashMapwdlhot12.put(DetailsManager.PLACES_DOMAIN,"petrolpumps");
        hashMapwdlhot12.put(DetailsManager.PLACES_ADDRESS," Wadala West, Matunga East, Mumbai, Maharashtra 400031");
        offlineDatabase.insertSponsors1(hashMapwdlhot12);

        hashMapwdlhot12.put(DetailsManager.PLACE_LOCATIONS,"WADALA");
        hashMapwdlhot12.put(DetailsManager.PLACES_NAMES,"BPCL Petrol Pump");
        hashMapwdlhot12.put(DetailsManager.PLACES_LAN,"19.0074293");
        hashMapwdlhot12.put(DetailsManager.PLACES_LONG,"72.8566047");
        hashMapwdlhot12.put(DetailsManager.PLACES_DOMAIN,"petrolpumps");
        hashMapwdlhot12.put(DetailsManager.PLACES_ADDRESS,"Nr., BPCL Terminal, Wadala, Mumbai, Maharashtra 400015");
        offlineDatabase.insertSponsors1(hashMapwdlhot12);
        //petrol pumps in dadar

        hashMapwdlhot12.put(DetailsManager.PLACE_LOCATIONS,"DADAR");
        hashMapwdlhot12.put(DetailsManager.PLACES_NAMES,"BPCL CNG Pump");
        hashMapwdlhot12.put(DetailsManager.PLACES_LAN,"19.0074293");
        hashMapwdlhot12.put(DetailsManager.PLACES_LONG,"72.8566047");
        hashMapwdlhot12.put(DetailsManager.PLACES_DOMAIN,"petrolpumps");
        hashMapwdlhot12.put(DetailsManager.PLACES_ADDRESS,"Chandrakant Dhuru Wadi, Dadar, Mumbai, Maharashtra 400028");
        offlineDatabase.insertSponsors1(hashMapwdlhot12);

        hashMapwdlhot12.put(DetailsManager.PLACE_LOCATIONS,"DADAR");
        hashMapwdlhot12.put(DetailsManager.PLACES_NAMES,"National Petrol Company");
        hashMapwdlhot12.put(DetailsManager.PLACES_LAN,"19.0074293");
        hashMapwdlhot12.put(DetailsManager.PLACES_LONG,"72.8566047");
        hashMapwdlhot12.put(DetailsManager.PLACES_DOMAIN,"petrolpumps");
        hashMapwdlhot12.put(DetailsManager.PLACES_ADDRESS,"Dadar West, Gokale Road North, Mumbai, Maharashtra 400028");
        offlineDatabase.insertSponsors1(hashMapwdlhot12);

        hashMapwdlhot12.put(DetailsManager.PLACE_LOCATIONS,"DADAR");
        hashMapwdlhot12.put(DetailsManager.PLACES_NAMES,"Hp Petrol Pump - Cadell Auto Service");
        hashMapwdlhot12.put(DetailsManager.PLACES_LAN,"19.0074293");
        hashMapwdlhot12.put(DetailsManager.PLACES_LONG,"72.8566047");
        hashMapwdlhot12.put(DetailsManager.PLACES_DOMAIN,"petrolpumps");
        hashMapwdlhot12.put(DetailsManager.PLACES_ADDRESS,"Swatantrya Veer Savarkar Marg, Shivaji Park, Mumbai, Maharashtra 400028");
        offlineDatabase.insertSponsors1(hashMapwdlhot12);

        //petrol pumps in mahim]
        hashMapwdlhot12.put(DetailsManager.PLACE_LOCATIONS,"MAHIM");
        hashMapwdlhot12.put(DetailsManager.PLACES_NAMES,"HP PETROL PUMP HIND AUTO");
        hashMapwdlhot12.put(DetailsManager.PLACES_LAN,"19.0074293");
        hashMapwdlhot12.put(DetailsManager.PLACES_LONG,"72.8566047");
        hashMapwdlhot12.put(DetailsManager.PLACES_DOMAIN,"petrolpumps");
        hashMapwdlhot12.put(DetailsManager.PLACES_ADDRESS,"52, Lady Jamshedji Road, Mahim West, Mumbai, Maharashtra 400016");
        offlineDatabase.insertSponsors1(hashMapwdlhot12);

        hashMapwdlhot12.put(DetailsManager.PLACE_LOCATIONS,"MAHIM");
        hashMapwdlhot12.put(DetailsManager.PLACES_NAMES,"Bharat Petrol Pump");
        hashMapwdlhot12.put(DetailsManager.PLACES_LAN,"19.0074293");
        hashMapwdlhot12.put(DetailsManager.PLACES_LONG,"72.8566047");
        hashMapwdlhot12.put(DetailsManager.PLACES_DOMAIN,"petrolpumps");
        hashMapwdlhot12.put(DetailsManager.PLACES_ADDRESS,"S.V Road, Mahim West, Mahim, Mumbai, Maharashtra 400016");
        offlineDatabase.insertSponsors1(hashMapwdlhot12);

        hashMapwdlhot12.put(DetailsManager.PLACE_LOCATIONS,"MAHIM");
        hashMapwdlhot12.put(DetailsManager.PLACES_NAMES,"Hp Petrol Pump - Cadell Auto Service");
        hashMapwdlhot12.put(DetailsManager.PLACES_LAN,"19.0074293");
        hashMapwdlhot12.put(DetailsManager.PLACES_LONG,"72.8566052");
        hashMapwdlhot12.put(DetailsManager.PLACES_DOMAIN,"petrolpumps");
        hashMapwdlhot12.put(DetailsManager.PLACES_ADDRESS,"Opposite Victoria Church, Lady Jamshedji Marg, Mahim West, Mumbai, Maharashtra 400016");
        offlineDatabase.insertSponsors1(hashMapwdlhot12);
    }
    public void hotels()
    {
        //hotels begin wadala
        HashMap<String,String> hashMapwdlhot12=new HashMap<String, String>();
        hashMapwdlhot12.put(DetailsManager.PLACE_LOCATIONS,"WADALA");
        hashMapwdlhot12.put(DetailsManager.PLACES_NAMES,"Wadala Restaurant & Stores");
        hashMapwdlhot12.put(DetailsManager.PLACES_LAN,"19.0169233");
        hashMapwdlhot12.put(DetailsManager.PLACES_LONG,"72.856201");
        hashMapwdlhot12.put(DetailsManager.PLACES_DOMAIN,"hotels");
        hashMapwdlhot12.put(DetailsManager.PLACES_ADDRESS,"Opposite Wadala Railway Station, Wadala West, Station Rd, Wadla Village, Wadala, Mumbai-400031");
        offlineDatabase.insertSponsors1(hashMapwdlhot12);

        HashMap<String,String> hashMapwdlhot121=new HashMap<String, String>();
        hashMapwdlhot121.put(DetailsManager.PLACE_LOCATIONS,"WADALA");
        hashMapwdlhot121.put(DetailsManager.PLACES_NAMES,"Shree Sainath Bar and Restaurant");
        hashMapwdlhot121.put(DetailsManager.PLACES_LAN,"19.0132892");
        hashMapwdlhot121.put(DetailsManager.PLACES_LONG,"72.8527095");
        hashMapwdlhot121.put(DetailsManager.PLACES_DOMAIN,"hotels");
        hashMapwdlhot121.put(DetailsManager.PLACES_ADDRESS,"Koodiyana Building, Khareghat Rd, Near Vadala Market, Wadala, Mumbai-400031");
        offlineDatabase.insertSponsors1(hashMapwdlhot121);


        HashMap<String,String> hashMapwdlhot1212=new HashMap<String, String>();
        hashMapwdlhot1212.put(DetailsManager.PLACE_LOCATIONS,"WADALA");
        hashMapwdlhot1212.put(DetailsManager.PLACES_NAMES,"Relax Fast Food");
        hashMapwdlhot1212.put(DetailsManager.PLACES_LAN,"19.0224536");
        hashMapwdlhot1212.put(DetailsManager.PLACES_LONG,"72.855261");
        hashMapwdlhot1212.put(DetailsManager.PLACES_DOMAIN,"hotels");
        hashMapwdlhot1212.put(DetailsManager.PLACES_ADDRESS,"Plot No. 161, Sai Krupa Building, Road Number 10, Wadala, Mumbai-400031");
        offlineDatabase.insertSponsors1(hashMapwdlhot1212);


        HashMap<String,String> hashMapwdlhot1213=new HashMap<String, String>();
        hashMapwdlhot1213.put(DetailsManager.PLACE_LOCATIONS,"WADALA");
        hashMapwdlhot1213.put(DetailsManager.PLACES_NAMES,"Suyog Bar & Restaurant");
        hashMapwdlhot1213.put(DetailsManager.PLACES_LAN,"19.0175871");
        hashMapwdlhot1213.put(DetailsManager.PLACES_LONG,"72.8518405");
        hashMapwdlhot1213.put(DetailsManager.PLACES_DOMAIN,"hotels");
        hashMapwdlhot1213.put(DetailsManager.PLACES_ADDRESS,"Municipality Building, Parsi Colony, Katrak Road, Dadar, Mumbai-400031");
        offlineDatabase.insertSponsors1(hashMapwdlhot1213);

        HashMap<String,String> hashMapwdlhot123=new HashMap<String, String>();
        hashMapwdlhot123.put(DetailsManager.PLACE_LOCATIONS,"WADALA");
        hashMapwdlhot123.put(DetailsManager.PLACES_NAMES,"Wok - In");
        hashMapwdlhot123.put(DetailsManager.PLACES_LAN,"19.0168939");
        hashMapwdlhot123.put(DetailsManager.PLACES_LONG,"72.8561649");
        hashMapwdlhot123.put(DetailsManager.PLACES_DOMAIN,"hotels");
        hashMapwdlhot123.put(DetailsManager.PLACES_ADDRESS,"248, Station Rd, Wadla Village, Wadala, Mumbai-400031");
        offlineDatabase.insertSponsors1(hashMapwdlhot123);

        HashMap<String,String> hashMapwdlhot1232=new HashMap<String, String>();
        hashMapwdlhot1232.put(DetailsManager.PLACE_LOCATIONS,"WADALA");
        hashMapwdlhot1232.put(DetailsManager.PLACES_NAMES,"Bansuri Family Bar & Restaurant");
        hashMapwdlhot1232.put(DetailsManager.PLACES_LAN,"19.0184379");
        hashMapwdlhot1232.put(DetailsManager.PLACES_LONG,"72.8616543");
        hashMapwdlhot1232.put(DetailsManager.PLACES_DOMAIN,"hotels");
        hashMapwdlhot1232.put(DetailsManager.PLACES_ADDRESS,"B.D.opp., Wadala Bridge, Wadala East, Wadala, Mumbai-400037");
        offlineDatabase.insertSponsors1(hashMapwdlhot1232);

        HashMap<String,String> hashMapwdlhot1236=new HashMap<String, String>();
        hashMapwdlhot1236.put(DetailsManager.PLACE_LOCATIONS,"WADALA");
        hashMapwdlhot1236.put(DetailsManager.PLACES_NAMES,"Vrindavan");
        hashMapwdlhot1236.put(DetailsManager.PLACES_LAN,"19.0233953");
        hashMapwdlhot1236.put(DetailsManager.PLACES_LONG,"72.8640184");
        hashMapwdlhot1236.put(DetailsManager.PLACES_DOMAIN,"hotels");
        hashMapwdlhot1236.put(DetailsManager.PLACES_ADDRESS," Club House, Eastern Fwy, Dosti Acres, Antop Hill, Mumbai, Maharashtra 400074");
        HashMap<String,String> hashMapwdlhot124=new HashMap<String, String>();
        hashMapwdlhot124.put(DetailsManager.PLACE_LOCATIONS,"WADALA");
        hashMapwdlhot124.put(DetailsManager.PLACES_NAMES,"Cafe VJTI");
        hashMapwdlhot124.put(DetailsManager.PLACES_LAN,"19.0185158");
        hashMapwdlhot124.put(DetailsManager.PLACES_LONG,"72.8544985");
        hashMapwdlhot124.put(DetailsManager.PLACES_DOMAIN,"hotels");
        hashMapwdlhot124.put(DetailsManager.PLACES_ADDRESS,"Wadla Village, 191, Station Rd, Wadla Village, Wadala, Mumbai-400031");
        offlineDatabase.insertSponsors1(hashMapwdlhot124);

        HashMap<String,String> hashMapwdlhot1235=new HashMap<String, String>();
        hashMapwdlhot1235.put(DetailsManager.PLACE_LOCATIONS,"WADALA");
        hashMapwdlhot1235.put(DetailsManager.PLACES_NAMES,"LAXMI HOTEL");
        hashMapwdlhot1235.put(DetailsManager.PLACES_LAN,"19.0179646");
        hashMapwdlhot1235.put(DetailsManager.PLACES_LONG,"72.8618652");
        hashMapwdlhot1235.put(DetailsManager.PLACES_DOMAIN,"hotels");
        hashMapwdlhot1235.put(DetailsManager.PLACES_ADDRESS,"Barkat Road, Jaikar Wadi, Wadala East, Nandkarni Park, Antop Hill, Mumbai-400037");
        offlineDatabase.insertSponsors1(hashMapwdlhot1235);
        HashMap<String,String> hashMapwdlhot=new HashMap<String, String>();
        hashMapwdlhot.put(DetailsManager.PLACE_LOCATIONS,"WADALA");

        hashMapwdlhot.put(DetailsManager.PLACES_NAMES,"Hariyali hotel");
        hashMapwdlhot.put(DetailsManager.PLACES_LAN,"19.0187447");
        hashMapwdlhot.put(DetailsManager.PLACES_LONG,"72.8632328");
        hashMapwdlhot.put(DetailsManager.PLACES_DOMAIN,"hotels");
        hashMapwdlhot.put(DetailsManager.PLACES_ADDRESS,"Barkat Ali Dargah Road, Near Wadala Fly Over Bridge, Wadala, Mumbai, Maharashtra 400037");

        offlineDatabase.insertSponsors1(hashMapwdlhot);
        HashMap<String,String> hashMapwdlhot1=new HashMap<String, String>();
        hashMapwdlhot1.put(DetailsManager.PLACE_LOCATIONS,"WADALA");

        hashMapwdlhot1.put(DetailsManager.PLACES_NAMES,"Saraswati hotel");
        hashMapwdlhot1.put(DetailsManager.PLACES_LAN,"19.012901");
        hashMapwdlhot1.put(DetailsManager.PLACES_LONG,"72.849065");
        hashMapwdlhot1.put(DetailsManager.PLACES_DOMAIN,"hotels");
        hashMapwdlhot1.put(DetailsManager.PLACES_ADDRESS,"Opp. Wadala Udyog Bhawan, Dadar East,, Mumbai, Maharashtra 400014");


        HashMap<String,String> hashMapwdlhot2=new HashMap<String, String>();
        hashMapwdlhot2.put(DetailsManager.PLACE_LOCATIONS,"WADALA");
        hashMapwdlhot2.put(DetailsManager.PLACES_NAMES,"Satkar Hotel");
        hashMapwdlhot2.put(DetailsManager.PLACES_LAN,"19.0120521");
        hashMapwdlhot2.put(DetailsManager.PLACES_LONG,"72.8534652");
        hashMapwdlhot2.put(DetailsManager.PLACES_DOMAIN,"hotels");
        hashMapwdlhot2.put(DetailsManager.PLACES_ADDRESS," Besides Talwalkars Gym, Road Number 37, Sahakar Nagar, Wadala, Mumbai, Maharashtra 400031");

        offlineDatabase.insertSponsors1(hashMapwdlhot2);
        HashMap<String,String> hashMapwdlhot3=new HashMap<String, String>();
        hashMapwdlhot3.put(DetailsManager.PLACE_LOCATIONS,"WADALA");
        hashMapwdlhot3.put(DetailsManager.PLACES_NAMES,"Palkhi Hotel");
        hashMapwdlhot3.put(DetailsManager.PLACES_LAN,"19.0220805");
        hashMapwdlhot3.put(DetailsManager.PLACES_LONG,"72.8632481");
        hashMapwdlhot3.put(DetailsManager.PLACES_DOMAIN,"hotels");
        hashMapwdlhot3.put(DetailsManager.PLACES_ADDRESS,"Shop No. 3, Jupiter Building, Dosti Estate, Sheikh Masari Marg, Wadala, Antop Hill, Mumbai -400037");
        offlineDatabase.insertSponsors1(hashMapwdlhot3);
        //hotels end WADALA
        //hotels begin dadar
        HashMap<String,String> hashMap=new HashMap<String, String>();



        HashMap<String,String> hashMap2=new HashMap<String, String>();
        hashMap2.put(DetailsManager.PLACE_LOCATIONS,"DADAR");

        hashMap2.put(DetailsManager.PLACES_NAMES,"china bistro");
        hashMap2.put(DetailsManager.PLACES_LAN,"72.8400771");
        hashMap2.put(DetailsManager.PLACES_LONG,"19.0250607");
        hashMap2.put(DetailsManager.PLACES_DOMAIN,"hotels");
        hashMap2.put(DetailsManager.PLACES_DOMAIN,"Sadanand,Opposite Amar Hind Mandal, Gokhale Road (North), Opposite Chandrika Automobiles,Dadar West");

        offlineDatabase.insertSponsors1(hashMap2);
        HashMap<String,String> hashMap3=new HashMap<String, String>();
        hashMap3.put(DetailsManager.PLACE_LOCATIONS,"DADAR");
        hashMap3.put(DetailsManager.PLACES_NAMES,"Apoorva");
        hashMap3.put(DetailsManager.PLACES_LAN,"19.0236521");
        hashMap3.put(DetailsManager.PLACES_LONG,"72.8382589");
        hashMap3.put(DetailsManager.PLACES_DOMAIN,"hotels");
        hashMap3.put(DetailsManager.PLACES_DOMAIN,"Sadanand,Opposite Amar Hind Mandal, Gokhale Road (North), Opposite Chandrika Automobiles,Dadar West");

        offlineDatabase.insertSponsors1(hashMap3);
        HashMap<String,String> hashMapddrhot=new HashMap<String, String>();
        hashMapddrhot.put(DetailsManager.PLACE_LOCATIONS,"DADAR");
        hashMapddrhot.put(DetailsManager.PLACES_NAMES,"Aaswad");
        hashMapddrhot.put(DetailsManager.PLACES_LAN,"19.0205513");
        hashMapddrhot.put(DetailsManager.PLACES_LONG,"72.8371057");
        hashMapddrhot.put(DetailsManager.PLACES_DOMAIN,"hotels");
        hashMapddrhot.put(DetailsManager.PLACES_DOMAIN,"Sadanand,Opposite Amar Hind Mandal, Gokhale Road (North), Opposite Chandrika Automobiles,Dadar West");

        offlineDatabase.insertSponsors1(hashMapddrhot);
        HashMap<String,String> hashMapddrhot1=new HashMap<String, String>();
        hashMapddrhot1.put(DetailsManager.PLACE_LOCATIONS,"DADAR");
        hashMapddrhot1.put(DetailsManager.PLACES_NAMES,"Light of Bharat Restaurant");
        hashMapddrhot1.put(DetailsManager.PLACES_LAN,"19.0241955");
        hashMapddrhot1.put(DetailsManager.PLACES_LONG,"72.8354292");
        hashMapddrhot1.put(DetailsManager.PLACES_DOMAIN,"hotels");
        hashMapddrhot1.put(DetailsManager.PLACES_DOMAIN,"Meher Building, Opp Senapati Bapat Statue, Ranade Rd, Dadar West, Shivaji Park, Mumbai, Maharashtra 400028");

        offlineDatabase.insertSponsors1(hashMapddrhot1);
        HashMap<String,String> hashMapddrhot2=new HashMap<String, String>();
        hashMapddrhot2.put(DetailsManager.PLACE_LOCATIONS,"DADAR");
        hashMapddrhot2.put(DetailsManager.PLACES_NAMES,"Anugraha Pure Veg.");
        hashMapddrhot2.put(DetailsManager.PLACES_LAN,"19.0218941");
        hashMapddrhot2.put(DetailsManager.PLACES_LONG,"72.83571");
        hashMapddrhot2.put(DetailsManager.PLACES_DOMAIN,"hotels");
        hashMapddrhot2.put(DetailsManager.PLACES_DOMAIN,"Sarvodaya Bhavan, Gokhale Road North, Dadar, Mumbai, Maharashtra 400028");

        offlineDatabase.insertSponsors1(hashMapddrhot2);
        HashMap<String,String> hashMapddrhot21=new HashMap<String, String>();
        hashMapddrhot21.put(DetailsManager.PLACE_LOCATIONS,"DADAR");
        hashMapddrhot21.put(DetailsManager.PLACES_NAMES,"Hotel Sindhudurg");
        hashMapddrhot21.put(DetailsManager.PLACES_LAN,"19.0230698");
        hashMapddrhot21.put(DetailsManager.PLACES_LONG,"72.838954");
        hashMapddrhot21.put(DetailsManager.PLACES_DOMAIN,"hotels");
        hashMapddrhot21.put(DetailsManager.PLACES_ADDRESS,"Gita Sadan, Rk Vaidya Road, Dadar West, Mumbai, Maharashtra 400028");

        offlineDatabase.insertSponsors1(hashMapddrhot21);
        HashMap<String,String> hashMapddrhot22=new HashMap<String, String>();
        hashMapddrhot22.put(DetailsManager.PLACE_LOCATIONS,"DADAR");
        hashMapddrhot22.put(DetailsManager.PLACES_NAMES,"Oven Fresh");
        hashMapddrhot22.put(DetailsManager.PLACES_LAN,"19.0239849");
        hashMapddrhot22.put(DetailsManager.PLACES_LONG,"72.8358888");
        hashMapddrhot22.put(DetailsManager.PLACES_DOMAIN,"hotels");
        hashMapddrhot22.put(DetailsManager.PLACES_ADDRESS,"68, Kiran Building, Ranade Road, Dadar West, Mumbai, Maharashtra 400028");

        offlineDatabase.insertSponsors1(hashMapddrhot22);
        HashMap<String,String> hashMapddrhot221=new HashMap<String, String>();
        hashMapddrhot221.put(DetailsManager.PLACE_LOCATIONS,"DADAR");
        hashMapddrhot221.put(DetailsManager.PLACES_NAMES,"Ronaldo's Family Restaurant");
        hashMapddrhot221.put(DetailsManager.PLACES_LAN,"19.020309");
        hashMapddrhot221.put(DetailsManager.PLACES_LONG,"72.8399375");
        hashMapddrhot221.put(DetailsManager.PLACES_DOMAIN,"hotels");
        hashMapddrhot221.put(DetailsManager.PLACES_ADDRESS,"Pandit Chawl, 8 Vachanalay Marg, Dadar West, Dadar, Mumbai, Maharashtra 400028");

        offlineDatabase.insertSponsors1(hashMapddrhot221);
        HashMap<String,String> hashMapddrhot221e=new HashMap<String, String>();
        hashMapddrhot221e.put(DetailsManager.PLACE_LOCATIONS,"DADAR");
        hashMapddrhot221e.put(DetailsManager.PLACES_NAMES,"Sizzle House");
        hashMapddrhot221e.put(DetailsManager.PLACES_LAN,"19.03047");
        hashMapddrhot221e.put(DetailsManager.PLACES_LONG,"72.8363543");
        hashMapddrhot221e.put(DetailsManager.PLACES_DOMAIN,"hotels");
        hashMapddrhot221e.put(DetailsManager.PLACES_ADDRESS,"Bhagirathi Sadan, Opp. Cozy Travels, Junction of Yes Bank, Cadell Road,, Mumbai, Maharashtra 400016");

        offlineDatabase.insertSponsors1(hashMapddrhot221e);
        HashMap<String,String> hashMapddrhot221ed=new HashMap<String, String>();
        hashMapddrhot221ed.put(DetailsManager.PLACE_LOCATIONS,"DADAR");
        hashMapddrhot221ed.put(DetailsManager.PLACES_NAMES,"Konkan Sanman");
        hashMapddrhot221ed.put(DetailsManager.PLACES_LAN,"19.0225604");
        hashMapddrhot221ed.put(DetailsManager.PLACES_LONG,"72.8401145");
        hashMapddrhot221ed.put(DetailsManager.PLACES_DOMAIN,"hotels");
        hashMapddrhot221ed.put(DetailsManager.PLACES_ADDRESS,"Shivaji Mandir Building, N. C. Kelkar Road, Dadar West, Dadar, Mumbai, Maharashtra 400028");
        offlineDatabase.insertSponsors1(hashMapddrhot221ed);
        HashMap<String,String> hashMap1=new HashMap<String, String>();
        hashMap.put(DetailsManager.PLACE_LOCATIONS,"DADAR");

        hashMap.put(DetailsManager.PLACES_NAMES,"Gomantak Hotel");
        hashMap.put(DetailsManager.PLACES_LAN,"19.0233542");
        hashMap.put(DetailsManager.PLACES_LONG,"72.8421185");
        hashMap.put(DetailsManager.PLACES_DOMAIN,"hotels");
        hashMap.put(DetailsManager.PLACES_ADDRESS,"Near Plaza cinema,Dadar West,Mumbai, Maharashtra 400028");
        offlineDatabase.insertSponsors1(hashMap);
        hashMap.put(DetailsManager.PLACE_LOCATIONS,"DADAR");

        hashMap.put(DetailsManager.PLACES_NAMES,"Trupti Milk & Snacks Bar Pvt. Ltd.");
        hashMap.put(DetailsManager.PLACES_LAN,"19.0233542");
        hashMap.put(DetailsManager.PLACES_LONG,"72.8421185");
        hashMap.put(DetailsManager.PLACES_DOMAIN,"hotels");
        hashMap.put(DetailsManager.PLACES_ADDRESS,"Akanksha Building, Opposite Plaza Cinema, N. C. Kelkar Road, Mumbai-400028");
        offlineDatabase.insertSponsors1(hashMap);

        hashMap.put(DetailsManager.PLACE_LOCATIONS,"DADAR");
        hashMap.put(DetailsManager.PLACES_NAMES,"Gold Rushs Restaurant.");
        hashMap.put(DetailsManager.PLACES_LAN,"19.0230019");
        hashMap.put(DetailsManager.PLACES_LONG,"72.8362163");
        hashMap.put(DetailsManager.PLACES_DOMAIN,"hotels");
        hashMap.put(DetailsManager.PLACES_ADDRESS,"Haji EP Trust Building, Ranade Road, Dadar West, Dadar, Mumbai, Maharashtra 400028");
        offlineDatabase.insertSponsors1(hashMap);

        hashMap.put(DetailsManager.PLACE_LOCATIONS,"DADAR");
        hashMap.put(DetailsManager.PLACES_NAMES,"Sujata Veg Treat.");
        hashMap.put(DetailsManager.PLACES_LAN,"19.0227677");
        hashMap.put(DetailsManager.PLACES_LONG,"72.836521");
        hashMap.put(DetailsManager.PLACES_DOMAIN,"hotels");
        hashMap.put(DetailsManager.PLACES_ADDRESS,"Saraswati Mahal, Gokhale Road, Dadar West, Dadar, Mumbai, Maharashtra 400028");
        offlineDatabase.insertSponsors1(hashMap);

        hashMap.put(DetailsManager.PLACE_LOCATIONS,"DADAR");
        hashMap.put(DetailsManager.PLACES_NAMES,"Flavours Of China, Dadar.");
        hashMap.put(DetailsManager.PLACES_LAN,"19.0232438");
        hashMap.put(DetailsManager.PLACES_LONG,"72.8400921");
        hashMap.put(DetailsManager.PLACES_DOMAIN,"hotels");
        hashMap.put(DetailsManager.PLACES_ADDRESS,"301, N. C. Kelkar Road, Dadar West, Dadar, Mumbai, Maharashtra 400028");
        offlineDatabase.insertSponsors1(hashMap);

        hashMap.put(DetailsManager.PLACE_LOCATIONS,"DADAR");
        hashMap.put(DetailsManager.PLACES_NAMES,"Laxmi Restaurant.");
        hashMap.put(DetailsManager.PLACES_LAN,"19.0232436");
        hashMap.put(DetailsManager.PLACES_LONG,"72.833526");
        hashMap.put(DetailsManager.PLACES_DOMAIN,"hotels");
        hashMap.put(DetailsManager.PLACES_ADDRESS,"Laxmi Building,, Dr.M.C. Jawale Road, Dadar West, Mumbai, Maharashtra 400028");
        offlineDatabase.insertSponsors1(hashMap);

        hashMap.put(DetailsManager.PLACE_LOCATIONS,"DADAR");
        hashMap.put(DetailsManager.PLACES_NAMES,"Adarsh.");
        hashMap.put(DetailsManager.PLACES_LAN,"19.0232427");
        hashMap.put(DetailsManager.PLACES_LONG,"72.83352");
        hashMap.put(DetailsManager.PLACES_DOMAIN,"hotels");
        hashMap.put(DetailsManager.PLACES_ADDRESS,"Ranade Road, Dadar West, Dadar, Dadar West, Mumbai, Maharashtra 400028");
        offlineDatabase.insertSponsors1(hashMap);

        hashMap.put(DetailsManager.PLACE_LOCATIONS,"DADAR");
        hashMap.put(DetailsManager.PLACES_NAMES,"Hotel Visawa.");
        hashMap.put(DetailsManager.PLACES_LAN,"19.019578");
        hashMap.put(DetailsManager.PLACES_LONG,"72.8385433");
        hashMap.put(DetailsManager.PLACES_DOMAIN,"hotels");
        hashMap.put(DetailsManager.PLACES_ADDRESS,"Near Kabutar Khana, Dadar West, Mumbai, Maharashtra 400028");
        offlineDatabase.insertSponsors1(hashMap);


        //hotels end dadaR

        //hotels in mahim
        HashMap<String,String> hashMap8=new HashMap<String, String>();
        hashMap8.put(DetailsManager.PLACE_LOCATIONS,"MAHIM");
        hashMap8.put(DetailsManager.PLACES_NAMES,"SHEHENAZ");
        hashMap8.put(DetailsManager.PLACES_LAN,"19.0415051");
        hashMap8.put(DetailsManager.PLACES_LONG,"72.8405525");
        hashMap8.put(DetailsManager.PLACES_DOMAIN,"hotels");
        hashMap8.put(DetailsManager.PLACES_ADDRESS,"Lady Jamshedji Rd, Mahim Koliwada, Mahim West, Mahim, Mumbai-400016");

        offlineDatabase.insertSponsors1(hashMap8);
        HashMap<String,String> hashMap9=new HashMap<String, String>();
        hashMap9.put(DetailsManager.PLACE_LOCATIONS,"MAHIM");
        hashMap9.put(DetailsManager.PLACES_NAMES,"MAMA MIA");
        hashMap9.put(DetailsManager.PLACES_LAN,"19.0416526");
        hashMap9.put(DetailsManager.PLACES_LONG,"72.8399515");
        hashMap9.put(DetailsManager.PLACES_DOMAIN,"hotels");
        hashMap9.put(DetailsManager.PLACES_ADDRESS,"Shop No:4, Hazi Ismail Building , Old Cadell Rd, Mahim West, Mumbai, Maharashtra 400016");

        offlineDatabase.insertSponsors1(hashMap9);
        HashMap<String,String> hashMap0=new HashMap<String, String>();
        hashMap0.put(DetailsManager.PLACE_LOCATIONS,"MAHIM");
        hashMap0.put(DetailsManager.PLACES_NAMES,"Icy Spicy Restaurant");
        hashMap0.put(DetailsManager.PLACES_LAN,"19.0353618");
        hashMap0.put(DetailsManager.PLACES_LONG,"72.8431391");
        hashMap0.put(DetailsManager.PLACES_DOMAIN,"hotels");
        hashMap0.put(DetailsManager.PLACES_ADDRESS,"10-B, Ground Floor, Sindhi Nivas, Sitladevi Temple Road, Mahim West, Mumbai-400016");
        offlineDatabase.insertSponsors1(hashMap0);

        hashMap0.put(DetailsManager.PLACE_LOCATIONS,"MAHIM");
        hashMap0.put(DetailsManager.PLACES_NAMES,"AB The Dining Bar");
        hashMap0.put(DetailsManager.PLACES_LAN,"19.031353");
        hashMap0.put(DetailsManager.PLACES_LONG,"72.8395971");
        hashMap0.put(DetailsManager.PLACES_DOMAIN,"hotels");
        hashMap0.put(DetailsManager.PLACES_ADDRESS,"Near City Light Cinema, Lady Jamshedji Rd, Mahim, Mumbai, Maharashtra 400016");
        offlineDatabase.insertSponsors1(hashMap0);

        hashMap0.put(DetailsManager.PLACE_LOCATIONS,"MAHIM");
        hashMap0.put(DetailsManager.PLACES_NAMES,"Goa Portuguesa");
        hashMap0.put(DetailsManager.PLACES_LAN,"19.0318326");
        hashMap0.put(DetailsManager.PLACES_LONG,"72.8380443");
        hashMap0.put(DetailsManager.PLACES_DOMAIN,"hotels");
        hashMap0.put(DetailsManager.PLACES_ADDRESS,"T. H. Kataria Road, Near Hinduja Hospital, Mahim, Mumbai, Maharashtra 400016");
        offlineDatabase.insertSponsors1(hashMap0);

        hashMap0.put(DetailsManager.PLACE_LOCATIONS,"MAHIM");
        hashMap0.put(DetailsManager.PLACES_NAMES,"Fresh Catch");
        hashMap0.put(DetailsManager.PLACES_LAN,"19.0332656");
        hashMap0.put(DetailsManager.PLACES_LONG,"72.8397095");
        hashMap0.put(DetailsManager.PLACES_DOMAIN,"hotels");
        hashMap0.put(DetailsManager.PLACES_ADDRESS,"Diamond Court Chawl, PN Kotnis Rd, Mahim West, Mahim, Mumbai, Maharashtra 400016");
        offlineDatabase.insertSponsors1(hashMap0);

        hashMap0.put(DetailsManager.PLACE_LOCATIONS,"MAHIM");
        hashMap0.put(DetailsManager.PLACES_NAMES,"Ming Chinese Restaurant");
        hashMap0.put(DetailsManager.PLACES_LAN,"19.0394092");
        hashMap0.put(DetailsManager.PLACES_LONG,"72.8428185");
        hashMap0.put(DetailsManager.PLACES_DOMAIN,"hotels");
        hashMap0.put(DetailsManager.PLACES_ADDRESS,"Alpaiwalla Building, MMC Road, Mahim (West), Mumbai, Maharashtra 400016");
        offlineDatabase.insertSponsors1(hashMap0);

        hashMap0.put(DetailsManager.PLACE_LOCATIONS,"MAHIM");
        hashMap0.put(DetailsManager.PLACES_NAMES,"Sagar Restaurant & Bar");
        hashMap0.put(DetailsManager.PLACES_LAN,"19.0432621");
        hashMap0.put(DetailsManager.PLACES_LONG,"72.8397015");
        hashMap0.put(DetailsManager.PLACES_DOMAIN,"hotels");
        hashMap0.put(DetailsManager.PLACES_ADDRESS,"Mori Rd, Mahim, Mumbai, Maharashtra 400016");
        offlineDatabase.insertSponsors1(hashMap0);

        hashMap0.put(DetailsManager.PLACE_LOCATIONS,"MAHIM");
        hashMap0.put(DetailsManager.PLACES_NAMES,"Thangabali");
        hashMap0.put(DetailsManager.PLACES_LAN,"19.0315787");
        hashMap0.put(DetailsManager.PLACES_LONG,"72.8392676");
        hashMap0.put(DetailsManager.PLACES_DOMAIN,"hotels");
        hashMap0.put(DetailsManager.PLACES_ADDRESS,"Manmohan Bhavan,Takandas Kataria Marg, Mahim West,Takandas Kataria Marg, Mumbai,Maharashtra 400016");
        offlineDatabase.insertSponsors1(hashMap0);

        hashMap0.put(DetailsManager.PLACE_LOCATIONS,"MAHIM");
        hashMap0.put(DetailsManager.PLACES_NAMES,"Saffron Restaurant");
        hashMap0.put(DetailsManager.PLACES_LAN,"19.0342734");
        hashMap0.put(DetailsManager.PLACES_LONG,"72.8320286");
        hashMap0.put(DetailsManager.PLACES_DOMAIN,"hotels");
        hashMap0.put(DetailsManager.PLACES_ADDRESS,"BMC Building, Welkar Wadi, Mahim West, Opp Mahim Dargah, Mumbai, Maharashtra 400016");
        offlineDatabase.insertSponsors1(hashMap0);

        hashMap0.put(DetailsManager.PLACE_LOCATIONS,"MAHIM");
        hashMap0.put(DetailsManager.PLACES_NAMES,"Potoba Restaurant");
        hashMap0.put(DetailsManager.PLACES_LAN,"19.0329524");
        hashMap0.put(DetailsManager.PLACES_LONG,"72.839922");
        hashMap0.put(DetailsManager.PLACES_DOMAIN,"hotels");
        hashMap0.put(DetailsManager.PLACES_ADDRESS,"Opp Cloud 9 Gym, Lady Jamshedji Road, Mahim West, Mumbai, Maharashtra 400016");
        offlineDatabase.insertSponsors1(hashMap0);

        hashMap0.put(DetailsManager.PLACE_LOCATIONS,"MAHIM");
        hashMap0.put(DetailsManager.PLACES_NAMES,"Lucky Dragon Chinese Cuisine");
        hashMap0.put(DetailsManager.PLACES_LAN,"19.0394092");
        hashMap0.put(DetailsManager.PLACES_LONG,"72.8428185");
        hashMap0.put(DetailsManager.PLACES_DOMAIN,"hotels");
        hashMap0.put(DetailsManager.PLACES_ADDRESS,"Om Sai Building, Behind Big Bazar, Mogul Lane, Mahim, Mumbai, Maharashtra 400016");
        offlineDatabase.insertSponsors1(hashMap0);



    }
    public void banks()
    {
        //banks begin wadala
        HashMap<String,String> hashMapwdlhot1235=new HashMap<String, String>();
        hashMapwdlhot1235.put(DetailsManager.PLACE_LOCATIONS,"WADALA");
        hashMapwdlhot1235.put(DetailsManager.PLACES_NAMES,"Indian Bank");
        hashMapwdlhot1235.put(DetailsManager.PLACES_LAN,"19.017429");
        hashMapwdlhot1235.put(DetailsManager.PLACES_LONG,"72.8589221");
        hashMapwdlhot1235.put(DetailsManager.PLACES_DOMAIN,"banks");
        hashMapwdlhot1235.put(DetailsManager.PLACES_ADDRESS,"Parvati Nivas, Rafi Ahmed Kidwai Road, Wadala, Mumbai-400031");
        offlineDatabase.insertSponsors1(hashMapwdlhot1235);

        HashMap<String,String> hashMap4=new HashMap<String, String>();
        hashMap4.put(DetailsManager.PLACE_LOCATIONS,"WADALA");

        hashMap4.put(DetailsManager.PLACES_NAMES,"Central bank");
        hashMap4.put(DetailsManager.PLACES_LAN,"19.0177231");
        hashMap4.put(DetailsManager.PLACES_LONG,"72.8576981");
        hashMap4.put(DetailsManager.PLACES_DOMAIN,"banks");
        hashMap4.put(DetailsManager.PLACES_ADDRESS,"195, Station Rd, Wadla Village, Wadala, Mumbai-400031");

        offlineDatabase.insertSponsors1(hashMap4);
        HashMap<String,String> hashMap5=new HashMap<String, String>();
        hashMap5.put(DetailsManager.PLACE_LOCATIONS,"WADALA");

        hashMap5.put(DetailsManager.PLACES_NAMES,"saraswat bank");
        hashMap5.put(DetailsManager.PLACES_LAN,"19.0122051");
        hashMap5.put(DetailsManager.PLACES_LONG,"72.8736512");
        hashMap5.put(DetailsManager.PLACES_DOMAIN,"banks");
        hashMap5.put(DetailsManager.PLACES_ADDRESS,"Kidwai Road, Wadala, Mumbai, Maharashtra 400031");

        offlineDatabase.insertSponsors1(hashMap5);
        HashMap<String,String> hashMap6=new HashMap<String, String>();
        hashMap6.put(DetailsManager.PLACE_LOCATIONS,"WADALA");

        hashMap6.put(DetailsManager.PLACES_NAMES,"ICICI BANK");
        hashMap6.put(DetailsManager.PLACES_LAN,"19.0182332");
        hashMap6.put(DetailsManager.PLACES_LONG,"72.7854109");
        hashMap6.put(DetailsManager.PLACES_DOMAIN,"banks");
        hashMap6.put(DetailsManager.PLACES_ADDRESS,"Pushkaraj Bldg, Plot No 191, Station Road, Wadala, Mumbai-400031");

        offlineDatabase.insertSponsors1(hashMap6);
        HashMap<String,String> hashMap7=new HashMap<String, String>();
        hashMap7.put(DetailsManager.PLACE_LOCATIONS,"WADALA");
        hashMap7.put(DetailsManager.PLACES_NAMES,"Bank of Baroda");
        hashMap7.put(DetailsManager.PLACES_LAN,"19.0201425");
        hashMap7.put(DetailsManager.PLACES_LONG,"72.8595125");
        hashMap7.put(DetailsManager.PLACES_DOMAIN,"banks");
        hashMap7.put(DetailsManager.PLACES_ADDRESS,"Mayur Hilla, Rafi Ahmed Kidwai Road, Wadala, Mumbai-400031");

        offlineDatabase.insertSponsors1(hashMap7);
        HashMap<String,String> hashMapwdlhot1236=new HashMap<String, String>();
        hashMapwdlhot1236.put(DetailsManager.PLACE_LOCATIONS,"WADALA");
        hashMapwdlhot1236.put(DetailsManager.PLACES_NAMES,"Allahabad Bank");
        hashMapwdlhot1236.put(DetailsManager.PLACES_LAN,"19.0217005");
        hashMapwdlhot1236.put(DetailsManager.PLACES_LONG,"72.8576043");
        hashMapwdlhot1236.put(DetailsManager.PLACES_DOMAIN,"banks");
        hashMapwdlhot1236.put(DetailsManager.PLACES_ADDRESS,"Sannidhan Wadala Sewri Cross, Road Number 10, Wadala, Mumbai- 400031");
        offlineDatabase.insertSponsors1(hashMapwdlhot1236);

        HashMap<String,String> hashMapwdlhot1237=new HashMap<String, String>();
        hashMapwdlhot1237.put(DetailsManager.PLACE_LOCATIONS,"WADALA");
        hashMapwdlhot1237.put(DetailsManager.PLACES_NAMES,"Corporation Bank");
        hashMapwdlhot1237.put(DetailsManager.PLACES_LAN,"19.0151922");
        hashMapwdlhot1237.put(DetailsManager.PLACES_LONG,"72.8493735");
        hashMapwdlhot1237.put(DetailsManager.PLACES_DOMAIN,"banks");
        hashMapwdlhot1237.put(DetailsManager.PLACES_ADDRESS,"GD Ambekar Marg, Kohinoor Mill, Wadala, Mumbai-400031");
        offlineDatabase.insertSponsors1(hashMapwdlhot1237);
        HashMap<String,String> hashMapwdlhot1238=new HashMap<String, String>();
        hashMapwdlhot1238.put(DetailsManager.PLACE_LOCATIONS,"WADALA");
        hashMapwdlhot1238.put(DetailsManager.PLACES_NAMES,"Vijaya Bank ");
        hashMapwdlhot1238.put(DetailsManager.PLACES_LAN,"19.0218707");
        hashMapwdlhot1238.put(DetailsManager.PLACES_LONG,"72.8571499");
        hashMapwdlhot1238.put(DetailsManager.PLACES_DOMAIN,"banks");
        hashMapwdlhot1238.put(DetailsManager.PLACES_ADDRESS,"Indulal Bhuva Rd, Wadla Village Wadala, Mumbai-400031");
        offlineDatabase.insertSponsors1(hashMapwdlhot1238);
        HashMap<String,String> hashMapwdlhot1239=new HashMap<String, String>();
        hashMapwdlhot1239.put(DetailsManager.PLACE_LOCATIONS,"WADALA");
        hashMapwdlhot1239.put(DetailsManager.PLACES_NAMES,"Dena  Bank ");
        hashMapwdlhot1239.put(DetailsManager.PLACES_LAN,"19.017247");
        hashMapwdlhot1239.put(DetailsManager.PLACES_LONG,"72.8555895");
        hashMapwdlhot1239.put(DetailsManager.PLACES_DOMAIN,"banks");
        hashMapwdlhot1239.put(DetailsManager.PLACES_ADDRESS,"Rajkamal Building, Station Road, Wadala,, Mumbai, Maharashtra 400031");
        offlineDatabase.insertSponsors1(hashMapwdlhot1239);

        HashMap<String,String> hashMapwdlhot1230=new HashMap<String, String>();
        hashMapwdlhot1230.put(DetailsManager.PLACE_LOCATIONS,"WADALA");
        hashMapwdlhot1230.put(DetailsManager.PLACES_NAMES,"UCO BANK");
        hashMapwdlhot1230.put(DetailsManager.PLACES_LAN,"19.0117686");
        hashMapwdlhot1230.put(DetailsManager.PLACES_LONG,"72.851019");
        hashMapwdlhot1230.put(DetailsManager.PLACES_DOMAIN,"banks");
        hashMapwdlhot1230.put(DetailsManager.PLACES_ADDRESS,"Rd Number 26, Sahakar Nagar, Wadala, Mumbai, Maharashtra 400031");
        offlineDatabase.insertSponsors1(hashMapwdlhot1230);

        HashMap<String,String> hashMapwdlhot12302=new HashMap<String, String>();
        hashMapwdlhot12302.put(DetailsManager.PLACE_LOCATIONS,"WADALA");
        hashMapwdlhot12302.put(DetailsManager.PLACES_NAMES,"Indian Overseas Bank");
        hashMapwdlhot12302.put(DetailsManager.PLACES_LAN,"19.0117686");
        hashMapwdlhot12302.put(DetailsManager.PLACES_LONG,"72.851019");
        hashMapwdlhot12302.put(DetailsManager.PLACES_DOMAIN,"banks");
        hashMapwdlhot12302.put(DetailsManager.PLACES_ADDRESS,"Vandana Co-operative Housing Society,Rafi Ahmed Kidwai Marg,Sahakar Nagar,Wadala Mumbai-400031");
        offlineDatabase.insertSponsors1(hashMapwdlhot12302);


        HashMap<String,String> hashMapwdlhot123023=new HashMap<String, String>();
        hashMapwdlhot123023.put(DetailsManager.PLACE_LOCATIONS,"WADALA");
        hashMapwdlhot123023.put(DetailsManager.PLACES_NAMES,"Abhyudaya Bank");
        hashMapwdlhot123023.put(DetailsManager.PLACES_LAN,"19.0117686");
        hashMapwdlhot123023.put(DetailsManager.PLACES_LONG,"72.851019");
        hashMapwdlhot123023.put(DetailsManager.PLACES_DOMAIN,"banks");
        hashMapwdlhot123023.put(DetailsManager.PLACES_ADDRESS," Market Building,Nadkarni Park,LM Nadkarni Marg,New BPT Colony,BPT Colony,Wadala(E)Mumbai-40003");
        offlineDatabase.insertSponsors1(hashMapwdlhot123023);

        //banks in wadala
        //banks begin dadar
        HashMap<String,String> hashMapddrbnk1=new HashMap<String, String>();
        hashMapddrbnk1.put(DetailsManager.PLACE_LOCATIONS,"DADAR");
        hashMapddrbnk1.put(DetailsManager.PLACES_NAMES,"SARASWAT BANK(SP)");
        hashMapddrbnk1.put(DetailsManager.PLACES_LAN,"19.018279");
        hashMapddrbnk1.put(DetailsManager.PLACES_LONG,"72.832461");
        hashMapddrbnk1.put(DetailsManager.PLACES_DOMAIN,"banks");
        hashMapddrbnk1.put(DetailsManager.PLACES_ADDRESS,"Shivsena Bhavan ,Gokhale Road South, Dadar West , Mumbai, Maharashtra 400028");
        offlineDatabase.insertSponsors1(hashMapddrbnk1);

        hashMapddrbnk1.put(DetailsManager.PLACE_LOCATIONS,"DADAR");
        hashMapddrbnk1.put(DetailsManager.PLACES_NAMES,"SARASWAT BANK(Madhu Kendra)");
        hashMapddrbnk1.put(DetailsManager.PLACES_LAN,"19.0212313");
        hashMapddrbnk1.put(DetailsManager.PLACES_LONG,"72.8391419");
        hashMapddrbnk1.put(DetailsManager.PLACES_DOMAIN,"banks");
        hashMapddrbnk1.put(DetailsManager.PLACES_ADDRESS,"Dada Saheb Phalke Marg, Dadar West, Mumbai-400028");
        offlineDatabase.insertSponsors1(hashMapddrbnk1);

        hashMapddrbnk1.put(DetailsManager.PLACE_LOCATIONS,"DADAR");
        hashMapddrbnk1.put(DetailsManager.PLACES_NAMES,"NKGSB CO-OP BANK LTD)");
        hashMapddrbnk1.put(DetailsManager.PLACES_LAN,"19.0266956");
        hashMapddrbnk1.put(DetailsManager.PLACES_LONG,"72.835391");
        hashMapddrbnk1.put(DetailsManager.PLACES_DOMAIN,"banks");
        hashMapddrbnk1.put(DetailsManager.PLACES_ADDRESS,"Shop No. 3,4, Prasad Building, Gokhale Road North, Dadar West, Mumbai-400028");
        offlineDatabase.insertSponsors1(hashMapddrbnk1);

        hashMapddrbnk1.put(DetailsManager.PLACE_LOCATIONS,"DADAR");
        hashMapddrbnk1.put(DetailsManager.PLACES_NAMES,"UCO Bank");
        hashMapddrbnk1.put(DetailsManager.PLACES_LAN,"19.0179231");
        hashMapddrbnk1.put(DetailsManager.PLACES_LONG,"72.833635");
        hashMapddrbnk1.put(DetailsManager.PLACES_DOMAIN,"banks");
        hashMapddrbnk1.put(DetailsManager.PLACES_ADDRESS,"Dadar Branch,3, Anant, Gokhale Road South, Dadar West, Mumbai-400028");
        offlineDatabase.insertSponsors1(hashMapddrbnk1);

        hashMapddrbnk1.put(DetailsManager.PLACE_LOCATIONS,"DADAR");
        hashMapddrbnk1.put(DetailsManager.PLACES_NAMES,"Abhyudaya Bank");
        hashMapddrbnk1.put(DetailsManager.PLACES_LAN,"19.0221473");
        hashMapddrbnk1.put(DetailsManager.PLACES_LONG,"72.84009");
        hashMapddrbnk1.put(DetailsManager.PLACES_DOMAIN,"banks");
        hashMapddrbnk1.put(DetailsManager.PLACES_ADDRESS,"Akanksh Building, N. C. Kelkar Road, Dadar West, Mumbai, Maharashtra 400028");
        offlineDatabase.insertSponsors1(hashMapddrbnk1);

        hashMapddrbnk1.put(DetailsManager.PLACE_LOCATIONS,"DADAR");
        hashMapddrbnk1.put(DetailsManager.PLACES_NAMES,"Federal Bank");
        hashMapddrbnk1.put(DetailsManager.PLACES_LAN,"19.0221471");
        hashMapddrbnk1.put(DetailsManager.PLACES_LONG,"72.8335239");
        hashMapddrbnk1.put(DetailsManager.PLACES_DOMAIN,"banks");
        hashMapddrbnk1.put(DetailsManager.PLACES_ADDRESS,"Opposite Yogi Sabhagruha, S.M.Road, Dadar East, Mumbai, Maharashtra 400014");
        offlineDatabase.insertSponsors1(hashMapddrbnk1);

        hashMapddrbnk1.put(DetailsManager.PLACE_LOCATIONS,"DADAR");
        hashMapddrbnk1.put(DetailsManager.PLACES_NAMES,"APNA SAHAKARI BANK LTD");
        hashMapddrbnk1.put(DetailsManager.PLACES_LAN,"19.0221436");
        hashMapddrbnk1.put(DetailsManager.PLACES_LONG,"72.8072589");
        hashMapddrbnk1.put(DetailsManager.PLACES_DOMAIN,"banks");
        hashMapddrbnk1.put(DetailsManager.PLACES_ADDRESS,"Madhukala Co-Operative Housing Society, R.K. Vaidya Road, Dadar West, Mumbai-400028");
        offlineDatabase.insertSponsors1(hashMapddrbnk1);

        hashMapddrbnk1.put(DetailsManager.PLACE_LOCATIONS,"DADAR");
        hashMapddrbnk1.put(DetailsManager.PLACES_NAMES,"Allahabad Bank");
        hashMapddrbnk1.put(DetailsManager.PLACES_LAN,"19.0186649");
        hashMapddrbnk1.put(DetailsManager.PLACES_LONG,"72.8388609");
        hashMapddrbnk1.put(DetailsManager.PLACES_DOMAIN,"banks");
        hashMapddrbnk1.put(DetailsManager.PLACES_ADDRESS,"Madhukala Co-Operative Housing Society, R.K. Vaidya Road, Dadar West, Mumbai-400028");
        offlineDatabase.insertSponsors1(hashMapddrbnk1);


        hashMapddrbnk1.put(DetailsManager.PLACE_LOCATIONS,"DADAR");
        hashMapddrbnk1.put(DetailsManager.PLACES_NAMES,"Punjab National Bank");
        hashMapddrbnk1.put(DetailsManager.PLACES_LAN,"19.0179409");
        hashMapddrbnk1.put(DetailsManager.PLACES_LONG,"72.8427091");
        hashMapddrbnk1.put(DetailsManager.PLACES_DOMAIN,"banks");
        hashMapddrbnk1.put(DetailsManager.PLACES_ADDRESS,"Tilak Marg No. 2, Near Swami Narayan Temple, Lokmanya Tilak Colony, Dadar East, Mumbai-400014");
        offlineDatabase.insertSponsors1(hashMapddrbnk1);

        HashMap<String,String> hashMapddrbnk2=new HashMap<String, String>();
        hashMapddrbnk2.put(DetailsManager.PLACE_LOCATIONS,"DADAR");
        hashMapddrbnk2.put(DetailsManager.PLACES_NAMES,"COSMOS BANK");
        hashMapddrbnk2.put(DetailsManager.PLACES_LAN,"19.0227948");
        hashMapddrbnk2.put(DetailsManager.PLACES_LONG,"72.8387665");
        hashMapddrbnk2.put(DetailsManager.PLACES_DOMAIN,"banks");
        hashMapddrbnk2.put(DetailsManager.PLACES_ADDRESS,"Gokhale Rd, Bhawani Sankar, Dadar West, Mumbai, Maharashtra 400028");

        offlineDatabase.insertSponsors1(hashMapddrbnk2);

        HashMap<String,String> hashMapddrbnk3=new HashMap<String, String>();
        hashMapddrbnk3.put(DetailsManager.PLACE_LOCATIONS,"DADAR");
        hashMapddrbnk3.put(DetailsManager.PLACES_NAMES,"IDBI BANK (Prabhadevi)");
        hashMapddrbnk3.put(DetailsManager.PLACES_LAN,"19.019838");
        hashMapddrbnk3.put(DetailsManager.PLACES_LONG,"72.8284078,");
        hashMapddrbnk3.put(DetailsManager.PLACES_DOMAIN,"banks");
        hashMapddrbnk3.put(DetailsManager.PLACES_ADDRESS,"Kohinoor Bhavan,Opposite Siddi Vinayaka Temple, Swatantrya Veer Sawarkar Marg, Dadar West, Mumbai-400028");
        offlineDatabase.insertSponsors1(hashMapddrbnk3);

        HashMap<String,String> hashMapddrbnk4=new HashMap<String, String>();
        hashMapddrbnk4.put(DetailsManager.PLACE_LOCATIONS,"DADAR");
        hashMapddrbnk4.put(DetailsManager.PLACES_NAMES,"SBI BANK");
        hashMapddrbnk4.put(DetailsManager.PLACES_LAN,"19.020854");
        hashMapddrbnk4.put(DetailsManager.PLACES_LONG,"72.840224");
        hashMapddrbnk4.put(DetailsManager.PLACES_DOMAIN,"banks");
        hashMapddrbnk4.put(DetailsManager.PLACES_ADDRESS,"Gyan Sagar Building, 1st floor, R.B.S.K. Bole Road, Near Portugese Church, Dadar West, Mumbai, Maharashtra 400028");

        offlineDatabase.insertSponsors1(hashMapddrbnk4);

        //banks end dadaR
        //banks in mahim

        HashMap<String,String> hashMapmhmbnk4=new HashMap<String, String>();
        hashMapmhmbnk4.put(DetailsManager.PLACE_LOCATIONS,"MAHIM");
        hashMapmhmbnk4.put(DetailsManager.PLACES_NAMES,"CitizenCredit Bank");
        hashMapmhmbnk4.put(DetailsManager.PLACES_LAN,"19.0391743");
        hashMapmhmbnk4.put(DetailsManager.PLACES_LONG,"72.8421861");
        hashMapmhmbnk4.put(DetailsManager.PLACES_DOMAIN,"banks");
        hashMapmhmbnk4.put(DetailsManager.PLACES_ADDRESS,"Shop No. 05, Mia Mohd Chhotani Rd, Garden View, Opposite Garden, Mahim West, Mumbai- 400016");
        offlineDatabase.insertSponsors1(hashMapmhmbnk4);

        hashMapmhmbnk4.put(DetailsManager.PLACE_LOCATIONS,"MAHIM");
        hashMapmhmbnk4.put(DetailsManager.PLACES_NAMES,"Indian Bank Mahim Branch");
        hashMapmhmbnk4.put(DetailsManager.PLACES_LAN,"19.0397562");
        hashMapmhmbnk4.put(DetailsManager.PLACES_LONG,"72.8432685");
        hashMapmhmbnk4.put(DetailsManager.PLACES_DOMAIN,"banks");
        hashMapmhmbnk4.put(DetailsManager.PLACES_ADDRESS,"1/1A, Plot No.542, Mia Mohd Chhotani Rd, Rajmahal, Mahim West, Mumbai, Maharashtra 400016");
        offlineDatabase.insertSponsors1(hashMapmhmbnk4);

        hashMapmhmbnk4.put(DetailsManager.PLACE_LOCATIONS,"MAHIM");
        hashMapmhmbnk4.put(DetailsManager.PLACES_NAMES,"HDFC Bank");
        hashMapmhmbnk4.put(DetailsManager.PLACES_LAN,"19.0343044");
        hashMapmhmbnk4.put(DetailsManager.PLACES_LONG,"72.8372178");
        hashMapmhmbnk4.put(DetailsManager.PLACES_DOMAIN,"banks");
        hashMapmhmbnk4.put(DetailsManager.PLACES_ADDRESS,"B'Bay Scottish School, Off Veersavarkar Marg, Mahim, Mumbai, Maharashtra 400016");
        offlineDatabase.insertSponsors1(hashMapmhmbnk4);

        hashMapmhmbnk4.put(DetailsManager.PLACE_LOCATIONS,"MAHIM");
        hashMapmhmbnk4.put(DetailsManager.PLACES_NAMES,"DCB Bank");
        hashMapmhmbnk4.put(DetailsManager.PLACES_LAN,"19.0346991");
        hashMapmhmbnk4.put(DetailsManager.PLACES_LONG,"72.840258");
        hashMapmhmbnk4.put(DetailsManager.PLACES_DOMAIN,"banks");
        hashMapmhmbnk4.put(DetailsManager.PLACES_ADDRESS,"Samrath Building, Lady Jamshedji Rd, Opp.Victoria School, New Dinkar Co Operative Housing Society, Mahim, Mumbai-400016");
        offlineDatabase.insertSponsors1(hashMapmhmbnk4);

        hashMapmhmbnk4.put(DetailsManager.PLACE_LOCATIONS,"MAHIM");
        hashMapmhmbnk4.put(DetailsManager.PLACES_NAMES,"Catholic Syrian Bank");
        hashMapmhmbnk4.put(DetailsManager.PLACES_LAN,"19.0379262");
        hashMapmhmbnk4.put(DetailsManager.PLACES_LONG,"72.8398352");
        hashMapmhmbnk4.put(DetailsManager.PLACES_DOMAIN,"banks");
        hashMapmhmbnk4.put(DetailsManager.PLACES_ADDRESS,"Terrace Building, Lady Jamshedji Rd, Mahim West, Mumbai, Maharashtra 400016");
        offlineDatabase.insertSponsors1(hashMapmhmbnk4);

        hashMapmhmbnk4.put(DetailsManager.PLACE_LOCATIONS,"MAHIM");
        hashMapmhmbnk4.put(DetailsManager.PLACES_NAMES,"The Zoroastrian Bank.");
        hashMapmhmbnk4.put(DetailsManager.PLACES_LAN,"19.0391743");
        hashMapmhmbnk4.put(DetailsManager.PLACES_LONG,"72.8421861");
        hashMapmhmbnk4.put(DetailsManager.PLACES_DOMAIN,"banks");
        hashMapmhmbnk4.put(DetailsManager.PLACES_ADDRESS,"Delta Apartment, Sonawala Agiary Lane,Bethany Co-Operative Housing Society Mahim West Mumbai, Maharashtra-400016");
        offlineDatabase.insertSponsors1(hashMapmhmbnk4);

        hashMapmhmbnk4.put(DetailsManager.PLACE_LOCATIONS,"MAHIM");
        hashMapmhmbnk4.put(DetailsManager.PLACES_NAMES,"Kotak Mahindra Bank Ltd");
        hashMapmhmbnk4.put(DetailsManager.PLACES_LAN,"19.0399577");
        hashMapmhmbnk4.put(DetailsManager.PLACES_LONG,"72.8346678");
        hashMapmhmbnk4.put(DetailsManager.PLACES_DOMAIN,"banks");
        hashMapmhmbnk4.put(DetailsManager.PLACES_ADDRESS,"Gayatri Apt.,L.J.Road, Opp.Vijay Sales,New Dinkar Co Operative Housing Society, Mahim, Mumbai, Maharashtra 400016");
        offlineDatabase.insertSponsors1(hashMapmhmbnk4);

        hashMapmhmbnk4.put(DetailsManager.PLACE_LOCATIONS,"MAHIM");
        hashMapmhmbnk4.put(DetailsManager.PLACES_NAMES,"ICICI Bank Mahim");
        hashMapmhmbnk4.put(DetailsManager.PLACES_LAN,"19.039395");
        hashMapmhmbnk4.put(DetailsManager.PLACES_LONG,"72.8382583");
        hashMapmhmbnk4.put(DetailsManager.PLACES_DOMAIN,"banks");
        hashMapmhmbnk4.put(DetailsManager.PLACES_ADDRESS,"Zehra Manzil,91, lady Jamshedji Road, Next to Paradise Cinema, Mahim (W), Mumbai, Maharashtra 400016");
        offlineDatabase.insertSponsors1(hashMapmhmbnk4);

        hashMapmhmbnk4.put(DetailsManager.PLACE_LOCATIONS,"MAHIM");
        hashMapmhmbnk4.put(DetailsManager.PLACES_NAMES,"Corporation Bank");
        hashMapmhmbnk4.put(DetailsManager.PLACES_LAN,"");
        hashMapmhmbnk4.put(DetailsManager.PLACES_LONG,"");
        hashMapmhmbnk4.put(DetailsManager.PLACES_DOMAIN,"banks");
        hashMapmhmbnk4.put(DetailsManager.PLACES_ADDRESS,"Mangireesh Building, L.J Cross Road,Geeta Nagar, New Dinkar Co Operative Housing Society, Mahim, Mumbai-400016");
        offlineDatabase.insertSponsors1(hashMapmhmbnk4);

        hashMapmhmbnk4.put(DetailsManager.PLACE_LOCATIONS,"MAHIM");
        hashMapmhmbnk4.put(DetailsManager.PLACES_NAMES,"Punjab National Bank");
        hashMapmhmbnk4.put(DetailsManager.PLACES_LAN,"19.0326845");
        hashMapmhmbnk4.put(DetailsManager.PLACES_LONG,"72.8404706");
        hashMapmhmbnk4.put(DetailsManager.PLACES_DOMAIN,"banks");
        hashMapmhmbnk4.put(DetailsManager.PLACES_ADDRESS,"Behind Citylight Cinema, Gopi Tank Road, Mahim West, Shivaji Park, Mahim West, Dadar, Mumbai, Maharashtra 400016");
        offlineDatabase.insertSponsors1(hashMapmhmbnk4);

        hashMapmhmbnk4.put(DetailsManager.PLACE_LOCATIONS,"MAHIM");
        hashMapmhmbnk4.put(DetailsManager.PLACES_NAMES,"BombayMercantile Bank");
        hashMapmhmbnk4.put(DetailsManager.PLACES_LAN,"19.0308976");
        hashMapmhmbnk4.put(DetailsManager.PLACES_LONG,"72.8362275");
        hashMapmhmbnk4.put(DetailsManager.PLACES_DOMAIN,"banks");
        hashMapmhmbnk4.put(DetailsManager.PLACES_ADDRESS,"224, Veer Savarkar Marg, Mahim, Mumbai - 400016");
        offlineDatabase.insertSponsors1(hashMapmhmbnk4);

        hashMapmhmbnk4.put(DetailsManager.PLACE_LOCATIONS,"MAHIM");
        hashMapmhmbnk4.put(DetailsManager.PLACES_NAMES,"NKGSB Co-op.Bank");
        hashMapmhmbnk4.put(DetailsManager.PLACES_LAN,"19.0388672");
        hashMapmhmbnk4.put(DetailsManager.PLACES_LONG,"72.8252055");
        hashMapmhmbnk4.put(DetailsManager.PLACES_DOMAIN,"banks");
        hashMapmhmbnk4.put(DetailsManager.PLACES_ADDRESS,"Near Shobha Hotel, Jagruti, Lady Jamshedji Rd, Mahim West, Mumbai, Maharashtra 400016");
        offlineDatabase.insertSponsors1(hashMapmhmbnk4);
    }
    public  void garages()
    {
        //garages  dadar
        HashMap<String,String> hashMapwdlhot=new HashMap<String, String>();
        hashMapwdlhot.put(DetailsManager.PLACE_LOCATIONS,"DADAR");
        hashMapwdlhot.put(DetailsManager.PLACES_NAMES,"ashok garage");
        hashMapwdlhot.put(DetailsManager.PLACES_LAN,"19.0197643");
        hashMapwdlhot.put(DetailsManager.PLACES_LONG,"72.8325765");
        hashMapwdlhot.put(DetailsManager.PLACES_DOMAIN,"garages");
        hashMapwdlhot.put(DetailsManager.PLACES_ADDRESS,"Dhuruwadi, Kashinath Dhuru Marg, Chandrakant Dhuru Wadi, Dadar West, Mumbai-400028");
        offlineDatabase.insertSponsors1(hashMapwdlhot);

        HashMap<String,String> hashMapwdlhot1=new HashMap<String, String>();
        hashMapwdlhot1.put(DetailsManager.PLACE_LOCATIONS,"DADAR");
        hashMapwdlhot1.put(DetailsManager.PLACES_NAMES,"Cherrys garage");
        hashMapwdlhot1.put(DetailsManager.PLACES_LAN,"19.014349");
        hashMapwdlhot1.put(DetailsManager.PLACES_LONG,"72.833851");
        hashMapwdlhot1.put(DetailsManager.PLACES_DOMAIN,"garages");
        hashMapwdlhot1.put(DetailsManager.PLACES_ADDRESS,"1, Gokhale Rd N, M.B Kowli Wadi, Dadar West, Prabhadevi, Mumbai, Maharashtra 400025");
        offlineDatabase.insertSponsors1(hashMapwdlhot1);

        HashMap<String,String> hashMapwdlhot2=new HashMap<String, String>();
        hashMapwdlhot2.put(DetailsManager.PLACE_LOCATIONS,"DADAR");
        hashMapwdlhot2.put(DetailsManager.PLACES_NAMES,"HighWay Garage");
        hashMapwdlhot2.put(DetailsManager.PLACES_LAN,"19.0178457");
        hashMapwdlhot2.put(DetailsManager.PLACES_LONG,"72.831287");
        hashMapwdlhot2.put(DetailsManager.PLACES_DOMAIN,"garages");
        hashMapwdlhot2.put(DetailsManager.PLACES_ADDRESS,"SK Bole Rd, Dadar West, Prabhadevi, Mumbai, Maharashtra 400028");
        offlineDatabase.insertSponsors1(hashMapwdlhot2);

        HashMap<String,String> hashMapwdlhot4=new HashMap<String, String>();
        hashMapwdlhot4.put(DetailsManager.PLACE_LOCATIONS,"DADAR");
        hashMapwdlhot4.put(DetailsManager.PLACES_NAMES,"Dadar Motor Works");
        hashMapwdlhot4.put(DetailsManager.PLACES_LAN,"19.0135446");
        hashMapwdlhot4.put(DetailsManager.PLACES_LONG,"72.8438786");
        hashMapwdlhot4.put(DetailsManager.PLACES_DOMAIN,"garages");
        hashMapwdlhot4.put(DetailsManager.PLACES_ADDRESS,"Next To Chitra Cinema, 200, Dr Baba Saheb Ambedkar Rd, Gautam Nagar, Dadar East, Mumbai-400014");
        offlineDatabase.insertSponsors1(hashMapwdlhot4);

        HashMap<String,String> hashMapddrgarage1=new HashMap<String, String>();
        hashMapddrgarage1.put(DetailsManager.PLACE_LOCATIONS,"DADAR");
        hashMapddrgarage1.put(DetailsManager.PLACES_NAMES,"Starline Garage");
        hashMapddrgarage1.put(DetailsManager.PLACES_LAN,"19.0126535");
        hashMapddrgarage1.put(DetailsManager.PLACES_LONG,"72.8346393");
        hashMapddrgarage1.put(DetailsManager.PLACES_DOMAIN,"garages");
        hashMapddrgarage1.put(DetailsManager.PLACES_ADDRESS,"Garage Galli, Babasaheb Ambedkar Nagar, Mumbai, Maharashtra 400028");
        offlineDatabase.insertSponsors1(hashMapddrgarage1);

        HashMap<String,String> hashMapddrgarage2=new HashMap<String, String>();
        hashMapddrgarage2.put(DetailsManager.PLACE_LOCATIONS,"DADAR");
        hashMapddrgarage2.put(DetailsManager.PLACES_NAMES,"SELECT AUTO");
        hashMapddrgarage2.put(DetailsManager.PLACES_LAN,"19.0125179");
        hashMapddrgarage2.put(DetailsManager.PLACES_LONG,"72.8425321");
        hashMapddrgarage2.put(DetailsManager.PLACES_DOMAIN,"garages");
        hashMapddrgarage2.put(DetailsManager.PLACES_ADDRESS,"135, DSP Rd, Gautam Nagar, Dadar, Mumbai, Maharashtra 400014");
        offlineDatabase.insertSponsors1(hashMapddrgarage2);

        HashMap<String,String> hashMapddrgarage3=new HashMap<String, String>();
        hashMapddrgarage3.put(DetailsManager.PLACE_LOCATIONS,"DADAR");
        hashMapddrgarage3.put(DetailsManager.PLACES_NAMES,"CARHUB GARAGE");
        hashMapddrgarage3.put(DetailsManager.PLACES_LAN,"19.0149112");
        hashMapddrgarage3.put(DetailsManager.PLACES_LONG,"72.8322309");
        hashMapddrgarage3.put(DetailsManager.PLACES_DOMAIN,"garages");
        hashMapddrgarage3.put(DetailsManager.PLACES_ADDRESS,"Aakruti Building, Koliwada, Vazira, DADAR West, Mumbai, Maharashtra 400028");

        offlineDatabase.insertSponsors1(hashMapddrgarage3);

        HashMap<String,String> hashMapddrgarage4=new HashMap<String, String>();
        hashMapddrgarage4.put(DetailsManager.PLACE_LOCATIONS,"DADAR");
        hashMapddrgarage4.put(DetailsManager.PLACES_NAMES,"OMPRAKASH GARAGE");
        hashMapddrgarage4.put(DetailsManager.PLACES_LAN,"18.991142");
        hashMapddrgarage4.put(DetailsManager.PLACES_LONG,"72.841689");
        hashMapddrgarage4.put(DetailsManager.PLACES_DOMAIN,"garages");
        hashMapddrgarage4.put(DetailsManager.PLACES_ADDRESS,"Castrol Bikepoint, Shop No.36, G.D.Ambekar Road, Kalachowki, Mumbai-400033");

        offlineDatabase.insertSponsors1(hashMapddrgarage4);

        HashMap<String,String> hashMapddrgarage5=new HashMap<String, String>();
        hashMapddrgarage5.put(DetailsManager.PLACE_LOCATIONS,"DADAR");
        hashMapddrgarage5.put(DetailsManager.PLACES_NAMES,"Revive Customs");
        hashMapddrgarage5.put(DetailsManager.PLACES_LAN,"19.0297931");
        hashMapddrgarage5.put(DetailsManager.PLACES_LONG,"72.8384242");
        hashMapddrgarage5.put(DetailsManager.PLACES_DOMAIN,"garages");
        hashMapddrgarage5.put(DetailsManager.PLACES_ADDRESS,"Shop No.1 , Rizvi Niketan CHSL, Gopi Tank Road, Dadar West, Mumbai, Maharashtra 400016");

        offlineDatabase.insertSponsors1(hashMapddrgarage5);
        //wadala garages
        HashMap<String,String> hashMapWDlGRG=new HashMap<String, String>();
        hashMapWDlGRG.put(DetailsManager.PLACE_LOCATIONS,"WADALA");

        hashMapWDlGRG.put(DetailsManager.PLACES_NAMES,"BPT GARAGE ");
        hashMapWDlGRG.put(DetailsManager.PLACES_LAN,"19.0139558");
        hashMapWDlGRG.put(DetailsManager.PLACES_LONG,"72.8623484");
        hashMapWDlGRG.put(DetailsManager.PLACES_DOMAIN,"garages");
        hashMapWDlGRG.put(DetailsManager.PLACES_ADDRESS,"Nadkarni Park, Wadala East, BPT Colony, Wadala, Mumbai, Maharashtra 400037");

        offlineDatabase.insertSponsors1(hashMapWDlGRG);
        HashMap<String,String> hashMapWDlGRG1=new HashMap<String, String>();
        hashMapWDlGRG1.put(DetailsManager.PLACE_LOCATIONS,"WADALA");

        hashMapWDlGRG1.put(DetailsManager.PLACES_NAMES,"GULFAM AUTO WORKS");
        hashMapWDlGRG1.put(DetailsManager.PLACES_LAN,"19.0152434");
        hashMapWDlGRG1.put(DetailsManager.PLACES_LONG,"72.8558618");
        hashMapWDlGRG1.put(DetailsManager.PLACES_DOMAIN,"garages");
        hashMapWDlGRG1.put(DetailsManager.PLACES_ADDRESS,"18/5, Ganesh Mandir Marg, Wadla Village, Wadala, Mumbai, Maharashtra 400031");

        offlineDatabase.insertSponsors1(hashMapWDlGRG1);

        HashMap<String,String> hashMapWDlGRG2=new HashMap<String, String>();
        hashMapWDlGRG2.put(DetailsManager.PLACE_LOCATIONS,"WADALA");

        hashMapWDlGRG2.put(DetailsManager.PLACES_NAMES,"Star Air Cool");
        hashMapWDlGRG2.put(DetailsManager.PLACES_LAN,"19.034001");
        hashMapWDlGRG2.put(DetailsManager.PLACES_LONG,"72.875972");
        hashMapWDlGRG2.put(DetailsManager.PLACES_DOMAIN,"garages");
        hashMapWDlGRG2.put(DetailsManager.PLACES_ADDRESS," Gala No S, Shram Safalya, Bldg No E-1, Wadala East, Mumbai 400037");

        offlineDatabase.insertSponsors1(hashMapWDlGRG2);
        HashMap<String,String> hashMapWDlGRG3=new HashMap<String, String>();
        hashMapWDlGRG3.put(DetailsManager.PLACE_LOCATIONS,"WADALA");
        hashMapWDlGRG3.put(DetailsManager.PLACES_NAMES,"Dashmesh Cng Impex Private Limited");
        hashMapWDlGRG3.put(DetailsManager.PLACES_LAN,"19.0330269");
        hashMapWDlGRG3.put(DetailsManager.PLACES_LONG,"72.878222");
        hashMapWDlGRG3.put(DetailsManager.PLACES_DOMAIN,"garages");
        hashMapWDlGRG3.put(DetailsManager.PLACES_ADDRESS,"Truck Terminal,Opp Imax Theatre,Wadala, Wadala, Mumbai, Maharashtra 400037");

        offlineDatabase.insertSponsors1(hashMapWDlGRG3);
        HashMap<String,String> hashMapWDlGRG4=new HashMap<String, String>();
        hashMapWDlGRG4.put(DetailsManager.PLACE_LOCATIONS,"WADALA");

        hashMapWDlGRG4.put(DetailsManager.PLACES_NAMES,"Star Automobile Service Station");
        hashMapWDlGRG4.put(DetailsManager.PLACES_LAN,"19.0512976");
        hashMapWDlGRG4.put(DetailsManager.PLACES_LONG,"72.910694");
        hashMapWDlGRG4.put(DetailsManager.PLACES_DOMAIN,"garages");
        hashMapWDlGRG4.put(DetailsManager.PLACES_ADDRESS,"73, Ghatkopar Sewri Wadala Rd, Shivneri Nagar, Govandi East, Mumbai-400088");

        offlineDatabase.insertSponsors1(hashMapWDlGRG4);
        HashMap<String,String> hashMapWDlGRG55=new HashMap<String, String>();
        hashMapWDlGRG55.put(DetailsManager.PLACE_LOCATIONS,"WADALA");
        hashMapWDlGRG55.put(DetailsManager.PLACES_NAMES,"KPG VISHWAKARMA ");
        hashMapWDlGRG55.put(DetailsManager.PLACES_LAN,"19.016302");
        hashMapWDlGRG55.put(DetailsManager.PLACES_LONG,"72.8533475");
        hashMapWDlGRG55.put(DetailsManager.PLACES_DOMAIN,"garages");
        hashMapWDlGRG55.put(DetailsManager.PLACES_ADDRESS," a, N D Rd,wadala east, mumbai-4000037");

        offlineDatabase.insertSponsors1(hashMapWDlGRG55);
        HashMap<String,String> hashMapWDlGRG54=new HashMap<String, String>();
        hashMapWDlGRG54.put(DetailsManager.PLACE_LOCATIONS,"WADALA");
        hashMapWDlGRG54.put(DetailsManager.PLACES_NAMES,"Antony Motors Private Limited ");
        hashMapWDlGRG54.put(DetailsManager.PLACES_LAN,"19.0176169");
        hashMapWDlGRG54.put(DetailsManager.PLACES_LONG,"72.853940");
        hashMapWDlGRG54.put(DetailsManager.PLACES_DOMAIN,"garages");
        hashMapWDlGRG54.put(DetailsManager.PLACES_ADDRESS,"A-390/391, Mahape, MIDC, Ttc Zone, New Mumbai, M I D C, Wadala West Mumbai-400601");

        offlineDatabase.insertSponsors1(hashMapWDlGRG54);
        HashMap<String,String> hashMapWDlGRG53=new HashMap<String, String>();
        hashMapWDlGRG53.put(DetailsManager.PLACE_LOCATIONS,"WADALA");
        hashMapWDlGRG53.put(DetailsManager.PLACES_NAMES,"Pintu Bike Point");
        hashMapWDlGRG53.put(DetailsManager.PLACES_LAN,"19.016988");
        hashMapWDlGRG53.put(DetailsManager.PLACES_LONG,"72.8508436");
        hashMapWDlGRG53.put(DetailsManager.PLACES_DOMAIN,"garages");
        hashMapWDlGRG53.put(DetailsManager.PLACES_ADDRESS,"20/C,Near Vithal Mandir,, Katrak Rd, Wadala, Mumbai, Maharashtra 400031");

        offlineDatabase.insertSponsors1(hashMapWDlGRG53);


        HashMap<String,String> hashMapWDlGRG51=new HashMap<String, String>();
        hashMapWDlGRG51.put(DetailsManager.PLACE_LOCATIONS,"WADALA");
        hashMapWDlGRG51.put(DetailsManager.PLACES_NAMES,"S.K. Auto Gas ");
        hashMapWDlGRG51.put(DetailsManager.PLACES_LAN,"19.0169872");
        hashMapWDlGRG51.put(DetailsManager.PLACES_LONG,"72.8355226");
        hashMapWDlGRG51.put(DetailsManager.PLACES_DOMAIN,"garages");
        hashMapWDlGRG51.put(DetailsManager.PLACES_ADDRESS,"Shanti Nagar Highway Antop Hill, Wadala E, Wadala East, Mumbai, Maharashtra 400037");

        offlineDatabase.insertSponsors1(hashMapWDlGRG51);

        //mahim garages
        HashMap<String,String> hashMapmhlgr=new HashMap<String, String>();
        hashMapmhlgr.put(DetailsManager.PLACE_LOCATIONS,"MAHIM");

        hashMapmhlgr.put(DetailsManager.PLACES_NAMES,"PARK GARAGE ");
        hashMapmhlgr.put(DetailsManager.PLACES_LAN,"19.0324794");
        hashMapmhlgr.put(DetailsManager.PLACES_LONG,"72.8388214");
        hashMapmhlgr.put(DetailsManager.PLACES_DOMAIN,"garages");
        hashMapmhlgr.put(DetailsManager.PLACES_ADDRESS,"7, Takandas Kataria Marg, Mahim West, Mahim, Mumbai, Maharashtra 400016");
        offlineDatabase.insertSponsors1(hashMapmhlgr);

        HashMap<String,String> hashMapmhlgr1=new HashMap<String, String>();
        hashMapmhlgr1.put(DetailsManager.PLACE_LOCATIONS,"MAHIM");
        hashMapmhlgr1.put(DetailsManager.PLACES_NAMES,"ATUL GARAGE ");
        hashMapmhlgr1.put(DetailsManager.PLACES_LAN,"19.0360831");
        hashMapmhlgr1.put(DetailsManager.PLACES_LONG,"72.8452392");
        hashMapmhlgr1.put(DetailsManager.PLACES_DOMAIN,"garages");
        hashMapmhlgr1.put(DetailsManager.PLACES_ADDRESS,"Raut Industrial Estate, 2, Senapat Bapat Marg, Mahim, Mumbai, Maharashtra 400016");
         offlineDatabase.insertSponsors1(hashMapmhlgr1);

        HashMap<String,String> hashMapmhlgr2=new HashMap<String, String>();
        hashMapmhlgr2.put(DetailsManager.PLACE_LOCATIONS,"MAHIM");

        hashMapmhlgr2.put(DetailsManager.PLACES_NAMES,"GARAGE ASHIQUE ");
        hashMapmhlgr2.put(DetailsManager.PLACES_LAN,"19.0448401");
        hashMapmhlgr2.put(DetailsManager.PLACES_LONG,"72.84182041");
        hashMapmhlgr2.put(DetailsManager.PLACES_DOMAIN,"garages");
        hashMapmhlgr2.put(DetailsManager.PLACES_ADDRESS,"Ground Floor, Upperside,, Mahim - Sion Link Rd, Naya Nagar, Mahim, Mumbai-400016");
        offlineDatabase.insertSponsors1(hashMapmhlgr2);

        HashMap<String,String> hashMapmhlgr3=new HashMap<String, String>();
        hashMapmhlgr3.put(DetailsManager.PLACE_LOCATIONS,"MAHIM");
        hashMapmhlgr3.put(DetailsManager.PLACES_NAMES,"GUDDU GARAGE ");
        hashMapmhlgr3.put(DetailsManager.PLACES_LAN,"19.0448652");
        hashMapmhlgr3.put(DetailsManager.PLACES_LONG,"72.8352543");
        hashMapmhlgr3.put(DetailsManager.PLACES_DOMAIN,"garages");
        hashMapmhlgr3.put(DetailsManager.PLACES_ADDRESS,"Kapad Market Road, Mahim West, Mahim, Mumbai, Maharashtra 400016");
        offlineDatabase.insertSponsors1(hashMapmhlgr3);

        hashMapmhlgr3.put(DetailsManager.PLACE_LOCATIONS,"MAHIM");
        hashMapmhlgr3.put(DetailsManager.PLACES_NAMES,"Suresh Auto");
        hashMapmhlgr3.put(DetailsManager.PLACES_LAN,"19.0360426");
        hashMapmhlgr3.put(DetailsManager.PLACES_LONG,"72.8403478");
        hashMapmhlgr3.put(DetailsManager.PLACES_DOMAIN,"garages");
        hashMapmhlgr3.put(DetailsManager.PLACES_ADDRESS,"Mahim - Sion Link Rd, Naya Nagar, Baba Saheb Ambedkar Nagar, Mahim, Mumbai, Maharashtra 400016");
        offlineDatabase.insertSponsors1(hashMapmhlgr3);

        hashMapmhlgr3.put(DetailsManager.PLACE_LOCATIONS,"MAHIM");
        hashMapmhlgr3.put(DetailsManager.PLACES_NAMES,"I.S Auto Garage");
        hashMapmhlgr3.put(DetailsManager.PLACES_LAN,"19.0371772");
        hashMapmhlgr3.put(DetailsManager.PLACES_LONG,"72.8383402");
        hashMapmhlgr3.put(DetailsManager.PLACES_DOMAIN,"garages");
        hashMapmhlgr3.put(DetailsManager.PLACES_ADDRESS,"Kapad Bazar Rd, Wanjawadi, Mahim West, Mumbai, Maharashtra 400016");
        offlineDatabase.insertSponsors1(hashMapmhlgr3);

        hashMapmhlgr3.put(DetailsManager.PLACE_LOCATIONS,"MAHIM");
        hashMapmhlgr3.put(DetailsManager.PLACES_NAMES,"Ismail Auto Works");
        hashMapmhlgr3.put(DetailsManager.PLACES_LAN,"19.0409533");
        hashMapmhlgr3.put(DetailsManager.PLACES_LONG,"72.8384553");
        hashMapmhlgr3.put(DetailsManager.PLACES_DOMAIN,"garages");
        hashMapmhlgr3.put(DetailsManager.PLACES_ADDRESS,"Plot Number 17A, Lady Jamshedji Road,Mahim West,Mumbai, Maharashtra 400016");
        offlineDatabase.insertSponsors1(hashMapmhlgr3);

        HashMap<String,String> hashMapmhlgr45=new HashMap<String, String>();
        hashMapmhlgr45.put(DetailsManager.PLACE_LOCATIONS,"MAHIM");
        hashMapmhlgr45.put(DetailsManager.PLACES_NAMES,"Car-N-Care");
        hashMapmhlgr45.put(DetailsManager.PLACES_LAN,"19.0414166");
        hashMapmhlgr45.put(DetailsManager.PLACES_LONG,"72.8374829");
        hashMapmhlgr45.put(DetailsManager.PLACES_DOMAIN,"garages");
        hashMapmhlgr45.put(DetailsManager.PLACES_ADDRESS,"Near Mahim Police Station,Cadel Road,Swatantrya Veer Sawarkar Marg, Mahim West Mumbai-400016");


        offlineDatabase.insertSponsors1(hashMapmhlgr45);
        HashMap<String,String> hashMapmhlgr6=new HashMap<String, String>();
        hashMapmhlgr6.put(DetailsManager.PLACE_LOCATIONS,"MAHIM");
        hashMapmhlgr6.put(DetailsManager.PLACES_NAMES,"DHVANI MOTORS");
        hashMapmhlgr6.put(DetailsManager.PLACES_LAN,"19.0296171");
        hashMapmhlgr6.put(DetailsManager.PLACES_LONG,"72.8386893");
        hashMapmhlgr6.put(DetailsManager.PLACES_DOMAIN,"garages");
        hashMapmhlgr6.put(DetailsManager.PLACES_ADDRESS,"Raja Bade Chowk,Behind, Raja Rani Travel Shivaji Park,Road No.5,Mahim,, Mumbai, Maharashtra 400024");

        offlineDatabase.insertSponsors1(hashMapmhlgr6);

        HashMap<String,String> hashMapddrgarage41=new HashMap<String, String>();
        hashMapddrgarage41.put(DetailsManager.PLACE_LOCATIONS,"MAHIM");
        hashMapddrgarage41.put(DetailsManager.PLACES_NAMES,"SAWANT MOTORS");
        hashMapddrgarage41.put(DetailsManager.PLACES_LAN,"19.0434624");
        hashMapddrgarage41.put(DetailsManager.PLACES_LONG,"72.8392792");
        hashMapddrgarage41.put(DetailsManager.PLACES_DOMAIN,"garages");
        hashMapddrgarage41.put(DetailsManager.PLACES_ADDRESS,"Mohini Mansion,Near Mahim Bus Depot,Mori Rd, Mahim West,Mumbai-400016");
        offlineDatabase.insertSponsors1(hashMapddrgarage41);

        HashMap<String,String> hashMapddrgarage52=new HashMap<String, String>();
        hashMapddrgarage52.put(DetailsManager.PLACE_LOCATIONS,"MAHIM");
        hashMapddrgarage52.put(DetailsManager.PLACES_NAMES,"KOHLI TYRES PVT LTD");
        hashMapddrgarage52.put(DetailsManager.PLACES_LAN,"19.0360873");
        hashMapddrgarage52.put(DetailsManager.PLACES_LONG,"72.8403572");
        hashMapddrgarage52.put(DetailsManager.PLACES_DOMAIN,"garages");
        hashMapddrgarage52.put(DetailsManager.PLACES_ADDRESS,"Shree Ganesh Apartments,109/C LJ Road,Opp. Sitladevi Temple,Mahim West,Mumbai-400016");

        offlineDatabase.insertSponsors1(hashMapddrgarage52);

        HashMap<String,String> hashMapddrgarage6=new HashMap<String, String>();
        hashMapddrgarage6.put(DetailsManager.PLACE_LOCATIONS,"MAHIM");
        hashMapddrgarage6.put(DetailsManager.PLACES_NAMES,"P.R. Enterprise Royal Enfield");
        hashMapddrgarage6.put(DetailsManager.PLACES_LAN,"19.0371862");
        hashMapddrgarage6.put(DetailsManager.PLACES_LONG,"72.843975");
        hashMapddrgarage6.put(DetailsManager.PLACES_DOMAIN,"garages");
        hashMapddrgarage6.put(DetailsManager.PLACES_ADDRESS,"Udyog Mandir, 7-C, Pitambar Lane, Mahim West, South Mumbai, Mumbai-400016");

        offlineDatabase.insertSponsors1(hashMapddrgarage6);
    }
    public  void hospitals()
    {
        //HOSPITALS WADALA
        HashMap<String,String> hashMapWDlGRG=new HashMap<String, String>();
        hashMapWDlGRG.put(DetailsManager.PLACE_LOCATIONS,"WADALA");
        hashMapWDlGRG.put(DetailsManager.PLACES_NAMES,"BPT Hospital ");
        hashMapWDlGRG.put(DetailsManager.PLACES_LAN,"19.0127298");
        hashMapWDlGRG.put(DetailsManager.PLACES_LONG,"72.8591986");
        hashMapWDlGRG.put(DetailsManager.PLACES_DOMAIN,"hospitals");
        hashMapWDlGRG.put(DetailsManager.PLACES_ADDRESS,"Near Wadala Police Station,Nadkarni Park,Wadala(E),Mumbai-400037");
        offlineDatabase.insertSponsors1(hashMapWDlGRG);

        HashMap<String,String> hashMapho=new HashMap<String, String>();
        hashMapho.put(DetailsManager.PLACE_LOCATIONS,"WADALA");
        hashMapho.put(DetailsManager.PLACES_NAMES,"Wadala MBPT Dispensary ");
        hashMapho.put(DetailsManager.PLACES_LAN,"19.0096969");
        hashMapho.put(DetailsManager.PLACES_LONG,"72.8535922");
        hashMapho.put(DetailsManager.PLACES_DOMAIN,"hospitals");
        hashMapho.put(DetailsManager.PLACES_ADDRESS,"Reynolds Road, Tejas Nagar, Wadala East, Mumbai-400037");
        offlineDatabase.insertSponsors1(hashMapho);

        HashMap<String,String> hashMapho1=new HashMap<String, String>();
        hashMapho1.put(DetailsManager.PLACE_LOCATIONS,"WADALA");
        hashMapho1.put(DetailsManager.PLACES_NAMES,"Dr. Shah's Wellness Clinic ");
        hashMapho1.put(DetailsManager.PLACES_LAN,"19.0119399");
        hashMapho1.put(DetailsManager.PLACES_LONG,"72.8526132");
        hashMapho1.put(DetailsManager.PLACES_DOMAIN,"hospitals");
        hashMapho1.put(DetailsManager.PLACES_ADDRESS,"Vijay Niwas, Rafi Ahmed Kidwai Marg, Mumbai, Maharashtra 400031");
        offlineDatabase.insertSponsors1(hashMapho1);

        HashMap<String,String> hashMapho2=new HashMap<String, String>();
        hashMapho2.put(DetailsManager.PLACE_LOCATIONS,"WADALA");
        hashMapho2.put(DetailsManager.PLACES_NAMES,"Sanjeevanee Hospital");
        hashMapho2.put(DetailsManager.PLACES_LAN,"19.0428588");
        hashMapho2.put(DetailsManager.PLACES_LONG,"72.8104815");
        hashMapho2.put(DetailsManager.PLACES_DOMAIN,"hospitals");
        hashMapho2.put(DetailsManager.PLACES_ADDRESS,"Naigaum, Dadar East, Mahatma Jyotiba Phule Road, Mumbai, Maharashtra 400014");
        offlineDatabase.insertSponsors1(hashMapho2);



        HashMap<String,String> hashMapho25=new HashMap<String, String>();
        hashMapho25.put(DetailsManager.PLACE_LOCATIONS,"WADALA");
        hashMapho25.put(DetailsManager.PLACES_NAMES,"Group of Tuberculosis Hospitals ");
        hashMapho25.put(DetailsManager.PLACES_LAN,"19.0060101");
        hashMapho25.put(DetailsManager.PLACES_LONG,"72.8501111");
        hashMapho25.put(DetailsManager.PLACES_DOMAIN,"hospitals");
        hashMapho25.put(DetailsManager.PLACES_ADDRESS,"Jerbai Wadia Rd, Sewree East, Mumbai-400015");
        offlineDatabase.insertSponsors1(hashMapho25);

        HashMap<String,String> hashMapho26=new HashMap<String, String>();
        hashMapho26.put(DetailsManager.PLACE_LOCATIONS,"WADALA");
        hashMapho26.put(DetailsManager.PLACES_NAMES,"Dr Lad's Sai Hospital ");
        hashMapho26.put(DetailsManager.PLACES_LAN,"19.0234121");
        hashMapho26.put(DetailsManager.PLACES_LONG,"72.8606763");
        hashMapho26.put(DetailsManager.PLACES_DOMAIN,"hospitals");
        hashMapho26.put(DetailsManager.PLACES_ADDRESS,"Nityanand Nagar, Antop Hill, Mumbai-400037");
        offlineDatabase.insertSponsors1(hashMapho26);

        HashMap<String,String> hashMapho27=new HashMap<String, String>();
        hashMapho27.put(DetailsManager.PLACE_LOCATIONS,"WADALA");
        hashMapho27.put(DetailsManager.PLACES_NAMES,"Nidan hospital wadala ");
        hashMapho27.put(DetailsManager.PLACES_LAN,"19.0265916");
        hashMapho27.put(DetailsManager.PLACES_LONG,"72.8683059");
        hashMapho27.put(DetailsManager.PLACES_DOMAIN,"hospitals");
        hashMapho27.put(DetailsManager.PLACES_ADDRESS,"SM Rd, CGS Colony, Sector 7, Antop Hill, Mumbai-400037");
        offlineDatabase.insertSponsors1(hashMapho27);

        HashMap<String,String> hashMapho28=new HashMap<String, String>();
        hashMapho28.put(DetailsManager.PLACE_LOCATIONS,"WADALA");
        hashMapho28.put(DetailsManager.PLACES_NAMES,"Sainiranjan Hospital");
        hashMapho28.put(DetailsManager.PLACES_LAN,"19.0399183");
        hashMapho28.put(DetailsManager.PLACES_LONG,"72.845926");
        hashMapho28.put(DetailsManager.PLACES_DOMAIN,"hospitals");
        hashMapho28.put(DetailsManager.PLACES_ADDRESS,"90 Feet Rd, fakim Soc.RP Nagar, Dharavi, Mumbai- 400017");
        offlineDatabase.insertSponsors1(hashMapho28);

        HashMap<String,String> hashMapho29=new HashMap<String, String>();
        hashMapho29.put(DetailsManager.PLACE_LOCATIONS,"WADALA");
        hashMapho29.put(DetailsManager.PLACES_NAMES,"Manav Kalyan Seva Trust");
        hashMapho29.put(DetailsManager.PLACES_LAN,"19.0178745");
        hashMapho29.put(DetailsManager.PLACES_LONG,"72.8619369");
        hashMapho29.put(DetailsManager.PLACES_DOMAIN,"hospitals");
        hashMapho29.put(DetailsManager.PLACES_ADDRESS,"Jaykarwadi, Vidyalankar College Rd, Wadala East, Nandkarni Park, Mumbai-400037");
        offlineDatabase.insertSponsors1(hashMapho29);

        HashMap<String,String> hashMapho222=new HashMap<String, String>();
        hashMapho222.put(DetailsManager.PLACE_LOCATIONS,"WADALA");
        hashMapho222.put(DetailsManager.PLACES_NAMES,"Sai Hospital");
        hashMapho222.put(DetailsManager.PLACES_LAN,"19.0096969");
        hashMapho222.put(DetailsManager.PLACES_LONG,"72.8535922");
        hashMapho222.put(DetailsManager.PLACES_DOMAIN,"hospitals");
        hashMapho222.put(DetailsManager.PLACES_ADDRESS,"90 Feet Rd, Masiha Islampura Soc.,Behind Sion Hospital, Mumbai-400017");
        offlineDatabase.insertSponsors1(hashMapho222);

        HashMap<String,String> hashMapho33=new HashMap<String, String>();
        hashMapho33.put(DetailsManager.PLACE_LOCATIONS,"WADALA");
        hashMapho33.put(DetailsManager.PLACES_NAMES,"Police Hospital And Maternity Home ");
        hashMapho33.put(DetailsManager.PLACES_LAN,"19.0176169");
        hashMapho33.put(DetailsManager.PLACES_LONG,"72.8539401");
        hashMapho33.put(DetailsManager.PLACES_DOMAIN,"hospitals");
        hashMapho33.put(DetailsManager.PLACES_ADDRESS,"Near Richard & Kordak Co., Road No. 19, Nagpada, Mumbai-400008");
        offlineDatabase.insertSponsors1(hashMapho33);

        HashMap<String,String> hashMaph2o=new HashMap<String, String>();
        hashMaph2o.put(DetailsManager.PLACE_LOCATIONS,"WADALA");
        hashMaph2o.put(DetailsManager.PLACES_NAMES,"Shabnam Hospital ");
        hashMaph2o.put(DetailsManager.PLACES_LAN,"19.023548");
        hashMaph2o.put(DetailsManager.PLACES_LONG,"72.870473");
        hashMaph2o.put(DetailsManager.PLACES_DOMAIN,"hospitals");
        hashMaph2o.put(DetailsManager.PLACES_ADDRESS,"597, Salt Pan Rd, Azad Mohalla, Sangam Nagar, Wadala, Mumbai, Maharashtra 400037");
        offlineDatabase.insertSponsors1(hashMaph2o);

        //HOSPITALS DADAR


        HashMap<String,String> hashMapddrhos=new HashMap<String, String>();
        hashMapddrhos.put(DetailsManager.PLACE_LOCATIONS,"DADAR");
        hashMapddrhos.put(DetailsManager.PLACES_NAMES,"Shushrusha Hospital");
        hashMapddrhos.put(DetailsManager.PLACES_LAN,"19.0234252");
        hashMapddrhos.put(DetailsManager.PLACES_LONG,"72.8355563");
        hashMapddrhos.put(DetailsManager.PLACES_DOMAIN,"hospitals");
        hashMapddrhos.put(DetailsManager.PLACES_ADDRESS,"Ranade Road, Shivaji Park, Dadar West, Mumbai, Maharashtra 400028");
        offlineDatabase.insertSponsors1(hashMapddrhos);

        hashMapddrhos.put(DetailsManager.PLACE_LOCATIONS,"DADAR");
        hashMapddrhos.put(DetailsManager.PLACES_NAMES,"Dr. Pinto Hospital");
        hashMapddrhos.put(DetailsManager.PLACES_LAN,"19.0198265");
        hashMapddrhos.put(DetailsManager.PLACES_LONG,"72.8350655");
        hashMapddrhos.put(DetailsManager.PLACES_DOMAIN,"hospitals");
        hashMapddrhos.put(DetailsManager.PLACES_ADDRESS,"Gyan Sagar, C. H. S, SK Bole Rd, Dadar West, Mumbai, Maharashtra 401105");
        offlineDatabase.insertSponsors1(hashMapddrhos);

        hashMapddrhos.put(DetailsManager.PLACE_LOCATIONS,"DADAR");
        hashMapddrhos.put(DetailsManager.PLACES_NAMES,"Vedicure Wellness Hospital");
        hashMapddrhos.put(DetailsManager.PLACES_LAN,"19.0227183");
        hashMapddrhos.put(DetailsManager.PLACES_LONG,"72.8392659");
        hashMapddrhos.put(DetailsManager.PLACES_DOMAIN,"hospitals");
        hashMapddrhos.put(DetailsManager.PLACES_ADDRESS,"Madhav Apt, N C Kelkar Road, Ganesh Peth Lane, Dadar West, Mumbai - 400028,");
        offlineDatabase.insertSponsors1(hashMapddrhos);

        hashMapddrhos.put(DetailsManager.PLACE_LOCATIONS,"DADAR");
        hashMapddrhos.put(DetailsManager.PLACES_NAMES,"Jeevak Hospital");
        hashMapddrhos.put(DetailsManager.PLACES_LAN,"19.0134669");
        hashMapddrhos.put(DetailsManager.PLACES_LONG,"72.842581");
        hashMapddrhos.put(DetailsManager.PLACES_DOMAIN,"hospitals");
        hashMapddrhos.put(DetailsManager.PLACES_ADDRESS,"Dr Baba Saheb Ambedkar Rd, Dadar East, Dadar, Mumbai, Maharashtra 400014");
        offlineDatabase.insertSponsors1(hashMapddrhos);

        hashMapddrhos.put(DetailsManager.PLACE_LOCATIONS,"DADAR");
        hashMapddrhos.put(DetailsManager.PLACES_NAMES,"Shreedhar Hospital");
        hashMapddrhos.put(DetailsManager.PLACES_LAN,"19.0196889");
        hashMapddrhos.put(DetailsManager.PLACES_LONG,"72.8315917");
        hashMapddrhos.put(DetailsManager.PLACES_DOMAIN,"hospitals");
        hashMapddrhos.put(DetailsManager.PLACES_ADDRESS,"Anil Co-operative Society, M.T.N.L Lane,Dadar West, Mumbai-400028");
        offlineDatabase.insertSponsors1(hashMapddrhos);

        hashMapddrhos.put(DetailsManager.PLACE_LOCATIONS,"DADAR");
        hashMapddrhos.put(DetailsManager.PLACES_NAMES,"Thakur Hospital");
        hashMapddrhos.put(DetailsManager.PLACES_LAN,"19.0250774");
        hashMapddrhos.put(DetailsManager.PLACES_LONG,"72.8379067");
        hashMapddrhos.put(DetailsManager.PLACES_DOMAIN,"hospitals");
        hashMapddrhos.put(DetailsManager.PLACES_ADDRESS,"Shivaji Park, Opposite Shivsena Bhavan, Dadar West, Mumbai, Maharashtra-400028");
        offlineDatabase.insertSponsors1(hashMapddrhos);


        hashMapddrhos.put(DetailsManager.PLACE_LOCATIONS,"DADAR");
        hashMapddrhos.put(DetailsManager.PLACES_NAMES,"Dr. Vaze Hospital");
        hashMapddrhos.put(DetailsManager.PLACES_LAN,"19.0241027");
        hashMapddrhos.put(DetailsManager.PLACES_LONG,"72.8346003");
        hashMapddrhos.put(DetailsManager.PLACES_DOMAIN,"hospitals");
        hashMapddrhos.put(DetailsManager.PLACES_ADDRESS,"Meghdoot, SH Paralkar Marg, Chandrakant Dhuru Wadi, Dadar, Mumbai, Maharashtra 400028");
        offlineDatabase.insertSponsors1(hashMapddrhos);


        hashMapddrhos.put(DetailsManager.PLACE_LOCATIONS,"DADAR");
        hashMapddrhos.put(DetailsManager.PLACES_NAMES,"Krishna Cardiac Care Centre");
        hashMapddrhos.put(DetailsManager.PLACES_LAN,"19.0203261");
        hashMapddrhos.put(DetailsManager.PLACES_LONG,"72.8468418");
        hashMapddrhos.put(DetailsManager.PLACES_DOMAIN,"hospitals");
        hashMapddrhos.put(DetailsManager.PLACES_ADDRESS,"Krishna Kunj ,Khareghat Road, Opp Hindu Colony p.o , Dadar, Mumbai, Maharashtra 400014");
        offlineDatabase.insertSponsors1(hashMapddrhos);


        hashMapddrhos.put(DetailsManager.PLACE_LOCATIONS,"DADAR");
        hashMapddrhos.put(DetailsManager.PLACES_NAMES,"GSBS Medical Trust");
        hashMapddrhos.put(DetailsManager.PLACES_LAN,"19.0250774");
        hashMapddrhos.put(DetailsManager.PLACES_LONG,"72.8379067");
        hashMapddrhos.put(DetailsManager.PLACES_DOMAIN,"hospitals");
        hashMapddrhos.put(DetailsManager.PLACES_ADDRESS,"Shilpa Apartments, Dasturwadi, MMGS Marg, Dadar East, Mumbai-400014");
        offlineDatabase.insertSponsors1(hashMapddrhos);


        hashMapddrhos.put(DetailsManager.PLACE_LOCATIONS,"DADAR");
        hashMapddrhos.put(DetailsManager.PLACES_NAMES,"Dr.Ingle's Surgical Hospital");
        hashMapddrhos.put(DetailsManager.PLACES_LAN,"19.0212273");
        hashMapddrhos.put(DetailsManager.PLACES_LONG,"72.8324251");
        hashMapddrhos.put(DetailsManager.PLACES_DOMAIN,"hospitals");
        hashMapddrhos.put(DetailsManager.PLACES_ADDRESS,"Swatantrya Veer Sawarkar Marg,Near Indian Oil Petrol Pump, Dhuru Wadi, Dadar West, Mumbai-400028");
        offlineDatabase.insertSponsors1(hashMapddrhos);

        hashMapddrhos.put(DetailsManager.PLACE_LOCATIONS,"DADAR");
        hashMapddrhos.put(DetailsManager.PLACES_NAMES,"Ashvini Nursing Home");
        hashMapddrhos.put(DetailsManager.PLACES_LAN,"19.0146659");
        hashMapddrhos.put(DetailsManager.PLACES_LONG,"72.8403183");
        hashMapddrhos.put(DetailsManager.PLACES_DOMAIN,"hospitals");
        hashMapddrhos.put(DetailsManager.PLACES_ADDRESS,"Rupal Apartment, 1st Floor, Dadasaheb Phalke Road, Dadar East, Mumbai-400014");
        offlineDatabase.insertSponsors1(hashMapddrhos);

        hashMapddrhos.put(DetailsManager.PLACE_LOCATIONS,"DADAR");
        hashMapddrhos.put(DetailsManager.PLACES_NAMES,"Punamiya Hospital");
        hashMapddrhos.put(DetailsManager.PLACES_LAN,"19.0121015");
        hashMapddrhos.put(DetailsManager.PLACES_LONG,"72.8313685");
        hashMapddrhos.put(DetailsManager.PLACES_DOMAIN,"hospitals");
        hashMapddrhos.put(DetailsManager.PLACES_ADDRESS,"Inder Tower, Gokhale Road, Near Tilak Bhavan, Dadar West, Mumbai, Maharashtra 400028");
        offlineDatabase.insertSponsors1(hashMapddrhos);

        //Hospitals in Mahim

        HashMap<String,String> hashMapmhmhosp=new HashMap<String, String>();
        hashMapmhmhosp.put(DetailsManager.PLACE_LOCATIONS,"MAHIM");
        hashMapmhmhosp.put(DetailsManager.PLACES_NAMES,"P. D. Hinduja Hospital ");
        hashMapmhmhosp.put(DetailsManager.PLACES_LAN,"19.0334048");
        hashMapmhmhosp.put(DetailsManager.PLACES_LONG,"72.8382863");
        hashMapmhmhosp.put(DetailsManager.PLACES_DOMAIN,"hospitals");
        hashMapmhmhosp.put(DetailsManager.PLACES_ADDRESS,"Veer Sawarkar Marg, Mahim West, Mahim, Asavari, Shivaji Park, Mumbai, Maharashtra 400016");
        offlineDatabase.insertSponsors1(hashMapmhmhosp);

        hashMapmhmhosp.put(DetailsManager.PLACE_LOCATIONS,"MAHIM");
        hashMapmhmhosp.put(DetailsManager.PLACES_NAMES,"S. L. Raheja Hospital – A Fortis Associate");
        hashMapmhmhosp.put(DetailsManager.PLACES_LAN,"19.046572");
        hashMapmhmhosp.put(DetailsManager.PLACES_LONG,"72.8400193");
        hashMapmhmhosp.put(DetailsManager.PLACES_DOMAIN,"hospitals");
        hashMapmhmhosp.put(DetailsManager.PLACES_ADDRESS,"Police Colony, Mahim, Mumbai, Maharashtra 400016");
        offlineDatabase.insertSponsors1(hashMapmhmhosp);

        hashMapmhmhosp.put(DetailsManager.PLACE_LOCATIONS,"MAHIM");
        hashMapmhmhosp.put(DetailsManager.PLACES_NAMES,"Parijat Children's Hospital");
        hashMapmhmhosp.put(DetailsManager.PLACES_LAN,"19.0365174");
        hashMapmhmhosp.put(DetailsManager.PLACES_LONG,"72.8399569");
        hashMapmhmhosp.put(DetailsManager.PLACES_DOMAIN,"hospitals");
        hashMapmhmhosp.put(DetailsManager.PLACES_ADDRESS,"1st Floor, Gahi Mansion, Lady Jamshedji Rd, Mahim West, Mahim, Mumbai, Maharashtra 400016");
        offlineDatabase.insertSponsors1(hashMapmhmhosp);

        hashMapmhmhosp.put(DetailsManager.PLACE_LOCATIONS,"MAHIM");
        hashMapmhmhosp.put(DetailsManager.PLACES_NAMES,"Ashwini Children Hospital");
        hashMapmhmhosp.put(DetailsManager.PLACES_LAN,"19.030846");
        hashMapmhmhosp.put(DetailsManager.PLACES_LONG,"72.8394586");
        hashMapmhmhosp.put(DetailsManager.PLACES_DOMAIN,"hospitals");
        hashMapmhmhosp.put(DetailsManager.PLACES_ADDRESS,"Near City Light Cinema, Lady Jamshedji Rd, Mahim West, Mumbai, Maharashtra 400016");
        offlineDatabase.insertSponsors1(hashMapmhmhosp);

        hashMapmhmhosp.put(DetailsManager.PLACE_LOCATIONS,"MAHIM");
        hashMapmhmhosp.put(DetailsManager.PLACES_NAMES,"Gupte Maternity and Surgical Home");
        hashMapmhmhosp.put(DetailsManager.PLACES_LAN,"19.0365174");
        hashMapmhmhosp.put(DetailsManager.PLACES_LONG,"72.8399569");
        hashMapmhmhosp.put(DetailsManager.PLACES_DOMAIN,"hospitals");
        hashMapmhmhosp.put(DetailsManager.PLACES_ADDRESS,"143, Rajdeep Building, Behind Scottish School,Lt Dilip Gupte Marg, Mahim, Mumbai-400016");
        offlineDatabase.insertSponsors1(hashMapmhmhosp);

        hashMapmhmhosp.put(DetailsManager.PLACE_LOCATIONS,"MAHIM");
        hashMapmhmhosp.put(DetailsManager.PLACES_NAMES,"New Ratna Hospital");
        hashMapmhmhosp.put(DetailsManager.PLACES_LAN,"19.0366717");
        hashMapmhmhosp.put(DetailsManager.PLACES_LONG,"72.8366439");
        hashMapmhmhosp.put(DetailsManager.PLACES_DOMAIN,"hospitals");
        hashMapmhmhosp.put(DetailsManager.PLACES_ADDRESS,"Sitladevi Temple Road, Mahim West, Mahim, Mumbai, Maharashtra 400016");
        offlineDatabase.insertSponsors1(hashMapmhmhosp);

        hashMapmhmhosp.put(DetailsManager.PLACE_LOCATIONS,"MAHIM");
        hashMapmhmhosp.put(DetailsManager.PLACES_NAMES,"Endoskopik Klinik & Hospital");
        hashMapmhmhosp.put(DetailsManager.PLACES_LAN,"19.0294895");
        hashMapmhmhosp.put(DetailsManager.PLACES_LONG,"72.8373505");
        hashMapmhmhosp.put(DetailsManager.PLACES_DOMAIN,"hospitals");
        hashMapmhmhosp.put(DetailsManager.PLACES_ADDRESS,"Ameya, 147, Pandurang Naik Road, Shivaji Park,mahim west Mumbai, 400016");
        offlineDatabase.insertSponsors1(hashMapmhmhosp);

        hashMapmhmhosp.put(DetailsManager.PLACE_LOCATIONS,"MAHIM");
        hashMapmhmhosp.put(DetailsManager.PLACES_NAMES,"Prabhat Maternity & Surgical Hospital");
        hashMapmhmhosp.put(DetailsManager.PLACES_LAN,"19.0377193");
        hashMapmhmhosp.put(DetailsManager.PLACES_LONG,"72.8375617");
        hashMapmhmhosp.put(DetailsManager.PLACES_DOMAIN,"hospitals");
        hashMapmhmhosp.put(DetailsManager.PLACES_ADDRESS,"Kapad Bazar, Mahim West, Mahim, Mumbai, Maharashtra 400016");
        offlineDatabase.insertSponsors1(hashMapmhmhosp);

        hashMapmhmhosp.put(DetailsManager.PLACE_LOCATIONS,"MAHIM");
        hashMapmhmhosp.put(DetailsManager.PLACES_NAMES,"Childrens Hospital");
        hashMapmhmhosp.put(DetailsManager.PLACES_LAN,"19.0377187");
        hashMapmhmhosp.put(DetailsManager.PLACES_LONG,"72.8309956");
        hashMapmhmhosp.put(DetailsManager.PLACES_DOMAIN,"hospitals");
        hashMapmhmhosp.put(DetailsManager.PLACES_ADDRESS,"Lieutenant Dilip Gupte Marg, Mahim West, Mahim, Mumbai, Maharashtra 400016");
        offlineDatabase.insertSponsors1(hashMapmhmhosp);

        hashMapmhmhosp.put(DetailsManager.PLACE_LOCATIONS,"MAHIM");
        hashMapmhmhosp.put(DetailsManager.PLACES_NAMES,"Sukhada Nursing Home");
        hashMapmhmhosp.put(DetailsManager.PLACES_LAN,"19.0278343");
        hashMapmhmhosp.put(DetailsManager.PLACES_LONG,"72.839672");
        hashMapmhmhosp.put(DetailsManager.PLACES_DOMAIN,"hospitals");
        hashMapmhmhosp.put(DetailsManager.PLACES_ADDRESS,"Ground Floor, Sita Sadan, Bal Govind Das Rd, Mahim, Mumbai, Maharashtra 400016");
        offlineDatabase.insertSponsors1(hashMapmhmhosp);

        hashMapmhmhosp.put(DetailsManager.PLACE_LOCATIONS,"MAHIM");
        hashMapmhmhosp.put(DetailsManager.PLACES_NAMES,"Mahim Police Hospital");
        hashMapmhmhosp.put(DetailsManager.PLACES_LAN,"19.0467488");
        hashMapmhmhosp.put(DetailsManager.PLACES_LONG,"72.8402243");
        hashMapmhmhosp.put(DetailsManager.PLACES_DOMAIN,"hospitals");
        hashMapmhmhosp.put(DetailsManager.PLACES_ADDRESS," New Mahim Police Colony, Fisherman colony, Mahim, Mumbai, Maharashtra 400016");
        offlineDatabase.insertSponsors1(hashMapmhmhosp);

        hashMapmhmhosp.put(DetailsManager.PLACE_LOCATIONS,"MAHIM");
        hashMapmhmhosp.put(DetailsManager.PLACES_NAMES,"North Bombay Clinic");
        hashMapmhmhosp.put(DetailsManager.PLACES_LAN,"19.030395");
        hashMapmhmhosp.put(DetailsManager.PLACES_LONG,"72.8397849");
        hashMapmhmhosp.put(DetailsManager.PLACES_DOMAIN,"hospitals");
        hashMapmhmhosp.put(DetailsManager.PLACES_ADDRESS,"Door No. 185/ B, 1st Floor, Dinath, Opposite Citylight Cinema, L. J Road, Mahim, Mumbai - 400016");
        offlineDatabase.insertSponsors1(hashMapmhmhosp);

        hashMapmhmhosp.put(DetailsManager.PLACE_LOCATIONS,"MAHIM");
        hashMapmhmhosp.put(DetailsManager.PLACES_NAMES,"North Bombay Clinic");
        hashMapmhmhosp.put(DetailsManager.PLACES_LAN,"19.030395");
        hashMapmhmhosp.put(DetailsManager.PLACES_LONG,"72.8397849");
        hashMapmhmhosp.put(DetailsManager.PLACES_DOMAIN,"hospitals");
        hashMapmhmhosp.put(DetailsManager.PLACES_ADDRESS,"Door No. 185/ B, 1st Floor, Dinath, Opposite Citylight Cinema, L. J Road, Mahim, Mumbai - 400016");
        offlineDatabase.insertSponsors1(hashMapmhmhosp);



    }
}
