package stream_terminal_operations;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/*
       * The Java Stream max() method is a terminal operation that returns the largest element in the Stream.
*/
public class Max {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("One", "Two", "Three", "XYZ");
        Optional<String> max = list.stream().max((n1, n2) -> n1.compareTo(n2));
        System.out.println("Using max() terminal operation: ");
        System.out.println(max.get());
    }
}
