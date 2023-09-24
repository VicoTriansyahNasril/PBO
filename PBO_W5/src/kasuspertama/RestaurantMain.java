package kasuspertama;
import java.util.Scanner;
import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class RestaurantMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int banyakPesanan;

        // Inisialisasi logger
        Logger logger = Logger.getLogger("Restaurant");
        logger.setLevel(Level.INFO);
        ConsoleHandler consoleHandler = new ConsoleHandler();
        consoleHandler.setLevel(Level.INFO);
        logger.addHandler(consoleHandler);

        // Menghapus handler konsol dari logger kelas Restaurant
        Logger restaurantLogger = Logger.getLogger("Restaurant");
        restaurantLogger.setUseParentHandlers(false);
        
        logger.info("MENU:");
        Restaurant menu = new Restaurant(logger);
        menu.tambahMenuMakanan("Bala-Bala", 1_000, 20);
        menu.tambahMenuMakanan("Gehu", 1_000, 20);
        menu.tambahMenuMakanan("Tahu", 1_000, 0);
        menu.tambahMenuMakanan("Molen", 1_000, 20);

        logger.info("Pilihan menu : ");
        int selectedMenu;
        do {
            menu.tampilMenuMakan();
            logger.info("Pilihan menu (0-3) atau 4 untuk keluar:");
            selectedMenu = input.nextInt();

            if (selectedMenu >= 0 && selectedMenu < menu.getJumlahMenu()) {
                logger.info("Jumlah yang ingin dipesan: ");
                banyakPesanan = input.nextInt();
                menu.pesanMakanan(selectedMenu, banyakPesanan);
            } else if (selectedMenu != 4) {
                logger.warning("Pilihan tidak valid.");
            }
        } while (selectedMenu != 4);

        input.close();
    }
}