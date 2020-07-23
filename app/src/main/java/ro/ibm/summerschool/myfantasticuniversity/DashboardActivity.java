package ro.ibm.summerschool.myfantasticuniversity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import com.google.android.material.navigation.NavigationView;

import ro.ibm.summerschool.myfantasticuniversity.orar.OrarActivity;


public class DashboardActivity extends AppCompatActivity {

    DrawerLayout drawerLayout;
    NavigationView navigationView;
    Toolbar toolbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        drawerLayout = findViewById(R.id.drawer_layout);
        navigationView = findViewById(R.id.nav_view);
        toolbar = findViewById(R.id.toolbar);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

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

        CardView cardViewProfil = findViewById((R.id.cardviewProfil));
        cardViewProfil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToProfile();
            }
        });
    }

    private void goToExams() {
        Intent intent = new Intent(DashboardActivity.this, ExamsActivity.class);
        startActivity(intent);
    }


    public void OnBackPressed() {
        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }


    private void goToProfile() {
        Intent intent = new Intent(DashboardActivity.this, MyProfileActivity.class);
        startActivity(intent);
    }

    private void goToChat() {
        Intent intent_chat = new Intent(DashboardActivity.this,
                ChatActivity.class);
        startActivity(intent_chat);
    }

    private void goToOrar() {
        Intent intentOrar = new Intent(DashboardActivity.this, OrarActivity.class);
        startActivity(intentOrar);

    }
}