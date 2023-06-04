package lambda_expression;

import java.util.function.Consumer;

public class LambdaSingleParameter {

    public static void main(String[] args) {

        // without lambda expression
        Consumer consumer = new Consumer() {
            @Override
            public void accept(Object msg) {
                System.out.println(msg.toString());
            }
        };
        consumer.accept("Printing a message to the console...");


        // with lambda expression
        Consumer withLambda = (msg) -> System.out.println(msg);
        withLambda.accept("Printing a message to the console...");
    }
}
