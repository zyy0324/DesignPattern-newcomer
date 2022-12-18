package factory.factorypattern;

public class FactoryPatternDemo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape sp = shapeFactory.getShape("circle");
        sp.draw();

        Shape sp2 = shapeFactory.getShape("triangle");
        sp2.draw();
    }
}
