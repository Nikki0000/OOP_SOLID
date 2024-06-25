package lsp1;

import lsp1.shape.Quadreliteral;
import lsp1.shape.Rectangle;
import lsp1.shape.Square;
import lsp1.view.ShapeView;

public class Main {
    public static void main(String[] args) {
        //Quadreliteral square = new Square(5);
        Quadreliteral rectangle = new Rectangle(2, 4);
        System.out.printf("In a quadreliteral area = ", rectangle.getArea());
        ShapeView view = new ShapeView(rectangle);
        view.showArea();
    }
}
