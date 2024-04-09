// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println(add(100, 400, 600, 99.5));

    }

    static int add(int a, int b){
        System.out.println("this is overloaded method #1");
        return a + b;
    }
    static int add(int a, int b, int c){
        System.out.println("this is overloaded method #2");
        return a + b + c;
    }

    static int add(int a, int b, int c, int d){
        System.out.println("this is overloaded method #3");
        return a + b + c + d;
    }
    static double add(double a, double b, double c, double d){
        System.out.println("this is overloaded method #5");
        return a + b + c + d;
    }

}