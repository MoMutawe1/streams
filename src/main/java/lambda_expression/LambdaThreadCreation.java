package lambda_expression;

public class LambdaThreadCreation {

    public static void main(String[] args) {

        //without lambda, Runnable implementation using anonymous class
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println(" Runnable example without lambda expression.");
            }
        };
        Thread thread1 = new Thread(runnable);
        thread1.start();

        //with lambda
        Runnable withLambda = () -> System.out.println(" Runnable example with lambda expression.");
        Thread thread2 = new Thread(withLambda);
        thread2.run();
    }
}
