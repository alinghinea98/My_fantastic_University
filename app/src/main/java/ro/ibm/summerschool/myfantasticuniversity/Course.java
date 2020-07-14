package ro.ibm.summerschool.myfantasticuniversity;

public class Course {

    private String course;
    private String classroom;
    private String dateTime;
    private String name;
    private boolean expanded;

    public Course(String course, String dateTime, String classroom, String name) {
        this.course = course;
        this.dateTime = dateTime;
        this.classroom = classroom;
        this.name = name;
        this.expanded = false;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getClassroom() {
        return classroom;
    }

    public void setClassroom(String classroom) {
        this.classroom = classroom;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isExpanded() {
        return expanded;
    }

    public void setExpanded(boolean expanded) {
        this.expanded = expanded;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "course='" + course + '\'' +
                ", classroom='" + classroom + '\'' +
                ", dateTime='" + dateTime + '\'' +
                ", name='" + name + '\'' +
                ", expanded=" + expanded +
                '}';
    }
}
