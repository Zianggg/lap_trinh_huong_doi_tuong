import java.util.Scanner;

public class B3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String maNgach = sc.nextLine();
        String hoTen = sc.nextLine();
        long luongCoBan = Long.parseLong(sc.nextLine());

        GiaoVien gv = new GiaoVien(maNgach, hoTen, luongCoBan);

        gv.hienThiThongTin();

        sc.close();
    }
}

class GiaoVien {
    private String maNgach;
    private String hoTen;
    private long luongCoBan;

    public GiaoVien(String maNgach, String hoTen, long luongCoBan) {
        this.maNgach = maNgach;
        this.hoTen = hoTen;
        this.luongCoBan = luongCoBan;
    }

    public String getChucVu() {
        return maNgach.substring(0, 2);
    }

    public int getBacLuong() {
        return Integer.parseInt(maNgach.substring(2));
    }

    public long tinhPhuCap() {
        switch (getChucVu()) {
            case "HT": return 2000000;
            case "HP": return 900000;
            case "GV": return 500000;
            default: return 0; 
        }
    }

    public long tinhThuNhap() {
        return luongCoBan * getBacLuong() + tinhPhuCap();
    }

    public void hienThiThongTin() {
        System.out.printf("%s %s %d %d %d\n", 
            maNgach, hoTen, getBacLuong(), tinhPhuCap(), tinhThuNhap());
    }
}

