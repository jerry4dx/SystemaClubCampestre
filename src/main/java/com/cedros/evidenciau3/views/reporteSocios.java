/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.cedros.evidenciau3.views;

import com.cedros.evidenciau3.SociosImpl;
import static com.cedros.evidenciau3.guiCedros.ShowJPanel;
import com.cedros.evidenciau3.interfaces.SociosInt;
import com.cedros.evidenciau3.models.Socios;
import java.awt.Color;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jerry
 */
public class reporteSocios extends javax.swing.JPanel {

    /**
     * Creates new form Principal
     */
    public reporteSocios() {
        initComponents();
        initEstilos();
        ReporteDeSocios();
    }
    
    public void initEstilos(){
        //bg.background = #fff;
        tituloLabel.setText("Consultar Socio");
        tituloLabel.putClientProperty( "FlatLaf.styleClass", "h1" );
        //NomTxt.putClientProperty("JTextField.placeholderText", "Nombre:");
        //NomTxt.putClientProperty( "FlatLaf.styleClass", "h3" );
        //ApeTxt.putClientProperty("JTextField.placeholderText", "Apellidos:");
        //ApeTxt.putClientProperty( "FlatLaf.styleClass", "h3" );
    }
    //Vaciamos los datos en la jtable
    private void ReporteDeSocios() {
        try {
            SociosInt socioint = new SociosImpl();
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            socioint.listarSocios("","").forEach((u) -> model.addRow(new Object[]{u
                    .getFolioSocio()
                    , u.getNombre(), u.getApellidos(), u.getTelefono()
                    , u.getDomicilio(), u.getActividades(), u.getVigencia()}));
        } catch (Exception e) {
            System.out.println(e.getMessage());
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

        noRegistrado = new javax.swing.JOptionPane();
        bg = new javax.swing.JPanel();
        tituloLabel = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        bg.setMinimumSize(new java.awt.Dimension(1024, 650));
        bg.setPreferredSize(new java.awt.Dimension(1024, 650));

        tituloLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Folio", "Nombre", "Apellidos", "telefono", "Domicilio", "Actividades", "Vigencia"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(120, 120, 120))
            .addGroup(bgLayout.createSequentialGroup()
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(tituloLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, bgLayout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 851, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(tituloLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(89, 89, 89))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        // Regresar al panel princial:
        ShowJPanel(new Principal());
    }//GEN-LAST:event_btnRegresarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JOptionPane noRegistrado;
    private javax.swing.JLabel tituloLabel;
    // End of variables declaration//GEN-END:variables
}
