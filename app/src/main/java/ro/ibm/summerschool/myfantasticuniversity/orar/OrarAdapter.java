package ro.ibm.summerschool.myfantasticuniversity.orar;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import ro.ibm.summerschool.myfantasticuniversity.R;

public class OrarAdapter extends RecyclerView.Adapter<OrarAdapter.OrarItemViewHolder> {

    private List<Saptamana> data;

    public OrarAdapter(List<Saptamana> data) {
        this.data = data;
    }

    @NonNull
    @Override
    public OrarItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.week_day_item, parent, false);
        return new OrarItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull OrarItemViewHolder holder, int position) {

        holder.dayNameTxt.setText(data.get(position).getNumeZi());
        holder.weekNumber.setText("Sapatamana " + data.get(position).getNumarSaptamana());

    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    class OrarItemViewHolder extends RecyclerView.ViewHolder {

        TextView dayNameTxt;
        TextView weekNumber;

        public OrarItemViewHolder(@NonNull final View itemView) {
            super(itemView);

            dayNameTxt = itemView.findViewById(R.id.dayName);
            weekNumber = itemView.findViewById(R.id.weekNumber);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Log.d("test", "Click item!");
                    goToZiActivity(itemView.getContext(), dayNameTxt.getText().toString());
                }
            });
        }

        private void goToZiActivity(Context context, String numeZi) {
            Intent intent = new Intent(context, ZiActivity.class);
            intent.putExtra("nume_zi", numeZi);
            context.startActivity(intent);
        }

    }
}
