import java.time.LocalDate;
import java.util.Date;

public class Student {

    private String name;
    private int age;
    private int id;
    private int idCount = 0;



    public Student() {
        id = idCount;
        idCount++;
    }

    public Student(String name, int dateOfBirth) {
        this.name = name;
        this.age = dateOfBirth;
        id = idCount;
        idCount++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int dateOfBirth) {
        this.age = dateOfBirth;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id=" + id +
                '}';
    }
}
