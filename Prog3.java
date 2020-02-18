public class Prog3 {
    //Instance VAriable
    int a = 28;
    //Static Variable
    static int j = 35;

    //Main method
    public static void main(String[] args) {
        //CAlling instance method in Static area
        Prog3 cal = new Prog3();
        cal.instancemethod();

        //Calling static method in static area
        Staticmethod();


    }

    //Instance Method
    public void instancemethod() {
        System.out.println(a);
        //Calling static variable in instance area
        System.out.println(Prog3.j);
    }

    //Static method
    public static void Staticmethod() {
        System.out.println(Prog3.j);
        //calling instance variable in static area
        Prog3 obj = new Prog3();
        System.out.println(obj.a);


    }
}
