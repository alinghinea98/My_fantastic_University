package ro.ibm.summerschool.myfantasticuniversity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import ro.ibm.summerschool.myfantasticuniversity.orar.OrarActivity;

//import android.widget.Toolbar;
import com.google.android.material.navigation.NavigationView;
import androidx.appcompat.widget.Toolbar;

import ro.ibm.summerschool.myfantasticuniversity.chat.ChatActivity;
import ro.ibm.summerschool.myfantasticuniversity.chat.ContactsActivity;

public class DashboardActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

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

        //
        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

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
                goToContactsList();
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


    public void OnBackPressed(){
        if(drawerLayout.isDrawerOpen(GravityCompat.START)) {
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
        Intent intentChat = new Intent(DashboardActivity.this,
                ChatActivity.class);
        startActivity(intentChat);
    }

    private void goToOrar() {
        Intent intentOrar = new Intent(DashboardActivity.this, OrarActivity.class);
        startActivity(intentOrar);
    }
    private void goToContactsList(){
        Intent intentContacts = new Intent(DashboardActivity.this, ContactsActivity.class);
        startActivity(intentContacts);

    }

    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.drawer_orar:
                Intent intentOrar = new Intent(DashboardActivity.this, OrarActivity.class);
                startActivity(intentOrar);
                break;

            case R.id.drawer_chat:
                Intent intentChat = new Intent(DashboardActivity.this, ChatActivity.class);
                startActivity(intentChat);
                break;

            case R.id.drawer_harta:
                Intent intentHarta = new Intent(DashboardActivity.this, MapActivity.class);
                startActivity(intentHarta);
                break;

            case R.id.drawer_examene:
                Intent intentExamene = new Intent(DashboardActivity.this, ExamsActivity.class);
                startActivity(intentExamene);
                break;

            case R.id.drawer_profil:
                Intent intentProfil = new Intent(DashboardActivity.this, MyProfileActivity.class);
                startActivity(intentProfil);
                break;

            case R.id.drawer_logout:
                SharedPreferences preferences = getSharedPreferences("checkbox", MODE_PRIVATE);
                SharedPreferences.Editor editor = preferences.edit();
                editor.putString("remember","false");
                editor.apply();
                finish();
        }


        return true;
    }
}