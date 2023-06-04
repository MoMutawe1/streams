package stream_terminal_operations;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/*
    * The Java Stream allMatch() method is a terminal operation that takes a single Predicate as the parameter,
      starts the internal iteration of elements in the Stream, and applies the Predicate parameter to each element.

    * If the Predicate returns true for all elements in the Stream, the allMatch() will return true.
      If not all elements match the Predicate, the allMatch() method returns false.
*/
public class AllMatch {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Spring Cloud Tutorial");
        list.add("REST API Tutorial");
        list.add("Kafka Tutorial");

        Stream<String> stream = list.stream();
        boolean allMatch = stream.allMatch(n -> n.contains("Tutorial"));

        System.out.println("allMatch execution result: " + allMatch);
    }
}
