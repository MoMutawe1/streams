package questions_and_answers;

import java.util.*;
import java.util.stream.Collectors;

public class DuplicateNumbers {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList( 22, 11, 37, 22, 222, 11, 22);

        // First Solution
        Set<Integer> set = list.stream().filter(n-> Collections.frequency(list, n)>1).collect(Collectors.toSet());
        System.out.println("Duplicate Numbers: " + set);

        // Second Solution
        Set<Integer> dublicateSet = new HashSet<>();
        list.stream().filter(n->!dublicateSet.add(n)).collect(Collectors.toSet()).forEach(System.out::println);
    }
}
