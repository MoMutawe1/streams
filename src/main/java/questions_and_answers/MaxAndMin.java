package questions_and_answers;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MaxAndMin {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(14, 32, 55, 1, 60, 73, 94);
        int max = list.stream().max(Comparator.comparing(Integer::valueOf)).get();
        System.out.println("Max Value: " + max);

        int min = list.stream().min(Comparator.comparing(n -> Integer.valueOf(n))).get();
        System.out.println("Min Value: " + min);

        List<Integer> list2 = Arrays.asList(14, 32, 55, 1, 60, 73, 94);
        int result = list2.stream().mapToInt(n->n).max().getAsInt();
        System.out.println("Max Value: " + result);
    }
}
