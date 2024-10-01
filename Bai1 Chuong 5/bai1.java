
class Employee{
  public String name;
  public int age;
  public double salary;


  public Employee(String name, int age){
    this.name = name;
    this.age = age;
    this.salary = 1000;
  }


  public void calculate_salary(){

  }


  public void show_info(){
    System.out.println("Name:" + name + "\nTuoi: " + age + "\nLuong: " + salary);
  }
}


class OfficeEmployee extends Employee{
  final int Days_Worked;
  private final double DAILY_WAGE = 100;


  public OfficeEmployee(String name, int age, int Days_Worked) {
    super(name, age);
    this.Days_Worked = Days_Worked;
  }


  @Override
  public void calculate_salary(){
    this.salary = Days_Worked*DAILY_WAGE;
  }
}


class TechnicalEmployee extends Employee{
  final int Hours_Worked;
  final double Hours_WAGE;

  public TechnicalEmployee(String name, int age, int Hours_Worked, double Hours_WAGE){
    super(name, age);
    this.Hours_Worked = Hours_Worked;
    this.Hours_WAGE = Hours_WAGE;
  }


  @Override
  public void calculate_salary(){
    this.salary = Hours_Worked*Hours_WAGE;
  }
}


public class bai1 {
  public static void main(String[] args) {
    OfficeEmployee officeEmp = new OfficeEmployee("Nguyen Van A", 22,30);
    officeEmp.calculate_salary();
    officeEmp.show_info();

    TechnicalEmployee techEmp = new TechnicalEmployee("Tran Van B", 28, 160, 30);
    techEmp.calculate_salary();
    techEmp.show_info();

  }
}


