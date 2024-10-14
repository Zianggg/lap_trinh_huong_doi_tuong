import java.util.*;

public class B1 {
    
   
    public static String chuanHoaTen(String s) {
        s = s.trim().replaceAll("\\s+", " ");  
        s = s.toLowerCase();  
        return s;
    }
    
    public static String taoEmail(String hoTen, Map<String, Integer> demEmail) {
        String[] parts = hoTen.split(" ");  
        String ten = parts[parts.length - 1];  
        StringBuilder email = new StringBuilder(ten);
        
    
        for (int i = 0; i < parts.length - 1; i++) {
            email.append(parts[i].charAt(0)); 
        }
        
        String emailKey = email.toString();  
        
      
        if (demEmail.containsKey(emailKey)) {
            int soThuTu = demEmail.get(emailKey) + 1;
            email.append(soThuTu);  
            demEmail.put(emailKey, soThuTu); 
        } else {
            demEmail.put(emailKey, 1);  
        }
        
        email.append("@ptit.edu.vn"); 
        return email.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());  
        
        Map<String, Integer> demEmail = new HashMap<>();  
        
        for (int i = 0; i < N; i++) {
            String hoTen = sc.nextLine();  
            hoTen = chuanHoaTen(hoTen);  
            String email = taoEmail(hoTen, demEmail);  
            System.out.println(email);  
        }
        
        sc.close();
    }
}