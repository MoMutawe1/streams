package stream_terminal_operations;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/*
    * The Java Stream min() method is a terminal operation that returns the smallest element in the Stream.
*/
public class Min {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("One", "Two", "Three", "AAA");
        Optional<String> min = list.stream().min((n1, n2) -> n1.compareTo(n2));
        System.out.println("Using min() terminal operation: ");
        System.out.println(min.get());
    }
}
