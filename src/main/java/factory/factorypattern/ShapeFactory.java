package factory.factorypattern;

public class ShapeFactory {

    public Shape getShape(String type)
    {
        switch (type)
        {
            case "circle":
                return new Circle();
            case "triangle":
                return new Triangle();
        }
        return null;
    }
}
