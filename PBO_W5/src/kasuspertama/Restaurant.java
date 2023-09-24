package kasuspertama;
import java.util.logging.Logger;
public class Restaurant {
    private final String[] namaMakanan;
    private final double[] hargaMakanan;
    private final int[] stok;
    private static byte id = 0;
    private final Logger logger;

    public Restaurant(Logger logger) {
        this.logger = logger;
        namaMakanan = new String[10];
        hargaMakanan = new double[10];
        stok = new int[10];
    }

    public void tambahMenuMakanan(String nama, double harga, int stok) {
        this.namaMakanan[id] = nama;
        this.hargaMakanan[id] = harga;
        this.stok[id] = stok;
        nextId();
    }

    private static void nextId() {
        id++;
    }

    public int getJumlahMenu() {
        return id;
    }

    public void tampilMenuMakan() {
        for (int i = 0; i < id; i++) {
            if (stok[i] > 0) {
                logger.info(String.format("%d. %s[%d]\tRp. %.2f", i, namaMakanan[i], stok[i], hargaMakanan[i]));
            } else {
                logger.info(String.format("%d. %s[%d] Habis!", i, namaMakanan[i], stok[i]));
            }
        }
    }


    public void pesanMakanan(int no, int banyak) {
        int temp;
        for (int i = 0; i < id; i++) {
            if (no == i) {
                if (stok[i] != 0 && stok[i] >= banyak) {
                    temp = stok[i] - banyak;
                    this.stok[i] = temp;
                    logger.info(String.format("Jenis Makanan: %s%nTotal Harga: Rp. %.2f", namaMakanan[i], hargaMakanan[i] * banyak));
                } else {
                    logger.warning("Pesanan gagal dibuat!");
                }
            }
        }
    }
}
