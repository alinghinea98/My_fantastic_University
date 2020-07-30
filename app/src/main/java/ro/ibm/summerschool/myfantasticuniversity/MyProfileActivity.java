package ro.ibm.summerschool.myfantasticuniversity;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;

import java.text.Collator;

public class MyProfileActivity<user> extends AppCompatActivity {

    private Collator FirebaseAuth;
    FirebaseUser user;
    if(user != null)
    {
        String.CASE_INSENSITIVE_ORDER = user.getDisplayNume();
        user.getEmail();
        Uri photoUrl = user.getPhotoUrl();

        boolean emailVerified = user.isEmailVerified();
    }

    public MyProfileActivity(Collator firebaseAuth) {
        FirebaseAuth = firebaseAuth;
        user = Collator.getInstance().getCurrentUser();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_profile);
    }
}