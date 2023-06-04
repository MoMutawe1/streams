package stream_intermediate_operations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
    * The Java Stream peek() method is a non-terminal operation that takes a Consumer interface as a parameter.
      The Consumer will get called for each element in the stream.
      The peek() method returns a new Stream that contains all the elements in the original stream.

    * The purpose of the peek() method is, as the method says, to peek at the elements in the stream,
      not to transform them. Keep in mind that the peek method does not start the internal iteration
      of the elements in the stream. You need to call a terminal operation for that.
*/
public class Peek {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("One", "Two", "Three", "Four", "Five");

        list.stream()
                .filter(n -> n.length()<=3)
                .peek(n -> System.out.println(n))
                .map(n -> n.toUpperCase())
                .peek(n -> System.out.println(n))
                .collect(Collectors.toList());
    }
}
