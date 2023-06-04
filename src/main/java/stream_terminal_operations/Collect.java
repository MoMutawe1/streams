package stream_terminal_operations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
    * The Java Stream collect() method is a terminal operation that starts the internal iteration of elements
      and collects the elements in the stream in a collection or object of some kind.
 */
public class Collect {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("One", "Two", "Three", "Four", "Five");

        List<String> result = list.stream().map(n-> n.toUpperCase()).collect(Collectors.toList());
        System.out.println("Using collect() terminal operation: ");
        System.out.println(result);
    }
}
