import java.util.*;

public class Soal4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double Gaji = 500000;
        double bonus;

        System.out.print("Laporan Penjualan : ");
        int item = input.nextInt();
        input.close();
        System.out.println("Jumlah item yang terjual : " + item );

        if(item >= 40)
        {
            bonus = 50000 * 0.25;
            System.out.println("Bonus yang diterima : " + (int)bonus);
            System.out.println("Total Gaji : " + (int)((bonus * item) + Gaji));
        }
        else if (item > 80 )
        {
            bonus = 50000 * 0.35;
            System.out.println("Bonus yang diterima : " + (int)bonus);
            System.out.println("Total Gaji : " + (int)((bonus * item) + Gaji));
        }
        else if (item < 15)
        {
            bonus = 50000 * 0.15;
            item = 15 - item;
            System.out.println("Pemotongan gaji : " + (int)bonus);
            System.out.println("Total Gaji : " + (int)(Gaji - (bonus * item)));
        }
        else {
            bonus = 50000 * 0.1 ;
            System.out.println("Total gaji : " + (int)((bonus * item) + Gaji));
        }
    }
}
