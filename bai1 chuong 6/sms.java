public class sms extends notification {

    public sms(String address, String message) {
        super(address, message);
    }

    @Override
    public void sent_noti(){
        System.out.println(String.format("sending message: %s to %s", message, address));
    };
}
