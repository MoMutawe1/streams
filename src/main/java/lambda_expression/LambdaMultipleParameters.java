package lambda_expression;

interface Addable{
    int add(int a,int b);
}

public class LambdaMultipleParameters {

    public static void main(String[] args) {

        // without lambda expression
        Addable addable = new Addable() {
            @Override
            public int add(int a, int b) {
                return a + b;
            }
        };
        System.out.println(addable.add(3, 10));

        // with lambda expression
        Addable withLambda = (n, m) -> {return n + m;};
        System.out.println("return the sum using lambda expression " + withLambda.add(1, 10));
    }
}
