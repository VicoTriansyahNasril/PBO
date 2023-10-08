package Tugas3;

class Employee extends Sortable {
    private String name;
    private double salary;
    private int hireYear;

    public Employee(String n, double s, int d, int m, int y) {
        name = n;
        salary = s;
        hireYear = y;
    }

    @Override
    public int compare(Sortable b) {
        Employee eb = (Employee) b;
        if (salary < eb.salary) return -1;
        if (salary > eb.salary) return 1;
        return 0;
    }

    @Override
    public void raiseSalary(int i) {
        salary += i;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public int getHireYear() {
        return hireYear;
    }

    public void print() {
        System.out.println("Employee: " + name + ", Salary: $" + salary + ", Hire Year: " + hireYear);
    }
}