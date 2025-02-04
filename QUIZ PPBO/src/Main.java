import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Main {
    private static ManajemenMahasiswa manajemenMahasiswa = new ManajemenMahasiswa();
    private static DefaultTableModel tableModel;
    private static JTable tableDaftarMahasiswa;
    private static JScrollPane scrollPane;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Sistem Manajemen Data Mahasiswa");
        frame.setSize(600, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        // Panel untuk form input
        JPanel panelInput = new JPanel(new GridLayout(6, 2));
        panelInput.add(new JLabel("ID:"));
        JTextField textFieldId = new JTextField();
        panelInput.add(textFieldId);
        panelInput.add(new JLabel("Nama:"));
        JTextField textFieldNama = new JTextField();
        panelInput.add(textFieldNama);
        panelInput.add(new JLabel("Jurusan:"));
        JTextField textFieldJurusan = new JTextField();
        panelInput.add(textFieldJurusan);
        panelInput.add(new JLabel("Tahun Masuk:"));
        JTextField textFieldTahunMasuk = new JTextField();
        panelInput.add(textFieldTahunMasuk);

        // Tombol tambah mahasiswa
        JButton buttonTambah = new JButton("Tambah Mahasiswa");
        buttonTambah.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int id = Integer.parseInt(textFieldId.getText());
                String nama = textFieldNama.getText();
                String jurusan = textFieldJurusan.getText();
                int tahunMasuk = Integer.parseInt(textFieldTahunMasuk.getText());
                Mahasiswa mahasiswa = new Mahasiswa(id, nama, jurusan, tahunMasuk);
                manajemenMahasiswa.tambahMahasiswa(mahasiswa);
                JOptionPane.showMessageDialog(frame, "Mahasiswa berhasil ditambahkan!");
                textFieldId.setText("");
                textFieldNama.setText("");
                textFieldJurusan.setText("");
                textFieldTahunMasuk.setText("");
            }
        });
        panelInput.add(buttonTambah);

        // Tombol hapus mahasiswa
        JButton buttonHapus = new JButton("Hapus Mahasiswa");
        buttonHapus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int id = Integer.parseInt(textFieldId.getText());
                manajemenMahasiswa.hapusMahasiswa(id);
                JOptionPane.showMessageDialog(frame, "Mahasiswa berhasil dihapus!");
                textFieldId.setText("");
                textFieldNama.setText("");
                textFieldJurusan.setText("");
                textFieldTahunMasuk.setText("");
                updateTable();
            }
        });
        panelInput.add(buttonHapus);

        // Tombol cari mahasiswa
        JButton buttonCari = new JButton("Cari Mahasiswa");
        buttonCari.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String input = JOptionPane.showInputDialog(frame, "Masukkan ID, Nama, atau Jurusan:");
                ArrayList<Mahasiswa> hasilPencarian = manajemenMahasiswa.cariMahasiswa(input);
                if (hasilPencarian.isEmpty()) {
                    JOptionPane.showMessageDialog(frame, "Mahasiswa tidak ditemukan.");
                } else {
                    for (Mahasiswa mahasiswa : hasilPencarian) {
                        JPanel panelHasil = new JPanel(new GridLayout(5, 2));
                        panelHasil.add(new JLabel("ID:"));
                        JTextField textFieldIdHasil = new JTextField(String.valueOf(mahasiswa.getId()));
                        textFieldIdHasil.setEditable(false);
                        panelHasil.add(textFieldIdHasil);
                        panelHasil.add(new JLabel("Nama:"));
                        JTextField textFieldNamaHasil = new JTextField(mahasiswa.getNama());
                        panelHasil.add(textFieldNamaHasil);
                        panelHasil.add(new JLabel("Jurusan:"));
                        JTextField textFieldJurusanHasil = new JTextField(mahasiswa.getJurusan());
                        panelHasil.add(textFieldJurusanHasil);
                        panelHasil.add(new JLabel("Tahun Masuk:"));
                        JTextField textFieldTahunMasukHasil = new JTextField(String.valueOf(mahasiswa.getTahunMasuk()));
                        panelHasil.add(textFieldTahunMasukHasil);

                        int option = JOptionPane.showConfirmDialog(frame, panelHasil, "Ubah atau Hapus Mahasiswa", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
                        if (option == JOptionPane.OK_OPTION) {
                            int id = Integer.parseInt(textFieldIdHasil.getText());
                            String nama = textFieldNamaHasil.getText();
                            String jurusan = textFieldJurusanHasil.getText();
                            int tahunMasuk = Integer.parseInt(textFieldTahunMasukHasil.getText());
                            manajemenMahasiswa.perbaruiMahasiswa(id, nama, jurusan, tahunMasuk);
                            JOptionPane.showMessageDialog(frame, "Mahasiswa berhasil diperbarui!");
                        } else if (option == JOptionPane.CANCEL_OPTION) {
                            int id = Integer.parseInt(textFieldIdHasil.getText());
                            manajemenMahasiswa.hapusMahasiswa(id);
                            JOptionPane.showMessageDialog(frame, "Mahasiswa berhasil dihapus!");
                        }
                        updateTable();
                    }
                }
            }
        });
        panelInput.add(buttonCari);

        frame.add(panelInput, BorderLayout.NORTH);

        // Model dan tabel untuk tampilan daftar mahasiswa
        String[] columnNames = {"ID", "Nama", "Jurusan", "Tahun Masuk"};
        tableModel = new DefaultTableModel(columnNames, 0);
        tableDaftarMahasiswa = new JTable(tableModel);
        scrollPane = new JScrollPane(tableDaftarMahasiswa);
        frame.add(scrollPane, BorderLayout.CENTER);
        scrollPane.setVisible(false); // Sembunyikan tabel awalnya

        // Tombol tampilkan semua mahasiswa
        JButton buttonTampilkan = new JButton("Tampilkan Semua Mahasiswa");
        buttonTampilkan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateTable();
                scrollPane.setVisible(true); // Tampilkan tabel saat tombol ditekan
                frame.revalidate();
                frame.repaint();
            }
        });
        frame.add(buttonTampilkan, BorderLayout.SOUTH);

        frame.setVisible(true);
    }

    private static void updateTable() {
        tableModel.setRowCount(0);  // Clear existing rows
        ArrayList<Mahasiswa> daftarMahasiswa = manajemenMahasiswa.getDaftarMahasiswa();
        for (Mahasiswa mahasiswa : daftarMahasiswa) {
            Object[] row = {
                    mahasiswa.getId(),
                    mahasiswa.getNama(),
                    mahasiswa.getJurusan(),
                    mahasiswa.getTahunMasuk()
            };
            tableModel.addRow(row);
        }
    }
}
