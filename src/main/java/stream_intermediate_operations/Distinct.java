package stream_intermediate_operations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
    * The Java Stream distinct() method is a non-terminal operation that returns a new Stream that
      will only contain the distinct elements from the original stream. Any duplicates will be eliminated.
*/
public class Distinct {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("One", "Two", "Three", "Three", "One");
        List<String> distinct = list.stream().distinct().collect(Collectors.toList());
        System.out.println("distinct() execution result: " + distinct);
    }
}
