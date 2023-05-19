/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import static javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE;

import javax.swing.JComboBox;

import Modelo.Conexion;

import Modelo.Perfil;
import Modelo.Secretaria;
import Modelo.Odontologo;
import Modelo.Paciente;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;


import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;



/**
 *
 * @author Alex Altuve
 */
public final class Controller {
    JTextField textNombre, textSexo,textCedula,textDireccion, textTelefono, textCorreo, textCargo, textUsuario, textClave, textEspecialidad, txtObservaciones,textEdad; 
    JTextField Error_Nombre, Error_Cedula, Error_Correo, Error_Especialidad, Error_Edad, Error_Usuario, Error_Telefono;
    JComboBox ListTel, CbCargo;
/////////////////////////////////////    
    JRadioButton SexoF,SexoM;
    ButtonGroup AmbasOpciones;
///////////////////////////    
    JTable TablaPerfiles;
   /////////////////////////////         
    ArrayList<Perfil> Perfiles = new ArrayList<>();
    ArrayList<Paciente> Pacientes = new ArrayList<>();
    Connection cn = Conexion.conectarBD();
  //////////////////////////////
    
    
  
    public Controller() {
   
    }

  
    ////////////////////////Pacientes//////////////////////////////

    public Controller(JTextField textNombre, JTextField textCedula, JTextField textDireccion ,JTextField textTelefono, JTextField textCorreo,  JTextField textSexo, JTextField txtObservaciones, JTextField Error_Nombre, JTextField Error_Cedula, JTextField Error_Edad, JComboBox ListTel,JTextField Error_Telefono,JRadioButton SexoF,JTextField textEdad) {
        this.textNombre = textNombre;
        this.textCedula = textCedula;
        this.textTelefono = textTelefono;
        this.textDireccion = textDireccion;
        this.textCorreo = textCorreo;
        this.textSexo= textSexo;
        this.txtObservaciones = txtObservaciones;
        this.SexoF = SexoF;            
        this.Error_Telefono=Error_Telefono;
        this.Error_Nombre = Error_Nombre;
        this.Error_Cedula = Error_Cedula;
        this.Error_Edad = Error_Edad;
        this.textEdad=textEdad;
        
        this.ListTel = ListTel;
    }
    
    
    
    ////////////////////////////ODONTOLOGO/////////////////////////////////////////
    public Controller(JTextField textNombre, JTextField textCedula, JTextField textDireccion, JTextField textCorreo, JTextField textTelefono, JTextField textCargo, JTextField textUsuario, JTextField textClave, JTextField textEspecialidad, JTextField Error_Nombre, JTextField Error_Cedula, JTextField Error_Correo, JTextField Error_Telefono, JTextField Error_Especialidad, JComboBox ListTel, JTextField Error_Usuario,JTextField txtObservaciones) {
        this.textNombre = textNombre;
        this.textCedula = textCedula;
        this.textDireccion = textDireccion;
        this.textTelefono = textTelefono;
        this.textCorreo = textCorreo;
        this.textCargo = textCargo;
        this.textUsuario = textUsuario;
        this.textClave = textClave;
        this.textEspecialidad = textEspecialidad;
        this.txtObservaciones= txtObservaciones;
       
        this.Error_Nombre = Error_Nombre;
        this.Error_Cedula = Error_Cedula;
        this.Error_Correo = Error_Correo;
        this.Error_Especialidad = Error_Especialidad;
        this.Error_Usuario= Error_Usuario;
        this.Error_Telefono=Error_Telefono;
        
        this.ListTel = ListTel;
    }
  
    /////////////////////PERFIL///////////////////////////////////////////////
    public Controller(JTextField Nombre, JTextField Cedula, JTextField Direccion, JTextField Telefono, JTextField Correo, JTextField textCargo, JTextField Usuario, JTextField Clave,JTextField Error_Nombre, JTextField Error_Cedula, JTextField Error_Correo, JComboBox listTel, JTextField Error_Usuario,JTextField Error_Telefono){
        this.textNombre = Nombre;
        this.textCedula = Cedula;
        this.textDireccion = Direccion;
        this.textTelefono = Telefono;
        this.textCorreo = Correo;
        this.textCargo = textCargo;
        this.textUsuario = Usuario;
        this.textClave = Clave;
        
        this.Error_Nombre = Error_Nombre;
        this.Error_Cedula = Error_Cedula;
        this.Error_Correo = Error_Correo;
        this.Error_Usuario= Error_Usuario;
        this.Error_Telefono=Error_Telefono;
        
        this.ListTel = listTel;
    }
    
    ///////GESTION PERFIL///////////////////////////////

    public Controller(JTextField textNombre, JTextField textCedula, JTextField textDireccion, JTextField textTelefono, JTextField textCorreo, JComboBox CbCargo, JTextField textUsuario, JTextField textClave, JTextField Error_Nombre, JTextField Error_Cedula, JTextField Error_Correo, JComboBox ListTel, JTable ListaPerfiles,JTextField Error_Usuario, JTextField Error_Telefono) {
        this.textNombre = textNombre;
        this.textCedula = textCedula;
        this.textDireccion = textDireccion;
        this.textTelefono = textTelefono;
        this.textCorreo = textCorreo;
        this.textUsuario = textUsuario;
        this.textClave = textClave;
        
        this.Error_Nombre = Error_Nombre;
        this.Error_Cedula = Error_Cedula;
        this.Error_Correo = Error_Correo;
        this.Error_Usuario = Error_Usuario;
        this.Error_Telefono=Error_Telefono;
          
        this.ListTel = ListTel;
        this.CbCargo = CbCargo;
        this.TablaPerfiles = ListaPerfiles;
    }
    
    
//////////////////Métodos de control///////////////////////
    
     public void iniciaVentana(JFrame ventana, String ruta) {
        ventana.setLocationRelativeTo(null);
        ventana.setIconImage(new ImageIcon(ruta).getImage());
        ventana.setResizable(false);
        ventana.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
    }
     
    
    public void activaVentana(JFrame ventana,JFrame ventana2) {
        
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
        ventana2.dispose(); 
    }
    public void ConectarPanel(JPanel origen, JPanel destino, int ancho, int alto, int x, int y){ // Metodo que permite mostrar un panel dentro de otro
          
        destino.setSize(ancho, alto);
        destino.setLocation(x,y);
        origen.removeAll();
        origen.add(destino, BorderLayout.CENTER);
        origen.revalidate();
        origen.repaint();
    }
    public void CrearFuentetoErrores(JTextField copy){
        Font fuente = new Font("", Font.BOLD, 9);
        copy.setForeground(Color.red);
        copy.setFont(fuente);
    }
    public boolean VerificarVaciosText(){
         return "".equals(textUsuario.getText()) || "".equals(textTelefono.getText()) || "".equals(textNombre.getText()) || "".equals(textCedula.getText()) || "".equals(textDireccion.getText()) || "".equals(textCorreo.getText()) || "".equals(textClave.getText());
    }
    
    
 /////////////Metodos de RegistrarPerfilN//////////////////  
    
    public void LLenarCamposErrores(Secretaria Sec){  
    /// Metodo para llenar los campos que denominamos errore_... para que al momento que se identifique 
    //se mostrara en letras rojas debajo del campo con el error un error en alguno de esos campos, 
        String Partenum=ListTel.getSelectedItem().toString().trim()+textTelefono.getText().trim();
        LlenarArrayLisUsuariosconBD();
        if(Sec.ValidarNombre(textNombre.getText().trim())== false){
            CrearFuentetoErrores(Error_Nombre);
            Error_Nombre.setText("*Cumplir formato [(A)riel (M)ax]");
        }
        if(Sec.ValidarCedula(textCedula.getText().trim())== false){
            CrearFuentetoErrores(Error_Cedula);
            Error_Cedula.setText("*Numeros entre 6 y 8 digitos");
        }
        if(Sec.ValidarTelefono(Partenum)== false){
            CrearFuentetoErrores(Error_Telefono);
            Error_Telefono.setText("*Debe tener 7 digitos");
        }
        if(Sec.ValidarCorreo(textCorreo.getText().trim())== false){
            CrearFuentetoErrores(Error_Correo);
            Error_Correo.setText("*Debe cumplir con el formato nombre@correo.com");
        }
        if(Sec.ValidarCedulaRep(Perfiles,textCedula.getText().trim())== true){
            CrearFuentetoErrores(Error_Cedula);
            Error_Cedula.setText("*Cedula ya registrada");
        }
        if(Sec.ValidarUsuario(Perfiles, textUsuario.getText().trim())== true ){
            CrearFuentetoErrores(Error_Usuario);
            Error_Usuario.setText("*Usuario ya registrado, intente con otro");
        }  
    }
   
    public void VaciarDatos(){
        ListTel.setSelectedIndex(0);
        CbCargo.setSelectedIndex(0);
   
        textNombre.setText("");
        textCedula.setText(""); 
        textDireccion.setText(""); 
        textTelefono.setText(""); 
        textCorreo.setText("");        
        textUsuario.setText(""); 
        textClave.setText(""); 
        
        Error_Nombre.setText("");
        Error_Correo.setText("");
        Error_Cedula.setText("");
        Error_Usuario.setText("");
        Error_Telefono.setText("");
    }
    public void InsertarUsuarioBDSecretaria(Secretaria sec){
        /// Ingresa al usuario en la base de datos
        try {
          
            Statement stm= (Statement) cn.createStatement();

            String Nombre= sec.getNombre();
            String Cedula= sec.getCedula();
            String Telefono= sec.getTelefono();
            String Correo=sec.getCorreo();
            String Cargo=sec.getCargo();
            String Direccion= sec.getDireccionC();
            String Usuario=sec.getUser();
            String Clave= sec.getClave();
            String Fecha_Ingreso= sec.getFechaIngreso();
        
            String insert="INSERT INTO secretarias VALUES('"+Nombre+"','"+Cedula+"','"+Direccion+"','"+Telefono+"','"+Correo+"','"+Cargo+"','"+Usuario+"','"+Clave+"','"+Fecha_Ingreso+"');";
         
            stm.executeUpdate(insert);
            JOptionPane.showMessageDialog(null, "Registro exitoso.");
        }catch(SQLException e) {
             System.err.println("Error al ingresarlo en la BD " + e);
             JOptionPane.showMessageDialog(null, "¡Contacte al administrador!");
        }
        
    }
        
    public void RegistrarPerfil(){ // se modifico
        LlenarArrayLisUsuariosconBD();
       
       if (VerificarVaciosText() !=true && ListTel.getSelectedIndex()!=0 && CbCargo.getSelectedIndex()!=0 ){
           Secretaria sec = new Secretaria(); 
           String Partenum=ListTel.getSelectedItem().toString().trim()+textTelefono.getText().trim();  /// une el combo box lista de numeros y el text field telefono
                     
           if(sec.ValidarDatosIngresado(textCedula.getText().trim(), textCorreo.getText().trim(), textNombre.getText().trim(),Partenum.trim() )== true && sec.ValidarCedulaRep(Perfiles, textCedula.getText().trim())==false && sec.ValidarUsuario(Perfiles, textUsuario.getText().trim())==false ){
             
                sec.IngresarDatos(textDireccion.getText().trim(), textCedula.getText().trim(), textNombre.getText().trim(), Partenum, textCorreo.getText().trim(), "Secretaria", textUsuario.getText().trim(), textClave.getText().trim()); 
                InsertarUsuarioBDSecretaria(sec);              
                VaciarDatos();
            }else{              
                LLenarCamposErrores(sec);
            }
       }else{
            JOptionPane.showMessageDialog(null, "Se deben llenar y seleccionar todos los campos","WARNING_MESSAGE", JOptionPane.WARNING_MESSAGE);
       }                
    }
    
//////////////////METODOS GESTION PERFIL /////////////////////////////////////////
    
public boolean VerificarVaciosTextPac(){
         return  "".equals(textTelefono.getText()) || "".equals(textNombre.getText()) || "".equals(textCedula.getText()) || "".equals(textDireccion.getText()) || "".equals(textCorreo.getText())|| "".equals(textEdad.getText()) ;
    }
 public void  LlenarArrayLisUsuariosconBD(){
      //Metodo para tener un control de los usuario (este lee de la base de datos todos lo usuarios 
      // y los agregar a un arraylist (Perfiles) que se encuentra al inicio de esta clase para
      //asi poder verfiicar que ninla cedula ni el suario se repitan desde la clase perfil (solo para no dejarla sin metodos)
      // ademas de ue se necetita una lista para poder llenar las tablas
      
      try{
            Perfiles.clear();
            Statement pst = cn.createStatement();
            ResultSet rs= pst.executeQuery("SELECT * FROM secretarias");
            String datos[]= new String[9]; 
            
            while (rs.next()) {
                Secretaria sec = new Secretaria();
                datos[0]=rs.getString(1); //nombre
                datos[1]=rs.getString(2); //cedula 
                datos[2]=rs.getString(3); //direccion
                datos[3]=rs.getString(4); //telefono
                datos[4]=rs.getString(5); //correo
                datos[5]=rs.getString(6); //cargo
                datos[6]=rs.getString(7); //usuario
                datos[7]=rs.getString(8); //clave
                datos[8]=rs.getString(9); //fecha ingreso
                
                sec.IngresarDatos(datos[2], datos[1],datos[0], datos[3], datos[4], datos[5], datos[6], datos[7]);
                sec.setFechaIngreso(datos[8]);
                Perfiles.add(sec);
            }
         
            Statement st = cn.createStatement();
           
            ResultSet res= st.executeQuery("SELECT * FROM odontologos");
            
            String info[]= new String[12]; 
            
            while (res.next()) {
                Odontologo doc = new Odontologo();
                info[0]=res.getString(1); 
                info[1]=res.getString(2);
                info[2]=res.getString(3);
                info[3]=res.getString(4); 
                info[4]=res.getString(5); 
                info[5]=res.getString(6); 
                info[6]=res.getString(7); 
                info[7]=res.getString(8); 
                info[8]=res.getString(9); 
                info[9]=res.getString(10); //especialidad
                info[10]=res.getString(11); // administrador
                info[11]=res.getString(12); // observaciones
              
                doc.IngresarDatos(info[2], info[1],info[0], info[3], info[4], info[5], info[6], info[7], info[9], info[10], info[11]);
                doc.setFechaIngreso(info[8]);
                Perfiles.add(doc);
            }
                        
        }catch(Exception e){
           
            System.err.println("Error al llenar arraylist." + e);
             JOptionPane.showMessageDialog(null, "Debe estara ctivo la base de datos, ¡Contacte al administrador!");
        }   
    }
 
    public void LlenarTablaPerfil() {  
        LlenarArrayLisUsuariosconBD(); /// llena un arraylist con la BD actualizada para poder llenar las tablas 
        String[] columna = {"Nombre","Cedula", "Cargo", "F. Ingreso" }; // se modifico
        DefaultTableModel dtm = new DefaultTableModel(null, columna){
          @Override
          public boolean isCellEditable(int row, int column){
              return false; 
          }
        };  

        for (int i=0; i<Perfiles.size(); i++) { 
           String[] row = {Perfiles.get(i).getNombre(), Perfiles.get(i).getCedula(), Perfiles.get(i).getCargo(),Perfiles.get(i).getFechaIngreso()};
           dtm.addRow(row);
        }
        TablaPerfiles.setModel(dtm);     
      }
    public void LlenarTablaPerfil1(String TextNombre,String TextCI,String TextDireccion,String TextTelefono,String TextCorreo,String Cargo, String TextUsuario, String  TextClave){ 
    
    }
    

public boolean EliminarUsuario(String NomGlobal, String CedGlobal){
    boolean a=false;
    if(  JOptionPane.showConfirmDialog(null, "¿Seguro de que desea eliminar su propio perfil "+NomGlobal+" C.I "+CedGlobal+" ?", "Confirmar Eliminacion", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION){
        a=true;
        try {
            String sql = "DELETE FROM odontologos WHERE Administrador= "+CedGlobal; // le indico a quien debe borra pasandole la cedula
            PreparedStatement ps = cn.prepareStatement(sql);

            ps.executeUpdate();
        } catch (Exception e) {
           System.err.println("Error al eliminar al usuario de la tabla." + e);
           JOptionPane.showMessageDialog(null, "Debe estara ctivo la base de datos, ¡Contacte al administrador!");
        }  
        try {
            String sql = "DELETE FROM secretarias WHERE Cedula= "+CedGlobal; // le indico a quien debe borra pasandole la cedula
            PreparedStatement ps = cn.prepareStatement(sql);

        if(ps.executeUpdate()>0){
            JOptionPane.showMessageDialog(null, "Eliminacion exitosa ");  
        }   

        } catch (Exception e) {
           System.err.println("Error al eliminar al usuario de la tabla." + e);
           JOptionPane.showMessageDialog(null, "Debe estara ctivo la base de datos, ¡Contacte al administrador!");
        }                    
    }
     return a;
}
 
public void ConsultarPerfil(){
  
    int fila=TablaPerfiles.getSelectedRow(); //llamar tabla odontologo
    if (fila>=0) {
        String Cedula, Cargo;
        Cedula= TablaPerfiles.getValueAt(fila, 1).toString().trim(); // pa pso 1 es la ced (se empieza desde 0)
        Cargo=TablaPerfiles.getValueAt(fila,2 ).toString().trim();
        Perfil per = new Perfil();
        if ("Secretaria".equals(Cargo)) {
            try {
                Statement pst = cn.createStatement();
                ResultSet rs= pst.executeQuery("SELECT * FROM secretarias WHERE Cedula= "+Cedula);
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
                    per.IngresarDatos(datos[2], datos[1],datos[0], datos[3], datos[4], datos[5], datos[6], datos[7]);
                    per.setFechaIngreso(datos[8]);
                }                   
            } catch (Exception e) {
                System.err.println("Error al consultar al usuario de la tabla." + e);
                JOptionPane.showMessageDialog(null, "Debe estara ctivo la base de datos, ¡Contacte al administrador!");
            }
        } else {
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
                        per.IngresarDatos(datos[2], datos[1],datos[0], datos[3], datos[4], datos[5], datos[6], datos[7]);
                        per.setFechaIngreso(datos[8]);
                    }                   
                } catch (Exception e) {
                    System.err.println("Error al consultar al usuario de la tabla." + e);
                    JOptionPane.showMessageDialog(null, "Debe estara ctivo la base de datos, ¡Contacte al administrador!");
                }            
        }
 
        
        textNombre.setText(per.getNombre()) ;
        textCedula.setText(per.getCedula()) ;
        textDireccion.setText(per.getDireccionC());
        String num=per.getTelefono().substring(0, 4).trim();
        if ("0212".equals(num)) {
            ListTel.setSelectedIndex(1);
        } else {
            if ("0412".equals(num)) {
                ListTel.setSelectedIndex(2);
            } else {
                if ("0414".equals(num)) {
                    ListTel.setSelectedIndex(3);
                } else {
                    if ("0424".equals(num)) {
                        ListTel.setSelectedIndex(4);
                    } else {
                        if ("0416".equals(num)) {
                            ListTel.setSelectedIndex(5);
                        } else {
                            ListTel.setSelectedIndex(6);
                        }
                    }
                }
            }
        }
        textTelefono.setText(per.getTelefono().substring(4, 11).trim()) ;
        textCorreo.setText(per.getCorreo()) ;
        textUsuario.setText(per.getUser()) ;
        textClave.setText(per.getClave()) ; 
        if ("Secretaria".equals(per.getCargo())) {
            CbCargo.setSelectedIndex(1);
        } else {
            CbCargo.setSelectedIndex(2);
        }        
        
        
        
    } else {
        JOptionPane.showMessageDialog(null, "Debe seleccionar una fila para poder eliminarla","WARNING_MESSAGE", JOptionPane.WARNING_MESSAGE);
    }
}

 public void ModificarPerfil(String Cedula, String Nombre){  // vamos a desactivarle Gestion de perfil, pacientes, citas... al odontologo (el solo tendra habilitado la parte de historia medica)
 /// se debe verificar s i es un odontologo el que selecciono para decirle que no lo puede modificar
     try {
       
        if (VerificarVaciosText() !=true && ListTel.getSelectedIndex()!=0){
           Secretaria sec = new Secretaria(); 
           String Partenum=ListTel.getSelectedItem().toString().trim()+textTelefono.getText().trim();  /// une el combo box lista de numeros y el text field telefono

           if(sec.ValidarDatosIngresado(textCedula.getText().trim(), textCorreo.getText().trim(), textNombre.getText().trim(),Partenum.trim() )== true && sec.ValidarUsuario(Perfiles, textUsuario.getText().trim())==false ){
                if(  JOptionPane.showConfirmDialog(null, "¿Seguro de que desea modificar su perfil "+Nombre+" C.I "+Cedula+" ?", "Confirmar Modificacion", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION){             
                    ///////////////////////////////
                    String Ssql = "UPDATE secretarias SET Nombre= ?, Direccion= ?, Telefono= ?, Correo= ?, Usuario= ?, Clave= ? "+" WHERE Cedula= ?";
                    PreparedStatement prest = cn.prepareStatement(Ssql);

                    prest.setString(1, textNombre.getText().trim());
                    prest.setString(2, textDireccion.getText().trim());
                    prest.setString(3, Partenum);
                    prest.setString(4, textCorreo.getText().trim());
                    prest.setString(5, textUsuario.getText().trim());
                    prest.setString(6, textClave.getText().trim());
                    prest.setString(7, Cedula);

                    prest.executeUpdate();
                    LlenarTablaPerfil();
                    ///////////////////////////////////
                    VaciarDatos();
                }
            }else{              
                LLenarCamposErrores(sec);
           }    
        }else{
            JOptionPane.showMessageDialog(null, "Debe seleccionar Consultar antes de modificar","WARNING_MESSAGE", JOptionPane.WARNING_MESSAGE);
        }   
                
         
    }catch(Exception e){
        System.err.println("Error al actualizar la tabla." + e);
        JOptionPane.showMessageDialog(null, "Debe estar activo la base de datos, ¡Contacte al administrador!");
    }
 }
 ///////////////////METODO LOGIN//////////////////////  
    public int Logueo(String Usuario, String Clave){
        LlenarArrayLisUsuariosconBD();
      
        if(Perfiles.isEmpty() == false){        
        
            for(int i=0; i< Perfiles.size(); i++){
              
                if(Perfiles.get(i).getClave().trim().equals(Clave.trim()) && Perfiles.get(i).getUser().trim().equals(Usuario.trim())){                  
                    return 1;
                } else if (Perfiles.get(i).getUser().trim().equals(Usuario.trim())){
                    return 2;
                } else if (Perfiles.get(i).getClave().trim().equals(Clave.trim())){
                    return 3;
                }  
                         
            }
    
        }
        return 4;
    }
   
    
    
    public String CedulaNombre(String Usuario, String Clave){
       String CedGlobal, NomGlobal;
        LlenarArrayLisUsuariosconBD();
        if(Perfiles.isEmpty() == false){        
        
            for(int i=0; i< Perfiles.size(); i++){
              
                if(Perfiles.get(i).getClave().trim().equals(Clave.trim()) && Perfiles.get(i).getUser().trim().equals(Usuario.trim())){                  
                    CedGlobal=Perfiles.get(i).getCedula().trim(); NomGlobal=Perfiles.get(i).getNombre().trim();
                    String nom=CedGlobal+"-"+NomGlobal;
                    return nom;
                }
            }
        }
        return null;
    }
    public void ActualizarFechaIngreso(String Usuario){
        try {
            LocalDate fecha = LocalDate.now();
          
            String Ssql = "UPDATE secretarias SET Fecha_Ingreso= ?"+" WHERE Usuario= ?";
            PreparedStatement prest = cn.prepareStatement(Ssql);
            
            prest.setString(1, fecha.toString().trim());
            prest.setString(2, Usuario);
            prest.executeUpdate();
            //////////
            String Sql = "UPDATE odontologos SET Fecha_Ingreso= ?"+" WHERE Usuario= ?";
            PreparedStatement prst = cn.prepareStatement(Sql);
            
            prst.setString(1, fecha.toString().trim());
            prst.setString(2, Usuario);
            prst.executeUpdate();

        }catch(Exception e){
             System.err.println("Error al actualizar la tabla." + e);
             JOptionPane.showMessageDialog(null, "Debe estara ctivo la base de datos, ¡Contacte al administrador!");
        }
    }
    
    
    //////////////////METODOS GESTION DE ODONTOLOGOS  /////////////////////////////////////////
    public void RegistrarOdontologo(String CeduNom){ // se modifico
        LlenarArrayLisUsuariosconBD();
       
        if (VerificarVaciosText() !=true && ListTel.getSelectedIndex()!=0 && CbCargo.getSelectedIndex()!=0 && !"".equals(textEspecialidad.getText()) ){
           Odontologo doc = new Odontologo(); 
           String Partenum=ListTel.getSelectedItem().toString().trim()+textTelefono.getText().trim();  /// une el combo box lista de numeros y el text field telefono
                     
           if(doc.ValidarDatosIngresado(textCedula.getText().trim(), textCorreo.getText().trim(), textNombre.getText().trim(),Partenum.trim() )== true && doc.ValidarCedulaRep(Perfiles, textCedula.getText().trim())==false && doc.ValidarUsuario(Perfiles, textUsuario.getText().trim())==false ){
             
                doc.IngresarDatos(textDireccion.getText().trim(), textCedula.getText().trim(), textNombre.getText().trim(), Partenum, textCorreo.getText().trim(), "Odontologo", textUsuario.getText().trim(), textClave.getText().trim(),textEspecialidad.getText().trim() ,CeduNom ,txtObservaciones.getText().trim() ); 
                InsertarUsuarioBDOdontologo(doc);              
                VaciarDatos();
            }else{              
                LLenarCamposErroresDoc(doc);
            }
        }else{
            JOptionPane.showMessageDialog(null, "No se puede agregar al usuario si hay campos vacios o no seleccionados","WARNING_MESSAGE", JOptionPane.WARNING_MESSAGE);
        }                
    }
    
        public void LLenarCamposErroresDoc(Odontologo doc){  
    /// Metodo para llenar los campos que denominamos errore_... para que al momento que se identifique 
    //se mostrara en letras rojas debajo del campo con el error un error en alguno de esos campos, 
       String Partenum=ListTel.getSelectedItem().toString().trim()+textTelefono.getText().trim();
        LlenarArrayLisUsuariosconBD();
        if(doc.ValidarNombre(textNombre.getText().trim())== false){
            CrearFuentetoErrores(Error_Nombre);
            Error_Nombre.setText("*Cumplir formato [(A)riel (M)ax]");
        }
        if(doc.ValidarCedula(textCedula.getText().trim())== false){
            CrearFuentetoErrores(Error_Cedula);
            Error_Cedula.setText("*Numeros entre 6 y 8 digitos");
        }
        if(doc.ValidarTelefono(Partenum)== false){
            CrearFuentetoErrores(Error_Telefono);
            Error_Telefono.setText("*Debe tener 7 digitos");
        }
        if(doc.ValidarCorreo(textCorreo.getText().trim())== false){
            CrearFuentetoErrores(Error_Correo);
            Error_Correo.setText("*Debe cumplir con el formato nombre@correo.com");
        }
        if(doc.ValidarCedulaRep(Perfiles,textCedula.getText().trim())== true){
            CrearFuentetoErrores(Error_Cedula);
            Error_Cedula.setText("*Cedula ya registrada");
        }
        if(doc.ValidarUsuario(Perfiles, textUsuario.getText().trim())== true ){
            CrearFuentetoErrores(Error_Usuario);
            Error_Usuario.setText("*Usuario ya registrado, intente con otro");
        }  
    }
    
    
  public void InsertarUsuarioBDOdontologo(Odontologo doc){
        /// Ingresa al usuario en la base de datos
        try {
          
            Statement stm= (Statement) cn.createStatement();

            String Nombre= doc.getNombre();
            String Cedula= doc.getCedula();
            String Telefono= doc.getTelefono();
            String Correo=doc.getCorreo();
            String Cargo=doc.getCargo();
            String Direccion= doc.getDireccionC();
            String Usuario=doc.getUser();
            String Clave= doc.getClave();
            String Fecha_Ingreso= doc.getFechaIngreso();
            String Especialidad=doc.getEspecialidad();
            String Administrador= doc.getAdministrador();
            String Observaciones= doc.getObservacion();
        
            String insert="INSERT INTO odontologos VALUES('"+Nombre+"','"+Cedula+"','"+Direccion+"','"+Telefono+"','"+Correo+"','"+Cargo+"','"+Usuario+"','"+Clave+"','"+Fecha_Ingreso+"','"+Especialidad+"','"+Administrador+"','"+Observaciones+"');";
         
            stm.executeUpdate(insert);
            JOptionPane.showMessageDialog(null, "Registro exitoso.");
        }catch(SQLException e) {
             System.err.println("Error al ingresarlo en la BD " + e);
             JOptionPane.showMessageDialog(null, "¡Contacte al administrador!");
        }
        
    }  
    
  public void LlenarTablaOdontolgo(JTable TablaOdontologos){
        LlenarArrayLisUsuariosconBD(); /// llena un arraylist con la BD actualizada para poder llenar las tablas 
        String[] columna = {"Nombre", "Cedula","Telefono","Correo", "Usuario", "Clave", "F. Ingreso", "Especialidad" }; // se modifico
        DefaultTableModel dtm = new DefaultTableModel(null, columna){
          @Override
          public boolean isCellEditable(int row, int column){
              return false; 
          }
        };  

        for (int i=0; i<Perfiles.size(); i++) { 
          if(Perfiles.get(i) instanceof Odontologo){
            Odontologo doc=(Odontologo)Perfiles.get(i);
            String[] row = {doc.getNombre(), doc.getCedula(), doc.getTelefono(), doc.getCorreo(),doc.getUser(), doc.getClave(),doc.getFechaIngreso(), doc.getEspecialidad()};
            dtm.addRow(row);
          }
          
        }
        TablaOdontologos.setModel(dtm);  
  }
   
    
    //////////////////METODOS GESTION DE PACIENTES   /////////////////////////////////////////
    public void RegistrarPaciente(){ //gregar el radioButton de Sexo
        LlenarArrayListPacientesconBD();
       
        if (VerificarVaciosTextPac() !=true && ListTel.getSelectedIndex()!=0  ){
           Paciente pac = new Paciente(); 
           String Partenum=ListTel.getSelectedItem().toString().trim()+textTelefono.getText().trim();  /// une el combo box lista de numeros y el text field telefono
                     
           if(pac.ValidarDatosIngresado(textCedula.getText().trim(), textCorreo.getText().trim(), textNombre.getText().trim(),Partenum.trim(),Integer.parseInt(textEdad.getText().trim()) )== true && pac.ValidarCedulaRep(Pacientes, textCedula.getText().trim())==false  ){
               
                pac.IngresarDatos(textDireccion.getText().trim(), textCedula.getText().trim(), textNombre.getText().trim(), Partenum, textCorreo.getText().trim(),Integer.parseInt(textEdad.getText().trim()),textSexo.getText().trim()   ,txtObservaciones.getText().trim(),null ); 
                InsertarUsuarioBDPaciente(pac);              
                //VaciarDatos();
                textNombre.setText("");
                textCedula.setText("");
                textTelefono.setText("");
                textDireccion.setText("");
                textCorreo.setText("");
                textEdad.setText("");
                textSexo.setText("");
                txtObservaciones.setText("");
                Error_Nombre.setText("");
                Error_Edad.setText("");
                Error_Cedula.setText("");
                Error_Correo.setText("");
            }else{              
                LLenarCamposErroresPac(pac);
            }
        }else{
            JOptionPane.showMessageDialog(null, "No se puede agregar al usuario si hay campos vacios o no seleccionados","WARNING_MESSAGE", JOptionPane.WARNING_MESSAGE);
        }                
    }
    
        public void LLenarCamposErroresPac(Paciente pac){  
    /// Metodo para llenar los campos que denominamos errore_... para que al momento que se identifique 
    //se mostrara en letras rojas debajo del campo con el error un error en alguno de esos campos, 
       String Partenum=ListTel.getSelectedItem().toString().trim()+textTelefono.getText().trim();
        LlenarArrayListPacientesconBD();
        if(pac.ValidarNombre(textNombre.getText().trim())== false){
            CrearFuentetoErrores(Error_Nombre);
            Error_Nombre.setText("*Cumplir formato [(A)riel (M)ax]");
        }
        if(pac.ValidarCedula(textCedula.getText().trim())== false){
            CrearFuentetoErrores(Error_Cedula);
            Error_Cedula.setText("*Numeros entre 6 y 8 digitos");
        }
        if(pac.ValidarTelefono(Partenum)== false){
            CrearFuentetoErrores(Error_Telefono);
            Error_Telefono.setText("*Debe tener 7 digitos");
        }
        if(pac.ValidarCorreo(textCorreo.getText().trim())== false){
            CrearFuentetoErrores(Error_Correo);
            Error_Correo.setText("*Debe cumplir con el formato nombre@correo.com");
        }
        if(pac.ValidarCedulaRep(Pacientes,textCedula.getText().trim())== true){
            CrearFuentetoErrores(Error_Cedula);
            Error_Cedula.setText("*Cedula ya registrada");
        }
        if(pac.ValidarEdad(  Integer.parseInt(textEdad.getText().trim())  )){
            CrearFuentetoErrores(Error_Edad);
            Error_Edad.setText("*La edad debe ser un numero entre 1-105");
        }  
    }
    
    
  public void InsertarUsuarioBDPaciente(Paciente pac){
        /// Ingresa al usuario en la base de datos
        try {
          
            Statement stm= (Statement) cn.createStatement();

            String Nombre= pac.getNombre();
            String Cedula= pac.getCedula();
            String Telefono= pac.getTelefono();
            String Correo=pac.getCorreo();
            String Direccion= pac.getDireccionC();
            String Observaciones= pac.getObservacion();
            String Edad=Integer.toString(pac.getEdad());
            String Sexo=pac.getSexo();
            String Administrador=pac.getAdministrador();
        
            String insert="INSERT INTO pacientes VALUES('"+Nombre+"','"+Cedula+"','"+Direccion+"','"+Telefono+"','"+Correo+"','"+Edad+"','"+Sexo+"','"+Administrador+"','"+Observaciones+"');";
         
            stm.executeUpdate(insert);
            JOptionPane.showMessageDialog(null, "Registro exitoso.");
        }catch(SQLException e) {
             System.err.println("Error al ingresarlo en la BD " + e);
             JOptionPane.showMessageDialog(null, "¡Contacte al administrador!");
        }
        
    }    
    
    public void  LlenarArrayListPacientesconBD(){
      //Metodo para tener un control de los usuario (este lee de la base de datos todos lo usuarios 
      // y los agregar a un arraylist (Pacientes) que se encuentra al inicio de esta clase para
      //asi poder verfiicar que ninla cedula ni el suario se repitan desde la clase paciente (solo para no dejarla sin metodos)
      // ademas de ue se necetita una lista para poder llenar las tablas
      
      try{
            Pacientes.clear();
            Statement pst = cn.createStatement();
            ResultSet rs= pst.executeQuery("SELECT * FROM pacientes");
            String datos[]= new String[9]; 
            
            while (rs.next()) {
                Paciente pac = new Paciente();
                datos[0]=rs.getString(1); //nombre
                datos[1]=rs.getString(2); //cedula 
                datos[2]=rs.getString(3); //direccion
                datos[3]=rs.getString(4); //telefono
                datos[4]=rs.getString(5); //correo
                datos[5]=rs.getString(6); //edad
                datos[6]=rs.getString(7); //sexo
                datos[7]=rs.getString(8); //Administrador
                datos[8]=rs.getString(9); //Observacion
                int edad= Integer.parseInt(datos[5]);
                pac.IngresarDatos(datos[2], datos[1],datos[0], datos[3], datos[4], edad, datos[6],datos[8], datos[7]);
                Pacientes.add(pac);
            }
         
          
        }catch(Exception e){
           
            System.err.println("Error al llenar arraylist." + e);
             JOptionPane.showMessageDialog(null, "Debe estara ctivo la base de datos, ¡Contacte al administrador!");
        }   
    } 
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}

