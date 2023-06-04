package lambda_expression;

import java.util.Arrays;

interface IAverage{
    double avg(int[] array);
}

public class LambdaMultipleStatements {

    public static void main(String[] args) {

        // without lambda expression, IAverage implementation using anonymous class
        IAverage average = new IAverage() {
            @Override
            public double avg(int[] array) {
                double sum = 0;
                int arraySize = array.length;

                System.out.println("arraySize: " + arraySize);
                for (int i = 0; i < array.length; i++) {
                    sum = sum + array[i];
                }
                System.out.println("sum: " + sum);

                return (sum/ arraySize);
            }
        };
        int[] array1 = {1,4,6,8,9};
        System.out.println(average.avg(array1));


        // with a lambda expression
        IAverage withLambda = (array2) -> {
            return Arrays.stream(array2).mapToDouble(n->n).average().orElseThrow(IllegalArgumentException::new);
        };

        int[] array2 = {1,4,6,8,9};
        System.out.println("return the avg using lambda expression: " + withLambda.avg(array2));
    }
}
