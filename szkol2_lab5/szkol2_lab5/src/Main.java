import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
interface MyInterface {
    void doSomething();
}

public class Main {
    public static void main(String[] args) {

        MyInterface myLambda = () -> System.out.println("line");


        myLambda.doSomething();
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);


        numbers.stream()
                .filter(number -> number % 2 == 0)
                .forEach(System.out::println);

        Optional<Integer> minEven = numbers.stream()
                .filter(number -> number % 2 == 0)
                .min(Integer::compareTo);

        minEven.ifPresent(System.out::println);

        int start;
        int end;


    }
}
