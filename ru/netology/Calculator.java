package ru.netology;

import java.util.function.*;

/**
 * @author Vladimir Troshin on 12.05.2022
 * https://jira.rvision.pro/browse/
 */
public class Calculator {

    public static Supplier<Calculator> instance = Calculator::new;

    public BinaryOperator<Integer> plus = (x, y) -> x + y;
    public BinaryOperator<Integer> minus = (x, y) -> x - y;
    public BinaryOperator<Integer> multiply = (x, y) -> x * y;
    public BinaryOperator<Integer> devide = (x, y) -> x / y;

    /*
    Деление на 0 вызывает исключение, необходимо учесть то, что y может быть равен 0
    Можно просто выводить 0 при делении на ноль:
    public BinaryOperator<Integer> devide = (x, y) -> y != 0 ? x / y : 0;
    Либо с выводом предупреждения
    public BinaryOperator<Integer> devide2 = (x, y) -> {
        if (y == 0){
            System.out.println("Делить на ноль нельзя");
            return 0;
        } else {
            return x / y;
        }
    };
     */

    public UnaryOperator<Integer> pow = x -> x * x;
    public UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;

    public Predicate<Integer> isPositive = x -> x > 0;

    public Consumer<Integer> println = System.out::println;

}
