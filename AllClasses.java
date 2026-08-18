public abstract class Shape {
    private String color;
    public Shape (String color){
        this.color=color;
    }
    public String getcolor() {
        return color;
    }


    public abstract double calculatearea();
}

public class Circle extends Shape {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double calculateArea(){
        return Math.PI*radius*radius;
    }
}

public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea(){
        return width = height;
    }
}

public class Practice {
    public static void main(String[] args) {

    }
}