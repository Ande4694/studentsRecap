import java.util.ArrayList;

public class Teacher {

    private int id;
    private int idCount;
    private String name;

    private ArrayList<Course> teachesCourse = new ArrayList<>();

    public void addCourse(Course course){
        teachesCourse.add(course);
        System.out.println(name+" now teaches: "+course);
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public Teacher() {
        id = idCount;
        idCount++;
    }

    public Teacher(String name) {
        this.name = name;
        id = idCount;
        idCount++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void printCoursesThisTeacherTeaches (){
        for (int i = 0; i < teachesCourse.size(); i++) {
            System.out.println(teachesCourse.get(i));

        }
    }
}
