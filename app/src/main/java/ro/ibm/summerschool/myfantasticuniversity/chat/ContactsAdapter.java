package ro.ibm.summerschool.myfantasticuniversity.chat;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import ro.ibm.summerschool.myfantasticuniversity.R;

public class ContactsAdapter extends RecyclerView.Adapter<ContactsAdapter.MovieVH> {

    Context context;
    ArrayList<Contact> contacts;

    public ContactsAdapter( ArrayList<Contact> contacts){

        this.contacts=new ArrayList<>();
        this.contacts.addAll(contacts);
    }




    @NonNull
    @Override
    public MovieVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.contact_item, parent,false);
        return new MovieVH(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final MovieVH holder, final int position) {
       holder.description.setText(contacts.get(position).getDescription());

       holder.contactName.setText(contacts.get(position).getContactName());
       holder.setItemClickListener(new ItemClickListener() {
           @Override
           public void OnItemClickListener(View v, int layoutPosition) {
               String sDescription=contacts.get(position).getDescription();
               String sContactName=contacts.get(position).getContactName();
               Intent intent = new Intent(holder.description.getContext(),ChatActivity.class);
               intent.putExtra("icontactname",sContactName);
               holder.description.getContext().startActivity(intent);
           }
       });


    }

    @Override
    public int getItemCount() {
        return contacts.size();
    }


    class MovieVH  extends RecyclerView.ViewHolder implements View.OnClickListener{

        ImageView imageView;
        TextView contactName;
        TextView description;
        ItemClickListener itemClickListener;

         MovieVH(@NonNull View itemView){
            super(itemView);
            this.imageView = itemView.findViewById(R.id.contact_image);
            itemView.setOnClickListener(this);
            this.contactName = itemView.findViewById(R.id.contact_name);
            this.description = itemView.findViewById(R.id.contact_description);

        }
        @Override
        public void onClick(View v) {
            this.itemClickListener.OnItemClickListener(v,getLayoutPosition());

        }

        public void setItemClickListener(ItemClickListener ic)
        {
            this.itemClickListener = ic;
        }



    }
}
