package Kasus1;

public class Hourly extends Employee {
    private int hoursWorked;
    private double totalSales;
    private double commissionRate; // Menambahkan atribut commissionRate


    public Hourly(String eName, String eAddress, String ePhone,
                  String socSecNumber, double rate, double commissionRate) {
        super(eName, eAddress, ePhone, socSecNumber, rate);
        hoursWorked = 0;
        totalSales = 0;
        this.commissionRate = commissionRate; // Menginisialisasi commissionRate
    }


    public void addHours(int moreHours) {
        hoursWorked += moreHours;
    }

    // metode untuk menambahkan total penjualan
    public void addSales(double sales) {
        totalSales += sales;
    }

    public double pay() {
        double payment = payRate * hoursWorked + (commissionRate * totalSales); // Menghitung komisinya

        hoursWorked = 0;
        totalSales = 0; // Reset total penjualan

        return payment;
    }

    public String toString() {
        String result = super.toString();

        result += "\nCurrent hours: " + hoursWorked;
        result += "\nTotal Sales: " + totalSales;

        return result;
    }
}
