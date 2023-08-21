package com.example.a4506_a11201911944_aryarachimwibawa_utsppb;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ContactAdapter extends RecyclerView.Adapter<ContactAdapter.ContactViewHolder> {
    private List<ItemContact> listContact = new ArrayList<>();

    //2 constructor
    public ContactAdapter(List<ItemContact> listContact) {
        this.listContact = listContact;
    }

    private OnContactClickListener listener;

    public interface OnContactClickListener {
        public void onClick(View view, int position);
    }

    public void setListener(OnContactClickListener listener) {
        this.listener = listener;
    }

    //3 menghubungkan layout item contact ke adapter
    @NonNull
    @Override
    public ContactViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View vh = LayoutInflater.
                from(viewGroup.getContext()).
                inflate(R.layout.activity_item_contact,viewGroup,false);

        //4 membuat view holder
        ContactViewHolder viewHolder = new ContactViewHolder(vh);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ContactViewHolder contactViewHolder, int i) {
        //7 menghubungkan id ke data
        ItemContact item = listContact.get(i);
        contactViewHolder.txtPhone.setText(item.getPhone());
        contactViewHolder.txtName.setText(item.getName());
    }

    @Override
    public int getItemCount() {
        return listContact.size();
    }

    public class ContactViewHolder extends RecyclerView.ViewHolder {
        //5 membuat variabel di view holder
        public TextView txtName,txtPhone;

        public ContactViewHolder(@NonNull View itemView) {
            super(itemView);
            //6 menghubungkan id di layout ke view holder
            txtName = itemView.findViewById(R.id.txtName);
            txtPhone = itemView.findViewById(R.id.txtPhone);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    listener.onClick(v, getAdapterPosition());
                }
            });
        }
    }
}
