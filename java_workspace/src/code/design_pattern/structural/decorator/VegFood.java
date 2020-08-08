package code.design_pattern.structural.decorator;

public class VegFood implements Food {
    public String prepareFood() {
        return "Veg Food";
    }

    public double foodPrice() {
        return 40.0;
    }
}
