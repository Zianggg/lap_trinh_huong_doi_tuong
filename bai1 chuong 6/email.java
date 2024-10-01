public class email extends notification {
    
    public email(String address,String message) {
        super(address, message);
    }
    
    @Override
    public void sent_noti(){
        System.out.println(String.format("Sending email to %s with message: %s",address, message));
    };
}
