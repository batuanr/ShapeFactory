public class Main {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape1 = shapeFactory.getShape(ShapeType.circle);
        shape1.draw();
        Shape shape2 = shapeFactory.getShape(ShapeType.rectangle);
        shape2.draw();
        Shape shape3 = shapeFactory.getShape(ShapeType.square);
        shape3.draw();
    }
}
