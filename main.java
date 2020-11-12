
import object.Const;
import object.Variable;
import operation.Add;
import operation.Multiply;
import operation.Subtract;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

        System.out.println(
                new Add(
                        new Subtract(
                                new Multiply(
                                        new Variable("x"),
                                        new Variable("x")
                                ),
                                new Multiply(
                                        new Const(2),
                                        new Variable("x")
                                )
                        ),
                        new Const(1)
                ).evaluate(x, x, x));
    }
}