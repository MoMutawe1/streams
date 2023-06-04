package stream_intermediate_operations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
    * The Java Stream limit() method can limit the number of elements in a stream to
      a number given to the limit() method as a parameter.
    * The limit() method returns a new Stream that will at most contain the given number of elements.
*/
public class Limit {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("One", "Two", "Three", "Four", "Five");

        List<String> limit = list.stream().limit(4).collect(Collectors.toList());
        System.out.println("limit() execution result: " + limit);
    }
}
