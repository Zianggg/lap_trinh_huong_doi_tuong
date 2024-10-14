import java.util.*;

public class B1 {
    
    // Hàm chuẩn hóa tên (loại bỏ khoảng trắng thừa và chuyển về chữ thường)
    public static String chuanHoaTen(String s) {
        s = s.trim().replaceAll("\\s+", " ");  // Xóa khoảng trắng thừa giữa các từ
        s = s.toLowerCase();  // Chuyển tất cả về chữ thường
        return s;
    }
    
    // Hàm tạo email từ họ tên đã chuẩn hóa
    public static String taoEmail(String hoTen, Map<String, Integer> demEmail) {
        String[] parts = hoTen.split(" ");  // Tách họ tên thành các từ
        String ten = parts[parts.length - 1];  // Tên là từ cuối cùng
        StringBuilder email = new StringBuilder(ten);  // Bắt đầu bằng tên
        
        // Ghép các chữ cái đầu của họ và tên đệm
        for (int i = 0; i < parts.length - 1; i++) {
            email.append(parts[i].charAt(0));  // Lấy chữ cái đầu tiên của họ và tên đệm
        }
        
        String emailKey = email.toString();  // Email ban đầu (chưa có đuôi số nếu cần)
        
        // Xử lý trùng email
        if (demEmail.containsKey(emailKey)) {
            int soThuTu = demEmail.get(emailKey) + 1;
            email.append(soThuTu);  // Thêm số thứ tự vào cuối
            demEmail.put(emailKey, soThuTu);  // Cập nhật số thứ tự
        } else {
            demEmail.put(emailKey, 1);  // Email này lần đầu xuất hiện
        }
        
        email.append("@ptit.edu.vn");  // Thêm đuôi email
        return email.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());  // Đọc số lượng họ tên
        
        Map<String, Integer> demEmail = new HashMap<>();  // Để đếm số email trùng
        
        for (int i = 0; i < N; i++) {
            String hoTen = sc.nextLine();  // Đọc họ tên
            hoTen = chuanHoaTen(hoTen);  // Chuẩn hóa họ tên
            String email = taoEmail(hoTen, demEmail);  // Tạo email
            System.out.println(email);  // In email ra
        }
        
        sc.close();
    }
}