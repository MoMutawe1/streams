package questions_and_answers;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DistinctNumbers {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 2, 3, 4, 4, 5);
        List<Integer> uniqueElements = list.stream().distinct().collect(Collectors.toList());
        System.out.println(uniqueElements);
    }
}
