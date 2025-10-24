package Main;

import Expressions.*;

public class Interpreter {
    public static void main(String[] args) {
        // Construir expresión compuesta: [5 + 3 * 2]
        Expression compuesta1 = new AddExpression(
            new NumberExpression(5),
            new MultiplyExpression (
                new NumberExpression (3),
                new NumberExpression(2)
            )  
        );
        System.out.println("[5 + 3 * 2] = " + compuesta1.interpret());

        // Construir expresión compuesta: [(4 + 6) - 2]
        Expression compuesta2 = new SubtractExpression(
            new AddExpression (
                new NumberExpression (4),
                new NumberExpression(6)
            ),
            new NumberExpression(2)
        );
        System.out.println("[(4 + 6) - 2] = " + compuesta2.interpret());   
    }
}
