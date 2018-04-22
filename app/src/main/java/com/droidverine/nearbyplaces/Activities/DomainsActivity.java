package com.droidverine.nearbyplaces.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.droidverine.nearbyplaces.R;
import com.droidverine.nearbyplaces.utils.DetailsManager;
import com.droidverine.nearbyplaces.utils.OfflineDatabase;

import java.util.HashMap;

public class DomainsActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnhotels,btnschools,btnhospitals,btnbanks,btnpetrolpumps;
    String placelocation;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_domains);
        btnhotels=(Button)findViewById(R.id.btnhotels);
        btnhospitals=(Button)findViewById(R.id.btnhospital);
        btnschools=(Button)findViewById(R.id.btngarages);
        btnbanks=(Button)findViewById(R.id.btnbank);
        btnpetrolpumps=(Button)findViewById(R.id.btnpetrol);
        btnhotels.setOnClickListener(this);
        btnhospitals.setOnClickListener(this);
        btnbanks.setOnClickListener(this);
        btnschools.setOnClickListener(this);
        btnpetrolpumps.setOnClickListener(this);
      //  mahimgrg();
         intent=getIntent();
        placelocation=intent.getStringExtra("placelocality");
        Toast.makeText(getApplicationContext(),placelocation,Toast.LENGTH_LONG).show();
      /*  OfflineDatabase offlineDatabase=new OfflineDatabase(getApplicationContext());
        offlineDatabase.truncateSponsors();
        //garages  dadar
        HashMap<String,String> hashMapwdlhot=new HashMap<String, String>();
        hashMapwdlhot.put(DetailsManager.PLACE_LOCATIONS,"DADAR");

        hashMapwdlhot.put(DetailsManager.PLACES_NAMES,"ashok garage");
        hashMapwdlhot.put(DetailsManager.PLACES_LAN,"19.0197643");
        hashMapwdlhot.put(DetailsManager.PLACES_LONG,"72.8325765");
        hashMapwdlhot.put(DetailsManager.PLACES_DOMAIN,"garages");


        offlineDatabase.insertSponsors(hashMapwdlhot);
        HashMap<String,String> hashMapwdlhot1=new HashMap<String, String>();
        hashMapwdlhot1.put(DetailsManager.PLACE_LOCATIONS,"DADAR");

        hashMapwdlhot1.put(DetailsManager.PLACES_NAMES,"Cherrys garage");
        hashMapwdlhot1.put(DetailsManager.PLACES_LAN,"19.014349");
        hashMapwdlhot1.put(DetailsManager.PLACES_LONG,"72.833851");
        hashMapwdlhot1.put(DetailsManager.PLACES_DOMAIN,"garages");


        HashMap<String,String> hashMapwdlhot2=new HashMap<String, String>();
        hashMapwdlhot2.put(DetailsManager.PLACE_LOCATIONS,"DADAR");

        hashMapwdlhot2.put(DetailsManager.PLACES_NAMES,"HighWay Garage");
        hashMapwdlhot2.put(DetailsManager.PLACES_LAN,"19.0178457");
        hashMapwdlhot2.put(DetailsManager.PLACES_LONG,"72.831287");
        hashMapwdlhot2.put(DetailsManager.PLACES_DOMAIN,"garages");

        offlineDatabase.insertSponsors(hashMapwdlhot2);
        HashMap<String,String> hashMapwdlhot3=new HashMap<String, String>();
        hashMapwdlhot3.put(DetailsManager.PLACE_LOCATIONS,"DADAR");
        hashMapwdlhot3.put(DetailsManager.PLACES_NAMES,"Dadar Motor Works");
        hashMapwdlhot3.put(DetailsManager.PLACES_LAN,"19.0135446");
        hashMapwdlhot3.put(DetailsManager.PLACES_LONG,"72.8438786");
        hashMapwdlhot3.put(DetailsManager.PLACES_DOMAIN,"garages");

        offlineDatabase.insertSponsors(hashMapwdlhot3);
        HashMap<String,String> hashMapddrgarage1=new HashMap<String, String>();
        hashMapddrgarage1.put(DetailsManager.PLACE_LOCATIONS,"DADAR");

        hashMapddrgarage1.put(DetailsManager.PLACES_NAMES,"Starline Garage");
        hashMapddrgarage1.put(DetailsManager.PLACES_LAN,"19.0126535");
        hashMapddrgarage1.put(DetailsManager.PLACES_LONG,"72.8346393");
        hashMapddrgarage1.put(DetailsManager.PLACES_DOMAIN,"garages");

        offlineDatabase.insertSponsors(hashMapddrgarage1);
        HashMap<String,String> hashMapddrgarage2=new HashMap<String, String>();
        hashMapddrgarage2.put(DetailsManager.PLACE_LOCATIONS,"DADAR");
        hashMapddrgarage2.put(DetailsManager.PLACES_NAMES,"SELECT AUTO");
        hashMapddrgarage2.put(DetailsManager.PLACES_LAN,"19.0125179");
        hashMapddrgarage2.put(DetailsManager.PLACES_LONG,"72.8425321");
        hashMapddrgarage2.put(DetailsManager.PLACES_DOMAIN,"garages");

        offlineDatabase.insertSponsors(hashMapddrgarage2);
        HashMap<String,String> hashMapddrgarage3=new HashMap<String, String>();
        hashMapddrgarage3.put(DetailsManager.PLACE_LOCATIONS,"DADAR");
        hashMapddrgarage3.put(DetailsManager.PLACES_NAMES,"CARHUB GARAGE");
        hashMapddrgarage3.put(DetailsManager.PLACES_LAN,"19.0149112");
        hashMapddrgarage3.put(DetailsManager.PLACES_LONG,"72.8322309");
        hashMapddrgarage3.put(DetailsManager.PLACES_DOMAIN,"garages");

        offlineDatabase.insertSponsors(hashMapddrgarage3);

        HashMap<String,String> hashMapddrgarage4=new HashMap<String, String>();
        hashMapddrgarage4.put(DetailsManager.PLACE_LOCATIONS,"DADAR");
        hashMapddrgarage4.put(DetailsManager.PLACES_NAMES,"OMPRAKASH GARAGE");
        hashMapddrgarage4.put(DetailsManager.PLACES_LAN,"18.991142");
        hashMapddrgarage4.put(DetailsManager.PLACES_LONG,"72.841689");
        hashMapddrgarage4.put(DetailsManager.PLACES_DOMAIN,"garages");

        offlineDatabase.insertSponsors(hashMapddrgarage4);

        HashMap<String,String> hashMapddrgarage5=new HashMap<String, String>();
        hashMapddrgarage5.put(DetailsManager.PLACE_LOCATIONS,"DADAR");
        hashMapddrgarage5.put(DetailsManager.PLACES_NAMES,"Revive Customs");
        hashMapddrgarage5.put(DetailsManager.PLACES_LAN,"19.0297931");
        hashMapddrgarage5.put(DetailsManager.PLACES_LONG,"72.8384242");
        hashMapddrgarage5.put(DetailsManager.PLACES_DOMAIN,"garages");
        offlineDatabase.insertSponsors(hashMapddrgarage5);
        //wadala garages
        HashMap<String,String> hashMapWDlGRG=new HashMap<String, String>();
        hashMapWDlGRG.put(DetailsManager.PLACE_LOCATIONS,"WADALA");

        hashMapWDlGRG.put(DetailsManager.PLACES_NAMES,"BPT GARAGE ");
        hashMapWDlGRG.put(DetailsManager.PLACES_LAN,"19.0139558");
        hashMapWDlGRG.put(DetailsManager.PLACES_LONG,"72.8623484");
        hashMapWDlGRG.put(DetailsManager.PLACES_DOMAIN,"garages");


        offlineDatabase.insertSponsors(hashMapWDlGRG);
        HashMap<String,String> hashMapWDlGRG1=new HashMap<String, String>();
        hashMapWDlGRG1.put(DetailsManager.PLACE_LOCATIONS,"WADALA");

        hashMapWDlGRG1.put(DetailsManager.PLACES_NAMES,"GULFAM AUTO WORKS");
        hashMapWDlGRG1.put(DetailsManager.PLACES_LAN,"19.0152434");
        hashMapWDlGRG1.put(DetailsManager.PLACES_LONG,"72.8558618");
        hashMapWDlGRG1.put(DetailsManager.PLACES_DOMAIN,"garages");

        offlineDatabase.insertSponsors(hashMapWDlGRG1);

        HashMap<String,String> hashMapWDlGRG2=new HashMap<String, String>();
        hashMapWDlGRG2.put(DetailsManager.PLACE_LOCATIONS,"WADALA");

        hashMapWDlGRG2.put(DetailsManager.PLACES_NAMES,"Star Air Cool");
        hashMapWDlGRG2.put(DetailsManager.PLACES_LAN,"19.034001");
        hashMapWDlGRG2.put(DetailsManager.PLACES_LONG,"72.875972");
        hashMapWDlGRG2.put(DetailsManager.PLACES_DOMAIN,"garages");

        offlineDatabase.insertSponsors(hashMapWDlGRG2);
        HashMap<String,String> hashMapWDlGRG3=new HashMap<String, String>();
        hashMapWDlGRG3.put(DetailsManager.PLACE_LOCATIONS,"WADALA");
        hashMapWDlGRG3.put(DetailsManager.PLACES_NAMES,"Dashmesh Cng Impex Private Limited");
        hashMapWDlGRG3.put(DetailsManager.PLACES_LAN,"19.0330269");
        hashMapWDlGRG3.put(DetailsManager.PLACES_LONG,"72.878222");
        hashMapWDlGRG3.put(DetailsManager.PLACES_DOMAIN,"garages");

        offlineDatabase.insertSponsors(hashMapWDlGRG3);
        HashMap<String,String> hashMapWDlGRG4=new HashMap<String, String>();
        hashMapWDlGRG4.put(DetailsManager.PLACE_LOCATIONS,"WADALA");

        hashMapWDlGRG4.put(DetailsManager.PLACES_NAMES,"Star Automobile Service Station");
        hashMapWDlGRG4.put(DetailsManager.PLACES_LAN,"19.0512976");
        hashMapWDlGRG4.put(DetailsManager.PLACES_LONG,"72.910694");
        hashMapWDlGRG4.put(DetailsManager.PLACES_DOMAIN,"garages");

        offlineDatabase.insertSponsors(hashMapWDlGRG4);
        HashMap<String,String> hashMapWDlGRG5=new HashMap<String, String>();
        hashMapWDlGRG5.put(DetailsManager.PLACE_LOCATIONS,"WADALA");
        hashMapWDlGRG5.put(DetailsManager.PLACES_NAMES,"KPG VISHWAKARMA ");
        hashMapWDlGRG5.put(DetailsManager.PLACES_LAN,"19.016302");
        hashMapWDlGRG5.put(DetailsManager.PLACES_LONG,"72.8533475");
        hashMapWDlGRG5.put(DetailsManager.PLACES_DOMAIN,"garages");

        offlineDatabase.insertSponsors(hashMapWDlGRG5);
*/



    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnhospital:
                Intent intent1=new Intent(DomainsActivity.this,PlacesActivity.class);
                intent1.putExtra("domain","hospitals");
                intent1.putExtra("placelocality",intent.getStringExtra("placelocality"));
                startActivity(intent1);
                break;
            case R.id.btnbank:
                Intent intent2=new Intent(DomainsActivity.this,PlacesActivity.class);
                intent2.putExtra("domain","banks");
                intent2.putExtra("placelocality",intent.getStringExtra("placelocality"));

                startActivity(intent2);
                break;
            case R.id.btngarages:
                Intent intent5=new Intent(DomainsActivity.this,PlacesActivity.class);
                intent5.putExtra("domain","garages");
                intent5.putExtra("placelocality",intent.getStringExtra("placelocality"));

                startActivity(intent5);
                break;
            case R.id.btnhotels:
                Intent intent3=new Intent(DomainsActivity.this,PlacesActivity.class);
                intent3.putExtra("domain","hotels");
                intent3.putExtra("placelocality",intent.getStringExtra("placelocality"));

                startActivity(intent3);
                break;
            case R.id.btnpetrol:
                Intent intent4=new Intent(DomainsActivity.this,PlacesActivity.class);
                intent4.putExtra("domain","petrolpumps");
                intent4.putExtra("placelocality",intent.getStringExtra("placelocality"));

                startActivity(intent4);
                break;
        }

    }}
  /*  public void mahimgrg()
    {
        //garages  mahim
        OfflineDatabase offlineDatabase=new OfflineDatabase(getApplicationContext());
        offlineDatabase.truncateSponsors();
        HashMap<String,String> hashMapwdlhot=new HashMap<String, String>();
        hashMapwdlhot.put(DetailsManager.PLACE_LOCATIONS,"MAHIM");

        hashMapwdlhot.put(DetailsManager.PLACES_NAMES,"PARK GARAGE ");
        hashMapwdlhot.put(DetailsManager.PLACES_LAN,"19.0324794");
        hashMapwdlhot.put(DetailsManager.PLACES_LONG,"72.8388214");
        hashMapwdlhot.put(DetailsManager.PLACES_DOMAIN,"garages");


        offlineDatabase.insertSponsors(hashMapwdlhot);
        HashMap<String,String> hashMapwdlhot1=new HashMap<String, String>();
        hashMapwdlhot1.put(DetailsManager.PLACE_LOCATIONS,"MAHIM");

        hashMapwdlhot1.put(DetailsManager.PLACES_NAMES,"ATUL GARAGE ");
        hashMapwdlhot1.put(DetailsManager.PLACES_LAN,"19.0360831");
        hashMapwdlhot1.put(DetailsManager.PLACES_LONG,"72.8452392");
        hashMapwdlhot1.put(DetailsManager.PLACES_DOMAIN,"garages");


        HashMap<String,String> hashMapwdlhot2=new HashMap<String, String>();
        hashMapwdlhot2.put(DetailsManager.PLACE_LOCATIONS,"MAHIM");

        hashMapwdlhot2.put(DetailsManager.PLACES_NAMES,"GARAGE ASHIQUE ");
        hashMapwdlhot2.put(DetailsManager.PLACES_LAN,"19.0448401");
        hashMapwdlhot2.put(DetailsManager.PLACES_LONG,"72.84182041");
        hashMapwdlhot2.put(DetailsManager.PLACES_DOMAIN,"garages");

        offlineDatabase.insertSponsors(hashMapwdlhot2);
        HashMap<String,String> hashMapwdlhot3=new HashMap<String, String>();
        hashMapwdlhot3.put(DetailsManager.PLACE_LOCATIONS,"MAHIM");
        hashMapwdlhot3.put(DetailsManager.PLACES_NAMES,"GUDDU GARAGE ");
        hashMapwdlhot3.put(DetailsManager.PLACES_LAN,"19.0448652");
        hashMapwdlhot3.put(DetailsManager.PLACES_LONG,"72.8352543");
        hashMapwdlhot3.put(DetailsManager.PLACES_DOMAIN,"garages");

        offlineDatabase.insertSponsors(hashMapwdlhot3);
        HashMap<String,String> hashMapddrgarage1=new HashMap<String, String>();
        hashMapddrgarage1.put(DetailsManager.PLACE_LOCATIONS,"MAHIM");

        hashMapddrgarage1.put(DetailsManager.PLACES_NAMES,"Suresh AutO ");
        hashMapddrgarage1.put(DetailsManager.PLACES_LAN,"19.0360426");
        hashMapddrgarage1.put(DetailsManager.PLACES_LONG,"72.8403478");
        hashMapddrgarage1.put(DetailsManager.PLACES_DOMAIN,"garages");

        offlineDatabase.insertSponsors(hashMapddrgarage1);
        HashMap<String,String> hashMapddrgarage2=new HashMap<String, String>();
        hashMapddrgarage2.put(DetailsManager.PLACE_LOCATIONS,"MAHIM");
        hashMapddrgarage2.put(DetailsManager.PLACES_NAMES,"Car-N-Care");
        hashMapddrgarage2.put(DetailsManager.PLACES_LAN,"19.0414166");
        hashMapddrgarage2.put(DetailsManager.PLACES_LONG,"72.8374829");
        hashMapddrgarage2.put(DetailsManager.PLACES_DOMAIN,"garages");

        offlineDatabase.insertSponsors(hashMapddrgarage2);
        HashMap<String,String> hashMapddrgarage3=new HashMap<String, String>();
        hashMapddrgarage3.put(DetailsManager.PLACE_LOCATIONS,"MAHIM");
        hashMapddrgarage3.put(DetailsManager.PLACES_NAMES,"DHVANI MOTORS");
        hashMapddrgarage3.put(DetailsManager.PLACES_LAN,"19.0296171");
        hashMapddrgarage3.put(DetailsManager.PLACES_LONG,"72.8386893");
        hashMapddrgarage3.put(DetailsManager.PLACES_DOMAIN,"garages");

        offlineDatabase.insertSponsors(hashMapddrgarage3);

        HashMap<String,String> hashMapddrgarage4=new HashMap<String, String>();
        hashMapddrgarage4.put(DetailsManager.PLACE_LOCATIONS,"MAHIM");
        hashMapddrgarage4.put(DetailsManager.PLACES_NAMES,"SAWANT MOTORS");
        hashMapddrgarage4.put(DetailsManager.PLACES_LAN,"19.0434624");
        hashMapddrgarage4.put(DetailsManager.PLACES_LONG,"72.8392792");
        hashMapddrgarage4.put(DetailsManager.PLACES_DOMAIN,"garages");

        offlineDatabase.insertSponsors(hashMapddrgarage4);

        HashMap<String,String> hashMapddrgarage5=new HashMap<String, String>();
        hashMapddrgarage5.put(DetailsManager.PLACE_LOCATIONS,"MAHIM");
        hashMapddrgarage5.put(DetailsManager.PLACES_NAMES,"KOHLI TYRES PVT LTD");
        hashMapddrgarage5.put(DetailsManager.PLACES_LAN,"19.0360873");
        hashMapddrgarage5.put(DetailsManager.PLACES_LONG,"72.8403572");
        hashMapddrgarage5.put(DetailsManager.PLACES_DOMAIN,"garages");
        offlineDatabase.insertSponsors(hashMapddrgarage5);
        HashMap<String,String> hashMapddrgarage6=new HashMap<String, String>();
        hashMapddrgarage6.put(DetailsManager.PLACE_LOCATIONS,"MAHIM");
        hashMapddrgarage6.put(DetailsManager.PLACES_NAMES,"P.R. Enterprise Royal Enfield");
        hashMapddrgarage6.put(DetailsManager.PLACES_LAN,"19.0371862");
        hashMapddrgarage6.put(DetailsManager.PLACES_LONG,"72.843975");
        hashMapddrgarage6.put(DetailsManager.PLACES_DOMAIN,"garages");
        offlineDatabase.insertSponsors(hashMapddrgarage6);
    }
}*/
