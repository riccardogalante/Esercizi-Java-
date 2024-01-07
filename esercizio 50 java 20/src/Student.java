import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student {
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

    public static ArrayList<Student> creaListaStudenti() {
        ArrayList<Student> studentList = new ArrayList<>();
        for (int i = 1; i <= 12; i++) {
            studentList.add(new Student("Student " + i, 20 + i)); // Esempio di età incrementale
        }
        return studentList;
    }

    public static void stampaListaStudenti(ArrayList<Student> students) {
        for (Student student : students) {
            System.out.println("Nome: " + student.getName() + ", Età: " + student.getAge());
        }
    }

    public static void ordinaListaStudentiPerNome(ArrayList<Student> students) {
        Collections.sort(students, Comparator.comparing(Student::getName));
    }
}