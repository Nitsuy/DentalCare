/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Vista;

import Modelo.Conexion;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author andre
 */
public class Gestion1 extends javax.swing.JPanel {

    /**
     * Creates new form Gestion1
     */
    public Gestion1(String ci) {
        initComponents();
        try{
         Connection cn = Conexion.conectarBD();
         PreparedStatement pst = cn.prepareStatement("select * from pacientes where Cedula = '" + ci + "'");

         ResultSet rs = pst.executeQuery();
         
         if(rs.next()){
             
             
             TextNombres.setText(rs.getString("Nombre"));
             TextCedula.setText(rs.getString("Cedula"));
             TextDireccion.setText(rs.getString("Direccion"));
             TextEdad.setText(rs.getString("Edad"));
             //TextSexo.setText(rs.getString("Especialidad"));
             TextTelefono.setText(rs.getString("Telefono"));
             TextCorreo.setText(rs.getString("Correo"));
             TextObservaciones.setText(rs.getString("Observaciones"));
             
         }
         
        cn.close();
     }catch(Exception e){
         System.out.println("Error en cargar usuario " + e);
        // JOptionPane.showMessageDialog(null), "ESCRIBALE A ANDI");
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

        panelRound1 = new Modelo.PanelRound();
        jLabel12 = new javax.swing.JLabel();
        Principal = new javax.swing.JPanel();
        panelRound2 = new Modelo.PanelRound();
        TextNombres = new javax.swing.JTextField();
        TextTelefono = new javax.swing.JTextField();
        TextCorreo = new javax.swing.JTextField();
        TextDireccion = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        TextEdad = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        panelRound4 = new Modelo.PanelRound();
        jLabel2 = new javax.swing.JLabel();
        TextCedula = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        RBFemenino = new javax.swing.JRadioButton();
        RBMasculino = new javax.swing.JRadioButton();
        jLabel18 = new javax.swing.JLabel();
        TextObservaciones = new javax.swing.JTextField();
        rSButtonMetro2 = new rsbuttom.RSButtonMetro();
        Error_Direccion = new javax.swing.JTextField();
        Error_Nombre = new javax.swing.JTextField();
        Error_Cedula = new javax.swing.JTextField();
        Error_Telefono = new javax.swing.JTextField();
        Error_Edad = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        Error_Correo = new javax.swing.JTextField();
        BEliminar = new javax.swing.JButton();
        panelRound3 = new Modelo.PanelRound();
        jLabel15 = new javax.swing.JLabel();

        panelRound1.setBackground(new java.awt.Color(5, 179, 242));
        panelRound1.setRoundBottomLeft(50);
        panelRound1.setRoundBottomRight(50);
        panelRound1.setRoundTopLeft(50);
        panelRound1.setRoundTopRight(50);

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("GESTIÓN DE PACIENTES");

        javax.swing.GroupLayout panelRound1Layout = new javax.swing.GroupLayout(panelRound1);
        panelRound1.setLayout(panelRound1Layout);
        panelRound1Layout.setHorizontalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addGap(188, 188, 188)
                .addComponent(jLabel12)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelRound1Layout.setVerticalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        Principal.setBackground(new java.awt.Color(153, 153, 255));

        panelRound2.setBackground(new java.awt.Color(204, 204, 204));
        panelRound2.setRoundBottomLeft(50);
        panelRound2.setRoundBottomRight(50);
        panelRound2.setRoundTopLeft(50);
        panelRound2.setRoundTopRight(50);
        panelRound2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TextNombres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextNombresActionPerformed(evt);
            }
        });
        TextNombres.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TextNombresKeyTyped(evt);
            }
        });
        panelRound2.add(TextNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 240, 30));

        TextTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextTelefonoActionPerformed(evt);
            }
        });
        TextTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TextTelefonoKeyTyped(evt);
            }
        });
        panelRound2.add(TextTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(142, 250, 130, 30));

        TextCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextCorreoActionPerformed(evt);
            }
        });
        TextCorreo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TextCorreoKeyTyped(evt);
            }
        });
        panelRound2.add(TextCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 250, 240, 30));

        TextDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextDireccionActionPerformed(evt);
            }
        });
        TextDireccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TextDireccionKeyTyped(evt);
            }
        });
        panelRound2.add(TextDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 130, 232, 30));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(64, 64, 64));
        jLabel1.setText("Nombre Completo");
        panelRound2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 194, 20));

        TextEdad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextEdadActionPerformed(evt);
            }
        });
        TextEdad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TextEdadKeyTyped(evt);
            }
        });
        panelRound2.add(TextEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 250, 100, 30));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(64, 64, 64));
        jLabel10.setText("Dirección corta");
        panelRound2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 90, 194, 20));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(64, 64, 64));
        jLabel11.setText("Correo electrónico");
        panelRound2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 220, 194, 20));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(64, 64, 64));
        jLabel13.setText("Teléfono");
        panelRound2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 194, 20));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(64, 64, 64));
        jLabel14.setText("Sexo");
        panelRound2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 350, 194, -1));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(64, 64, 64));
        jLabel16.setText("Edad");
        panelRound2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 210, 80, -1));

        panelRound4.setBackground(new java.awt.Color(145, 168, 213));
        panelRound4.setRoundBottomLeft(50);
        panelRound4.setRoundBottomRight(50);
        panelRound4.setRoundTopLeft(50);
        panelRound4.setRoundTopRight(50);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Datos del paciente");

        javax.swing.GroupLayout panelRound4Layout = new javax.swing.GroupLayout(panelRound4);
        panelRound4.setLayout(panelRound4Layout);
        panelRound4Layout.setHorizontalGroup(
            panelRound4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound4Layout.createSequentialGroup()
                .addGap(336, 336, 336)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(365, Short.MAX_VALUE))
        );
        panelRound4Layout.setVerticalGroup(
            panelRound4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelRound2.add(panelRound4, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 15, 910, -1));

        TextCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextCedulaActionPerformed(evt);
            }
        });
        TextCedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TextCedulaKeyTyped(evt);
            }
        });
        panelRound2.add(TextCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 130, 236, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(64, 64, 64));
        jLabel3.setText("Cédula");
        panelRound2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 90, 194, 20));

        RBFemenino.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        RBFemenino.setText("Femenino");
        RBFemenino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBFemeninoActionPerformed(evt);
            }
        });
        panelRound2.add(RBFemenino, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 400, -1, -1));

        RBMasculino.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        RBMasculino.setText("Masculino");
        RBMasculino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBMasculinoActionPerformed(evt);
            }
        });
        panelRound2.add(RBMasculino, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 400, -1, -1));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(64, 64, 64));
        jLabel18.setText("Observaciones");
        panelRound2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 340, 194, -1));

        TextObservaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextObservacionesActionPerformed(evt);
            }
        });
        panelRound2.add(TextObservaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 380, 481, 80));

        rSButtonMetro2.setText("Modificar");
        rSButtonMetro2.setColorHover(new java.awt.Color(104, 255, 104));
        rSButtonMetro2.setColorNormal(new java.awt.Color(113, 226, 113));
        rSButtonMetro2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonMetro2ActionPerformed(evt);
            }
        });
        panelRound2.add(rSButtonMetro2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 470, 215, 50));

        Error_Direccion.setEditable(false);
        Error_Direccion.setBackground(new java.awt.Color(0,0,0,1));
        Error_Direccion.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        Error_Direccion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Error_Direccion.setBorder(null);
        panelRound2.add(Error_Direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 160, 210, 20));

        Error_Nombre.setEditable(false);
        Error_Nombre.setBackground(new java.awt.Color(0,0,0,1));
        Error_Nombre.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        Error_Nombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Error_Nombre.setBorder(null);
        panelRound2.add(Error_Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 210, 20));

        Error_Cedula.setEditable(false);
        Error_Cedula.setBackground(new java.awt.Color(0,0,0,1));
        Error_Cedula.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Error_Cedula.setBorder(null);
        panelRound2.add(Error_Cedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 160, 220, -1));

        Error_Telefono.setEditable(false);
        Error_Telefono.setBackground(new java.awt.Color(0,0,0,1));
        Error_Telefono.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Error_Telefono.setBorder(null);
        panelRound2.add(Error_Telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 287, 220, 20));

        Error_Edad.setEditable(false);
        Error_Edad.setBackground(new java.awt.Color(0,0,0,1));
        Error_Edad.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        Error_Edad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Error_Edad.setBorder(null);
        panelRound2.add(Error_Edad, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 280, 150, 20));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "0212", "0412", "0414", "0424", "0416", "0426" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        panelRound2.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 90, 30));

        Error_Correo.setEditable(false);
        Error_Correo.setBackground(new java.awt.Color(0,0,0,1));
        Error_Correo.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        Error_Correo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Error_Correo.setBorder(null);
        panelRound2.add(Error_Correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 280, 200, 20));

        BEliminar.setText("Eliminar");
        BEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BEliminarActionPerformed(evt);
            }
        });
        panelRound2.add(BEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 480, -1, -1));

        panelRound3.setBackground(new java.awt.Color(5, 179, 242));
        panelRound3.setRoundBottomLeft(50);
        panelRound3.setRoundBottomRight(50);
        panelRound3.setRoundTopLeft(50);
        panelRound3.setRoundTopRight(50);

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("GESTIÓN DE PACIENTES");

        javax.swing.GroupLayout panelRound3Layout = new javax.swing.GroupLayout(panelRound3);
        panelRound3.setLayout(panelRound3Layout);
        panelRound3Layout.setHorizontalGroup(
            panelRound3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound3Layout.createSequentialGroup()
                .addGap(188, 188, 188)
                .addComponent(jLabel15)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelRound3Layout.setVerticalGroup(
            panelRound3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout PrincipalLayout = new javax.swing.GroupLayout(Principal);
        Principal.setLayout(PrincipalLayout);
        PrincipalLayout.setHorizontalGroup(
            PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PrincipalLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(panelRound2, javax.swing.GroupLayout.PREFERRED_SIZE, 950, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
            .addGroup(PrincipalLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(panelRound3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        PrincipalLayout.setVerticalGroup(
            PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelRound3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelRound2, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void TextNombresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextNombresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextNombresActionPerformed

    private void TextNombresKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextNombresKeyTyped
        int key = evt.getKeyChar();

        boolean mayusculas = key >= 65 && key <= 90;
        boolean minusculas = (key >= 97 && key <= 122) || key==127 || key==8;
        boolean espacio = key == 32;

        if (!(minusculas || mayusculas || espacio)){

            Error_Nombre.setText("No se aceptan caracteres especiales ni numeros");
            //JOptionPane.showMessageDialog(null, "ADVERTENCIA No se aceptan caracteres especiales ni numeros (solo letras)","WARNING_MESSAGE", JOptionPane.WARNING_MESSAGE);

            evt.consume();
        }
    }//GEN-LAST:event_TextNombresKeyTyped

    private void TextTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextTelefonoActionPerformed

    private void TextTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextTelefonoKeyTyped
        int key = evt.getKeyChar();

        boolean numeros = (key >= 48 && key <= 57) || key==127 || key==8;

        if (!numeros)
        {
            Error_Telefono.setText("No se aceptan caracteres especiales ni letras");
            //JOptionPane.showMessageDialog(null, "ADVERTENCIA no se aceptan caracteres especiales ni letras (solo numeros)","WARNING_MESSAGE", JOptionPane.WARNING_MESSAGE);
            evt.consume();
        }
        if (TextTelefono.getText().trim().length() >=7) {
            Error_Telefono.setText("Seleccione e ingrese los últimos 7 dígitos");
            //JOptionPane.showMessageDialog(null, "ADVERTENCIA el telefono debe tener 7 digitos","WARNING_MESSAGE", JOptionPane.WARNING_MESSAGE);
            evt.consume();
        }
    }//GEN-LAST:event_TextTelefonoKeyTyped

    private void TextCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextCorreoActionPerformed

    private void TextCorreoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextCorreoKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_TextCorreoKeyTyped

    private void TextDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextDireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextDireccionActionPerformed

    private void TextDireccionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextDireccionKeyTyped
        int key = evt.getKeyChar();
        boolean mayusculas = key >= 65 && key <= 90;
        boolean minusculas = (key >= 97 && key <= 122) || key==127 || key==8;
        boolean espacio = key == 32;
        boolean numeros= (key >= 48 && key <= 57);
        if (!(minusculas || mayusculas || espacio || numeros)){
            
            Error_Direccion.setText("No se aceptan caracteres especiales.");
            //JOptionPane.showMessageDialog(null, "ADVERTENCIA No se aceptan caracteres especiales","WARNING_MESSAGE", JOptionPane.WARNING_MESSAGE);

            evt.consume();
        }
    }//GEN-LAST:event_TextDireccionKeyTyped

    private void TextEdadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextEdadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextEdadActionPerformed

    private void TextEdadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextEdadKeyTyped
        int key = evt.getKeyChar();
        boolean numeros = (key >= 48 && key <= 57) || key==127 || key==8;
        if (!numeros)
        {
            Error_Edad.setText("No se aceptan caracteres especiales ni letras (sólo números)");
            //JOptionPane.showMessageDialog(null, "ADVERTENCIA no se aceptan caracteres especiales ni letras (solo numeros)","WARNING_MESSAGE", JOptionPane.WARNING_MESSAGE);
            evt.consume();
        }
    }//GEN-LAST:event_TextEdadKeyTyped

    private void TextCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextCedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextCedulaActionPerformed

    private void TextCedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextCedulaKeyTyped
        int key = evt.getKeyChar();

        boolean numeros = (key >= 48 && key <= 57) || key==127 || key==8;

        if (!numeros)
        {
            Error_Cedula.setText("No se aceptan caracteres especiales ni letras");
            //JOptionPane.showMessageDialog(null, "ADVERTENCIA no se aceptan caracteres especiales ni letras","WARNING_MESSAGE", JOptionPane.WARNING_MESSAGE);
            evt.consume();
        }
        if (TextCedula.getText().trim().length() >=8) {
            Error_Cedula.setText("La cedula debe tener 6-8 digitos");
            //JOptionPane.showMessageDialog(null, "ADVERTENCIA la cedula debe tener 6-8 digitos","WARNING_MESSAGE", JOptionPane.WARNING_MESSAGE);
            evt.consume();
        }
    }//GEN-LAST:event_TextCedulaKeyTyped

    private void RBFemeninoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBFemeninoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RBFemeninoActionPerformed

    private void RBMasculinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBMasculinoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RBMasculinoActionPerformed

    private void TextObservacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextObservacionesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextObservacionesActionPerformed

    private void rSButtonMetro2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonMetro2ActionPerformed
        int validacion=0;
        String nombre,ci, direccion, telefono,correo, edad,observaciones;

        nombre = TextNombres.getText().trim();
        ci = TextCedula.getText().trim();
        direccion = TextDireccion.getText().trim();
        telefono = TextTelefono.getText().trim();
        correo = TextCorreo.getText().trim();
        edad = TextEdad.getText().trim();
        observaciones = TextObservaciones.getText().trim();

        if(correo.equals("")){
            TextCorreo.setBackground(Color.red);
            validacion ++;
        }
        if(nombre.equals("")){
            TextNombres.setBackground(Color.red);
            validacion ++;
        }
        /*if(cedula.equals("")){
            TextCedula.setBackground(Color.red);
            validacion ++;
        }*/
        if(direccion.equals("")){
            TextDireccion.setBackground(Color.red);
            validacion ++;
        }
        if(telefono.equals("")){
            TextTelefono.setBackground(Color.red);
            validacion ++;
        }
        if(correo.equals("")){
            TextCorreo.setBackground(Color.red);
            validacion ++;
        }
        if(edad.equals("")){
            TextEdad.setBackground(Color.red);
            validacion ++;
        }

        if(validacion==0){
            try{
                  Connection cn2 = Conexion.conectarBD();
                  String Ssql = "UPDATE pacientes SET Nombre= ?, Direccion= ?, Telefono= ?, Correo= ?, Edad= ?, Observaciones= ? " + "WHERE Cedula = '" + ci + "'";
                  PreparedStatement pst2 = cn2.prepareStatement(Ssql);

                            pst2.setString(1,nombre );
                           
                            pst2.setString(2, direccion);
                            pst2.setString(3,telefono );
                            pst2.setString(4,correo );
                            pst2.setString(5, edad);
                           
                            pst2.setString(6, observaciones);

                            pst2.executeUpdate();
                            cn2.close();
                            JOptionPane.showMessageDialog(this, "Se han guardado los cambios.","", JOptionPane.PLAIN_MESSAGE);

                          //  Limpiar();

                        }catch (Exception e){

                        }
                    }else{
                        JOptionPane.showMessageDialog(null,"Los campos no están completos");
                    }
                


    }//GEN-LAST:event_rSButtonMetro2ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void BEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BEliminarActionPerformed
       String ci= TextCedula.getText();
        try {
            Connection cn = Conexion.conectarBD();
            String sql = "DELETE FROM pacientes WHERE Cedula = '" + ci + "'"; // le indico a quien debe borra pasandole la cedula
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.executeUpdate();
            cn.close();
            JOptionPane.showMessageDialog(null,"¡El cliente fue eliminado con éxito!");
            
        } catch (Exception e) {
           System.err.println("Error al eliminar al usuario de la tabla." + e);
           JOptionPane.showMessageDialog(null, "Debe estara ctivo la base de datos, ¡Contacte al administrador!");}
    }//GEN-LAST:event_BEliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BEliminar;
    private javax.swing.JTextField Error_Cedula;
    private javax.swing.JTextField Error_Correo;
    private javax.swing.JTextField Error_Direccion;
    private javax.swing.JTextField Error_Edad;
    private javax.swing.JTextField Error_Nombre;
    private javax.swing.JTextField Error_Telefono;
    private javax.swing.JPanel Principal;
    private javax.swing.JRadioButton RBFemenino;
    private javax.swing.JRadioButton RBMasculino;
    private javax.swing.JTextField TextCedula;
    private javax.swing.JTextField TextCorreo;
    private javax.swing.JTextField TextDireccion;
    private javax.swing.JTextField TextEdad;
    private javax.swing.JTextField TextNombres;
    private javax.swing.JTextField TextObservaciones;
    private javax.swing.JTextField TextTelefono;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private Modelo.PanelRound panelRound1;
    private Modelo.PanelRound panelRound2;
    private Modelo.PanelRound panelRound3;
    private Modelo.PanelRound panelRound4;
    private rsbuttom.RSButtonMetro rSButtonMetro2;
    // End of variables declaration//GEN-END:variables
}
