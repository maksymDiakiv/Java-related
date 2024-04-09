// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        Double[] doubleArray = {5.5, 4.4, 3.3, 2.2, 1.1};
        Character[] charArray = {'s', '3', '1', ';'};
        String[] stringArray = {"dasdf", "324asdf", "fdasfasd"};
        MyGenClass<Integer> myInt = new MyGenClass<>(24);
//        displayArray(intArray);
//        displayArray(doubleArray);
//        displayArray(charArray);
//        displayArray(stringArray);

        getFIrst(stringArray);

    }
    public static <T> void displayArray(T[] array){
        for (T x : array){
            System.out.println(x + " ");
        }
        System.out.println();
    }
    public static <T> T getFIrst(T[] array){
        return array[0];
    }
}