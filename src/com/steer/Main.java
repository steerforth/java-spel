package com.steer;

import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Main {

    public static void test(){
        ExpressionParser parser = new SpelExpressionParser();
        String expression1 = "2>1 and (!true or !false)";
        boolean result1 = parser.parseExpression(expression1).getValue(boolean.class);
        System.out.println(result1);
    }

    public static void main(String[] args) {
        test();
    }
}
