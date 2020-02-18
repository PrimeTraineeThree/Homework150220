import java.util.Scanner;

public class LowerCase {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input a String: ");
        String line = scan.nextLine();
        line = line.toLowerCase();
        System.out.println(line);
    }
}