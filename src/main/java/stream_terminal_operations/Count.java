package stream_terminal_operations;

import java.util.Arrays;
import java.util.List;

/*
    The Java Stream count() method is a terminal operation that starts the internal iteration of the elements in the Stream and counts the elements.
*/
public class Count {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("One", "Two", "Three", "Four", "Five");

        long count = list.stream().map(n->n.toUpperCase()).count();
        System.out.println("Using count() terminal operation: ");
        System.out.println(count);
    }
}
