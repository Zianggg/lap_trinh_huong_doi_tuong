import java.util.Scanner;
class Point {
    private double x; // Tọa độ x
    private double y; // Tọa độ y

    // Tạo đối tượng mặc định
    public Point() {
        this.x = 0;
        this.y = 0;
    }

    // Tạo đối tượng có tọa độ trong tham số
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Tạo đối tượng là bản sao của đối tượng trong tham số
    public Point(Point p) {
        this.x = p.x;
        this.y = p.y;
    }

    // Trả về tọa độ X
    public double getX() {
        return x;
    }

    // Trả về tọa độ Y
    public double getY() {
        return y;
    }

    // Trả về khoảng cách từ điểm này tới điểm thứ hai
    public double distance(Point secondPoint) {
        return Math.sqrt(Math.pow(secondPoint.x - this.x, 2) + Math.pow(secondPoint.y - this.y, 2));
    }

    // Trả về khoảng cách giữa hai điểm
    public static double distance(Point p1, Point p2) {
        return Math.sqrt(Math.pow(p2.x - p1.x, 2) + Math.pow(p2.y - p1.y, 2));
    }

    // Chuyển một đối tượng về dạng xâu ký tự, ghi đè phương thức toString()
    @Override
    public String toString() {
        return "Point(" + x + ", " + y + ")";
    }
}

public class bai5{
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            
            int testCases = scanner.nextInt(); // Nhập số bộ test
            for (int t = 0; t < testCases; t++) {
                // Nhập tọa độ của 3 điểm
                double x1 = scanner.nextDouble();
                double y1 = scanner.nextDouble();
                double x2 = scanner.nextDouble();
                double y2 = scanner.nextDouble();
                double x3 = scanner.nextDouble();
                double y3 = scanner.nextDouble();
                
                // Tạo các đối tượng Point
                Point p1 = new Point(x1, y1);
                Point p2 = new Point(x2, y2);
                Point p3 = new Point(x3, y3);
                
                // Tính chu vi
                double a = Point.distance(p1, p2);
                double b = Point.distance(p2, p3);
                double c = Point.distance(p3, p1);
                
                // Kiểm tra xem 3 điểm có tạo thành tam giác hay không
                if (a + b <= c || a + c <= b || b + c <= a) {
                    System.out.println("INVALID");
                } else {
                    double perimeter = a + b + c;
                    System.out.printf("%.3f\n", perimeter); // In chu vi với 3 chữ số thập phân
                }
            }
            
            scanner.close();
        }
    }
