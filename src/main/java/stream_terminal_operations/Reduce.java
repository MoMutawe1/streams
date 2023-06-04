package stream_terminal_operations;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/*
    * The Java Stream reduce() method is a terminal operation that can reduce all elements in the stream to a single element.
*/
public class Reduce {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("One", "Two", "Three");
        Optional<String> reduce = list.stream().reduce((n, m) -> n + " " + m);
        System.out.println("Using reduce() terminal operation: ");
        System.out.println(reduce.get());
    }
}
