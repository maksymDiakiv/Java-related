// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Rabbit rabbit = new Rabbit();
        Hawk hawk = new Hawk();
        Fish fish = new Fish();
        rabbit.flee();
        hawk.hunt();
        fish.flee();
        fish.hunt();
    }
}