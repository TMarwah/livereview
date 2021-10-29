import java.util.Scanner;
public class Student {
    private String nameFirst;
    private String nameLast;
    private String grade;
    private String studentid;
    private String courses;
    private int balance;
    private static int cost = 100;
    private static int id = 1000;

    //student constructor intitializes the object
    public Student() {
        Scanner input = new Scanner(System.in);
        System.out.print("What is the students first name: ");
        this.nameFirst = input.nextLine();

        System.out.print("What is the students first name: ");
        this.nameLast = input.nextLine();

        System.out.print("\n 9\n 10\n 11\n 12\nEnter grade: ");
        this.grade = input.nextLine();

        idset();
        System.out.println(nameFirst + nameLast + grade + studentid );


    }
    //creates id number
    private void idset() {
        //increment ID number
        id++;
        this.studentid =  grade + "" + id;
    }
    //add course

    //course cost checking

    //finalize details
}
