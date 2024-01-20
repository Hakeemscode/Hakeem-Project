public class MultiplicationTable {
    public static void main(String[] args) {
        //Using for loop to create multiplication Table
        System.out.println("Multiplication Table");
        for (int i = 1; i <= 12; i++) {
            for (int j = 1; j <= 12; j++) {

                System.out.println(i + " * " + j + " = " + i * j);
            }
        }
    }
}