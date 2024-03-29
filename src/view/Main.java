
package view;

import core.Hotel;

public class Main extends javax.swing.JFrame {
    public static Hotel jomaHotel;
    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
        jomaHotel = new Hotel();
        jomaHotel.addRoom(1, "simple");
        jomaHotel.addClient(1, "1998-2300-24001" ,"Johann", "Ruiz", "98990315");
        jomaHotel.addReservation(
                1,
                jomaHotel.getRoom(1),
                jomaHotel.getClient("1998-2300-24001"),
                "10-10-2020",
                "15-10-2020"
        );
        
        
        jomaHotel.addRoom(4, "double");
        jomaHotel.addClient(5, "1998-2300-24051" ,"Juan", "Discua", "98990314");
        jomaHotel.addReservation(
                2,
                jomaHotel.getRoom(4),
                jomaHotel.getClient("1998-2300-24051"),
                "10-11-2020",
                "11-12-2020"
        );
        jomaHotel.addRoom(6, "simple");
        jomaHotel.addRoom(10, "double");
        jomaHotel.addRoom(20, "simple");
        jomaHotel.addRoom(30, "double");
        jomaHotel.addRoom(31, "simple");
        jomaHotel.addRoom(32, "double");
        jomaHotel.addRoom(33, "simple");
        jomaHotel.addRoom(34, "double");
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ModulesBar = new javax.swing.JToolBar();
        btnReserva = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        btnReserva1 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        btnReserva2 = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        btnReserva3 = new javax.swing.JButton();
        Escritorio = new javax.swing.JDesktopPane();
        Menu = new javax.swing.JMenuBar();
        Archivos = new javax.swing.JMenu();
        Reservar = new javax.swing.JMenuItem();
        Registrar = new javax.swing.JMenuItem();
        Cancelar = new javax.swing.JMenuItem();
        Buscar = new javax.swing.JMenuItem();
        Salir = new javax.swing.JMenuItem();
        Herramientas = new javax.swing.JMenu();
        Ayuda = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ModulesBar.setRollover(true);

        btnReserva.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagenes/cliente.png"))); // NOI18N
        btnReserva.setText("Reservacion");
        btnReserva.setFocusable(false);
        btnReserva.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnReserva.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReservaActionPerformed(evt);
            }
        });
        ModulesBar.add(btnReserva);
        ModulesBar.add(jSeparator1);

        btnReserva1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagenes/nuevo_persona.jpg"))); // NOI18N
        btnReserva1.setText("Agregar Cliente");
        btnReserva1.setFocusable(false);
        btnReserva1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnReserva1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnReserva1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReserva1ActionPerformed(evt);
            }
        });
        ModulesBar.add(btnReserva1);
        ModulesBar.add(jSeparator2);

        btnReserva2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagenes/buscar.png"))); // NOI18N
        btnReserva2.setText("Ver Reserva");
        btnReserva2.setFocusable(false);
        btnReserva2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnReserva2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnReserva2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReserva2ActionPerformed(evt);
            }
        });
        ModulesBar.add(btnReserva2);
        ModulesBar.add(jSeparator3);

        btnReserva3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagenes/borrar.png"))); // NOI18N
        btnReserva3.setText("Cancelar Reserva");
        btnReserva3.setFocusable(false);
        btnReserva3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnReserva3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnReserva3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReserva3ActionPerformed(evt);
            }
        });
        ModulesBar.add(btnReserva3);

        Escritorio.setPreferredSize(new java.awt.Dimension(0, 591));

        Archivos.setText("Archivos");

        Reservar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        Reservar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagenes/cliente.png"))); // NOI18N
        Reservar.setText("Reservar Habitacion");
        Reservar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReservarActionPerformed(evt);
            }
        });
        Archivos.add(Reservar);

        Registrar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        Registrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagenes/nuevo_persona.jpg"))); // NOI18N
        Registrar.setText("Registrar Huesped");
        Archivos.add(Registrar);

        Cancelar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        Cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagenes/borrar.png"))); // NOI18N
        Cancelar.setText("Cancelar Reservacion");
        Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarActionPerformed(evt);
            }
        });
        Archivos.add(Cancelar);

        Buscar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        Buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagenes/consulta.png"))); // NOI18N
        Buscar.setText("Fechas Reservadas");
        Archivos.add(Buscar);

        Salir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        Salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagenes/salir.jpg"))); // NOI18N
        Salir.setText("Salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });
        Archivos.add(Salir);

        Menu.add(Archivos);

        Herramientas.setText("Herramientas");
        Menu.add(Herramientas);

        Ayuda.setText("Ayuda");
        Menu.add(Ayuda);

        setJMenuBar(Menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ModulesBar, javax.swing.GroupLayout.DEFAULT_SIZE, 1044, Short.MAX_VALUE)
            .addComponent(Escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(ModulesBar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CancelarActionPerformed

    private void ReservarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReservarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ReservarActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SalirActionPerformed

    private void btnReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReservaActionPerformed
        AddReservation addReservation = new AddReservation();
        addReservation.setVisible(true);
        
        Escritorio.add(addReservation);
    }//GEN-LAST:event_btnReservaActionPerformed

    private void btnReserva1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReserva1ActionPerformed
        AddClient reservaHab = new AddClient();
        reservaHab.setVisible(true);
        
        Escritorio.add(reservaHab);
    }//GEN-LAST:event_btnReserva1ActionPerformed

    private void btnReserva2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReserva2ActionPerformed
        GetReservations getReservation = new GetReservations();
        getReservation.setVisible(true);
        
        Escritorio.add(getReservation);
    }//GEN-LAST:event_btnReserva2ActionPerformed

    private void btnReserva3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReserva3ActionPerformed
       RemoveReservation removeReservation = new RemoveReservation();
        removeReservation.setVisible(true);
        
        Escritorio.add(removeReservation);
    }//GEN-LAST:event_btnReserva3ActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Archivos;
    private javax.swing.JMenu Ayuda;
    private javax.swing.JMenuItem Buscar;
    private javax.swing.JMenuItem Cancelar;
    private javax.swing.JDesktopPane Escritorio;
    private javax.swing.JMenu Herramientas;
    private javax.swing.JMenuBar Menu;
    private javax.swing.JToolBar ModulesBar;
    private javax.swing.JMenuItem Registrar;
    private javax.swing.JMenuItem Reservar;
    private javax.swing.JMenuItem Salir;
    private javax.swing.JButton btnReserva;
    private javax.swing.JButton btnReserva1;
    private javax.swing.JButton btnReserva2;
    private javax.swing.JButton btnReserva3;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator3;
    // End of variables declaration//GEN-END:variables
}
