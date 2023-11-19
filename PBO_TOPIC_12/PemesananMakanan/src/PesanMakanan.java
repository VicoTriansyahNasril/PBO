import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PesanMakanan extends JFrame {
    private JPanel PemesananMakanan;
    private JTextField Nama;
    private JTextField Alamat;
    private JTextField Nomor;
    private JCheckBox steakCheckBox;
    private JCheckBox sphagetiCheckBox;
    private JCheckBox pizzaCheckBox;
    private JTextField TotalHarga = new JTextField("0");
    private JButton Tambah;
    private JTextPane TotalBayar;
    private JTextPane DataSeluruhPenjualan;
    private JScrollPane DataPenjualan;

    private int totalBayar = 0; // Variabel untuk menyimpan total bayar

    public PesanMakanan() {
        this.setContentPane(PemesananMakanan);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.pack();

        // Initialize the DataPenjualan JScrollPane
        DataPenjualan = new JScrollPane();

        // Initialize TotalHarga
        TotalHarga = new JTextField("0");

        steakCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int harga = 20000;
                updateTotalHarga(harga);
            }
        });

        sphagetiCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int harga = 25000;
                updateTotalHarga(harga);
            }
        });

        pizzaCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int harga = 35000;
                updateTotalHarga(harga);
            }
        });

        Tambah.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nama = Nama.getText();
                String alamat = Alamat.getText();
                String nomor = Nomor.getText();
                String menu = "";

                if (steakCheckBox.isSelected()) {
                    menu += "Steak, ";
                }
                if (sphagetiCheckBox.isSelected()) {
                    menu += "Sphageti, ";
                }
                if (pizzaCheckBox.isSelected()) {
                    menu += "Pizza, ";
                }

                // Update the JTextPane (TotalBayar) with the totalBayar
                TotalBayar.setText("Total Bayar: " + totalBayar);

                // Append data to the JTextPane (DataSeluruhPenjualan)
                DataSeluruhPenjualan.setText(DataSeluruhPenjualan.getText() +
                        "Nama: " + nama + "\n" +
                        "Alamat: " + alamat + "\n" +
                        "Nomor: " + nomor + "\n" +
                        "Menu: " + menu + "\n" +
                        "Total Harga: " + TotalHarga.getText() + "\n\n"
                );

                // Clear the JTextFields
                Nama.setText("");
                Alamat.setText("");
                Nomor.setText("");

                // Clear the checkboxes
                steakCheckBox.setSelected(false);
                sphagetiCheckBox.setSelected(false);
                pizzaCheckBox.setSelected(false);


                TotalHarga.setText("0");
            }
        });
    }

    private void updateTotalHarga(int harga) {
        int totalHarga = Integer.parseInt(TotalHarga.getText());
        totalBayar += harga;
        TotalHarga.setText(String.valueOf(totalHarga + harga));
    }

    public static void main(String[] args) {
        PesanMakanan pesanMakanan = new PesanMakanan();
        pesanMakanan.setVisible(true);
    }
}
