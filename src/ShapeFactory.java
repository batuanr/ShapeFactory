public class ShapeFactory {
    public Shape getShape(ShapeType type){
        switch (type){
            case circle:
                return new Circle();
            case rectangle:
                return new Rectangle();
            case square:
                return new Square();
            default:
                throw new IllegalArgumentException("sai rồi");
        }
    }
}
