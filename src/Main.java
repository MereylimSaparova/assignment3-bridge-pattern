public class Main {

    public static void main(String[] args) {

        Renderer vectorRenderer = new VectorRenderer();
        Renderer rasterRenderer = new RasterRenderer();

        Shape circle = new Circle(10.0, vectorRenderer);
        Shape square = new Square(8.0, rasterRenderer);

        circle.draw();
        square.draw();

        System.out.println("--- Switching renderers at runtime ---");

        circle.setRenderer(rasterRenderer);
        square.setRenderer(vectorRenderer);

        circle.draw();
        square.draw();
    }
}