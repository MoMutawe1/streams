package questions_and_answers;

import java.util.*;
import java.util.stream.Collectors;

public class NthHighestSalary {

    public static void main(String[] args) {

        Map<String, Integer> myMap = new HashMap<>();
        myMap.put("anil", 1000);
        myMap.put("mohammad", 1300);
        myMap.put("suna", 1500);
        myMap.put("temo", 1600); //output
        myMap.put("meme", 1200);
        myMap.put("daniel", 1700);
        myMap.put("james", 1400);

        Map.Entry<String, Integer> result = getNthHighestSalary(2, myMap);
        System.out.println(result);
    }

    public static Map.Entry<String, Integer> getNthHighestSalary(int num, Map<String, Integer> map) {

        try {
            return map.entrySet().stream()
                    .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                    .collect(Collectors.toList()).get(num - 1);
        } catch(IndexOutOfBoundsException e) {
            return new AbstractMap.SimpleEntry<String, Integer>("Index out of bounds for length " + num, 0);
        }
    }
}
