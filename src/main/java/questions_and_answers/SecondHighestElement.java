package questions_and_answers;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SecondHighestElement {

    public static void main(String[] args) {
        int[] arr = {14, 32, 28, 55, 1, 60, 12, 73, 94, 94, 8};
        List<Integer> list = Arrays.asList(14, 32, 28, 55, 1, 60, 12, 73, 94, 8);

        // find the second-highest unique number.
        int secHighest1 = Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).distinct().skip(1).findFirst().get();
        System.out.println("second-highest unique number: " + secHighest1);

        // find the second-highest number.
        int secHighest2 = list.stream().sorted(Collections.reverseOrder()).skip(1).findFirst().get();
        System.out.println("second-highest number: " + secHighest2);

        // find the second-smallest number.
        int secL = list.stream().sorted().distinct().skip(1).findFirst().get();
        System.out.println("second-smallest unique number" + secL);
    }
}
