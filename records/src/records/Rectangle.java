package records;

public record Rectangle(double width, double height) {
    public double area(){
        return width * height;
    }

    public static Rectangle square(double side){
        return new Rectangle(side, side);
    }
    public static final double PI = 3.1416;
}
