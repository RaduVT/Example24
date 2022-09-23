import java.util.Scanner;

public class Example24 {
    public static void main(String[] args){
        int num, factorial = 1, i;

        Scanner inputValue;
        inputValue = new Scanner(System.in);

        System.out.println("Enter a number:");
        num = inputValue.nextInt();

        for (i = 1; i <= num; i++) {
            factorial = factorial * i;
        }
        System.out.println("The factorial of " +num+ " is " +factorial);
    }
}
