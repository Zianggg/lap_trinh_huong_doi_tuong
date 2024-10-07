import java.util.Scanner;

class SinhVien {
    private String maSV;
    private String hoTen;
    private String lop;
    private String ngaySinh;
    private float diemGPA;

    // Hàm khởi tạo không tham số
    public SinhVien() {
        this.maSV = "B20DCCN001";  // Gán mã sinh viên mặc định
        this.hoTen = "";            // Gán họ tên mặc định là chuỗi rỗng
        this.lop = "";              // Gán lớp mặc định là chuỗi rỗng
        this.ngaySinh = "";         // Gán ngày sinh mặc định là chuỗi rỗng
        this.diemGPA = 0.0f;        // Gán điểm GPA mặc định là 0
    }

    // Hàm để đọc thông tin sinh viên từ bàn phím
    public void nhapThongTin() {
        Scanner scanner = new Scanner(System.in);
        
        hoTen = scanner.nextLine();

        lop = scanner.nextLine();

        ngaySinh = scanner.nextLine();

        diemGPA = scanner.nextFloat();
    }

    // Hàm để chuẩn hóa ngày sinh
    public String chuanHoaNgaySinh() {
        String[] parts = ngaySinh.split("/");
        if (parts.length == 3) {
            String ngay = String.format("%02d", Integer.parseInt(parts[0])); // Đảm bảo là 2 chữ số
            String thang = String.format("%02d", Integer.parseInt(parts[1])); // Đảm bảo là 2 chữ số
            String nam = parts[2]; // Giữ nguyên năm
            return ngay + "/" + thang + "/" + nam;
        }
        return ngaySinh; // Trả lại nguyên nếu không đúng định dạng
    }

    // Hàm để in thông tin sinh viên
    public void inThongTin() {
        System.out.println(maSV + " " + hoTen + " " + lop + " " + chuanHoaNgaySinh() + " " + String.format("%.2f", diemGPA));
    }
}

public class bai3 {
    public static void main(String[] args) {
        SinhVien sinhVien = new SinhVien(); // Tạo đối tượng sinh viên
        sinhVien.nhapThongTin();            // Nhập thông tin
        sinhVien.inThongTin();               // In thông tin
    }
}