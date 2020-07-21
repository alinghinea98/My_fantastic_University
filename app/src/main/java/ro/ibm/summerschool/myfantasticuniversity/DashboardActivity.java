package ro.ibm.summerschool.myfantasticuniversity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import ro.ibm.summerschool.myfantasticuniversity.chat.ChatActivity;
import ro.ibm.summerschool.myfantasticuniversity.chat.ContactsActivity;

public class DashboardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        CardView cardviewOrar = findViewById(R.id.cardviewOrar);
        cardviewOrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToOrar();
            }
        });

        CardView cardViewChat = findViewById(R.id.cardviewChat);
        cardViewChat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToContactsList();
            }
        });
    }

    private void goToOrar() {
        Intent intent = new Intent(DashboardActivity.this, OrarActivity.class);
        startActivity(intent);
    }
    private void goToContactsList(){
        Intent intentContacts = new Intent(DashboardActivity.this, ContactsActivity.class);
        startActivity(intentContacts);
    }
}