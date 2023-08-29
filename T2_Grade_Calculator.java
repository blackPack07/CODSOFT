//                    CodSoft Java Programmer Internship Task 2 i.e. STUDENT GRADE CALCULATOR 
import java.util.Scanner;

public class T2_Grade_Calculator {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Marks of DSA : ");
        int DSA = sc.nextInt();
        System.out.print("\nEnter Marks of ML : ");
        int ML = sc.nextInt();
        System.out.print("\nEnter Marks of OOPS : ");
        int OOPS = sc.nextInt();
        System.out.print("\nEnter Marks of OS : ");
        int OS = sc.nextInt();
        System.out.print("\nEnter Marks of DBMS : ");
        int DBMS = sc.nextInt();
        System.out.print("\nEnter Marks of DAA : ");
        int DAA = sc.nextInt();

        float sum = DSA + OOPS + DAA + ML + OS + DBMS;
        float percentage = sum/6;

        System.out.println("\n\n\nMarks Obtained (out of 600): - " + sum);
        System.out.println("Your Average Percentage is " + percentage + "%");

        if (percentage >= 85)
            System.out.println("\nYou are graded A+ i.e. Outstanding");

        else if (75 <= percentage && percentage < 85)
            System.out.println("\nYou are graded A i.e. Excellent");

        else if (65 <= percentage && percentage < 75)
            System.out.println("\nYou are graded B i.e. Very Good");

        else if(50 <= percentage && percentage < 65)
            System.out.println("\nYou are graded C i.e. Below Average");

        else if (40 <= percentage && percentage < 50)
            System.out.println("\nYou are graded D i.e. Marginal");

        else
            System.out.println("\nYou are graded E i.e. Very Poor");
        
    }
    
}
