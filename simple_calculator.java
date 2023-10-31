import java.util.Scanner;

public class simple_calculator {
    public static void main(String args[]) {
        char operator;
        int num1, num2, result;
        // creating a object for scanner class
        Scanner sc = new Scanner(System.in);
        // get input from user
        System.out.println("choose an operator : +,- ,*,/,%");
        operator = sc.next().charAt(0);
        // enter the input
        System.out.println("enter the number1:");
        num1 = sc.nextInt();
        System.out.println("enter the number2:*");
        num2 = sc.nextInt();
        switch (operator) {
            case '+':
                // performs addition operation
                result = num1 + num2;
                System.out.println("addition of two numbers :" + result);
                break;
            case '-':
                // perfoms subraction operation
                result = num1 - num2;
                System.out.println("subraction of two numbers :" + result);
                break;
            case '*':
                // perfoms multiplication operation
                result = num1 * num2;
                System.out.println("multiplication of two numbers :" + result);
                break;
            // perfoms division operation
            case '/':
                result = num1 / num2;
                System.out.println("Division of two numbers :" + result);
                break;
            // performs modulo operation
            case '%':
                result = num1 % num2;
                System.out.println("remainder of two number:" + result);
                break;
            default:
                System.out.println("INVALID OPERATOR!!");
                break;

        }

        sc.close();
    }

}
