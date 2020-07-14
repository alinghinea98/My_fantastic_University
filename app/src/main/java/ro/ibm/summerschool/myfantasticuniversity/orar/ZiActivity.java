package ro.ibm.summerschool.myfantasticuniversity.orar;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import ro.ibm.summerschool.myfantasticuniversity.R;

public class ZiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zi);

        TextView numeZiTxt = findViewById(R.id.numeZi);

        String numeZi = getIntent().getStringExtra("nume_zi");
        numeZiTxt.setText(numeZi);
    }
}