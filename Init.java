package Shape;

public class Init {
    public static void main(String[] args) {
        Square square = new Square();
        System.out.println(square);

        square = new Square(2.3);
        System.out.println(square);

        square = new Square("red",true ,1.5);
        System.out.println(square);
    }
}
