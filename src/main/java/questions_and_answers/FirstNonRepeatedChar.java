package questions_and_answers;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatedChar {

    public static void main(String[] args) {
        String str = "iloveleetcodei";

        String duplicateElements = Arrays.stream(str.split(""))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new ,Collectors.counting()))
                .entrySet().stream().filter(n->n.getValue()==1).findFirst()
                .get().getKey();

        System.out.println("First Non Repeated Char: " + duplicateElements);
    }
}
