import java.util.Scanner;

public class multiplicationTable {
    public static void main(String[] args) {

        int num, i;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        num = sc.nextInt();
        for (i = 1; i <= 10; i++) {
            System.out.println(i + "*" + num + "=" + i * num);
        }

    }
}