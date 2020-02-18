import java.util.Scanner;


public class TraingleArea {
    //instance variable
    int b;
    int h;

    //main method
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the value of b");
        int b = scan.nextInt();
        System.out.println("Enter the value of h");
        int h = scan.nextInt();
        //calling instance method in main method
        TraingleArea cal = new TraingleArea();
        cal.area(b, h);

    }

    //instance method
    public void area(int b, int h) {
        int result = (b + h) / 2;
        System.out.println(result);
    }


}
