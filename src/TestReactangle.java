public class TestReactangle {
    public static void main(String[] args) {
        try {
            Rectangle rectangle=new Rectangle(0,10);
            System.out.println("Area is "+rectangle.calculateArea());
            System.out.println("Perimeter is "+rectangle.calculatePerimeter());

        } catch (IlegalSizeExeception e) {
            System.out.println("Error IllegalSizeException");
        }
    }
}
