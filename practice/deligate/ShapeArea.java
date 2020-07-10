/**
 * Shape
 */
public class ShapeArea {
  private IShapeArea shape;

  public ShapeArea(IShapeArea shape) {
    this.shape = shape;
  }
  
  public double getArea() {
    return this.shape.calculateArea();
  }

  public static void main(String[] args) {
    ShapeArea s1 = new ShapeArea(new RectangleArea(10.0, 5.0));

    System.out.println(s1.getArea());
  }
}