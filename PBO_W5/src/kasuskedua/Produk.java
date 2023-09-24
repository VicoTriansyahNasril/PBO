package kasuskedua;
public class Produk {
    private String nama_product;
    private double harga;
    private int qty;
    private static int id = 0;

    public String getNama_produk() {
        return nama_product;
    }
    public void setNama_produk(String nama_product) {
        this.nama_product = nama_product;
    }


    public double getHarga() {
        return harga;
    }
    public void setHarga(double harga) {
        this.harga = harga;
    }


    public int getQty() {
        return qty;
    }
    public void setQty(int qty) {
        this.qty = qty;
    }


    public static void nextId() {
        id += 1;
    }

    public static int getId()
    {
        return id;
    }

}
