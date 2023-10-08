package Tugas3;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee[] staff = new Employee[3];
        staff[0] = new Employee("Antonio Rossi", 2000000, 1, 1, 1970);
        staff[1] = new Employee("Maria Bianchi", 2500000, 1, 1, 1970);
        staff[2] = new Employee("Isabel Vidal", 3000000, 1, 1, 1970);

        System.out.println("Before sorting:");
        for (Employee employee : staff) {
            employee.print();
        }

        Sortable.shell_sort(staff);

        System.out.println("\nAfter sorting:");
        for (Employee employee : staff) {
            employee.print();
        }
    }
}

