package com.droidverine.nearbyplaces.Adapters;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.droidverine.nearbyplaces.R;
import com.droidverine.nearbyplaces.models.contact;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;


/**
 * Created by Shivraj on 02-02-2018.
 */

public class ContactAdapter extends RecyclerView.Adapter<ContactAdapter.ViewHoledr>{
    Context context;
    List<contact> contactList;
    int[] pics={R.drawable.pvan,R.drawable.firetruck, R.drawable.management,R.drawable.wmhelpline};

    public ContactAdapter(Context context, List<contact> contactList) {
        this.context = context;
        this.contactList=contactList;
    }

    @Override
    public ViewHoledr onCreateViewHolder(ViewGroup parent, int viewType) {
        View rootView = LayoutInflater.from(context.getApplicationContext()).inflate(R.layout.contactsitem, parent, false);
        return new ContactAdapter.ViewHoledr(rootView);
    }

    @Override
    public void onBindViewHolder(ViewHoledr holder, int position) {
        final String contactnumber=contactList.get(position).getContactnumber();
        holder.contactname.setText(contactList.get(position).getContactname());
        holder.contactrole.setText(contactList.get(position).getContactrole());
        holder.headimg.setImageResource(pics[position]);
        holder.callbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:"+contactnumber));
               context.startActivity(callIntent);
            }
        });




    }

    @Override
    public int getItemCount() {
        return contactList.size();
    }

    public class ViewHoledr extends RecyclerView.ViewHolder {
        TextView contactname,contactrole;
        ImageView callbtn,wabtn,headimg;
        public ViewHoledr(View itemView) {
            super(itemView);
            headimg=(CircleImageView)itemView.findViewById(R.id.contactimg);
            callbtn=(ImageView)itemView.findViewById(R.id.callbtn);
            contactname=(TextView)itemView.findViewById(R.id.contactname);
            contactrole=(TextView)itemView.findViewById(R.id.contactrole);


        }
    }
}
