package stream_intermediate_operations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
    * The Java Stream filter() can be used to filter out elements from a Java Stream.
      The filter method takes a Predicate that is called for each element in the stream.
      If the element is to be included in the resulting Stream, the Predicate should return true.
      If the element should not be included, the Predicate should return false.
*/
public class Filter {

    public static void main(String[] args) {
        List<String> lines = Arrays.asList("c", "c++", "java", "python");

        List<String> filter = lines.stream().filter(n -> !"java".equals(n)).collect(Collectors.toList());
        System.out.println("filter() execution result: " + filter);
    }
}
