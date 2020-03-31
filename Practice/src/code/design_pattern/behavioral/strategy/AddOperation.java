package code.design_pattern.behavioral.strategy;

public class AddOperation implements Strategy {
    @Override
    public int doOperation(int x, int y) {
        return x + y;
    }
}
