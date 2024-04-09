// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.io.File;
public class Main {
    public static void main(String[] args) {
        File file = new File("secretMessage.txt");
        if (file.exists()){
            System.out.println(true);
        }else {
            System.out.println("no");
        }
    }
}