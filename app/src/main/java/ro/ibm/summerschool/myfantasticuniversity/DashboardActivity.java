package ro.ibm.summerschool.myfantasticuniversity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

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
}