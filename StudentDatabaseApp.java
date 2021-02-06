import java.util.Scanner;
public class StudentDatabaseApp{
    public static void main(String[] args) { 
        System.out.println("Enter number of students to enroll: ");
        Scanner in = new Scanner(System.in);
        int numOfStudents = in.nextInt();
        Student[] students = new Student[numOfStudents];
                                                          // Array of objects.
        for (int i = 0; i< numOfStudents; i++){
            students[i] = new Student();
            students[i].enroll();
            students[i].payTuition();
            System.out.println(students[i].toString());
        }
    }
}