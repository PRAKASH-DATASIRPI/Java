
import java.util.ArrayList;
import java.util.*;
class Student implements Comparable<Student>
{
    int age;
    String name;
    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }
    public String toString() {
        return "Student [" + "age=" + age + ", name=" + name + "]";
    }
    public int compareTo(Student that)
    {
        if(this.age < that.age)
            return 1;
        else
            return -1;
    }
}
public class compable
{
    public static void main(String[] args)
    {
        List<Student> studs = new ArrayList<>();
        studs.add(new Student(07,"praksh"));
        studs.add(new Student(41,"murugan"));
        studs.add(new Student(36,"selvi"));
        studs.add(new Student(55,"manju"));

        Collections.sort(studs);

        for(Student s1: studs)
        {
            System.out.println(s1.toString());
        }
    }
}