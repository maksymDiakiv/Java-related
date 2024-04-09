// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.HashMap;
public class Main {
    public static void main(String[] args) {
        HashMap<String,String> countries = new HashMap<String, String>();

        countries.put("USA", "Washington DC");
        countries.put("India", "New Delhi");
        countries.put("Ukraine", "Kyiv");
        countries.put("Japan", "Tokyo");


        //countries.remove("India");

        //System.out.println(countries.size());
        //countries.clear();
        //countries.replace("USA", "Detroit");

//        System.out.println(countries.containsKey("Ukraine"));
//        System.out.println(countries.containsValue("Kyiv"));
        for (String i : countries.keySet()){
            System.out.println(i);
            System.out.println(countries.get(i));
        }
    }
}