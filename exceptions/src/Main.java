// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {

            System.out.println("enter number ");
            int number = scanner.nextInt();
            System.out.println("enter second number ");
            int secondNum = scanner.nextInt();
            int th = number/secondNum;
            System.out.println(th);
            }catch (ArithmeticException e){
                System.out.println("you cant divide by 0");
        }catch (InputMismatchException e){
            System.out.println("enter only numbers");

        }finally {
            //System.out.println("always");
            scanner.close();
        }


    }
}