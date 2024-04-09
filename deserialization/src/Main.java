// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException{
        //steps to deserialize
        // 1 declare your object (dont instantiate)
        // 2 your class should implement Serializable interface
        // 3 add import java.io.Serializable
        // 4 FileInputStream fileIn = new FileInputStream(filepath)
        // 5 ObjectInputStream in = new ObjectInputStream(fileIn)
        // 6 objectName = (Class) in.readObject()
        // 7 in.close(); fileIn.close()
        User user = null;//1
        FileInputStream fileIn = new FileInputStream("D:\\programming\\java\\projects\\serialization\\userInfo.ser");
        ObjectInputStream in = new ObjectInputStream(fileIn);
        user = (User) in.readObject();
        in.close();
        fileIn.close();

        System.out.println(user.name + "\n" + user.password);
        user.sayHello();
    }
}