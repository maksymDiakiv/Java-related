// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("chevr", "camaro", 2077);
        //Car car2 = new Car("lambo", "gini", 2022);
        Car car2 = new Car(car1);
        //car2.copy(car1);
        System.out.println(car1 + " " + car2);
//        System.out.println(car1.getYear());
//        car1.setYear(2069);
//
//        System.out.println(car1.getYear());
    }
}