package questions_and_answers;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterEvenNum {

    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(1, 13, 5, 7, 22, 6);
        List<Integer> result = arr.stream().filter(n->n%2==0).collect(Collectors.toList());
        System.out.println("Even Number: " + result);
    }
}
