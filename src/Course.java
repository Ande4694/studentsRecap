import java.util.ArrayList;

public class Course {

    private int id;
    private int idCount = 0;
    private String courseName;
    private Room isTaughtIn;
    private Teacher teacher;

    private ArrayList<Klasse> enrolledKlasse = new ArrayList<>();



    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", courseName='" + courseName + '\'' +
                ", isTaughtIn=" + isTaughtIn +
                ", teacher=" + teacher +
                '}';
    }

    public Course() {
        id = idCount;
        idCount++;
    }

    public void removeTeacher(){
        System.out.println("Removed "+teacher.getName()+" as teacher, from course: "+courseName);
        teacher = null;
    }

    public void addTeacher(Teacher teacher){
        this.teacher = teacher;
        System.out.println("Added "+teacher.getName()+" as the teacher for: "+courseName);
    }

    public void addKlasseToCourse(Klasse klasse){
        enrolledKlasse.add(klasse);
        System.out.println("added "+klasse.getKlasseNavn()+" to course: "+courseName);
    }

    public void removeStudentFromCourse(Klasse klasse){

        enrolledKlasse.remove(klasse);
        System.out.println("removed "+klasse.getKlasseNavn()+" from: "+courseName);

    }

    public Course(String courseName, Room isTaughtIn, Teacher teacher) {
        this.courseName = courseName;
        this.isTaughtIn = isTaughtIn;
        this.teacher = teacher;
        id = idCount;
        idCount++;
    }

    public Course(String courseName, Room isTaughtIn) {
        this.courseName = courseName;
        this.isTaughtIn = isTaughtIn;
        id = idCount;
        idCount++;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Room getIsTaughtIn() {
        return isTaughtIn;
    }

    public void setIsTaughtIn(Room isTaughtIn) {
        this.isTaughtIn = isTaughtIn;
    }

    public int getId() {
        return id;
    }
}
