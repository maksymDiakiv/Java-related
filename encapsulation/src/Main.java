// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Car car = new Car("chevr", "camaro", 2077);
        System.out.println(car.getYear());
        car.setYear(2069);
        System.out.println(car.getYear());
    }
}