public abstract class notification {
    public String address;
    public String message;
        
    public notification(String address, String message){
        this.address = address;
        this.message = message;
    };


    abstract void sent_noti();
}
