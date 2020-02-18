public class Prog1 {

    //instance variable
    int a = 15;
    int b;

    public static void main(String[] args) {
        Prog1 obj = new Prog1();
        obj.instancemethod();


    }

    public void instancemethod() {
        int result=a+b;
        System.out.println(result);
    }


}



