package ro.ibm.summerschool.myfantasticuniversity.chat;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import java.util.ArrayList;

import ro.ibm.summerschool.myfantasticuniversity.DashboardActivity;
import ro.ibm.summerschool.myfantasticuniversity.R;

public class ContactsActivity extends AppCompatActivity {

    RecyclerView mRecyclerView;
    ContactsAdapter contactsAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacts);

        mRecyclerView = findViewById(R.id.recyclerView_contacts);
        getMyList();

       /* Button btn_chat_to_contacts = findViewById(R.id.btn_contacts_to_dashb);
        btn_chat_to_contacts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goBackToDashboard();
            }

        });*/
    }

    private void getMyList(){
        ArrayList<Contact> contacts = new ArrayList<>();
        Contact a = new Contact();
        a.setContactName("Popescu Andrei");
        a.setDescription("Available");
        contacts.add(a);

//        a = new Contact("Ionescu George","Busy"); pentru cand am constructor definit cu param
        a=new Contact();
        a.setContactName("Ionescu George");
        a.setDescription("Busy");
        contacts.add(a);

        contactsAdapter = new ContactsAdapter(contacts);
        mRecyclerView.setAdapter(contactsAdapter);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

    }

    /*private void goBackToDashboard() {
        Intent intentContactsToDashB = new Intent(ContactsActivity.this, DashboardActivity.class);
        startActivity(intentContactsToDashB);
    }*/
}