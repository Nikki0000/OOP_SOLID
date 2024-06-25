package lsp1.shape;

public class Square implements Quadreliteral {

    private double side;

    public Square(int side) {
        this.side = side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return (int) Math.pow(getSide(), 2);
    }

    private double getSide() {
        return side;
    }
}
