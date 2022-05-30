
package miJuego;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author Samuel Hernández Gómez
 */
public class VentanaJuego extends javax.swing.JFrame {

    enum enTurno { cruz, circulo };
    enTurno turno = enTurno.cruz;
    JButton botones[] = new JButton[10];
    clickEnBoton click; 
    boolean jugando = true;

  
    public VentanaJuego() {
        initComponents();
        this.setLocationRelativeTo(null);
        click = new clickEnBoton(this);
        botones[1] = boton1;
        botones[2] = boton2;
        botones[3] = boton3;
        botones[4] = boton4;
        botones[5] = boton5;
        botones[6] = boton6;
        botones[7] = boton7;
        botones[8] = boton8;
        botones[9] = boton9;
        
        for (int i =1; i<=9; i++) {
            botones[i].addActionListener(click);
        }
    }


     // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
     private void initComponents() {

          jMenuItem1 = new javax.swing.JMenuItem();
          jMenuItem2 = new javax.swing.JMenuItem();
          jPanel1 = new javax.swing.JPanel();
          boton1 = new javax.swing.JButton();
          boton2 = new javax.swing.JButton();
          boton3 = new javax.swing.JButton();
          boton4 = new javax.swing.JButton();
          boton5 = new javax.swing.JButton();
          boton6 = new javax.swing.JButton();
          boton7 = new javax.swing.JButton();
          boton8 = new javax.swing.JButton();
          boton9 = new javax.swing.JButton();
          jLabel1 = new javax.swing.JLabel();
          jMenuBar1 = new javax.swing.JMenuBar();
          mnuNuevo = new javax.swing.JMenu();
          mnuNuevo2 = new javax.swing.JMenuItem();
          mnuMensaje = new javax.swing.JMenu();

          jMenuItem1.setText("jMenuItem1");

          jMenuItem2.setText("jMenuItem2");

          setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
          setTitle("Juego del gato");
          setBackground(new java.awt.Color(204, 204, 255));
          setMinimumSize(new java.awt.Dimension(252, 200));
          setPreferredSize(new java.awt.Dimension(252, 250));

          jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

          boton1.setBackground(new java.awt.Color(255, 204, 255));
          boton1.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N

          boton2.setBackground(new java.awt.Color(255, 204, 255));
          boton2.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N

          boton3.setBackground(new java.awt.Color(255, 204, 255));
          boton3.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N

          boton4.setBackground(new java.awt.Color(255, 204, 255));
          boton4.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N

          boton5.setBackground(new java.awt.Color(255, 204, 255));
          boton5.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N

          boton6.setBackground(new java.awt.Color(255, 204, 255));
          boton6.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N

          boton7.setBackground(new java.awt.Color(255, 204, 255));
          boton7.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N

          boton8.setBackground(new java.awt.Color(255, 204, 255));
          boton8.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N

          boton9.setBackground(new java.awt.Color(255, 204, 255));
          boton9.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N

          jLabel1.setBackground(new java.awt.Color(102, 255, 204));
          jLabel1.setFont(new java.awt.Font("Arial", 2, 24)); // NOI18N
          jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
          jLabel1.setText("Insert Coin, para jugar el juego del gato jeje.");

          javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
          jPanel1.setLayout(jPanel1Layout);
          jPanel1Layout.setHorizontalGroup(
               jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(71, 71, 71)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                         .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE)
                         .addGroup(jPanel1Layout.createSequentialGroup()
                              .addComponent(boton1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addGap(0, 0, 0)
                              .addComponent(boton2, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addGap(0, 0, 0)
                              .addComponent(boton3, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                         .addGroup(jPanel1Layout.createSequentialGroup()
                              .addComponent(boton4, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addGap(0, 0, 0)
                              .addComponent(boton5, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addGap(0, 0, 0)
                              .addComponent(boton6, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                         .addGroup(jPanel1Layout.createSequentialGroup()
                              .addComponent(boton7, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addGap(0, 0, 0)
                              .addComponent(boton8, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addGap(0, 0, 0)
                              .addComponent(boton9, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(86, Short.MAX_VALUE))
          );
          jPanel1Layout.setVerticalGroup(
               jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(43, 43, 43)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                         .addComponent(boton1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                         .addComponent(boton2, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                         .addComponent(boton3, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                         .addComponent(boton4, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                         .addComponent(boton5, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                         .addComponent(boton6, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                         .addComponent(boton7, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                         .addComponent(boton8, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                         .addComponent(boton9, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap())
          );

          jMenuBar1.setBackground(new java.awt.Color(102, 255, 204));
          jMenuBar1.setForeground(new java.awt.Color(102, 255, 204));

          mnuNuevo.setText("Empezar nuvo juego");
          mnuNuevo.setToolTipText("");

          mnuNuevo2.setText("Nuevo");
          mnuNuevo2.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    mnuNuevo2ActionPerformed(evt);
               }
          });
          mnuNuevo.add(mnuNuevo2);

          jMenuBar1.add(mnuNuevo);

          mnuMensaje.setText("Inicia con cruz (X)");
          mnuMensaje.setEnabled(false);
          jMenuBar1.add(mnuMensaje);

          setJMenuBar(jMenuBar1);

          javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
          getContentPane().setLayout(layout);
          layout.setHorizontalGroup(
               layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(24, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap())
          );
          layout.setVerticalGroup(
               layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(19, Short.MAX_VALUE))
          );

          pack();
     }// </editor-fold>//GEN-END:initComponents

    private void mnuNuevo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuNuevo2ActionPerformed
        mnuMensaje.setText("Inicia con Cruz(X)");
        turno = enTurno.cruz;
        for (int i = 1; i <= 9; i++) {
            botones[i].setText("");
            botones[i].setBackground(null);
        }
        jugando = true;
    }//GEN-LAST:event_mnuNuevo2ActionPerformed

    void tirada(int posicion) {
        // realiza una tirada 
        if (jugando) {

            //Coloca la marca
            if (turno == enTurno.cruz) {
                botones[posicion].setText("X");
                turno = enTurno.circulo;
            } else {
                botones[posicion].setText("O");
                turno = enTurno.cruz;
            }

            //Despliega el mensaje del turno siguiente
            if (turno == enTurno.circulo) {
                mnuMensaje.setText("Turno siguiente: Circulo");
            } else {
                mnuMensaje.setText("Turno siguiente: Cruz");
            }

            //Verifica si se cumple con alguna condición de ganar
            switch (posicion) {

                case 1:
                    if (valida(1, 2, 3) || valida(1, 4, 7) || valida(1, 5, 9)) {
                        jugando = false;
                    }
                    break;

                case 2:
                    if (valida(2, 1, 3) || valida(2, 5, 8)) {
                        jugando = false;
                    }
                    break;

                case 3:
                    if (valida(3, 1, 2) || valida(3, 6, 9) || valida(3, 5, 7)) {
                        jugando = false;
                    }
                    break;

                case 4:
                    if (valida(4, 1, 7) || valida(4, 5, 6)) {
                        jugando = false;
                    }
                    break;

                case 5:
                    if (valida(5, 2, 8) || valida(5, 4, 6)
                            || valida(5, 1, 9) || valida(5, 7, 3)) {
                        jugando = false;
                    }
                    break;

                case 6:
                    if (valida(6, 3, 9) || valida(6, 4, 5)) {
                        jugando = false;
                    }
                    break;

                case 7:
                    if (valida(7, 1, 4) || valida(7, 8, 9) || valida(7, 5, 3)) {
                        jugando = false;
                    }
                    break;

                case 8:
                    if (valida(8, 2, 5) || valida(8, 7, 9)) {
                        jugando = false;
                    }
                    break;

                case 9:
                    if (valida(9, 1, 5) || valida(9, 7, 8) || valida(9, 3, 6)) {
                        jugando = false;
                    }
                    break;
            }
        }
    }

    boolean valida(int tirada, int primero, int segundo) {
        //Valida si las posiciones donde se hace la tirada y los otros dos botones 
        //tienen el mismo texto (Equis o O)
        if (botones[primero].getText().equals(botones[tirada].getText())
                && botones[segundo].getText().equals(botones[tirada].getText())) {

            //System.out.println("Ya ganó, lil peep lo filicita #CryBaby");
            JOptionPane.showMessageDialog(null, "¡Ya ganooó!");
            botones[tirada].setBackground(Color.magenta);
            botones[primero].setBackground(Color.magenta);
            botones[segundo].setBackground(Color.magenta);

            if (botones[tirada].getText().equals("X")) {
                mnuMensaje.setText("Ganó: Cruz");
            } else {
                mnuMensaje.setText("Ganó: Circulo");
            }
            return true;
        } else {
            return false;
        }
    }


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
            java.util.logging.Logger.getLogger(VentanaJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new VentanaJuego().setVisible(true);
            }
        });
    }
     // Variables declaration - do not modify//GEN-BEGIN:variables
     private javax.swing.JButton boton1;
     private javax.swing.JButton boton2;
     private javax.swing.JButton boton3;
     private javax.swing.JButton boton4;
     private javax.swing.JButton boton5;
     private javax.swing.JButton boton6;
     private javax.swing.JButton boton7;
     private javax.swing.JButton boton8;
     private javax.swing.JButton boton9;
     private javax.swing.JLabel jLabel1;
     private javax.swing.JMenuBar jMenuBar1;
     private javax.swing.JMenuItem jMenuItem1;
     private javax.swing.JMenuItem jMenuItem2;
     private javax.swing.JPanel jPanel1;
     private javax.swing.JMenu mnuMensaje;
     private javax.swing.JMenu mnuNuevo;
     private javax.swing.JMenuItem mnuNuevo2;
     // End of variables declaration//GEN-END:variables

}
