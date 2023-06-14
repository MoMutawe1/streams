package questions_and_answers;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class FilterMapValues {

    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Blue");
        map.put(2, "Green");
        map.put(3, "Yellow");

        Map<Integer,String> filteredMap = map.entrySet().stream().filter(n->n.getKey().intValue()>2).collect(Collectors.toMap(n->n.getKey(), n->n.getValue()));
        System.out.println("Return Elements with Id Greater than 2: " + filteredMap);

        Map<Integer, String> filteredByValue = map.entrySet().stream().filter(n->"Yellow".equals(n.getValue())).collect(Collectors.toMap(n->n.getKey(), n->n.getValue()));
        System.out.println("Return Elements with Yellow Value: " + filteredByValue);
    }
}
