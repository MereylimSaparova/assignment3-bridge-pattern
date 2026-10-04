public class RasterRenderer implements Renderer {

    @Override
    public void renderCircle(double radius) {
        System.out.println("Drawing a circle as pixels. Radius: " + radius);
    }

    @Override
    public void renderSquare(double side) {
        System.out.println("Drawing a square as pixels. Side: " + side);
    }
}