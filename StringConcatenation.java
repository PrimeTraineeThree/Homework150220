import java.util.Scanner;

public class StringConcatenation {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Local variables//
        int a;
        int b;
        System.out.println("Enter the value of first number");
        a = scan.nextInt();
        System.out.println("Enter the value of second number");
        b = scan.nextInt();
        //calling instance method in static method
        StringConcatenation cal = new StringConcatenation();
        cal.addsub(a, b);
        //calling static method in static area
        division(a, b);


    }

    //instance method//
    public void addsub(int a, int b) {
        int result1 = a + b;
        int result2 = a - b;
        System.out.println(result1);
        System.out.println(result2);
    }

    //static method//
    public static void division(int a, int b) {
        int result3 = a * b;
        int result4 = a / b;
        System.out.println(result3);
        System.out.println(result4);

    }
}

