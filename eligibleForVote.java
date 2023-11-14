import java.util.Scanner;
public class eligibleForVote {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int age;
        System.out.print("Enter the age:");
        age=sc.nextInt();
        if(age>=18){
            System.out.println("you are eligible to vote");

        }
        else{
            System.out.println("not eligible to vote");
        }

    }
    
}
