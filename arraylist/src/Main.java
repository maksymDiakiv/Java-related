import java.util.ArrayList;// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
//         ArrayList<String> food = new ArrayList<String>();
//
//         food.add("pizza");
//         food.add("ham");
//         food.add("dog");
//
//         food.set(0, "sushi");
//         food.remove(2);
//         food.clear();
//         for(byte i = 0; i<food.size(); i++){
//             System.out.print(food.get(i));
//         }
        //2d arraylist

        ArrayList<ArrayList<String>> groceryList = new ArrayList();
        ArrayList<String> bakeryList = new ArrayList();
        bakeryList.add("pasta");
        bakeryList.add("garlic");
        bakeryList.add("don");

        ArrayList<String> produceList = new ArrayList();
        produceList.add("dog ammo");
        produceList.add("cum");
        produceList.add("sex");

        ArrayList<String> drinksList = new ArrayList();
        drinksList.add("cola");
        drinksList.add("pepsi");
//        produceList.add("zhyvchyk");

        groceryList.add(bakeryList);
        groceryList.add(produceList);
        groceryList.add(drinksList);


        System.out.println(groceryList.get(0).get(0));


        }
    }
