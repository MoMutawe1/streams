package questions_and_answers;

import java.util.Arrays;
import java.util.List;

public class FindTheAverage {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(93, 97, 95, 100, 98);
        double average = list.stream().mapToInt(n -> n).average().getAsDouble();
        System.out.println("The Average: " + average);

        int[] arr = {93, 97, 95, 100, 98};
        double doubleVal = Arrays.stream(arr).mapToDouble(n->n).average().getAsDouble();
        System.out.println("The Average: " + doubleVal);
    }
}
