package ro.ibm.summerschool.myfantasticuniversity;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class CourseAdapter extends RecyclerView.Adapter<CourseAdapter.MovieVH> {

    List<Course> coursesList;

    public CourseAdapter(List<Course> coursesList) {
        this.coursesList = coursesList;
    }

    @NonNull
    @Override
    public MovieVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_exams, parent, false);
        return new MovieVH(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MovieVH holder, int position) {

        Course course = coursesList.get(position);
        holder.titleTextView.setText(course.getCourse());
        holder.dateTimeTextView.setText(course.getClassroom());
        holder.classroomTextView.setText(course.getDateTime());
        holder.nameTextView.setText(course.getName());

        boolean isExpanded = coursesList.get(position).isExpanded();
        holder.expandableLayout.setVisibility(isExpanded ? View.VISIBLE : View.GONE);

    }

    @Override
    public int getItemCount() {
        return coursesList.size();
    }

    class MovieVH extends RecyclerView.ViewHolder {

        ConstraintLayout expandableLayout;
        TextView titleTextView, dateTimeTextView, classroomTextView, nameTextView;

        public MovieVH(@NonNull final View itemView) {
            super(itemView);

            titleTextView = itemView.findViewById(R.id.titleTextView);
            dateTimeTextView = itemView.findViewById(R.id.dateTimeTextView);
            classroomTextView = itemView.findViewById(R.id.classroomTextView);
            nameTextView = itemView.findViewById(R.id.nameTextView);
            expandableLayout = itemView.findViewById(R.id.expandableLayout);


            titleTextView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    Course course = coursesList.get(getAdapterPosition());
                    course.setExpanded(!course.isExpanded());
                    notifyItemChanged(getAdapterPosition());

                }
            });
        }
    }
}
