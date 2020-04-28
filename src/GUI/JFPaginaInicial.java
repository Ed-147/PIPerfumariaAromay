/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import javax.swing.JOptionPane;

/**
 *
 * @author luans
 */
public class JFPaginaInicial extends javax.swing.JFrame {

    /**
     * Creates new form JFPaginaInicial
     */
    public JFPaginaInicial() {
        initComponents();
        this.setLocationRelativeTo(null);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        lblImgInicial = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        lblIcone = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        pnlCategoria = new javax.swing.JPanel();
        lblProdCabelo = new javax.swing.JLabel();
        lblProdDente = new javax.swing.JLabel();
        lblProdCorpo = new javax.swing.JLabel();
        lblProdInfantil = new javax.swing.JLabel();
        lblProdPCasa = new javax.swing.JLabel();
        pnlNovidades = new javax.swing.JPanel();
        pnlPromo1 = new javax.swing.JPanel();
        lblImagemPromo1 = new javax.swing.JLabel();
        lblTituloPromo1 = new javax.swing.JLabel();
        lblPrecoPromo1 = new javax.swing.JLabel();
        btnComprarPromo1 = new javax.swing.JButton();
        cmbQtdePromo1 = new javax.swing.JComboBox<>();
        pnlPromo2 = new javax.swing.JPanel();
        lblImagemPromo2 = new javax.swing.JLabel();
        lblTituloPromo2 = new javax.swing.JLabel();
        lblPrecoPromo2 = new javax.swing.JLabel();
        btnComprarPromo2 = new javax.swing.JButton();
        cmbQtdePromo2 = new javax.swing.JComboBox<>();
        pnlPromo3 = new javax.swing.JPanel();
        lblImagemPromo3 = new javax.swing.JLabel();
        lblTituloPromo3 = new javax.swing.JLabel();
        lblPrecoPromo3 = new javax.swing.JLabel();
        btnComprarPromo3 = new javax.swing.JButton();
        cmbQtdePromo3 = new javax.swing.JComboBox<>();
        lblPerfil = new javax.swing.JLabel();
        lblCarrinho = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setAlignmentY(1.0F);

        jPanel1.setBackground(new java.awt.Color(93, 172, 189));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblImgInicial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/BemVindo.png"))); // NOI18N

        txtBuscar.setFont(new java.awt.Font("Yu Gothic Medium", 0, 14)); // NOI18N
        txtBuscar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarActionPerformed(evt);
            }
        });

        lblIcone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/aromayIcon.png"))); // NOI18N

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/search.png"))); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscarMouseClicked(evt);
            }
        });

        pnlCategoria.setBackground(new java.awt.Color(93, 172, 189));
        pnlCategoria.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "Navegar por categorias", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Yu Gothic Medium", 0, 24), new java.awt.Color(255, 255, 255))); // NOI18N

        lblProdCabelo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/soap.png"))); // NOI18N
        lblProdCabelo.setText("Cabelo");
        lblProdCabelo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblProdCabeloMouseClicked(evt);
            }
        });

        lblProdDente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/brush-teeth.png"))); // NOI18N
        lblProdDente.setText("Dente");
        lblProdDente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblProdDenteMouseClicked(evt);
            }
        });

        lblProdCorpo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/hip.png"))); // NOI18N
        lblProdCorpo.setText("Corpo");
        lblProdCorpo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblProdCorpoMouseClicked(evt);
            }
        });

        lblProdInfantil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/child.png"))); // NOI18N
        lblProdInfantil.setText("Infantil");
        lblProdInfantil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblProdInfantilMouseClicked(evt);
            }
        });

        lblProdPCasa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/casa-mila.png"))); // NOI18N
        lblProdPCasa.setText("Para casa");
        lblProdPCasa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblProdPCasaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlCategoriaLayout = new javax.swing.GroupLayout(pnlCategoria);
        pnlCategoria.setLayout(pnlCategoriaLayout);
        pnlCategoriaLayout.setHorizontalGroup(
            pnlCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCategoriaLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(lblProdCabelo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(lblProdDente, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(lblProdCorpo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                .addComponent(lblProdInfantil)
                .addGap(62, 62, 62)
                .addComponent(lblProdPCasa)
                .addContainerGap())
        );
        pnlCategoriaLayout.setVerticalGroup(
            pnlCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCategoriaLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(pnlCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblProdCabelo, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblProdDente)
                    .addComponent(lblProdCorpo)
                    .addComponent(lblProdInfantil)
                    .addComponent(lblProdPCasa))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pnlNovidades.setBackground(new java.awt.Color(93, 172, 189));
        pnlNovidades.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "Novidades", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Yu Gothic Medium", 0, 24), new java.awt.Color(255, 255, 255))); // NOI18N

        pnlPromo1.setBackground(new java.awt.Color(93, 172, 189));
        pnlPromo1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblImagemPromo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/KitSedaNiinaSecrets.jpg"))); // NOI18N

        lblTituloPromo1.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lblTituloPromo1.setText("Kit shampoo+condicionador Seda ");

        lblPrecoPromo1.setText("por R$17.90");

        btnComprarPromo1.setText("Comprar");
        btnComprarPromo1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnComprarPromo1MouseClicked(evt);
            }
        });

        cmbQtdePromo1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Quantidade", "1", "2", "3", "4" }));

        javax.swing.GroupLayout pnlPromo1Layout = new javax.swing.GroupLayout(pnlPromo1);
        pnlPromo1.setLayout(pnlPromo1Layout);
        pnlPromo1Layout.setHorizontalGroup(
            pnlPromo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPromo1Layout.createSequentialGroup()
                .addGroup(pnlPromo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlPromo1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(lblImagemPromo1))
                    .addGroup(pnlPromo1Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(lblPrecoPromo1))
                    .addGroup(pnlPromo1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(cmbQtdePromo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(btnComprarPromo1))
                    .addGroup(pnlPromo1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(lblTituloPromo1)))
                .addContainerGap())
        );
        pnlPromo1Layout.setVerticalGroup(
            pnlPromo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPromo1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblImagemPromo1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTituloPromo1)
                .addGap(4, 4, 4)
                .addComponent(lblPrecoPromo1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlPromo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnComprarPromo1)
                    .addComponent(cmbQtdePromo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlPromo2.setBackground(new java.awt.Color(93, 172, 189));
        pnlPromo2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblImagemPromo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/KitViagemColgate.jpg"))); // NOI18N

        lblTituloPromo2.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lblTituloPromo2.setText("Kit viagem Colgate");

        lblPrecoPromo2.setText("por R$23.90");

        btnComprarPromo2.setText("Comprar");
        btnComprarPromo2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnComprarPromo2MouseClicked(evt);
            }
        });

        cmbQtdePromo2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Quantidade", "1", "2", "3", "4" }));

        javax.swing.GroupLayout pnlPromo2Layout = new javax.swing.GroupLayout(pnlPromo2);
        pnlPromo2.setLayout(pnlPromo2Layout);
        pnlPromo2Layout.setHorizontalGroup(
            pnlPromo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPromo2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(pnlPromo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblImagemPromo2)
                    .addGroup(pnlPromo2Layout.createSequentialGroup()
                        .addComponent(cmbQtdePromo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnComprarPromo2))))
            .addGroup(pnlPromo2Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(pnlPromo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblTituloPromo2)
                    .addComponent(lblPrecoPromo2)))
        );
        pnlPromo2Layout.setVerticalGroup(
            pnlPromo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPromo2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblImagemPromo2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTituloPromo2)
                .addGap(1, 1, 1)
                .addComponent(lblPrecoPromo2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlPromo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbQtdePromo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnComprarPromo2))
                .addGap(50, 50, 50))
        );

        pnlPromo3.setBackground(new java.awt.Color(93, 172, 189));
        pnlPromo3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblImagemPromo3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Pampers50u.jpg"))); // NOI18N

        lblTituloPromo3.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lblTituloPromo3.setText("Fralda Pampers 50 unidades");

        lblPrecoPromo3.setText("por R$89.90");

        btnComprarPromo3.setText("Comprar");
        btnComprarPromo3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnComprarPromo3MouseClicked(evt);
            }
        });

        cmbQtdePromo3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Quantidade", "1", "2", "3", "4" }));

        javax.swing.GroupLayout pnlPromo3Layout = new javax.swing.GroupLayout(pnlPromo3);
        pnlPromo3.setLayout(pnlPromo3Layout);
        pnlPromo3Layout.setHorizontalGroup(
            pnlPromo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPromo3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlPromo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPromo3Layout.createSequentialGroup()
                        .addGroup(pnlPromo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblImagemPromo3, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTituloPromo3))
                        .addGap(42, 42, 42))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPromo3Layout.createSequentialGroup()
                        .addComponent(lblPrecoPromo3)
                        .addGap(88, 88, 88))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPromo3Layout.createSequentialGroup()
                        .addComponent(cmbQtdePromo3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnComprarPromo3)
                        .addGap(38, 38, 38))))
        );
        pnlPromo3Layout.setVerticalGroup(
            pnlPromo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPromo3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblImagemPromo3, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTituloPromo3)
                .addGap(1, 1, 1)
                .addComponent(lblPrecoPromo3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlPromo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbQtdePromo3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnComprarPromo3))
                .addGap(9, 9, 9))
        );

        javax.swing.GroupLayout pnlNovidadesLayout = new javax.swing.GroupLayout(pnlNovidades);
        pnlNovidades.setLayout(pnlNovidadesLayout);
        pnlNovidadesLayout.setHorizontalGroup(
            pnlNovidadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNovidadesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlPromo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnlPromo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(pnlPromo3, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlNovidadesLayout.setVerticalGroup(
            pnlNovidadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPromo3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(pnlPromo2, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(pnlPromo1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        lblPerfil.setFont(new java.awt.Font("Yu Gothic Medium", 0, 14)); // NOI18N
        lblPerfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/account.png"))); // NOI18N
        lblPerfil.setText("Perfil");
        lblPerfil.setToolTipText("");
        lblPerfil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblPerfilMouseClicked(evt);
            }
        });

        lblCarrinho.setFont(new java.awt.Font("Yu Gothic Medium", 0, 14)); // NOI18N
        lblCarrinho.setText("Carrinho: ");
        lblCarrinho.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCarrinhoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(lblIcone)
                        .addGap(18, 18, 18)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCarrinho)
                        .addGap(18, 18, 18)
                        .addComponent(lblPerfil))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(lblImgInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 596, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(pnlCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(pnlNovidades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblCarrinho)
                        .addComponent(lblPerfil))
                    .addComponent(lblIcone, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(lblImgInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnlCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlNovidades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78))
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 741, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 819, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblCarrinhoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCarrinhoMouseClicked
        // TODO add your handling code here:
        //Implementar
    }//GEN-LAST:event_lblCarrinhoMouseClicked

    private void lblPerfilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPerfilMouseClicked
        new JFPerfil().setVisible(true);
        dispose();
    }//GEN-LAST:event_lblPerfilMouseClicked

    private void btnComprarPromo3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnComprarPromo3MouseClicked
        // TODO add your handling code here:
        if (cmbQtdePromo3.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Por favor selecione quantos itens você deseja!");
        }
    }//GEN-LAST:event_btnComprarPromo3MouseClicked

    private void btnComprarPromo2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnComprarPromo2MouseClicked
        // TODO add your handling code here:
        if (cmbQtdePromo2.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Por favor selecione quantos itens você deseja!");
        }
    }//GEN-LAST:event_btnComprarPromo2MouseClicked

    private void btnComprarPromo1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnComprarPromo1MouseClicked
        // TODO add your handling code here:
        if (cmbQtdePromo1.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Por favor selecione quantos itens você deseja!");
        }
    }//GEN-LAST:event_btnComprarPromo1MouseClicked

    private void lblProdPCasaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblProdPCasaMouseClicked
        // TODO add your handling code here:
        //Implementar
        
        JFProdutos prod = new JFProdutos(5);
        prod.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblProdPCasaMouseClicked

    private void lblProdInfantilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblProdInfantilMouseClicked
        // TODO add your handling code here:
        //Implementar
        
        JFProdutos prod = new JFProdutos(4);
        prod.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblProdInfantilMouseClicked

    private void lblProdCorpoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblProdCorpoMouseClicked
        // TODO add your handling code here:
        //Implementar
        
        JFProdutos prod = new JFProdutos(3);
        prod.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblProdCorpoMouseClicked

    private void lblProdDenteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblProdDenteMouseClicked
        // TODO add your handling code here:
        //Implementar
        
        JFProdutos prod = new JFProdutos(2);
        prod.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblProdDenteMouseClicked

    private void lblProdCabeloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblProdCabeloMouseClicked
        // TODO add your handling code here:
        //Implementar
        
        JFProdutos prod = new JFProdutos(1);
        prod.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblProdCabeloMouseClicked

    private void btnBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseClicked
        // TODO add your handling code here:
        if (txtBuscar.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Por favor preencha corretamente o campo de pesquisa!");
        } else {
            //Implementar
        }
    }//GEN-LAST:event_btnBuscarMouseClicked

    private void txtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFPaginaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFPaginaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFPaginaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFPaginaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFPaginaInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnComprarPromo1;
    private javax.swing.JButton btnComprarPromo2;
    private javax.swing.JButton btnComprarPromo3;
    private javax.swing.JComboBox<String> cmbQtdePromo1;
    private javax.swing.JComboBox<String> cmbQtdePromo2;
    private javax.swing.JComboBox<String> cmbQtdePromo3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCarrinho;
    private javax.swing.JLabel lblIcone;
    private javax.swing.JLabel lblImagemPromo1;
    private javax.swing.JLabel lblImagemPromo2;
    private javax.swing.JLabel lblImagemPromo3;
    private javax.swing.JLabel lblImgInicial;
    private javax.swing.JLabel lblPerfil;
    private javax.swing.JLabel lblPrecoPromo1;
    private javax.swing.JLabel lblPrecoPromo2;
    private javax.swing.JLabel lblPrecoPromo3;
    private javax.swing.JLabel lblProdCabelo;
    private javax.swing.JLabel lblProdCorpo;
    private javax.swing.JLabel lblProdDente;
    private javax.swing.JLabel lblProdInfantil;
    private javax.swing.JLabel lblProdPCasa;
    private javax.swing.JLabel lblTituloPromo1;
    private javax.swing.JLabel lblTituloPromo2;
    private javax.swing.JLabel lblTituloPromo3;
    private javax.swing.JPanel pnlCategoria;
    private javax.swing.JPanel pnlNovidades;
    private javax.swing.JPanel pnlPromo1;
    private javax.swing.JPanel pnlPromo2;
    private javax.swing.JPanel pnlPromo3;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
