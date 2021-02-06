
import java.util.Scanner;
public class Student {
    
    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentID;
    private String courses;
    private int tuitionBalance;
    private static int costOfCourse=100;
    private static int id = 1000;

    public Student(){
        Scanner in = new Scanner(System.in); 

        System.out.println("Enter student firstname : ");
        this.firstName = in.nextLine();

        System.out.println("Enter student lastname : ");
        this.lastName = in.nextLine();

        System.out.println("1 - for fresher\n2 - sophmore\n3 - junior\n4 - senior\nEnter student class level : ");
        this.gradeYear = in.nextInt();

        setStudentID();              
    }
    private void setStudentID(){
        id++;
        this.studentID = gradeYear + "" + id;
    }
    public void enroll(){
        do{
            System.out.print("ENROLL course (Q to quit) : ");
            Scanner in = new Scanner(System.in);
            String course = in.nextLine();
            if (!course.equals("Q")){
                courses = courses + "\n   " + course;
                tuitionBalance = tuitionBalance + costOfCourse;
            }
            else {
                break;
            }
        } while (1 != 0);       
    }
    public void viewBalance(){
        System.out.println("Your balance is $"+tuitionBalance);
    }
    public void payTuition(){
        viewBalance();
        System.out.println("Enter your payment: $");
        Scanner in = new Scanner(System.in);
        int payment = in.nextInt();

        tuitionBalance = tuitionBalance - payment;
        System.out.println("Thankyou for your payment of $" +payment);
        viewBalance();
    }
    public String toString(){
        return "Name: " + firstName + " " + lastName +
                "\nGrade Level: "+ gradeYear+
                "\nStudent ID: "+ studentID+
                "\nCourses Enrolled:" + courses +
                "\nBalance: $" + tuitionBalance;
    }


}


