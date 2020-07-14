package ro.ibm.summerschool.myfantasticuniversity.orar;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import ro.ibm.summerschool.myfantasticuniversity.R;

public class OrarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_orar);

        RecyclerView list = findViewById(R.id.weekDaysList);
        list.setLayoutManager(new LinearLayoutManager(this));
        list.setAdapter(new OrarAdapter(getDataForList()));
    }


    private ArrayList<Saptamana> getDataForList() {

        ArrayList<Saptamana> zileleSpatamanii = new ArrayList<>();
        zileleSpatamanii.add(new Saptamana("Luni", "16"));
        zileleSpatamanii.add(new Saptamana("Marti", "16"));

        return zileleSpatamanii;
    }

}