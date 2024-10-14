import java.util.*;

class MatHang implements Comparable<MatHang> {
    // Thuộc tính của mặt hàng
    private String maMatHang;
    private String tenMatHang;
    private String donViTinh;
    private int giaMua;
    private int giaBan;
    private int loiNhuan;

    // Constructor để khởi tạo mặt hàng
    public MatHang(int stt, String tenMatHang, String donViTinh, int giaMua, int giaBan) {
        this.maMatHang = String.format("MH%03d", stt);  // Tạo mã mặt hàng tự động
        this.tenMatHang = tenMatHang;
        this.donViTinh = donViTinh;
        this.giaMua = giaMua;
        this.giaBan = giaBan;
        this.loiNhuan = giaBan - giaMua;  // Tính lợi nhuận ngay khi khởi tạo
    }

    // Getter cho lợi nhuận (dùng cho việc sắp xếp)
    public int getLoiNhuan() {
        return loiNhuan;
    }

    // Getter cho mã mặt hàng (dùng khi lợi nhuận bằng nhau)
    public String getMaMatHang() {
        return maMatHang;
    }

    // Phương thức hiển thị thông tin mặt hàng
    @Override
    public String toString() {
        return String.format("%s %s %s %d %d %d", 
            maMatHang, tenMatHang, donViTinh, giaMua, giaBan, loiNhuan);
    }

    // Phương thức so sánh để sắp xếp theo lợi nhuận giảm dần, nếu bằng thì sắp xếp theo mã
    @Override
    public int compareTo(MatHang other) {
        if (this.loiNhuan != other.loiNhuan) {
            return Integer.compare(other.loiNhuan, this.loiNhuan);  // Sắp xếp giảm dần
        }
        return this.maMatHang.compareTo(other.maMatHang);  // Sắp xếp tăng dần theo mã
    }
}

public class QuanLyMatHang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = Integer.parseInt(sc.nextLine());  // Số mặt hàng

        List<MatHang> danhSachMatHang = new ArrayList<>();

        // Nhập thông tin cho từng mặt hàng
        for (int i = 1; i <= M; i++) {
            String tenMatHang = sc.nextLine();
            String donViTinh = sc.nextLine();
            int giaMua = Integer.parseInt(sc.nextLine());
            int giaBan = Integer.parseInt(sc.nextLine());

            // Tạo đối tượng MatHang và thêm vào danh sách
            danhSachMatHang.add(new MatHang(i, tenMatHang, donViTinh, giaMua, giaBan));
        }

        // Sắp xếp danh sách mặt hàng theo lợi nhuận giảm dần
        Collections.sort(danhSachMatHang);

        // Xuất thông tin danh sách mặt hàng sau khi sắp xếp
        for (MatHang mh : danhSachMatHang) {
            System.out.println(mh);
        }

        sc.close();
    }
}
