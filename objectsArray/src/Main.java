// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
     // Food[] refrigerator = new Food[3];
      Food food1 = new Food("pizza");
      Food food2 = new Food("hot dog");
      Food food3 = new Food("cock");
      Food[] refrigerator = {food1,food2,food3};
//
//      refrigerator[0] = food1;
//      refrigerator[1] = food2;
//      refrigerator[2] = food3;
      System.out.println(refrigerator[0].name);
      System.out.println(refrigerator[1].name);
      System.out.println(refrigerator[2].name);
    }
}