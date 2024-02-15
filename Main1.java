
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {

        ATMoprationInterf op=new ATMoprationInterf();
        int AtmNumber = 123456;
        int AtmPin = 7741;

        Scanner sc = new Scanner(System.in);

        System.out.println("**************************");
        System.out.println(" WelCome To ATM Machine");
        System.out.println("**************************");

        System.out.print("Enter ATM Number:-");
        int atmNumber = sc.nextInt();

        System.out.print("Enter ATM PIN:-");
        int atmPin = sc.nextInt();

        if (atmNumber == AtmNumber && atmPin == AtmPin){
            while(true){
                System.out.println("1.View Available Balance");
                System.out.println("2.withdraw Amount");
                System.out.println("3.Deposit Amount");
                System.out.println("4.View Ministatement");
                System.out.println("5.Exit");

                System.out.println("Enter Your Choice :-");
                int ch=sc.nextInt();
                if(ch==1)
                {
                    op.viewbalance();
                }
                else if(ch==2)
                {
                    System.out.println("Enter Amount To Withdraw :");
                    double withdrawAmount=sc.nextDouble();
                    op.withdrawAmount(withdrawAmount);
                }
                else if(ch==3)
                {
                    System.out.println("Enter Amount To Deposit :");
                    double depositAmount=sc.nextDouble();
                    op.depositAmount(depositAmount);
                }
                else if(ch==4)
                {
                    op.ViewMinistatement();
                }
                else if(ch==5)
                {
                    System.out.println("Collect Your ATM Card ");
                    System.out.println("Thank You For Using ATM Machine...!");
                }
                else
                {
                    System.out.println("Please Enter Correct Choice...!");
                }

            }

        }
        else
        {
            System.out.println("Incorrect ATM Number & PIN ...!");
        }
    }
}
