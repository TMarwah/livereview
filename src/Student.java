import java.util.Scanner;
import java.util.concurrent.TimeUnit;
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
        System.out.println( );


    }
    //creates id number
    private void idset() {
        //increment ID number
        id++;
        this.studentid =  grade + "" + id;
    }
    //add course
    public void enroll() {
        do{
            System.out.print("Enter courses you would like to enroll in: ");
            Scanner input = new Scanner(System.in);
            String course = input.nextLine();

            //exit loop case
            if (!course.equals("q")){
                courses = courses + "\n" + course;
                balance = balance + cost;
            }
            else{
                System.out.println("Leaving loop \n");
                break;
            }
        } while (1 != 0);

        System.out.println("You are enrolled in: " + courses);
        System.out.println("Total cost of tuition $" + balance);
    }
    //course cost checking
    public void costCheck(){

        System.out.println("Your remaining balance is $" + balance);
    }

    //pay tuition
    public void payCost(){
        System.out.print("Enter your payment: ");
        Scanner input = new Scanner(System.in);
        int payment = input.nextInt();
        balance = payment - balance;
        System.out.println("Your account funds are $" + payment);
        costCheck();
    }
    //finalize details
    public void finalAccount() {
        System.out.println("Name: " + nameFirst + " " + nameLast + "\n" + "Grade: " + grade + "\nStudent ID: " + nameFirst + nameLast + grade + studentid + "\n"
                + "Enrolled Courses: " + courses + "\n" + "Account balance: $" + balance);
    }
}
