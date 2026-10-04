public class VectorRenderer implements Renderer {

    @Override
    public void renderCircle(double radius) {
        System.out.println("Drawing a circle as vectors. Radius: " + radius);
    }

    @Override
    public void renderSquare(double side) {
        System.out.println("Drawing a square as vectors. Side: " + side);
    }
}