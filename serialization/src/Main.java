// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
public class Main {
    public static void main(String[] args) throws IOException {
        //serialization is a process of converting an object into a byte stream
        User user = new User();
        user.name = "Bro";
        user.password = "cumsex";
        FileOutputStream fileOut = new FileOutputStream("userInfo.ser");
        ObjectOutputStream out = new ObjectOutputStream(fileOut);
        out.writeObject(user);
        out.close();
        fileOut.close();

        System.out.println("info saved");
        //steps to serialize
        //1 object should implement Serializable interface
        //2 add import java.io.Serializable
        //3 FileOutputStream fileOut = new FileOutputStream(file path)
        //4 ObjectOutputStream out = new ObjectOutputStream(fileOut)
        //5 out.writeObject(objectName)
        // 6 out.close(); fileOut.close();
    }
}