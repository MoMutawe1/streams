package questions_and_answers;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterNullStream {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("hello", "hi", null);
        List<String> nullableList = list.stream().filter(n -> n!=null).collect(Collectors.toList());
        nullableList.forEach(System.out::println);
    }
}
