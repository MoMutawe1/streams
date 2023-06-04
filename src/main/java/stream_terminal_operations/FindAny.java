package stream_terminal_operations;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/*
    * The Java Stream findAny() method can find a single element from the Stream.
    * The element found can be from anywhere in the Stream.
    * There is no guarantee about from where in the stream the element is taken.
*/
public class FindAny {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("One", "Two", "Three", "Four", "Five");

        Optional<String> findAny = list.stream().findAny();
        System.out.println("Using findAny() terminal operation: ");
        System.out.println(findAny.get());
    }
}
