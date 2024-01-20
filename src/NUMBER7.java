import java.util.Scanner;
public class NUMBER7 {
    public static void main(String[] args) {
        Scanner Num = new Scanner(System.in);
        System.out.println("Pick a number: ");
                int N = Num.nextInt();
                int result = 1;
                for (int i =1; i<=N; i++) {
                    result *= i;

                }
        System.out.println(N + "=" + result );

    }

}
