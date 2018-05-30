/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package penjualan;

import java.awt.event.KeyEvent;
import java.text.NumberFormat;
import javax.swing.table.TableColumn;
import menu.belanja;
import menu.beranda;
import penyimpanan.Frame_penyimpanan_barang;

/**
 *
 * @author 1First
 */
public class UIPenjualan extends javax.swing.JFrame {
    ModelBarang barang;
    ModelPenjualan penjualan=new ModelPenjualan();
    
    /**
     * Creates new form UIPenjualan
     */
    public UIPenjualan() {
        initComponents();
        fillComboBarang();
        tblBarang.setModel(penjualan.getTabel());
        
    }
    
    private void fillComboBarang(){
        // Kategori A
        
        ModelBarang barang43 = new ModelBarang("Akar Keju", "Bungkus", 38000);
        ModelBarang barang44 = new ModelBarang("Akar Asin", "Bungkus", 30000);
        ModelBarang barang45 = new ModelBarang("Akar Manis", "Bungkus", 43000);
        ModelBarang barang107 = new ModelBarang("Amora", "Bungkus", 94000);
        
        // Kategori B
        
        ModelBarang barang82 = new ModelBarang("Bagelan", "Dus", 73000);
        ModelBarang barang83 = new ModelBarang("Bagelan", "Kaleng", 0);
        ModelBarang barang84 = new ModelBarang("Bintang Keju", "Bungkus", 28000);
        ModelBarang barang26 = new ModelBarang("Boled", "Bungkus", 30000);
        ModelBarang barang62 = new ModelBarang("BLS Sinar", "Bungkus", 42000);
        ModelBarang barang63 = new ModelBarang("BLS Gem", "Bungkus", 0);
        ModelBarang barang64 = new ModelBarang("BLS Wijen", "Bungkus", 0);
        ModelBarang barang71 = new ModelBarang("Bolu PDM", "Bungkus", 30000);
        ModelBarang barang72 = new ModelBarang("Bolu Delia", "Bungkus", 36000);
        ModelBarang barang73 = new ModelBarang("Bolu Kelinci", "Bungkus", 95000);
        ModelBarang barang74 = new ModelBarang("Bolu Kelinci", "Kaleng", 45000);
        ModelBarang barang75 = new ModelBarang("Bolu Semir", "Bungkus", 32500);
        ModelBarang barang22 = new ModelBarang("Basreng Bulet", "Bungkus", 47000);
        ModelBarang barang23 = new ModelBarang("Basreng Stik", "Bungkus", 52000);
        
        // Kategori C
        
        ModelBarang barang5 = new ModelBarang("Coco Ijo", "Bungkus", 0);
        ModelBarang barang6 = new ModelBarang("Coco Ijo", "Kaleng", 11000);
        ModelBarang barang61 = new ModelBarang("Cung-cung", "Bungkus", 19000);
        ModelBarang barang106 = new ModelBarang("Cookies", "Bungkus", 343000);
        ModelBarang barang112 = new ModelBarang("Coco Cran", "Bungkus", 36000);
        ModelBarang barang51 = new ModelBarang("Cincin Dahlia", "Bungkus", 37000);
        
        // Kategori D
        // Kategori E
        
        ModelBarang barang16 = new ModelBarang("Emping", "Bungkus", 72000);
        ModelBarang barang17 = new ModelBarang("Emping", "Kaleng", 0);
        
        // Kategori F
        // Kategori G
        
        ModelBarang barang10 = new ModelBarang("Gandaria", "Bungkus", 27000);
        ModelBarang barang14 = new ModelBarang("Gadung", "Bungkus", 0);
        ModelBarang barang15 = new ModelBarang("Gemblong", "Bungkus", 35000);
        ModelBarang barang54 = new ModelBarang("Gapit TB", "Kilogram", 22500);
        ModelBarang barang55 = new ModelBarang("Gapit TB", "Dus", 60000);
        ModelBarang barang56 = new ModelBarang("Gapit KLP 24", "Bungkus", 18000);
        ModelBarang barang57 = new ModelBarang("Gapit KE", "Kaleng", 26000);
        ModelBarang barang58 = new ModelBarang("Gapit KE", "Bungkus", 46000);
        ModelBarang barang59 = new ModelBarang("Gapit Keju Bawang", "Bungkus", 24000);
        ModelBarang barang114 = new ModelBarang("Gapik Klp Opi", "Bungkus", 20000);
        ModelBarang barang115 = new ModelBarang("Gapik TB", "Ons", 14500);
        
        // Kategori H
        // Kategori I
        
        ModelBarang barang113 = new ModelBarang("Intip", "Bungkus", 41000);
        
        // Kategori J
        
        ModelBarang barang102 = new ModelBarang("Jagung", "Bungkus", 66000);
        ModelBarang barang103 = new ModelBarang("Jagung", "Kaleng", 35000);
        
        // Kategori K
        
        ModelBarang barang101 = new ModelBarang("Kue", "Bungkus", 51000);
        ModelBarang barang28 = new ModelBarang("Keripik Tempe Bulet", "Bungkus", 30000);
        ModelBarang barang29 = new ModelBarang("Keripik Tempe Kotak", "Bungkus", 27500);
        ModelBarang barang30 = new ModelBarang("Katus Kuning", "Bungkus", 40000);
        ModelBarang barang31 = new ModelBarang("Katus Putih", "Bungkus", 0);
        ModelBarang barang32 = new ModelBarang("Katus Putih", "Kaleng", 0);
        ModelBarang barang13 = new ModelBarang("Kentang", "Bungkus", 0);
        ModelBarang barang20 = new ModelBarang("Keripik Pangsit POS", "Bungkus", 29000);
        ModelBarang barang21 = new ModelBarang("Keripik Pangsit Kuning", "Kaleng", 27000);
        ModelBarang barang48 = new ModelBarang("Kenanga", "Bungkus", 25000);
        ModelBarang barang49 = new ModelBarang("Keciput", "Bungkus", 65000);
        ModelBarang barang86 = new ModelBarang("Ke Atom", "Bungkus", 107000);
        ModelBarang barang87 = new ModelBarang("Ke Mersi", "Bungkus", 53000);
        ModelBarang barang88 = new ModelBarang("Ke Bandung", "Bungkus", 72000);
        ModelBarang barang89 = new ModelBarang("Ke Koro", "Bungkus", 95000);
        ModelBarang barang90 = new ModelBarang("Ke Koro", "Kaleng", 60000);
        ModelBarang barang91 = new ModelBarang("Ke Tempe", "Bungkus", 47000);
        ModelBarang barang92 = new ModelBarang("Ke Tunggak", "Bungkus", 67000);
        ModelBarang barang93 = new ModelBarang("Ke Kate", "Bungkus", 75000);
        ModelBarang barang94 = new ModelBarang("Ke Gawil", "Bungkus", 0);
        ModelBarang barang95 = new ModelBarang("Ke Gawil", "Kaleng", 0);
        ModelBarang barang96 = new ModelBarang("Ke Al", "Bungkus", 112000);
        ModelBarang barang97 = new ModelBarang("Ke Aji", "Bungkus", 0);
        ModelBarang barang98 = new ModelBarang("Ke Pa Lurah", "Bungkus", 55000);
        ModelBarang barang99 = new ModelBarang("Ke Ijo", "Bungkus", 0);
        ModelBarang barang85 = new ModelBarang("Ke Bandung", "Bungkus", 72000);
        
        // Kategori L
        
        ModelBarang barang76 = new ModelBarang("Ladu Keju", "Bungkus", 44000);
        ModelBarang barang77 = new ModelBarang("Ladu Cendol", "Bungkus", 43000);
        ModelBarang barang78 = new ModelBarang("Ladu PLP", "Bungkus", 33000);
        ModelBarang barang79 = new ModelBarang("Ladu Stik", "Bungkus", 0);
        ModelBarang barang80 = new ModelBarang("Ladu Wijen", "Bungkus", 0);
        ModelBarang barang81 = new ModelBarang("Ladu Bintang", "Bungkus", 53000);
        
        // Kategori M
        
        ModelBarang barang9 = new ModelBarang("Makaroni", "Bungkus", 23000);
        
        // Kategori N
        // Kategori O
        // Kategori P
        
        ModelBarang barang19 = new ModelBarang("Pangsik Kuncup", "Bungkus", 43000);
        ModelBarang barang1 = new ModelBarang("Potato", "Bungkus", 36000);
        ModelBarang barang2 = new ModelBarang("Poco", "Bungkus", 9000);
        ModelBarang barang3 = new ModelBarang("Pules", "Bungkus", 14000);
        ModelBarang barang108 = new ModelBarang("Pang Utama", "Bungkus", 0);
        ModelBarang barang109 = new ModelBarang("Pang Segitiga", "Bungkus", 44000);
        ModelBarang barang110 = new ModelBarang("Pang Idola", "Bungkus", 44000);
        ModelBarang barang111 = new ModelBarang("Pang Korea", "Bungkus", 64000);
        ModelBarang barang4 = new ModelBarang("Peyek", "Bungkus", 29000);
        ModelBarang barang34 = new ModelBarang("Ps Open", "Bungkus", 38000);
        ModelBarang barang35 = new ModelBarang("Ps Keju", "Bungkus", 45000);
        ModelBarang barang36 = new ModelBarang("Ps Manis", "Bungkus", 40000);
        ModelBarang barang37 = new ModelBarang("Ps Asin", "Bungkus", 40000);
        ModelBarang barang38 = new ModelBarang("Ps Madu", "Bungkus", 45000);
        ModelBarang barang69 = new ModelBarang("Pastel", "Bungkus", 0);
        ModelBarang barang70 = new ModelBarang("Pastel", "Kaleng", 29000);
        
        // Kategori Q
        // Kategori R
        
        ModelBarang barang11 = new ModelBarang("Rambak", "Bungkus", 24000);
        ModelBarang barang12 = new ModelBarang("Rambak", "Kaleng", 0);
        ModelBarang barang65 = new ModelBarang("Rengginang", "Bungkus", 25000);
        ModelBarang barang66 = new ModelBarang("Rengginang", "Kaleng", 28000);
        
        // Kategori S
        
        ModelBarang barang7 = new ModelBarang("Stik Balado", "Bungkus", 33000);
        ModelBarang barang8 = new ModelBarang("Stik Balado", "Kaleng", 17000);
        ModelBarang barang25 = new ModelBarang("Sukun", "Bungkus", 40000);
        ModelBarang barang39 = new ModelBarang("Singkong", "Bungkus", 40000);
        ModelBarang barang40 = new ModelBarang("Singkong", "Kaleng", 0);
        ModelBarang barang42 = new ModelBarang("Sing Balado", "Bungkus", 0);
        ModelBarang barang53 = new ModelBarang("Stik Windu", "Bungkus", 32000);
        ModelBarang barang60 = new ModelBarang("Semprong", "Bungkus", 19000);
        ModelBarang barang67 = new ModelBarang("Sumpin", "Bungkus", 0);
        ModelBarang barang68 = new ModelBarang("Sumping", "Kaleng", 30000);
        ModelBarang barang100 = new ModelBarang("Sagon", "Bungkus", 276000);
        
        // Kategori T
        
        ModelBarang barang24 = new ModelBarang("Tahu", "Bungkus", 0);
        ModelBarang barang27 = new ModelBarang("Tales", "Bungkus", 40000);
        ModelBarang barang33 = new ModelBarang("Tambang", "Bungkus", 28000);
        ModelBarang barang41 = new ModelBarang("Top Rasa", "Bungkus", 39000);
        ModelBarang barang46 = new ModelBarang("Towok Polet", "Bungkus", 27000);
        ModelBarang barang47 = new ModelBarang("Towok Bulet", "Bungkus", 0);
        ModelBarang barang52 = new ModelBarang("Towok Mini", "Bungkus", 0);
        ModelBarang barang18 = new ModelBarang("Teng-teng", "Bungkus", 38000);
        
        // Kategori U
        // Kategori F
        // Kategori W
        
        ModelBarang barang50 = new ModelBarang("Wijen", "Bungkus", 0);
        ModelBarang barang104 = new ModelBarang("Wf Rosendra", "Bungkus", 59000);
        ModelBarang barang105 = new ModelBarang("Wf Rasaku", "Bungkus", 61000);
        
        // Kategori A
        
        cboBarang.addItem(barang43);
        cboBarang.addItem(barang44);
        cboBarang.addItem(barang45);
        cboBarang.addItem(barang107);
        
        // Kategori B
        // Kategori C
        
        cboBarang.addItem(barang5);
        cboBarang.addItem(barang6);
        cboBarang.addItem(barang61);
        cboBarang.addItem(barang106);
        cboBarang.addItem(barang112);
        cboBarang.addItem(barang51);
        
        // Kategori D
        // Kategori E
        
        cboBarang.addItem(barang16);
        cboBarang.addItem(barang17);
        
        // Kategori F
        // Kategori G
        
        cboBarang.addItem(barang10);
        cboBarang.addItem(barang14);
        cboBarang.addItem(barang15);
        cboBarang.addItem(barang54);
        cboBarang.addItem(barang55);
        cboBarang.addItem(barang56);
        cboBarang.addItem(barang57);
        cboBarang.addItem(barang58);
        cboBarang.addItem(barang59);
        cboBarang.addItem(barang114);
        cboBarang.addItem(barang115);
        
        // Kategori H
        // Kategori I
        
        cboBarang.addItem(barang113);
        
        // Kategori J
        
        cboBarang.addItem(barang102);
        cboBarang.addItem(barang103);
        
        // Kategori K
        
        cboBarang.addItem(barang101);
        cboBarang.addItem(barang28);
        cboBarang.addItem(barang29);
        cboBarang.addItem(barang30);
        cboBarang.addItem(barang31);
        cboBarang.addItem(barang32);
        cboBarang.addItem(barang13);
        cboBarang.addItem(barang20);
        cboBarang.addItem(barang21);
        cboBarang.addItem(barang48);
        cboBarang.addItem(barang49);
        cboBarang.addItem(barang86);
        cboBarang.addItem(barang87);
        cboBarang.addItem(barang88);
        cboBarang.addItem(barang89);
        cboBarang.addItem(barang90);
        cboBarang.addItem(barang91);
        cboBarang.addItem(barang92);
        cboBarang.addItem(barang93);
        cboBarang.addItem(barang94);
        cboBarang.addItem(barang95);
        cboBarang.addItem(barang96);
        cboBarang.addItem(barang97);
        cboBarang.addItem(barang98);
        cboBarang.addItem(barang99);
        cboBarang.addItem(barang85);
        
        // Kategori L
        
        cboBarang.addItem(barang76);
        cboBarang.addItem(barang77);
        cboBarang.addItem(barang78);
        cboBarang.addItem(barang79);
        cboBarang.addItem(barang80);
        cboBarang.addItem(barang81);
        
        // Kategori M
        
        cboBarang.addItem(barang9);
        
        // Kategori N
        // Kategori O
        // Kategori P
        
        cboBarang.addItem(barang19);
        cboBarang.addItem(barang1);
        cboBarang.addItem(barang2);
        cboBarang.addItem(barang3);
        cboBarang.addItem(barang108);
        cboBarang.addItem(barang109);
        cboBarang.addItem(barang110);
        cboBarang.addItem(barang111);
        cboBarang.addItem(barang4);
        cboBarang.addItem(barang34);
        cboBarang.addItem(barang35);
        cboBarang.addItem(barang36);
        cboBarang.addItem(barang37);
        cboBarang.addItem(barang38);
        cboBarang.addItem(barang69);
        cboBarang.addItem(barang70);
        
        // Kategori Q
        // Kategori R
        
        cboBarang.addItem(barang11);
        cboBarang.addItem(barang12);
        cboBarang.addItem(barang65);
        cboBarang.addItem(barang66);
        
        // Kategori S
        
        cboBarang.addItem(barang7);
        cboBarang.addItem(barang8);
        cboBarang.addItem(barang25);
        cboBarang.addItem(barang39);
        cboBarang.addItem(barang40);
        cboBarang.addItem(barang42);
        cboBarang.addItem(barang53);
        cboBarang.addItem(barang60);
        cboBarang.addItem(barang67);
        cboBarang.addItem(barang68);
        cboBarang.addItem(barang100);
        
        // Kategori T
        
        cboBarang.addItem(barang24);
        cboBarang.addItem(barang27);
        cboBarang.addItem(barang33);
        cboBarang.addItem(barang41);
        cboBarang.addItem(barang46);
        cboBarang.addItem(barang47);
        cboBarang.addItem(barang52);
        cboBarang.addItem(barang18);
        
        // Kategori U
        // Kategori F
        // Kategori W
        
        cboBarang.addItem(barang50);
        cboBarang.addItem(barang104);
        cboBarang.addItem(barang105);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cboBarang = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblHarga = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblSatuan = new javax.swing.JLabel();
        txtQuantity = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblBarang = new javax.swing.JTable();
        btnSimpan = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblSubtotal = new javax.swing.JLabel();
        chkPPN = new javax.swing.JCheckBox();
        jLabel8 = new javax.swing.JLabel();
        lblPPN = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        btnHapus = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Belanja +PPN");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Transaksi Penjualan");

        jLabel2.setText("Barang");

        cboBarang.setNextFocusableComponent(txtQuantity);
        cboBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboBarangActionPerformed(evt);
            }
        });

        jLabel3.setText("Quantity");

        jLabel4.setText("Harga");

        lblHarga.setText("00");

        jLabel5.setText("Rp.");

        lblSatuan.setText("jLabel6");

        txtQuantity.setNextFocusableComponent(btnSimpan);
        txtQuantity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtQuantityKeyPressed(evt);
            }
        });

        tblBarang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblBarang);

        btnSimpan.setText("Simpan");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        jLabel6.setText("Subtotal :");

        jLabel7.setText("Rp.");

        lblSubtotal.setText("00");

        chkPPN.setText("PPN");
        chkPPN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkPPNActionPerformed(evt);
            }
        });

        jLabel8.setText("Rp.");

        lblPPN.setText("00");

        jLabel9.setText("Total");

        jLabel10.setText("Rp.");

        lblTotal.setText("00");

        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        jMenu1.setText("Menu");

        jMenuItem1.setText("Beranda");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem4.setText("Penyimpanan");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuItem2.setText("Belanja");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem5.setText("Belanja +PPN");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem5);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 545, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel9)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel10)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel6)
                                        .addComponent(chkPPN))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel8)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(lblPPN, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel7)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(lblSubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(cboBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(269, 269, 269))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblSatuan)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnSimpan)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnHapus)))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(160, 160, 160))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnHapus, btnSimpan});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cboBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(lblHarga)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lblSatuan)
                    .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHapus)
                    .addComponent(btnSimpan))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(lblSubtotal)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkPPN)
                    .addComponent(lblPPN)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(lblTotal)
                    .addComponent(jLabel10))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtQuantityKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtQuantityKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
            btnSimpan.requestFocus();
    }//GEN-LAST:event_txtQuantityKeyPressed

    private void cboBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboBarangActionPerformed
        barang = (ModelBarang)cboBarang.getSelectedItem();
        lblHarga.setText(NumberFormat.getNumberInstance().format(barang.getHarga()));
        lblSatuan.setText(barang.getSatuan());
    }//GEN-LAST:event_cboBarangActionPerformed

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        String[] data = new String[5];
        double harga, jumlah=0;
        int qty=0;
        
        data[0]=barang.getNamaBarang();
        harga=barang.getHarga();
        data[1]=String.valueOf(barang.getHarga());
        qty=Integer.parseInt(txtQuantity.getText());
        data[2]=txtQuantity.getText();
        data[3]=barang.getSatuan();
        jumlah=harga*qty;
        data[4]=String.valueOf(jumlah);
        
        penjualan.getTabel().addRow(data);
        lblSubtotal.setText(NumberFormat.getNumberInstance().format(penjualan.countSubtotal()));
        chkPPNActionPerformed(null);
        
        cboBarang.requestFocus();
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void chkPPNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkPPNActionPerformed
        if (chkPPN.isSelected())
            lblPPN.setText(NumberFormat.getNumberInstance().format(penjualan.countPPN()));
        else{
            lblPPN.setText("0");
            penjualan.setPpn(0);
        }
        
        lblTotal.setText(NumberFormat.getNumberInstance().format(penjualan.countTotal()));
    }//GEN-LAST:event_chkPPNActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        penjualan.getTabel().removeRow(tblBarang.getSelectedRow());
        lblSubtotal.setText(NumberFormat.getNumberInstance().format(penjualan.countSubtotal()));
        chkPPNActionPerformed(null);
    }//GEN-LAST:event_btnHapusActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        beranda e = new beranda();
        e.setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        Frame_penyimpanan_barang k = new Frame_penyimpanan_barang();
        k.setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        belanja b = new belanja();
        b.setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        UIPenjualan u = new UIPenjualan();
        u.setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UIPenjualan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UIPenjualan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UIPenjualan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UIPenjualan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new UIPenjualan().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JComboBox cboBarang;
    private javax.swing.JCheckBox chkPPN;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblHarga;
    private javax.swing.JLabel lblPPN;
    private javax.swing.JLabel lblSatuan;
    private javax.swing.JLabel lblSubtotal;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JTable tblBarang;
    private javax.swing.JTextField txtQuantity;
    // End of variables declaration//GEN-END:variables
}
