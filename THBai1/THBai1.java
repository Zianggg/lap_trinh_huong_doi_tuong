
import java.util.Scanner;


public class THBai1{
    public static String Check(String N){
        
        for (int i = 0; i < N.length() - 1; i++) {
            int num1 = N.charAt(i) - '0';
            int num2 = N.charAt(i + 1) - '0';

            if (Math.abs(num1 - num2) != 1) {
                return "NO";
            }
        }
        return "YES";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < t; i++) {
            String N = scanner.nextLine().trim();
            String result = Check(N);
            System.out.println(result);
        }
        
        scanner.close();
    }
}