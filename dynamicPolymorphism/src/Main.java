// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Animal animal;
        Scanner scanner = new Scanner(System.in);
        System.out.println("waltuh choose animal");
        System.out.println("1 == dog, 2 == cat ");
        int choice = scanner.nextInt();
        if(choice == 1){
            animal = new Dog();
            animal.speak();
        }else if (choice == 2){
            animal = new Cat();
            animal.speak();
        }
    }
}