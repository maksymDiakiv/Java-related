// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try  {
            FileWriter fileWriter = new FileWriter("poem.txt");
            fileWriter.write("roses are black");
            fileWriter.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}