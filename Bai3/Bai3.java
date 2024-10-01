class Common{
    public static boolean isPositive(double Number){
        return Number > 0;
    }
}


class Circle{
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    };


    public double getRadius() {
        return radius;
    }


    public void setRadius(double radius) {
        if(Common.isPositive(radius)){
            this.radius = radius;
        }
        else{
            System.out.println("need positive radius!");
        }
    }


    public double getPerimeter(){
        return 2*radius*Math.PI;
    }


    public double getArea(){
    return radius*radius*Math.PI;
    }
}


class Rectangle{
    private int width;
    private int height;

    public Rectangle(int width, int height){
        setWidth(width);
        setHeight(height);
    }


    public int getWidth(){
        return width;
    }


    public int getHeight(){
        return height;
    }


    public void setWidth(int width){
        if(Common.isPositive(width)){
            this.width = width;
        }
        else{
            System.out.println("need positive width!");
        }
    }


    public void setHeight(int height){
        if(Common.isPositive(height)){
            this.height = height;
        }
        else{
            System.out.println("need positive height!");
        }
    }


    public int getPerimeter(){
        return 2*(width + height);
    }

    public int getArea(){
        return width*height;
    }
}


public class Bai3{
    public static void main(String[] args) {

        Circle circle = new Circle(15.0);
        System.out.println("Circle:");
        System.out.println("Radius: " + circle.getRadius());
        System.out.println("Perimeter: " + circle.getPerimeter());
        System.out.println("Area: " + circle.getArea());


        Rectangle rectangle = new Rectangle(40, 6);
        System.out.println("Rectangle:");
        System.out.println("Width: " + rectangle.getWidth());
        System.out.println("Height: " + rectangle.getHeight());
        System.out.println("Perimeter: " + rectangle.getPerimeter());
        System.out.println("Area: " + rectangle.getArea());


        circle.setRadius(-13.0);
        rectangle.setWidth(-2);
        rectangle.setHeight(0);
    }
}