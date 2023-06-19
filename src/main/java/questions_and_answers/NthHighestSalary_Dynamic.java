package questions_and_answers;

import java.util.*;
import java.util.stream.Collectors;

public class NthHighestSalary_Dynamic {

    public static void main(String[] args) {

        Map<String, Integer> myMap = new HashMap<>();
        myMap.put("mango", 1000);
        myMap.put("peach", 1200);
        myMap.put("apple", 1200);
        myMap.put("melon", 1200);
        myMap.put("banana", 1000);
        myMap.put("watermelon", 1300);
        myMap.put("orange", 1300);

        System.out.println(getDynamicNthHighestSalary(3, myMap));
    }

    public static Map.Entry<Integer, List<String>> getDynamicNthHighestSalary(int num, Map<String, Integer> map) {

        try {
            return map.entrySet()
                    .stream()
                    .collect(Collectors.groupingBy(Map.Entry::getValue,
                            Collectors.mapping(Map.Entry::getKey, Collectors.toList())
                    ))
                    .entrySet()
                    .stream()
                    .sorted(Collections.reverseOrder(Map.Entry.comparingByKey()))
                    .collect(Collectors.toList())
                    .get(num - 1);
        }catch (IndexOutOfBoundsException e){
            List<String> elist = new ArrayList<>();
            elist.add("Index out of bounds for length " + num);
            return new AbstractMap.SimpleEntry<Integer, List<String>>(0,elist);
        }
    }
}
