package com.droidverine.nearbyplaces.Adapters;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.droidverine.nearbyplaces.Activities.MapsActivity;
import com.droidverine.nearbyplaces.R;
import com.droidverine.nearbyplaces.models.Places;

import java.util.List;

/**
 * Created by Shivraj Patil on 08-03-2018.
 */

public class PlacesAdapter extends RecyclerView.Adapter<PlacesAdapter.CustomViewHolder> {
    Context context;
    List<Places> placesList;

    public PlacesAdapter(Context context, List<Places> placesList) {
        this.context = context;
        this.placesList = placesList;
    }

    @Override
    public CustomViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.placesitem_layout,parent,false);
        return new CustomViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final CustomViewHolder holder,final int position) {
        holder.placename.setText(placesList.get(position).getPlacename().toString());
        if (placesList.get(position).getPlacefulladdr()!=null)
        {
            holder.placeaddress.setText(placesList.get(position).getPlacefulladdr().toString());

        }
        else {
            holder.placeaddress.setText(placesList.get(position).getPlaceaddress().toString());
        }
        holder.item.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(context, MapsActivity.class);
                intent.putExtra("lng",placesList.get(position).getLng().toString());
                intent.putExtra("lat",placesList.get(position).getLat().toString());
                intent.putExtra("name",placesList.get(position).getPlacename().toString()+".");

                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);//FLag added
                context.getApplicationContext().startActivity(intent);

            }
        });

    }

    @Override
    public int getItemCount() {
        return placesList.size();
    }

    public class CustomViewHolder extends RecyclerView.ViewHolder{
        TextView placename,placeaddress;
        LinearLayout item;
        public CustomViewHolder(View itemView) {
            super(itemView);
            placename=(TextView)itemView.findViewById(R.id.placenametxt);
            placeaddress=(TextView)itemView.findViewById(R.id.addresstxt);
            item=(LinearLayout)itemView.findViewById(R.id.item);
        }
    }
}
