package code.design_pattern.structural.facade;

public class FacadeMain {
    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();

        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawTriangle();
    }
}

