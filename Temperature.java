import java.util.Scanner;

public class Temperature {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the degree in farenheit");
        double farenheit = scan.nextDouble();
        double Celcius = ((farenheit - 32) * 5 / 9);
        System.out.println(farenheit + "degree farenheit is equal to" + Celcius + "in Celcius");


    }
}

