import java.util.Scanner;
public class MarkCalculation {
    public static void main(String[] args) {
        
        int math,physics,cs,eng,tamil,chemistry ,TotalMark=0 ,no_sub=6;
        float percentage,cutoff ;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the Maths mark:");
         math=sc.nextInt();
        System.out.print("Enter the Physics mark:");
        physics=sc.nextInt();
        System.out.print("Enter the Chemistry mark:");
        chemistry=sc.nextInt();
        System.out.print("Enter the English mark:");
        eng=sc.nextInt();
        System.out.print("Enter the Tamil mark:");
        tamil=sc.nextInt();
        System.out.print("Enter the Computer science mark:");
        cs=sc.nextInt();
        TotalMark=math+physics+chemistry+eng+tamil+cs;
        percentage=TotalMark/(float)no_sub;
        cutoff=math+(physics+chemistry)/2;
        System.out.println("Total mark :"+TotalMark);
        System.out.println("Percentage:"+percentage);
        System.out.println("Cutoff:"+cutoff);



    }
    
}
