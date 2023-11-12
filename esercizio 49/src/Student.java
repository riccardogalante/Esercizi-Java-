
public class Student implements Comparable<Student> {
    private String name;
    private int age;


    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }


    @Override
    public int compareTo(Student otherStudent) {

        return Integer.compare(this.age, otherStudent.age);
    }
}
