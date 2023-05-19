/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Vista;

import Controlador.Controller;
import Modelo.Conexion;
import Modelo.Odontologo;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.awt.event.MouseEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author andre
 */
public class GestionOdontologos extends javax.swing.JPanel {

    Controller control;
///////////////////////
    String CeduNom;
   
////////////////
    Connection cn = Conexion.conectarBD();
    DefaultTableModel model = new DefaultTableModel();
    public static String Nombre = "";
    public static String Cedula = "";
    public static String Direccion = "";
    public static String Usuario = "";
    public static String Telefono = "";
    public static String Correo = "";
    public static String Especialidad = "";
    public static String Cargo = "";
    public static String Clave = "";

    /**
     * Creates new form GestionOdontologos1
     */
    public GestionOdontologos() {
        initComponents();
        control = new Controller();
        
        //control.LlenarTablaOdontolgo(TablaOdontologos);
       try {
            Connection cn = Conexion.conectarBD();
            PreparedStatement pst = cn.prepareStatement("select Nombre, Cedula, Direccion, Telefono, Correo, Usuario from odontologos");

            ResultSet rs = pst.executeQuery();

            TablaOdontologos = new JTable(model);
            jScrollPaneO.setViewportView(TablaOdontologos);

            model.addColumn("Nombre");
            model.addColumn("Cédula");
            model.addColumn("Direccion");
            model.addColumn("Teléfono");
            model.addColumn("Correo");
            model.addColumn("Usuario");
            

            while (rs.next()) {
                Object[] fila = new Object[6];

                for (int i = 0; i < 6; i++) {
                    fila[i] = rs.getObject(i + 1);

                }

                model.addRow(fila);
            }
            cn.close();

        } catch (Exception e) {
            System.out.println("Error al llenar tabla" + e);
        }

        /*TablaOdontologos.addMouseListener(new MouseAdapter() {
          @Override
          public void mouseClicked(MouseEvent e){
             int fila_point = TablaOdontologos.rowAtPoint(e.getPoint());
                          
             if(fila_point > -1){
            
                Nombre = (String)model.getValueAt(fila_point, 0);
                Cedula = (String)model.getValueAt(fila_point, 1);
                Usuario = (String)model.getValueAt(fila_point, 2);
                Telefono = (String)model.getValueAt(fila_point, 3);
                Correo = (String)model.getValueAt(fila_point, 4);
                Especialidad = (String)model.getValueAt(fila_point, 5);
                
                modificar destino = new modificar();
                control.ConectarPanel(jPanel2, destino,  960, 639, 0, 0);  
                 
            }
          }
        });*/
        
       /* int fila=TablaOdontologos.getSelectedRow(); //llamar tabla odontologo
        if (fila>=0) {
            String Cedula;
            Cedula= TablaOdontologos.getValueAt(fila, 1).toString().trim(); // pa pso 1 es la ced (se empieza desde 0)
            Odontologo per = new Odontologo();
            try {
                Statement pst = cn.createStatement();
                ResultSet rs= pst.executeQuery("SELECT * FROM odontologos WHERE Cedula= "+Cedula);
                String datos[]= new String[9]; 
                
                while (rs.next()) {

                    datos[0]=rs.getString(1); //nombre
                    datos[1]=rs.getString(2);//cedula
                    datos[2]=rs.getString(3);//direccion
                    datos[3]=rs.getString(4); //telefono
                    datos[4]=rs.getString(5); //correo
                    datos[5]=rs.getString(6); //cargo
                    datos[6]=rs.getString(7); //usuario
                    datos[7]=rs.getString(8); //clave
                    datos[8]=rs.getString(9); //fecha_ingreso
                    datos[9]=rs.getString(10); //Especialidad
                    datos[10]=rs.getString(11); //Admin
                    datos[11]=rs.getString(12); //Observaciones
                    per.IngresarDatos(datos[2], datos[1],datos[0], datos[3], datos[4], datos[5], datos[6], datos[7], datos[8], datos[9],datos[10],datos[11]);
                    
                }                   
            } catch (Exception e) {
                System.err.println("Error al consultar al usuario de la tabla." + e);
                JOptionPane.showMessageDialog(null, "Debe estara ctivo la base de datos, ¡Contacte al administrador!");
            }*/

    }

    public GestionOdontologos(String CeduNom) {
        this.CeduNom = CeduNom;
        initComponents();
        control = new Controller();
        //control.LlenarTablaOdontolgo(TablaOdontologos);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BModificarP = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        panelRound15 = new Modelo.PanelRound();
        BuscarTodo = new javax.swing.JTextField();
        rSButtonMetro1 = new rsbuttom.RSButtonMetro();
        jScrollPaneO = new javax.swing.JScrollPane();
        TablaOdontologos = new javax.swing.JTable();
        BModi = new javax.swing.JButton();
        panelRound2 = new Modelo.PanelRound();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        panelRound1 = new Modelo.PanelRound();
        jLabel12 = new javax.swing.JLabel();

        BModificarP.setBackground(new java.awt.Color(84, 84, 246));
        BModificarP.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        BModificarP.setForeground(new java.awt.Color(255, 255, 255));
        BModificarP.setText("Modificar Perfil");
        BModificarP.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BModificarP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BModificarPMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BModificarPMouseExited(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(204, 249, 255));

        panelRound15.setBackground(new java.awt.Color(5, 179, 242));
        panelRound15.setRoundBottomLeft(50);
        panelRound15.setRoundBottomRight(50);
        panelRound15.setRoundTopLeft(50);
        panelRound15.setRoundTopRight(50);

        BuscarTodo.setBackground(new java.awt.Color(204, 204, 204));
        BuscarTodo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BuscarTodo.setForeground(new java.awt.Color(255, 255, 255));
        BuscarTodo.setText("Ingrese datos del odontólogo...");
        BuscarTodo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                BuscarTodoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                BuscarTodoFocusLost(evt);
            }
        });
        BuscarTodo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BuscarTodoMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BuscarTodoMouseExited(evt);
            }
        });
        BuscarTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarTodoActionPerformed(evt);
            }
        });
        BuscarTodo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                BuscarTodoKeyPressed(evt);
            }
        });

        rSButtonMetro1.setText("Agregar");
        rSButtonMetro1.setColorHover(new java.awt.Color(104, 255, 104));
        rSButtonMetro1.setColorNormal(new java.awt.Color(113, 226, 113));
        rSButtonMetro1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonMetro1ActionPerformed(evt);
            }
        });

        TablaOdontologos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPaneO.setViewportView(TablaOdontologos);

        BModi.setBackground(new java.awt.Color(0, 0, 102));
        BModi.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BModi.setForeground(new java.awt.Color(255, 255, 255));
        BModi.setText("Consultar");
        BModi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BModi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BModiMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BModiMouseExited(evt);
            }
        });
        BModi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BModiActionPerformed(evt);
            }
        });

        panelRound2.setBackground(new java.awt.Color(88, 234, 253));
        panelRound2.setRoundBottomLeft(50);
        panelRound2.setRoundBottomRight(50);
        panelRound2.setRoundTopLeft(50);
        panelRound2.setRoundTopRight(50);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Lista de Odontólogos registrados");

        javax.swing.GroupLayout panelRound2Layout = new javax.swing.GroupLayout(panelRound2);
        panelRound2.setLayout(panelRound2Layout);
        panelRound2Layout.setHorizontalGroup(
            panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound2Layout.createSequentialGroup()
                .addGap(266, 266, 266)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelRound2Layout.setVerticalGroup(
            panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout panelRound15Layout = new javax.swing.GroupLayout(panelRound15);
        panelRound15.setLayout(panelRound15Layout);
        panelRound15Layout.setHorizontalGroup(
            panelRound15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound15Layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(panelRound15Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(panelRound15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound15Layout.createSequentialGroup()
                        .addComponent(BuscarTodo, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelRound15Layout.createSequentialGroup()
                        .addGroup(panelRound15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rSButtonMetro1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelRound15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(BModi, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPaneO, javax.swing.GroupLayout.DEFAULT_SIZE, 820, Short.MAX_VALUE)
                                .addComponent(panelRound2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        panelRound15Layout.setVerticalGroup(
            panelRound15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rSButtonMetro1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelRound2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BuscarTodo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPaneO, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BModi, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1011, 1011, 1011))
        );

        panelRound1.setBackground(new java.awt.Color(5, 179, 242));
        panelRound1.setRoundBottomLeft(50);
        panelRound1.setRoundBottomRight(50);
        panelRound1.setRoundTopLeft(50);
        panelRound1.setRoundTopRight(50);

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("GESTIÓN DE ODONTÓLOGOS");

        javax.swing.GroupLayout panelRound1Layout = new javax.swing.GroupLayout(panelRound1);
        panelRound1.setLayout(panelRound1Layout);
        panelRound1Layout.setHorizontalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addGap(144, 144, 144)
                .addComponent(jLabel12)
                .addContainerGap(149, Short.MAX_VALUE))
        );
        panelRound1Layout.setVerticalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelRound1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelRound15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(132, 132, 132))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelRound15, javax.swing.GroupLayout.PREFERRED_SIZE, 524, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(415, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BModificarPMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BModificarPMouseEntered

    }//GEN-LAST:event_BModificarPMouseEntered

    private void BModificarPMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BModificarPMouseExited

    }//GEN-LAST:event_BModificarPMouseExited

    private void BuscarTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarTodoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BuscarTodoActionPerformed

    private void rSButtonMetro1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonMetro1ActionPerformed
        RegistrarOdontologo destino = new RegistrarOdontologo();
        control.ConectarPanel(jPanel2, destino, 960, 639, 1, 0);
    }//GEN-LAST:event_rSButtonMetro1ActionPerformed

    private void BuscarTodoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BuscarTodoKeyPressed

        String[] columna = {"Nombre", "Cedula", "Telefono", "Correo", "Usuario", "Clave", "F. Ingreso", "Especialidad"}; // se modifico
        String[] registros = new String[8];

        DefaultTableModel dtm = new DefaultTableModel(null, columna) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        String ssql = "SELECT *FROM odontologos WHERE Nombre LIKE '%" + BuscarTodo.getText() + "%' "
                + "OR Cedula LIKE '%" + BuscarTodo.getText() + "%'"
                + "OR Correo LIKE '%" + BuscarTodo.getText() + "%'"
                + "OR Telefono LIKE '%" + BuscarTodo.getText() + "%'"
                + "OR Especialidad LIKE '%" + BuscarTodo.getText() + "%'";
        try {
            Statement stm = (Statement) cn.createStatement();
            ResultSet res = stm.executeQuery(ssql);

            while (res.next()) {

                registros[0] = res.getString(1); //nombre
                registros[1] = res.getString(2); //cedula
                registros[2] = res.getString(4); //telefono
                registros[3] = res.getString(5); //correo               
                registros[4] = res.getString(7); //user
                registros[5] = res.getString(8); // clave
                registros[6] = res.getString(9); // Fecha Ingreso
                registros[7] = res.getString(10); //especialidad

                dtm.addRow(registros);
            }
            TablaOdontologos.setModel(dtm);
        } catch (SQLException e) {
            System.err.println("Error al ingresarlo en la BD " + e);
            JOptionPane.showMessageDialog(null, "¡Contacte al administrador!");
        }
    }//GEN-LAST:event_BuscarTodoKeyPressed

    
    
    
    private void BModiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BModiActionPerformed
         
        int fila=TablaOdontologos.getSelectedRow(); //llamar tabla odontologo
    if (fila>-1) {
        String Cedula_new= TablaOdontologos.getValueAt(fila, 1).toString().trim();
        
        
        /*TablaOdontologos.addMouseListener(new MouseAdapter() {
          @Override
          public void mouseClicked(MouseEvent e){
             int fila_point = TablaOdontologos.rowAtPoint(e.getPoint());
                          
             if(fila_point > -1){
            
                Nombre = (String)model.getValueAt(fila_point, 0);
                Cedula = (String)model.getValueAt(fila_point, 1);
                Usuario = (String)model.getValueAt(fila_point, 2);
                Telefono = (String)model.getValueAt(fila_point, 3);
                Correo = (String)model.getValueAt(fila_point, 4);
                Especialidad = (String)model.getValueAt(fila_point, 5);*/
                
                GestionOdontologos1 destino = new GestionOdontologos1(Cedula_new);
                control.ConectarPanel(jPanel2, destino,  960, 639, 0, 0);  
                 
            }
    else{
        JOptionPane.showMessageDialog(null, "Debe seleccionar un odontólogo antes de consultar");
    }
        //  }
       // });
    }//GEN-LAST:event_BModiActionPerformed

    private void BModiMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BModiMouseEntered
        BModi.setBackground(new Color(4,119,255));
    }//GEN-LAST:event_BModiMouseEntered

    private void BModiMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BModiMouseExited
         BModi.setBackground(new Color(0,0,102));
    }//GEN-LAST:event_BModiMouseExited

    private void BuscarTodoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_BuscarTodoFocusGained
        
        if(BuscarTodo.getText().equals("Ingrese datos del odontólogo...")){
            BuscarTodo.setText("");
            
        }
        
        BuscarTodo.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_BuscarTodoFocusGained

    private void BuscarTodoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BuscarTodoMouseClicked
        BuscarTodo.setBackground(new Color(255,255,255));
        BuscarTodo.setForeground(new Color(0,0,0));
    }//GEN-LAST:event_BuscarTodoMouseClicked

    private void BuscarTodoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BuscarTodoMouseExited
        
    }//GEN-LAST:event_BuscarTodoMouseExited

    private void BuscarTodoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_BuscarTodoFocusLost
        if(BuscarTodo.getText().trim().equals("") ){
            BuscarTodo.setText("Ingrese datos del odontólogo...");
            
        }
        
        BuscarTodo.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_BuscarTodoFocusLost
 
    
    /*public void PlaceHolder(){
        JPlaceHolderTextField up = new JPlaceHolderTextField("Escriba",BuscarTodo);
    }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BModi;
    private javax.swing.JButton BModificarP;
    private javax.swing.JTextField BuscarTodo;
    private javax.swing.JTable TablaOdontologos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPaneO;
    private Modelo.PanelRound panelRound1;
    private Modelo.PanelRound panelRound15;
    private Modelo.PanelRound panelRound2;
    private rsbuttom.RSButtonMetro rSButtonMetro1;
    // End of variables declaration//GEN-END:variables
}
