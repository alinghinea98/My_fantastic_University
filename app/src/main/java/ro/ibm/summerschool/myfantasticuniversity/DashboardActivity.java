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

        CardView cardviewOrar = findViewById(R.id.cardviewOrar);
        cardviewOrar.setOnClickListener(new View.OnClickListener() {
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

    private void goToOrar() {
        Intent intent = new Intent(DashboardActivity.this, OrarActivity.class);
        startActivity(intent);
    }
    private void goToProfile() {
        Intent intent = new Intent(DashboardActivity.this, MyProfileActivity.class);
        startActivity(intent);
    }
}