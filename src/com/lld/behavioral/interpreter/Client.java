package com.lld.behavioral.interpreter;

public class Client {
    public static void main(String[] args) {
        // initialize context
        Context context = new Context();
        context.put("a",2);
        context.put("b",4);
        context.put("c",8);
        context.put("d",16);

        // ((a * b) + (c * d))
        Expression expression = new AddNonTerminalExpression(
                new MultiplyNonTerminalExpression(
                        new NumberTerminalExpression("a"),
                        new NumberTerminalExpression("b")),
                new MultiplyNonTerminalExpression(
                        new NumberTerminalExpression("c"),
                        new NumberTerminalExpression("d")));
        System.out.println(expression.interpret(context));
    }
}
