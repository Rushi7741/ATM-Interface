import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class  ATMoprationInterf  {
    ATM a=new ATM();

    Map<Double, String> ministmt=new HashMap<>();


    public void viewbalance()
    {
        System.out.println("Avaliable Balance is :"+a.getBalance());
    }


    public void depositAmount(double depositAmount)
    {
        ministmt.put(depositAmount," Rs Amount deposit");
        System.out.println(depositAmount+" Rs  Deposited Successfully...!");
        a.setBalance(a.getBalance()+depositAmount);
        viewbalance();
    }


    public void withdrawAmount(double withdrawAmount)
    {
        if(withdrawAmount%500==0){
            if(withdrawAmount<=a.getBalance()){
                ministmt.put(withdrawAmount," Rs Amount withdraw");
                System.out.println("Collect The Cash "+withdrawAmount+" Rs");
                a.setBalance(a.getBalance()-withdrawAmount);
                viewbalance();
            }
            else
            {
                System.out.println("Insufficient Balance..!");
            }
        }
        else
        {
            System.out.println("Please enter the Amount in Multipal Of 500");
        }
    }

    public void ViewMinistatement()
    {
        for (Map.Entry<Double, String> m:ministmt.entrySet()){
            System.out.println(m.getKey()+""+m.getValue());

        }
    }

}
