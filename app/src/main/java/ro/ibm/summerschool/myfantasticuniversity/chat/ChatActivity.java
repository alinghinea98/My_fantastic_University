package ro.ibm.summerschool.myfantasticuniversity.chat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import ro.ibm.summerschool.myfantasticuniversity.DashboardActivity;
import ro.ibm.summerschool.myfantasticuniversity.R;

public class ChatActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);
        Contact contact= (Contact) getIntent().getSerializableExtra("icontactname");

        // Populam lista cu mesaje
        ArrayList<MessageModel> messagesList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            messagesList.add(new MessageModel("Hi", i % 2 == 0 ? CustomAdapter.MESSAGE_TYPE_IN : CustomAdapter.MESSAGE_TYPE_OUT,contact));
        }

        CustomAdapter adapter = new CustomAdapter(this, messagesList);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);

       /* Button btn_chat_to_contacts = findViewById(R.id.btn_chat_to_contacts);
        btn_chat_to_contacts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goBackToContactsList();
            }

        });*/
    }

   /* private void goBackToContactsList() {
        Intent intentContacts = new Intent(ChatActivity.this, ContactsActivity.class);
        startActivity(intentContacts);
    }*/
}
