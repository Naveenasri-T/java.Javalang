import java.util.Scanner;
public class ATMexample {
    public static void main(String[] args) {
        int balance=  99000,withdraw, deposit;
        Scanner sc= new Scanner(System.in);

        while(true)
        {
            System.out.println("ATM");
            System.out.println("1.Withdraw");
            System.out.println("2.Deposit");
            System.out.println("3.Balance Check");
            System.out.println("4.Exit");
            System.out.println("Choose the operation you want to perform:");
            int choice= sc.nextInt();
            switch(choice){
                case 1:
                 System.out.println("Enter money to be withdrawn:");
                 withdraw=sc.nextInt();
                 if(balance>=withdraw){
                    balance=balance-withdraw;
                     System.out.println("please collect your money");
                 }
                 else{
                     System.out.println("Insufficient Balance");
                 }
                  System.out.println("");
                  break;

                  case 2:
                   System.out.println("Enter the money to be Deposited:");
                   deposit=sc.nextInt();
                   balance=balance+deposit;
                   System.out.println("Your money has been Successfully deposited");
                   System.out.println("");
                   break;
                   case 3:
                    System.out.println("Balance:"+balance);
                    System.out.println("");
                    break;
                    case 4:
                     System.out.println(0);
                }
            }        
                        
    }
                        
}

    

