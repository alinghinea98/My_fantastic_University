package ro.ibm.summerschool.myfantasticuniversity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class ExamsActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    List<Course> coursesList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        recyclerView = findViewById(R.id.recyclerView);

        initData();
        initRecyclerView();
    }

    private void initRecyclerView() {
        CourseAdapter courseAdapter = new CourseAdapter(coursesList);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(courseAdapter);
    }

    private void initData() {
        coursesList = new ArrayList<>();
        coursesList.add(new Course("ProgramareWeb", "VIV7", "28.08.2020 10:00", "Delia UNGUREANU"));
        coursesList.add(new Course("Retele de Calculatoare", "VI1B", "12.09.2020 8:00", "Robert DEMETER"));
        coursesList.add(new Course("Automate si microprogramare", "VIV7", "22.08.2020 9:00", "Lucian ITU"));
        coursesList.add(new Course("Sisteme cu microprocesoare", "VIV7", "30.08.2020 17:00", "Gigel MACESANU"));
        coursesList.add(new Course("Programare vizuala cu aplicatii in robotica","VIII13","30.08.2020 14:00","Aurel FRATU"));
        coursesList.add(new Course("Arhitectura sistemelor de calcul","VIII8","03.09.2020 9:00","Dan FLOROIAN"));


    }
}
