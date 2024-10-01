public class bai1 {
    public static void main(String[] args) {
        notification email = new email("nguyengiang01122005@gmail.com", "message for email sent");
        notification sms = new sms("0764623705", "message for sms sent");

        email.sent_noti();
        sms.sent_noti();
    }
}
