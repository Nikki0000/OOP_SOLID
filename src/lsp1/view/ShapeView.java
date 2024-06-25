package lsp1.view;

import lsp1.shape.Quadreliteral;

public class ShapeView {
    private final Quadreliteral rectangle;

    public ShapeView(Quadreliteral rectangle) {
        this.rectangle = rectangle;
    }

    public void showArea() {
        System.out.print("Area of quadreliteral equal:");
        System.out.println(rectangle.getArea());
    }
}
