public class Prog4 {
    //Instance Variable
    int p = 59;
    String m = "Priti ";
    //Static Variable
    static String y = "Monkey";
    static char plAY = 'P';

    //MAin method
    public static void main(String[] args) {
        //calling static method in static area
        product();
        //calling instance method in static area
        Prog4 obj = new Prog4();
        obj.division();

    }

    //Instance Method
    public void division() {
        //calling instance variable in instance area
        System.out.println(p);
        System.out.println(m);
        //calling static variable in instance area
        System.out.println(Prog4.plAY);
        System.out.println(Prog4.y);

    }

    //Static Method
    public static void product() {
        //calling static variables in static area
        System.out.println(plAY);
        System.out.println(y);
        //calling instance variable in static area
        Prog4 priti = new Prog4();
        System.out.println(priti.m);
        System.out.println(priti.p);
    }
}


