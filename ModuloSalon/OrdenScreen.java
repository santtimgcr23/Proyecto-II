import java.io.IOException;
import java.io.OutputStream;

import javax.swing.JOptionPane;

public class OrdenScreen extends javax.swing.JFrame {

    String hamburguesa;
    Salon salon;
    int mesa;
    Cliente cliente;

    public OrdenScreen(Cliente cliente, Salon salon, int mesa) {
        this.mesa = mesa;
        this.cliente = cliente;
        this.salon = salon;
        setTitle("La Cocina de Icebox - Ordenar");
        initComponents();
        setVisible(true);
    }     

    private void initComponents() {
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lblIngredientes = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        btnClassic = new javax.swing.JButton();
        btnSpectre = new javax.swing.JButton();
        btnVandal = new javax.swing.JButton();
        btnOperator = new javax.swing.JButton();
        btnOdin = new javax.swing.JButton();
        btnOrdenar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 0, 51));

        jPanel2.setBackground(new java.awt.Color(102, 0, 51));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 204, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("LA COCINA DE ICEBOX");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(102, 0, 51));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 204, 255)));

        lblIngredientes.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        lblIngredientes.setForeground(new java.awt.Color(255, 255, 255));
        lblIngredientes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblIngredientes, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblIngredientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel4.setBackground(new java.awt.Color(102, 0, 51));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 204, 255)));

        btnClassic.setBackground(new java.awt.Color(153, 204, 255));
        btnClassic.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        btnClassic.setForeground(new java.awt.Color(102, 0, 51));
        btnClassic.setText("LA CLASSIC");
        btnClassic.setBorder(null);
        btnClassic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClassicActionPerformed(evt);
            }
        });

        btnSpectre.setBackground(new java.awt.Color(153, 204, 255));
        btnSpectre.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        btnSpectre.setForeground(new java.awt.Color(102, 0, 51));
        btnSpectre.setText("LA SPECTRE");
        btnSpectre.setBorder(null);
        btnSpectre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSpectreActionPerformed(evt);
            }
        });

        btnVandal.setBackground(new java.awt.Color(153, 204, 255));
        btnVandal.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        btnVandal.setForeground(new java.awt.Color(102, 0, 51));
        btnVandal.setText("LA VANDAL");
        btnVandal.setBorder(null);
        btnVandal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVandalActionPerformed(evt);
            }
        });

        btnOperator.setBackground(new java.awt.Color(153, 204, 255));
        btnOperator.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        btnOperator.setForeground(new java.awt.Color(102, 0, 51));
        btnOperator.setText("LA OPERATOR");
        btnOperator.setBorder(null);
        btnOperator.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOperatorActionPerformed(evt);
            }
        });

        btnOdin.setBackground(new java.awt.Color(153, 204, 255));
        btnOdin.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        btnOdin.setForeground(new java.awt.Color(102, 0, 51));
        btnOdin.setText("LA ODIN (CUSTOM)");
        btnOdin.setBorder(null);
        btnOdin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOdinActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnClassic, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSpectre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnVandal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnOperator, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnOdin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnClassic, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSpectre, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVandal, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnOperator, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnOdin, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        btnOrdenar.setBackground(new java.awt.Color(102, 0, 51));
        btnOrdenar.setFont(new java.awt.Font("Century Gothic", 1, 48)); // NOI18N
        btnOrdenar.setForeground(new java.awt.Color(153, 204, 255));
        btnOrdenar.setText("ORDENAR");
        btnOrdenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    btnOrdenarActionPerformed(evt);
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnOrdenar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnOrdenar, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>                        

    private void btnClassicActionPerformed(java.awt.event.ActionEvent evt) {                                           
        hamburguesa = "La Classic";
        lblIngredientes.setText("<html>" + new HambClassic().toString().replaceAll("\n", "<br/>") + "<html>");
    }                                          

    private void btnSpectreActionPerformed(java.awt.event.ActionEvent evt) {                                           
        hamburguesa = "La Spectre";
        lblIngredientes.setText("<html>" + new HambSpectre().toString().replaceAll("\n", "<br/>") + "<html>");
    }                                          

    private void btnVandalActionPerformed(java.awt.event.ActionEvent evt) {                                          
        hamburguesa = "La Vandal";
        lblIngredientes.setText("<html>" + new HambVandal().toString().replaceAll("\n", "<br/>") + "<html>");
    }                                         

    private void btnOperatorActionPerformed(java.awt.event.ActionEvent evt) {                                            
        hamburguesa = "La Operator";
        lblIngredientes.setText("<html>" + new HambOperator().toString().replaceAll("\n", "<br/>") + "<html>");
    }                                           

    private void btnOdinActionPerformed(java.awt.event.ActionEvent evt) {                                        
        hamburguesa = "La Odin";
        lblIngredientes.setText("<html>" + new HambOdin().toString().replaceAll("\n", "<br/>") + "<html>");
    }                                       

    private void btnOrdenarActionPerformed(java.awt.event.ActionEvent evt) throws IOException {
        HambFactory hf = new HambFactory();
        Hamburguesa h = hf.cocinarHamburguesa(hamburguesa);
        Orden orden = new Orden(mesa, h, h.getPrecio());   
        cliente.enviarOrden(orden);
        JOptionPane.showMessageDialog(this, "Orden realizada con éxito.", "Orden realizada.", JOptionPane.INFORMATION_MESSAGE);
    }                                          

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(OrdenScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OrdenScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OrdenScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OrdenScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton btnClassic;
    private javax.swing.JButton btnOdin;
    private javax.swing.JButton btnOperator;
    private javax.swing.JButton btnOrdenar;
    private javax.swing.JButton btnSpectre;
    private javax.swing.JButton btnVandal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lblIngredientes;
    // End of variables declaration                   
}
