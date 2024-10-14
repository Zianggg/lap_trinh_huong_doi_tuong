import java.util.Scanner;

class NhanVien {
    private String maNV;
    private String hoTen;
    private String gioiTinh;
    private String ngaySinh;
    private String diaChi;
    private String maSoThue;
    private String ngayKyHopDong;

    public NhanVien() {
        this.maNV = "00001";  
        this.hoTen = "";       
        this.gioiTinh = "";    
        this.ngaySinh = "";    
        this.diaChi = "";      
        this.maSoThue = "";    
        this.ngayKyHopDong = ""; 
    }

    public void nhapThongTin() {
        Scanner scanner = new Scanner(System.in);
        

        hoTen = scanner.nextLine();


        gioiTinh = scanner.nextLine();


        ngaySinh = scanner.nextLine();


        diaChi = scanner.nextLine();


        maSoThue = scanner.nextLine();

        ngayKyHopDong = scanner.nextLine();
    }

    public void inThongTin() {
        System.out.println(maNV + " " + hoTen + " " + gioiTinh + " " + ngaySinh + " " + diaChi + " " + maSoThue + " " + ngayKyHopDong);
    }
}

public class bai4 {
    public static void main(String[] args) {
        NhanVien nhanVien = new NhanVien();
        nhanVien.nhapThongTin();            
        nhanVien.inThongTin();         
    }
}
