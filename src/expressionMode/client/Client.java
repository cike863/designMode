package expressionMode.client;

import expressionMode.context.Calculator;

/**
 * Created by XY on 2016/11/27.
 */
public class Client {
    public static void main(String[] args) {
        String statement = "3 * 2 * 4 / 6 % 5";
        Calculator calculator = new Calculator();
        calculator.bulid(statement);
        int result = calculator.compute();
        System.out.println(statement + " = " + result);
    }
}
