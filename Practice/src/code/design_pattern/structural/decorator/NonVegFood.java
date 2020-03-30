package code.design_pattern.structural.decorator;

public class NonVegFood extends FoodDecorator{
    public NonVegFood(Food newFood) {
        super(newFood);
    }
    public String prepareFood(){
        return super.prepareFood() +" With Chicken Kebab ";
    }
    public double foodPrice()   {
        return super.foodPrice()+100.0;
    }
}