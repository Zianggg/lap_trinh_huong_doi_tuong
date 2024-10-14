import java.util.Scanner;

class SinhVien {
    private String maSV;
    private String hoTen;
    private String lop;
    private String ngaySinh;
    private float diemGPA;

    public SinhVien() {
        this.maSV = "B20DCCN001";  
        this.hoTen = "";           
        this.lop = "";              
        this.ngaySinh = "";       
        this.diemGPA = 0.0f;       
    }

    public void nhapThongTin() {
        Scanner scanner = new Scanner(System.in);
        
        hoTen = scanner.nextLine();

        lop = scanner.nextLine();

        ngaySinh = scanner.nextLine();

        diemGPA = scanner.nextFloat();
    }

    public String chuanHoaNgaySinh() {
        String[] parts = ngaySinh.split("/");
        if (parts.length == 3) {
            String ngay = String.format("%02d", Integer.parseInt(parts[0])); 
            String thang = String.format("%02d", Integer.parseInt(parts[1])); 
            String nam = parts[2]; 
            return ngay + "/" + thang + "/" + nam;
        }
        return ngaySinh; 
    }

    public void inThongTin() {
        System.out.println(maSV + " " + hoTen + " " + lop + " " + chuanHoaNgaySinh() + " " + String.format("%.2f", diemGPA));
    }
}

public class bai3 {
    public static void main(String[] args) {
        SinhVien sinhVien = new SinhVien(); 
        sinhVien.nhapThongTin();            
        sinhVien.inThongTin();              
    }
}