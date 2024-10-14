
interface Payment {
    void pay(double amount);
}

class CardPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Thanh toán bằng thẻ: " + amount + " VNĐ");
        // Logic xử lý thanh toán bằng thẻ
    }
}

class EWalletPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Thanh toán bằng ví điện tử: " + amount + " VNĐ");
        // Logic xử lý thanh toán bằng ví điện tử
    }
}

class CashPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Thanh toán bằng tiền mặt: " + amount + " VNĐ");
        // Logic xử lý thanh toán bằng tiền mặt
    }
}

class Store {
    private Payment paymentMethod;

    // Constructor nhận đối tượng Payment thông qua Dependency Injection
    public Store(Payment paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void processPayment(double amount) {
        paymentMethod.pay(amount);
    }

    // Phương thức để thay đổi phương thức thanh toán
    public void setPaymentMethod(Payment paymentMethod) {
        this.paymentMethod = paymentMethod;
    }
}

public class bai2 {
    public static void main(String[] args) {
        // Tạo đối tượng Store với phương thức thanh toán bằng thẻ
        Store store = new Store(new CardPayment());
        store.processPayment(100000); // Thanh toán bằng thẻ

        // Thay đổi phương thức thanh toán sang ví điện tử
        store.setPaymentMethod(new EWalletPayment());
        store.processPayment(50000); // Thanh toán bằng ví điện tử

        // Thay đổi phương thức thanh toán sang tiền mặt
        store.setPaymentMethod(new CashPayment());
        store.processPayment(30000); // Thanh toán bằng tiền mặt
    }
}