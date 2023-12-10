package questions_and_answers;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountCharsOccurrence {

    public static void main(String[] args) {

        String str = "ILoveLeetCode";

        Map<String, Long> map =
                Arrays.stream(str.split(""))
                        .map(latter-> latter.toLowerCase())
                        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(map);
    }
}
