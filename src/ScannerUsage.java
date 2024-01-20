import java.util.Scanner;
public class ScannerUsage {
    public static void main(String[] args) throws InterruptedException {


        Scanner num = new Scanner(System.in);
       System.out.println("choose a function: ");
        System.out.println(" 1 - Add \n 2- subtraction \n 3- multiplication \n 4- division \n 5- remainder");
        int choice = num.nextInt();

        while (choice <1 || choice >5){
            System.out.println("you entered an invalid number");
            Thread.sleep(1000);
            System.out.println("enter a valid number");
            choice = num.nextInt();

            //if it exceeds, code ends
            //System.exit(0);
        }
        Thread.sleep(1000);
        System.out.println("Input first Number: ");
        double firstNumber = num.nextInt();
        Thread.sleep(1000);
        System.out.println("Input second Number: ");
        double secondNumber = num.nextInt();

        double result = switch (choice) {
            case 1 -> firstNumber + secondNumber;
            case 2 -> firstNumber - secondNumber;
            case 3 -> firstNumber * secondNumber;
            case 4 -> firstNumber / secondNumber;
            case 5 -> firstNumber % secondNumber;
            default -> 0;
            //System.out.println("The addition is: " + (firstNumber + secondNumber));
        };
        //we output the result
        System.out.println("the result is; " + result);
    }
}
