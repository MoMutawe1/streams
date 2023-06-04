/*
    * Java introduced a new class Optional in JDK 8. It is a public final class and is used to deal with
      NullPointerException in Java applications.

    * You must import java.util package to use this class. It provides methods that are used to check
      the presence of a value for the particular variable.

    * The purpose of the class is to provide a type-level solution for representing optional values instead of
      using null references.

    * Advantages of Java 8 Optional
        - Null checks are not required.
        - No more NullPointerException at run-time.
        - We can develop clean and neat APIs.
        - No more Boilerplate code.
    *
*/

import java.util.Optional;

public class OptionalUtilClass {

    public static void main(String[] args) {

        ofNullable();
        isPresentOptionalAPI();
        emptyOptionalAPI();
        emptyOptionalWithStaticAPI();
        emptyOptionalWithStaticAPI();
        ifPresentOptionalAPI();
        orElseOptionalAPI();
        orElseGetOptionalAPI();
        orElseThrowOptionalAPI();
        getOptionalAPI();
    }

    /*
        The Optional.ofNullable() method returns a Non-empty Optional if a value present in the given object.
        Otherwise returns empty Optional. Optional.empty() method is useful to create an empty Optional object.
    */
    public static void ofNullable(){
        Optional<String> gender = Optional.of("MALE");
        String answer1 = "YES";
        String answer2 = null;

        System.out.println("Non-Empty Optional: " + gender);
        System.out.println("Non-Empty Optional: Gender value: " + gender.get());
        System.out.println("Empty Optional: " + Optional.empty());

        System.out.println("ofNullable on Non-Empty Optional: " + Optional.ofNullable(answer1));
        System.out.println("ofNullable on Empty Optional: " + Optional.ofNullable(answer2));

        // java.lang.NullPointerException
        System.out.println("ofNullable on Non-Empty Optional: " + Optional.of(answer2));
    }

    // If a value is present, returns true, otherwise false.
    public static void isPresentOptionalAPI(){
        Optional<String> obj = Optional.of("Mohammad");
        System.out.println(obj.isPresent());
    }

    // Returns an empty Optional instance. No value is present for this Optional.
    public static void emptyOptionalAPI(){
        Optional<String> obj = Optional.empty();
        System.out.println(obj.isPresent());
    }

    // Returns an Optional describing the given non-null value.
    // the value to describe, which must be non-null
    public static void emptyOptionalWithStaticAPI(){
        String name = "Suna";
        System.out.println(Optional.of(name).get());
    }

    // If a value is present, performs the given action with the value, otherwise does nothing.
    public static void ifPresentOptionalAPI(){
        String name = "Temo";
        if(name != null)
            System.out.println(name.length());

        Optional<String> obj = Optional.of("Temo");
        obj.ifPresent(n -> System.out.println(n.length()));
    }

    public static void orElseOptionalAPI(){
        String nullName = null;
        String name = Optional.ofNullable(nullName).orElse("Meme");
        System.out.println(name);
    }

    public static void orElseGetOptionalAPI(){
        String nullName = null;
        String name = Optional.ofNullable(nullName).orElseGet(() -> "Meme");
        System.out.println(name);
    }

    // If a value is present, returns the value, otherwise throws an exception
    // produced by the exception supplying function.
    public static void orElseThrowOptionalAPI(){
        String nullName = null;
        String name = Optional.ofNullable(nullName).orElseThrow(() -> new IllegalArgumentException());
        System.out.println(name);
    }

    public static void getOptionalAPI(){
        Optional<String> obj = Optional.of("Mutawe");
        String name = obj.get();
        System.out.println(name);
    }
}

