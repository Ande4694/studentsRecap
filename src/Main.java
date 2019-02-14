import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Student anders = new Student("Anders",27);
        Student thomas = new Student("Thomas",22);
        Student elisha = new Student("Elisha",27);
        Student jona = new Student("Jonathan",27);

        Klasse dat18v2 = new Klasse("Dat18V2");

        dat18v2.addStudentToKlasse(anders);
        dat18v2.addStudentToKlasse(thomas);
        dat18v2.addStudentToKlasse(elisha);
        dat18v2.addStudentToKlasse(jona);

        Room room1 = new Room(145);
        Room room2 = new Room(213);

        Teacher jon = new Teacher("Jon");
        Teacher oskar = new Teacher("Oskar");

        Course course1 = new Course("Tech", room1, jon);
        Course course2 = new Course("SWC3", room2, jon);
        Course course3 = new Course("SWCD", room1, oskar);

        course1.addKlasseToCourse(dat18v2);
        course1.removeTeacher();
        course1.addTeacher(jon);

    }
}
