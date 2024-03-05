package person;

public class Employee extends person{
    String name = "Saya";
    int age = 100;
    float salary = 4000f;
   
    public void showInfo(){
        System.out.println("Name :"+this.name);
        System.out.println("Age :"+this.age);
        System.out.println("Salary : $"+salary);
        
        System.out.println("Name :"+super.name);
        System.out.println("Age :"+super.age);
        System.out.println("Salary : $"+salary);
    }
}
