


interface EmailSender{
    void Send_Email();
}


interface Coder{
    void Write_Code();
}


interface SellPerson{
    void Sell_Product();
}


class OfficeEmployee implements EmailSender{
    public String name;
    public int age;


    public OfficeEmployee(String name, int age){
        this.name = name;
        this.age = age;
    }


    @Override
    public void Send_Email() {
        System.out.println(String.format("%s is sending email . . . . ", name));
    }


    public void Show_info(){
        System.out.println("Ten: " + name + "\nTuoi: " + age);
    }
}


class TechnicalEmployee implements Coder{
    public String name;
    public int age;


    public TechnicalEmployee(String name, int age){
        this.name = name;
        this.age = age;
    }


    @Override
    public void Write_Code(){
        System.out.println(String.format("%s is writing code . . . . ", name));
    }


    public void Show_info(){
        System.out.println("Ten: " + name + "\nTuoi: " + age);
    }
}


class SalesEmployee implements SellPerson{
    public String name;
    public int age;


    public SalesEmployee(String name, int age){
        this.name = name;
        this.age = age;
    }


    @Override
    public void Sell_Product(){
        System.out.println(String.format("%s is trying to sell . . . . ", name));
    }


    public void Show_info(){
        System.out.println("Ten: " + name + "\nTuoi: " + age);
    }
}




public class bai2 {
    public static void main(String[] args) {
        OfficeEmployee officeEmployee = new OfficeEmployee("Nguyen Van A", 23);
        officeEmployee.Send_Email();
        officeEmployee.Show_info();


        TechnicalEmployee technicalEmployee = new TechnicalEmployee("Nguyen Van B", 21);
        technicalEmployee.Write_Code();
        technicalEmployee.Show_info();


        SalesEmployee salesEmployee = new SalesEmployee("Nguyen Van C", 25);
        salesEmployee.Sell_Product();
        salesEmployee.Show_info();
    }
}
