package StudentDBApp;

import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private int gradeYear;
    private int studentID;
    private String courses;
    private String balance;
    private String tutionBal;
    private int courseCost = 899; // INR 899
    private static int id = 1000;

    // Constructor: prompt user to enter student data
    public Student() {
        Scanner sc = new Scanner(System.in);
        // input for student name
        System.out.println("Enter First Name: ");
        this.firstName = sc.nextLine();
        System.out.println("Enter Last Name: ");
        this.lastName = sc.nextLine();

        // input for student class level
        System.out.println(
                "Press 1 - 1st Year\n Press 2 - 2nd Year\n Press 3 - 3rd Year\n Press 4 - 4th Year\n Enter student class level: ");
        this.gradeYear = sc.nextInt();

        setStudentId();

        System.out.println(studentID+"\t "+firstName + " \t" + lastName + " \t" + "year = " + gradeYear);
    }
    
    // Generating student unique ID
    private void setStudentId() {
        id++;
        this.studentID = gradeYear + id;
    }

    // Enroll in course
    // View balance
    // Pay tution
    // Show status
}
