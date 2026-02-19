public class ShapeFactory {
    public static Shape createShape(String type, double... dimensions) {
        switch(type.toLowerCase()) {
            case "circle":
                return new Circle(dimensions[0]);
            case "square":
                return new Square(dimensions[0]);
            case "triangle":
                return new Triangle(dimensions[0], dimensions[1]);
            default:
                throw new IllegalArgumentException("Unknown shape type: " + type);
        }
    }
}