package stream_terminal_operations;

import java.util.Arrays;
import java.util.List;

/*
    * The Java Stream toArray() method is a terminal operation that starts the internal iteration
      of the elements in the stream and returns an array of Objects containing all the elements.
*/
public class ToArray {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("One", "Two", "Three");
        Object[] strObj = list.stream().toArray();
        System.out.println("Using toArray() terminal operation: ");
        System.out.println(strObj[0]);
        System.out.println(strObj[1]);
        System.out.println(strObj[2]);
    }
}
