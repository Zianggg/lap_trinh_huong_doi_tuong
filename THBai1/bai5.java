import java.util.Scanner;
class Point {
    private double x; 
    private double y;

    public Point() {
        this.x = 0;
        this.y = 0;
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point(Point p) {
        this.x = p.x;
        this.y = p.y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double distance(Point secondPoint) {
        return Math.sqrt(Math.pow(secondPoint.x - this.x, 2) + Math.pow(secondPoint.y - this.y, 2));
    }

    public static double distance(Point p1, Point p2) {
        return Math.sqrt(Math.pow(p2.x - p1.x, 2) + Math.pow(p2.y - p1.y, 2));
    }

    @Override
    public String toString() {
        return "Point(" + x + ", " + y + ")";
    }
}

public class bai5{
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            
            int testCases = scanner.nextInt(); 
            for (int t = 0; t < testCases; t++) {
                double x1 = scanner.nextDouble();
                double y1 = scanner.nextDouble();
                double x2 = scanner.nextDouble();
                double y2 = scanner.nextDouble();
                double x3 = scanner.nextDouble();
                double y3 = scanner.nextDouble();
                
                Point p1 = new Point(x1, y1);
                Point p2 = new Point(x2, y2);
                Point p3 = new Point(x3, y3);
                
                double a = Point.distance(p1, p2);
                double b = Point.distance(p2, p3);
                double c = Point.distance(p3, p1);
                
                if (a + b <= c || a + c <= b || b + c <= a) {
                    System.out.println("INVALID");
                } else {
                    double perimeter = a + b + c;
                    System.out.printf("%.3f\n", perimeter); 
                }
            }
            
            scanner.close();
        }
    }
