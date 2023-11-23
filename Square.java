public class Square extends Circle {
    public Square(double radius) {
        super(radius);
    }

    @Override
    public double getArea() {
        return Math.pow(getSide(), 2);
    }
int getSide(){
        return 10;
}
}