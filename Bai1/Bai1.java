public class Bai1 {

  public static void main(String[] args) {
      int width = 0;
      int height = 0;

      try {
          width = Integer.parseInt(args[0]);
          height = Integer.parseInt(args[1]);


          if (width <= 0 || height <= 0) {
              System.out.println("Chiều rộng và chiều cao phải là số nguyên dương.");
              return;
          }

      } catch (NumberFormatException e) {
          System.out.println("Chiều rộng và chiều cao phải là các số nguyên hợp lệ.");
          return;
      }

      int perimeter = 2 * (width + height);
      int area = width * height;

      System.out.println("Chu vi của hình chữ nhật là: " + perimeter);
      System.out.println("Diện tích của hình chữ nhật là: " + area);
  }
}
