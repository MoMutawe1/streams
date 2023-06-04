package lambda_expression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaComparator {

    public static void main(String[] args) {
        List<Person> listOfPerson = new ArrayList<Person>();
        listOfPerson.add(new Person("Mo", 27));
        listOfPerson.add(new Person("Suna", 26));
        listOfPerson.add(new Person("Temo", 28));
        listOfPerson.add(new Person("Meme", 27));

        // Without lambda expression.
        // Sort list by age
        Comparator<Person> comparator = new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge() - o2.getAge();
            }
        };

        Collections.sort(listOfPerson, comparator);

        System.out.println(" Sort persons by age in ascending order - without lambda");
        for (Person person : listOfPerson) {
            System.out.println(" Person name : " + person.getName());
        }

        System.out.println();
        // With lambda expression.
        // Sort list by age
        Collections.sort(listOfPerson, (Person o1, Person o2) -> {return o1.getAge() - o2.getAge();});

        // Use forEach method added in java 8
        System.out.println(" Sort persons by age in ascending order - with lambda");
        listOfPerson.forEach((person) -> System.out.println(" Person name : " + person.getName()));
    }
}

class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}