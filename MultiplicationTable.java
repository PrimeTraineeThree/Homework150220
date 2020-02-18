import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[]args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input the number");
        int n = scan.nextInt();
        for (int i = 1; i <= 12; i++) {
            ;

            System.out.println(n + "*" + i + " = " + (n * i));
        }
    }
}
