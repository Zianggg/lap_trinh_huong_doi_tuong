import java.util.Scanner;

public class B2 {
    public static void tinhThuNhap(String maNV, String hoTen, int luongCB, int soNgayCong, String chucVu) {
        int luongThang = luongCB * soNgayCong;
        
        double thuong;
        if (soNgayCong >= 25) {
            thuong = 0.2 * luongThang;
        } else if (soNgayCong >= 22) {
            thuong = 0.1 * luongThang;
        } else {
            thuong = 0;
        }

        int phuCap;
        switch (chucVu) {
            case "GD":
                phuCap = 250000;
                break;
            case "PGD":
                phuCap = 200000;
                break;
            case "TP":
                phuCap = 180000;
                break;
            default:
                phuCap = 150000;
        }

        double thuNhap = luongThang + thuong + phuCap;

        System.out.printf("%s %s %d %.0f %d %.0f%n", maNV, hoTen, luongThang, thuong, phuCap, thuNhap);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String maNV = "NV01";

        String hoTen = sc.nextLine(); 
        int luongCB = sc.nextInt();   
        int soNgayCong = sc.nextInt();
        sc.nextLine();
        String chucVu = sc.nextLine();

        tinhThuNhap(maNV, hoTen, luongCB, soNgayCong, chucVu);

        sc.close();
    }
}