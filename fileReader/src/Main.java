// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("secretMessage.txt");
            int data = reader.read();
            while (data != -1){
                System.out.print((char) data);
                data = reader.read();
            }
            reader.close();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}