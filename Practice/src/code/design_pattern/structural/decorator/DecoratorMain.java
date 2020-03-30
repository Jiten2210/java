package code.design_pattern.structural.decorator;

public class DecoratorMain {
    public static void main(String[] args) {
        VegFood vf = new VegFood();
        System.out.println(vf.prepareFood());
        System.out.println(vf.foodPrice());

        Food f1 = new NonVegFood((Food) new VegFood());
        System.out.println(f1.prepareFood());
        System.out.println(f1.foodPrice());
    }
}
