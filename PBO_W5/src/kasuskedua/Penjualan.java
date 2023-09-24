package kasuskedua;
public class Penjualan {
    Produk[] product;

    Penjualan(int total_item)
    {
        product = new Produk[total_item];
    }

    public void addMenu(String nama_makanan, double harga, int quantity)
    {
        int id = Produk.getId();
        product[id] = new Produk();

        product[id].setNama_produk(nama_makanan);
        product[id].setHarga(harga);
        product[id].setQty(quantity);

        Produk.nextId();
    }

    public void orderMenu(int menuSelect, int quantity)
    {
        int temp;
        for (int i = 0; i < Produk.getId(); i++)
        {
            if(menuSelect == i)
            {
                temp = product[i].getQty() - quantity;
                System.out.println("Menu yang dipilih : " + product[i].getNama_produk());
                System.out.println("Total Harga : " + "Rp. "  + product[i].getHarga() * quantity);
                product[i].setQty(temp);
            }
        }
    }

    public void displayMenu()
    {
        for (int i = 0; i < Produk.getId(); i++)
        {
            if(!isQuantityEmpty(i))
            {
                System.out.println(i + ". " + product[i].getNama_produk() + " \tRp."  + product[i].getHarga() + " Stok : " + product[i].getQty());
            }
            else {
                System.out.println(i + ". " + product[i].getNama_produk() + " Habis!");
            }
        }
    }

    public boolean isQuantityEmpty(int id){
        if(product[id].getQty() == 0){
            return true;
        } else {
            return false;
        }
    }
}
