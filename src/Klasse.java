import java.util.ArrayList;

public class Klasse {

    private int id;
    private int idCount = 0;
    private int courseCount = 0;
    private String klasseNavn;
    private int semester =1;

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    private Course[] courses = new Course [3];

    private ArrayList<Student> studentsInKlasse = new ArrayList<>();

    public Klasse(String klasseNavn) {
        this.klasseNavn = klasseNavn;
        id = idCount;
        idCount ++;

    }

    public void whatSemester(){
        System.out.println(klasseNavn+" is on "+semester+" semester");
    }

    public void addCourse(Course course){

        if (courseCount>=2){
            System.out.println(klasseNavn+" has too many courses!");
        }
        else {
            courses[courseCount]=course;
            System.out.println(klasseNavn+" now has a new course: "+course.getCourseName());
            courseCount++;
        }

    }

    public void removeStudentFromKlasse(Student student){
        studentsInKlasse.remove(student);
        System.out.println(student.getName()+" was removed from: "+klasseNavn);
    }

    public void addStudentToKlasse(Student student){
        studentsInKlasse.add(student);
        System.out.println(student.getName()+" is now enrolled in "+klasseNavn);
    }

    public Klasse() {
        id = idCount;
        idCount ++;
    }

    public int getId() {
        return id;
    }

    public String getKlasseNavn() {
        return klasseNavn;
    }

    public void setKlasseNavn(String klasseNavn) {
        this.klasseNavn = klasseNavn;
    }

    public ArrayList<Student> getStudentsInKlasse() {
        return studentsInKlasse;
    }

    public void setStudentsInKlasse(ArrayList<Student> studentsInKlasse) {
        this.studentsInKlasse = studentsInKlasse;
    }
}
