import java.util.Scanner;

public class Areacircle {


    public static void main(String[] args) {
        int rad;
        double pie = 3.14;
        Scanner scan = new Scanner(System.in);
        Areacircle obj = new Areacircle();
        System.out.println("enter the radius of circle");
        rad = scan.nextInt();
        Areacircle cal = new Areacircle();
        cal.Area(rad, pie);

    }

    public void Area(int rad, double pie) {
        double result = pie * rad * rad;
        System.out.println(result);


    }

}
