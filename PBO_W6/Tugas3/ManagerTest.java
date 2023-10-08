package Tugas3;

public class ManagerTest {
    public static void main(String[] args) {
        Employee[] staff = new Employee[3];
        staff[0] = new Employee("Antonio Rossi", 2000000, 1, 1, 1970);
        staff[1] = new Manager("Maria Bianchi", 2500000, 1, 1, 1970);
        staff[2] = new Employee("Isabel Vidal", 3000000, 1, 1, 1970);
        for (Employee employee : staff) {
            employee.raiseSalary(5);
            employee.print();
        }
    }
}

