package stream_terminal_operations;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/*
    * The Java Stream anyMatch() method is a terminal operation that takes a single Predicate as a parameter,
      starts the internal iteration of the Stream, and applies the Predicate parameter to each element.
*/
public class AnyMatch {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Spring Cloud");
        list.add("REST API");
        list.add("Kafka");

        Stream<String> stream = list.stream();

        boolean anyMatch = stream.anyMatch(n -> n.startsWith("Spring"));
        System.out.println("anyMatch execution result: " + anyMatch);
    }
}
