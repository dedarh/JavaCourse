package company;
public class Employee{
    int age;
    double salary;
    String name;
    String designation;

    public Employee(String name){
        this.name = name;
    }

    public void empAge(int empAge){
        this.age = empAge;
    }

    public void empDesignation(String empDesig){
        this.designation = empDesig;
    }

    public void empSalary(double empSalary){
        this.salary = empSalary;
    }

    private void printAll(){
        System.out.println("Имя:"+ name );
        System.out.println("Возраст:" + age );
        System.out.println("Наименование:" + designation );
        if(salary < 30){
            System.out.println("Заработная плата:" + salary);
        }else{
            System.out.println("Заработная плата: ??");
        }
    }
    public void printName(){
        System.out.println("Имя:"+ name );
    }
    public void printAge(){
        System.out.println("Возраст:" + age );
    }

    public void printDesignation(){
        System.out.println("Наименование:" + designation );
    }
    public void print(){
        printAll();
    }

}