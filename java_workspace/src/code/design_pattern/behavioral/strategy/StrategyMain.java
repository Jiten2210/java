package code.design_pattern.behavioral.strategy;

public class StrategyMain {
    public static void main(String[] args) {
        Context context = new Context(new AddOperation());
        System.out.println("30 + 20 = " + context.executeStrategy(30, 20));

        context = new Context(new SubtractOperation());
        System.out.println("30 - 20 = " + context.executeStrategy(30, 20));

        context = new Context(new MultiplyOperation());
        System.out.println("30 * 20 = " + context.executeStrategy(30, 20));
    }
}
