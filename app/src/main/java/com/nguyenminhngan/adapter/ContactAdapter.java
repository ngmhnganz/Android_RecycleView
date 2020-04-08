package com.nguyenminhngan.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

import com.nguyenminhngan.model.Contact;
import com.nguyenminhngan.recycleview.R;

import java.util.List;

public class ContactAdapter extends RecyclerView.Adapter<ContactAdapter.ContactViewHolder> {
    private List<Contact> contactList;
    private LayoutInflater mLayoutInflater;
    private Context context;

    public ContactAdapter(Context context,List<Contact> contactList){
        this.contactList = contactList;
        this.context = context;
        mLayoutInflater = LayoutInflater.from(context);
    }

    public class ContactViewHolder extends RecyclerView.ViewHolder{
        public TextView txtPhone;
        public TextView txtName;
        public  ImageView imgAvatar;
         public ContactViewHolder (View view){
             super(view);
             txtName = view.findViewById(R.id.txtName);
             txtPhone = view.findViewById(R.id.txtPhone);
             imgAvatar = view.findViewById(R.id.imgAvatar);
         }
    }

    public  ContactViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View item = mLayoutInflater.inflate(R.layout.contact_item,parent,false);
        return new ContactViewHolder(item);
    }

    public void onBindViewHolder(ContactAdapter.ContactViewHolder holder, int position){
        Contact contact = contactList.get(position);
        holder.txtPhone.setText(contact.getPhone());
        holder.txtName.setText(contact.getName());
        holder.imgAvatar.setImageResource(contact.getAvatar());
    }
    public int getItemCount(){
        return contactList.size();
    }
}
