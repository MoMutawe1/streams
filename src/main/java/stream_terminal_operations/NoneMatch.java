package stream_terminal_operations;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/*
    * The Java Stream noneMatch() method is a terminal operation that will iterate the elements in the stream and return true or false,
      depending on whether no elements in the stream match the Predicate passed to noneMatch() as the parameter.

    * The noneMatch() method will return true if no elements are matched by the Predicate, and false if one or more elements are matched.
*/
public class NoneMatch {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Spring Cloud");
        list.add("REST API");
        list.add("Kafka");

        Stream<String> stream = list.stream();
        boolean noneMatch = stream.noneMatch(n -> "Junit".equals(n));

        System.out.println("noneMatch execution result: " + noneMatch);
    }
}
