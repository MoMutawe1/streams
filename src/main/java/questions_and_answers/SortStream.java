package questions_and_answers;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortStream {

    public static void main(String[] args) {

        // Sort a List.
        List<String> strList = Arrays.asList("java", "C#", "C++", "Java");
        List<String> sortedList = strList.stream().sorted().collect(Collectors.toList());
        System.out.println("Sort a list of Strings: ");
        sortedList.forEach(n -> System.out.print(n + " "));
        System.out.println();
        System.out.println();

        // Sort a List in a reverse order.
        System.out.println("Sort a list of Strings in reverse order: ");
        List<String> reversedList = strList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        reversedList.forEach(n -> System.out.print(n + " "));
    }
}
