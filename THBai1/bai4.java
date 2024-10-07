import java.util.Scanner;

class NhanVien {
    private String maNV;
    private String hoTen;
    private String gioiTinh;
    private String ngaySinh;
    private String diaChi;
    private String maSoThue;
    private String ngayKyHopDong;

    // Hàm khởi tạo không tham số
    public NhanVien() {
        this.maNV = "00001";  // Gán mã nhân viên mặc định
        this.hoTen = "";       // Gán họ tên mặc định là chuỗi rỗng
        this.gioiTinh = "";    // Gán giới tính mặc định là chuỗi rỗng
        this.ngaySinh = "";    // Gán ngày sinh mặc định là chuỗi rỗng
        this.diaChi = "";      // Gán địa chỉ mặc định là chuỗi rỗng
        this.maSoThue = "";    // Gán mã số thuế mặc định là chuỗi rỗng
        this.ngayKyHopDong = ""; // Gán ngày ký hợp đồng mặc định là chuỗi rỗng
    }

    // Hàm để đọc thông tin nhân viên từ bàn phím
    public void nhapThongTin() {
        Scanner scanner = new Scanner(System.in);
        

        hoTen = scanner.nextLine();


        gioiTinh = scanner.nextLine();


        ngaySinh = scanner.nextLine();


        diaChi = scanner.nextLine();


        maSoThue = scanner.nextLine();

        ngayKyHopDong = scanner.nextLine();
    }

    // Hàm để in thông tin nhân viên
    public void inThongTin() {
        System.out.println(maNV + " " + hoTen + " " + gioiTinh + " " + ngaySinh + " " + diaChi + " " + maSoThue + " " + ngayKyHopDong);
    }
}

public class bai4 {
    public static void main(String[] args) {
        NhanVien nhanVien = new NhanVien(); // Tạo đối tượng nhân viên
        nhanVien.nhapThongTin();            // Nhập thông tin
        nhanVien.inThongTin();               // In thông tin
    }
}
