package stream_terminal_operations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


/*
    * The Java Stream forEach() method is a terminal operation that starts the internal iteration of the elements in the Stream
      and applies a Consumer (java.util.function.Consumer) to each element in the Stream. The forEach() method returns void.
*/
public class ForEach {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("One", "Two", "Three", "Four", "Five");
        System.out.println("Using forEach() terminal operation: ");
        list.stream().collect(Collectors.toList()).forEach(n -> System.out.print(n + " "));
    }
}
