//     CodSoft Internship (Java Programing) Task 03 : ATM Interface

import java.util.Scanner;

class ATM extends UserAccount{
    UserAccount ua = new UserAccount();
    Scanner sc = new Scanner(System.in);
    float amount  = ua.amount;    // Here, balance is pre-defined        

    public void withdraw(){
        System.out.print("Enter the amount to be withdraw : ");
        float amt = sc.nextFloat();    //taking user's amount

        if( amt > amount){
            System.out.println("!!  Insufficient Balance  !!");
        }
        else{
            amount = amount - amt;
            System.out.println("Withdrawal Successfull, collect your amount !");
        }
        System.out.println();
    }

    public void deposit(){
        System.out.print("Enter the amount to be deposite : ");
        float amt = sc.nextFloat();

        if (amt == 0){
            System.out.println("!!  Please enter the amount first  !!");
        }
        else{
            amount = amount + amt;
            System.out.println();
            System.out.println("!!  Amount Successfully Added  !!");
        }
        System.out.println();
    }

    public void checkBalance(){
        System.out.println("Your balance is : " + amount);
    }
}

class UserAccount {
    
    float amount = 500000;

}

public class T3_ATM {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        ATM atm = new ATM();
        UserAccount uAcc = new UserAccount();
        atm.amount = 500000;

        while(true){
            System.out.println("\n__________________||--Welcome to CodSoft ATM--||_________________");
            System.out.println("Type 1 for Wihthdraw the Amount");
            System.out.println("Type 2 for Deposit the Amount");
            System.out.println("Type 3 for Check The Balance");
            System.out.println("Type 4 to EXIT");
            System.out.print("Choose an option to perform the Task: ");
            int user_command = sc.nextInt();

            switch (user_command){
                case 1 :    atm.withdraw();
                            System.out.println();
                            break;
                case 2 :    atm.deposit();
                            System.out.println();
                            break;
                case 3 :    atm.checkBalance();
                            System.out.println();
                            break;
                case 4 :    System.exit(user_command);
                default :   System.out.println("!!  Invalid Input  !!");
                            System.out.println();
            }
        }
    }
    
}
