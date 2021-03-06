/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p2amc;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Migue
 */
public class Test extends javax.swing.JFrame {

    List<Punto> Lista = new ArrayList<Punto>();
    Par Sol = new Par();
    FuerzaBruta FB = new FuerzaBruta();
    DivideVenceras DV = new DivideVenceras();

    private void CompararMetodos(int opcion) {
        //Limpio los TextArea
        jTextArea1.setText(null);
        jTextArea2.setText(null);
        switch(opcion)
        {
            case 1: //En este caso creo una lista con la talla que hemos elegido
                    P2AMC.crearLista(Lista, Integer.parseInt(jTextField1.getText()));
                    break;    
            case 2: //Creo una lista con 300.000 elementos
                    P2AMC.crearLista(Lista, 300000);
                    break;
            default: break;
        }
        Sol = FB.Test(Lista); //ejecuto el metodo de fuerza bruta y relleno el textArea correspondiente
        jTextArea1.append("Punto " + Sol.getP1().getId() + " en: (" + Sol.getP1().getX() + "," + Sol.getP1().getY() + ")\n");
        jTextArea1.append("Punto " + Sol.getP2().getId() + " en: (" + Sol.getP2().getX() + "," + Sol.getP2().getY() + ")\n");
        jTextArea1.append("Distancia minima: " + Sol.getDistancia() + "\n");
        jTextArea1.append("Tiempo transcurrido (ms): " + Sol.getTiempo());

        Sol = DV.Test(Lista); //Ejecuto Divide y Venceras y muestro los resultados
        jTextArea2.append("Punto " + Sol.getP1().getId() + " en: (" + Sol.getP1().getX() + "," + Sol.getP1().getY() + ")\n");
        jTextArea2.append("Punto " + Sol.getP2().getId() + " en: (" + Sol.getP2().getX() + "," + Sol.getP2().getY() + ")\n");
        jTextArea2.append("Distancia minima: " + Sol.getDistancia() + "\n");
        jTextArea2.append("Tiempo transcurrido (ms): " + Sol.getTiempo());
    }

    /**
     * Creates new form Test
     */
    public Test(int opcion) {
        initComponents();
        Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
        int height = pantalla.height;
        int width = pantalla.width;
        setSize(width / 2, height / 2); //Para centrar y mostrar un tamaño acorde a la resolucion de la pantalla
        setLocationRelativeTo(null);

        switch (opcion)
        {   //En funcion del caso oculto o no los lementos que no necesito
            case 1: jLabel1.setText("Comprobación de los métodos");
                    jButton2.setVisible(false);
                    jLabel5.setVisible(false);
                    break;
            case 2: jLabel1.setText("Comparacion de los métodos para 300.000 puntos");
                    jButton1.setText("Comprobar");
                    jButton2.setVisible(false);
                    jTextField1.setVisible(false);
                    jLabel2.setVisible(false);
                    jLabel5.setVisible(false);
                    CompararMetodos(2);
                    break;
            case 3: jLabel1.setText("Aplicación práctica de los métodos");
                    jButton1.setVisible(false);
                    jTextField1.setVisible(false);
                    jLabel2.setVisible(false);
                    break;
        }
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
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Par de puntos más cercanos");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Comprobación de los métodos");

        jLabel2.setText("Talla de la nube de puntos:");

        jTextField1.setToolTipText("");

        jButton1.setText("Comprobar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel3.setText("Método exhaustivo");

        jLabel4.setText("Método Divide y Venceras");

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        jButton2.setText("Cargar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel5.setText("Fichero");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(jLabel5))
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton1)))
                        .addGap(0, 45, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // Voy a probar el funcionamiento de los metodos. Si el campo de texto esta vacio muestro una ventana de error
        if (!jTextField1.getText().isEmpty()) {
            CompararMetodos(1);
        } else {
            JOptionPane.showMessageDialog(null, "Debe indicar una talla (mas de dos)");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // Vamos a cargar un fichero
        JFileChooser filechooser = new JFileChooser();
        filechooser.setCurrentDirectory(new File(".\\ficheros")); //Indico el directorio donde vamos a buscar
        Lista.clear();
        int returnVal = filechooser.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            P2AMC.leerFichero(filechooser.getSelectedFile().getAbsolutePath(), Lista);
            jLabel5.setText(filechooser.getSelectedFile().getAbsolutePath());
            CompararMetodos(0);
        } else {
            System.out.println("Cancelado por el usuario");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Test(1).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
