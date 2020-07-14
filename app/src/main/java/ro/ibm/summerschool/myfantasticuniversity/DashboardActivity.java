package ro.ibm.summerschool.myfantasticuniversity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import ro.ibm.summerschool.myfantasticuniversity.orar.OrarActivity;

public class DashboardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

            CardView cardviewExams = findViewById(R.id.cardviewExamene);
        cardviewExams.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    goToExams();
                }


        });

        CardView cardViewChat = findViewById(R.id.cardviewChat);
        cardViewChat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToChat();
            }
        });

        CardView cardViewOrar = findViewById(R.id.cardviewOrar);
        cardViewOrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToOrar();
            }
        });
    }

    private void goToExams() {
        Intent intent = new Intent(DashboardActivity.this, ExamsActivity.class);
        startActivity(intent);
    }
    private void goToChat(){
        Intent intent_chat = new Intent(DashboardActivity.this,
                ChatActivity.class);
        startActivity(intent_chat);
    }

    private void goToOrar() {
        Intent intentOrar = new Intent(DashboardActivity.this, OrarActivity.class);
        startActivity(intentOrar);
    }
}