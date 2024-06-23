package com.lld.behavioral.interpreter;

public class NumberTerminalExpression implements Expression {
    private final String var;

    public NumberTerminalExpression(String var) {
        this.var = var;
    }

    @Override
    public int interpret(Context context) {
        return context.get(var);
    }
}
