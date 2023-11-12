import java.util.ArrayList;
import java.util.Collections;


public class Start {

    public static void main(String[] args) {

        ArrayList<Student> studentList = new ArrayList<>();


        for (int i = 0; i < 12; i++) {
            Student student = new Student("Student" + i, 20 + i);
            studentList.add(student);
        }

        System.out.println("Lista iniziale:");
        printStudentList(studentList);


        Collections.sort(studentList);
        System.out.println("\nLista ordinata:");
        printStudentList(studentList);
    }


    private static void printStudentList(ArrayList<Student> studentList) {
        for (Student student : studentList) {
            System.out.println("Name: " + student.getName() + ", Age: " + student.getAge());
        }
    }
}