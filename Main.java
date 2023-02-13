public class Main {

    public static int a;
    public static int b;

    public static void main(String[] args) {
        System.out.println("Hello world");
        a = 10;
        calc();
    }
    public static void calc() {
        b = a - 2;
        System.out.println("Value of b: "+b);
    }
}
