public class EmphasisDecorator {
    private Shape shape;

    public EmphasisDecorator(Shape shape) {
        this.shape = shape;
    }

    public void draw() {
        System.out.println("***"); // Pre-decoration
        shape.draw();
        System.out.println("***"); // Post-decoration
    }
}