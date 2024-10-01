class Rectangle{
    private int width;
    private int height;

    public Rectangle(int width, int height){
        this.width = width;
        this.height = height;
    }

    public int getPerimeter(){
        return 2*(width + height);
    }

    public int getArea(){
        return width*height;
    }
}

public class Bai2{
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(12, 13) ;


        System.out.println("chu vi" + rectangle.getPerimeter());
        System.out.println("dien tich" + rectangle.getArea());
    }
}