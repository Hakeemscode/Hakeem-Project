import java.util.Scanner;
public class EvenNumbers {
    public static void main(String[] args) {
        String message;
        Scanner num = new Scanner(System.in);
        System.out.println("Enter number:");
        int firstNum = num.nextInt();

        if (firstNum %2== 0){
          message = "is even";
        }
        else{
          message = "is odd";
        }
        System.out.println(message);
        }
        }
