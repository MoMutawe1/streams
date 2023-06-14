package questions_and_answers;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDuplicateChars {

    public static void main(String[] args) {
        String str = "iloveleetcode";

        List<String> duplicateElements = Arrays.stream(str.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().filter(n->n.getValue()>1)
                .map(Map.Entry::getKey).collect(Collectors.toList());

        System.out.println(duplicateElements);
    }
}
