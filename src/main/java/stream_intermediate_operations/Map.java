package stream_intermediate_operations;

/*
    The Java Stream map() method converts (maps) an element to another object.
    For instance, if you had a list of strings it could convert each string to lowercase,
    uppercase, or to a substring of the original string, or something completely else.
*/

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Map {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("1", "2", "3", "4", "5");
        List<Integer> map = list.stream().map(n -> Integer.valueOf(n)).collect(Collectors.toList());
        System.out.println("map() execution result: " + map);
    }
}
