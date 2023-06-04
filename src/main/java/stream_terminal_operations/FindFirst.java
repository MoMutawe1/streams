package stream_terminal_operations;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/*
    * The Java Stream findFirst() method finds the first element in the Stream if any elements are present in the Stream.
    * The findFirst() method returns an Optional from which you can obtain the element if present.
*/
public class FindFirst {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("One", "Two", "Three", "Four", "Five");
        Optional<String> findFirst = list.stream().findFirst();
        System.out.println("Using findFirst() terminal operation: ");
        System.out.println(findFirst.get());
    }
}
