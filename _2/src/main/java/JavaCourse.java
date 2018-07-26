import java.io.*;
import company.Employee;

class JavaCourse {
    public static void main(String args[]){
        /* Создание двух объектов с помощью конструктора. */
        Employee One = new Employee("Первый человек");
        Employee Two = new Employee("Второй");

        // Вызов метода для каждого созданного объекта.
        One.empAge(26);
        One.empDesignation("Старший инженер-программист");
        One.empSalary(1000);
        One.print();

        Two.empAge(21);
        Two.empDesignation("Инженер-программист");
        Two.empSalary(1.0);
        Two.print();
    }
}
