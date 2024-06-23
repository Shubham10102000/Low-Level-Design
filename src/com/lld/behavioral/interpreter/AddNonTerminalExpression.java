package com.lld.behavioral.interpreter;

public class AddNonTerminalExpression implements Expression {
    private final Expression leftExpression;
    private final Expression rightExpression;

    public AddNonTerminalExpression(Expression leftExpression, Expression rightExpression) {
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
    }

    @Override
    public int interpret(Context context) {
        return leftExpression.interpret(context) + rightExpression.interpret(context);
    }
}