public class Main {

    public static void main(String[] args) {
        Circle circle = new Circle(10);
        System.out.println(circle.getArea()); // 100.0

        Square square = new Square(10);
        System.out.println(square.getArea()); // 100.0

        System.out.println(MathUtils.add(1, 2)); // 3
        System.out.println(MathUtils.add(1.0, 2.0)); // 3.0
        System.out.println(MathUtils.add("Hello", "World")); // HelloWorld
    }

}