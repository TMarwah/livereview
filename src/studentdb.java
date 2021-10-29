import java.util.concurrent.TimeUnit;

public class studentdb {

    public static void main(String[] args){
         Student stu1 = new Student();
         stu1.enroll();
         stu1.payCost();
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < 50; ++i) System.out.println();
        stu1.finalAccount();
        //prompt for student number

        //creates students
    }
}
