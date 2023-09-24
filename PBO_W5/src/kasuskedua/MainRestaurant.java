package kasuskedua;
import java.util.Scanner;

public class MainRestaurant {
    public static void main(String[] args) {
        int element = 20;
        int jumlahPesanan;
        int selectedMenu;
        char confirm;
        boolean loop = false;
        Scanner input = new Scanner(System.in);

        Penjualan restoran = new Penjualan(element);
        restoran.addMenu("Bala-bala", 1_500, 10);
        restoran.addMenu("Batagor", 7_000, 10);
        restoran.addMenu("Cireng", 3_000, 20);
        restoran.addMenu("Pempek", 12_000, 20);
        restoran.addMenu("Nasi Goreng", 17_000, 20);
        restoran.addMenu("Kopi Lawak!", 4_000, 15);
        restoran.addMenu("Lemon tea", 5_000, 10);
        restoran.addMenu("Aqua", 5_000, 20);
        restoran.addMenu("Kwetiau", 14_000, 20);
        restoran.addMenu("Teh Botol", 5_000, 20);

        do {
            System.out.println("============== Menu Resto ==============");
            restoran.displayMenu();
            System.out.print("\nPilihan Menu [no] : ");
            selectedMenu = input.nextInt();
            System.out.print("Jumlah Pesanan : ");
            jumlahPesanan = input.nextInt();
            restoran.orderMenu(selectedMenu, jumlahPesanan);
            System.out.print("Pesan Lagi [y]/[t] :");
            confirm = input.next().charAt(0);
            if (confirm == 't' || confirm == 'T')
            {
                loop = true;
            }
        }while(loop == false);
        System.exit(0);
    }
}

