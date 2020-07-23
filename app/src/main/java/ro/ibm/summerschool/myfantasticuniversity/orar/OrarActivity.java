package ro.ibm.summerschool.myfantasticuniversity.orar;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

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

       // testWriteInDatabase();

        readFromDatabase();


    }


    private ArrayList<Saptamana> getDataForList() {

        ArrayList<Saptamana> zileleSpatamanii = new ArrayList<>();
        zileleSpatamanii.add(new Saptamana("Luni", "16"));
        zileleSpatamanii.add(new Saptamana("Marti", "16"));

        return zileleSpatamanii;
    }


    private void testWriteInDatabase() {
        DatabaseReference database = FirebaseDatabase.getInstance().getReference();

        Saptamana saptamana = new Saptamana("Luni", "27");
        Saptamana saptamana1 = new Saptamana("Marti", "27");

        database.child("weeks").child("Luni").setValue(saptamana);
        database.child("weeks").child("Marti").setValue(saptamana1);



//        try {
//            DatabaseReference myRef = database.getReference("message");
//            myRef.setValue("Hello, World!");
//        } catch (Exception e) {
//            Log.d("Firebase", e.getLocalizedMessage());
//        }
    }


    private void readFromDatabase() {
        DatabaseReference database =
                FirebaseDatabase.getInstance().getReference().child("weeks").child("Luni");
        ValueEventListener postListener = new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                // Get Post object and use the values to update the UI
                Saptamana post = dataSnapshot.getValue(Saptamana.class);
                Log.d("Firebase database", post.toString());

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
                // Getting Post failed, log a message
                Log.w("OrarActivitate.java", "loadPost:onCancelled", databaseError.toException());
                // ...
            }
        };

        database.addValueEventListener(postListener);

    }

}