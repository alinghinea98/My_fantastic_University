package ro.ibm.summerschool.myfantasticuniversity;

import androidx.appcompat.app.AppCompatActivity;

import android.app.TaskStackBuilder;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.loginBtn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToDashboard();
            }
        });

    }

    private void goToDashboard() {
        Intent intent = new Intent(LoginActivity.this, DashboardActivity.class);
        finish();
        startActivity(intent);



    }

   /* @Override
    protected void onStart() {
        super.onStart();
        if(mAuth.getCurrentUser() !=null)
        {
            finish();
            startActivity(new Intent(this, MyProfileActivity.class));
        }

    }

    @Override
    public void onClick(View view) {
        switch(view,getTaskId())
        {
            case R.id.textViewLoginActivity:
                finish();
                startActivity( new Intent(this, LoginActivity.class));
                break;

                case R.id buttonLogin:
                    userLogin();
                    break;
        }

        super.onPrepareNavigateUpTaskStack(builder);
    }*/
}