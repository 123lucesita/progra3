/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectochocolates;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.Timer;

/**
 *
 * @author LUCESITA GARCIA RIVERO
 */
public class Ventana extends JFrame {
    
    private JLabel lblchocolates;
    
    private JLabel lblnombre;
    private JTextField txtnombre;
    
    private JLabel lblci;
    private JTextField txtci;
    
    private JLabel lbldireccion;
    private JTextField txtdireccion;
    
    private JButton btnGuardar;
    
    private JButton btnMostrar;  
    
    private Timer time;
    private JTextArea pantalla;
    private JScrollPane ampliar;  
    private JPanel contenedor;
    private final File informacion;
    private FileWriter escribir;
    private PrintWriter linea;
    private FileReader leer;
    private BufferedReader leerLinea;
    
    private JLabel lbltemporal;
    
    private JLabel lblproducto;
    private JComboBox cbxcontenido;
    
    private JLabel lblproducto1;
    private JTextField txtproducto1;
    
    private JLabel lblproducto2;
    private JTextField txtproducto2;
    
    private JLabel lblproducto3;
    private JTextField txtproducto3;
    
    private JButton btncalcular;
    
    private JButton btnlimpiar;
    
    private JLabel lblpreciototal;
   
     private JTextField txtpreciototal;
    
 public Ventana() {
        super();
        configurarVentana();
        inicializarComponentes();
        informacion = new File("Lista.doc");
    }

    private void configurarVentana() {
        this.setTitle("Lista De Nombres");// Nombre del formulario
        this.setSize(500, 800); // tamaño del formulario
        this.setLocationRelativeTo(null); // // Ubicacion con repecto a
        this.setLayout(null); // TAMAÑO Y POSICION DE LOS COMPONENTES
        this.setResizable(false); //SIRVE PARA QUE NO SE MODIFIQUE EL TAMAÑO
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void inicializarComponentes() {
      lblchocolates = new JLabel();  
        
        lblnombre = new JLabel();        
        txtnombre = new JTextField();
       
        lblci = new JLabel();
        txtci = new JTextField();
        
        lbldireccion = new JLabel();
        txtdireccion = new JTextField();
        
        lbltemporal = new JLabel();
        
        btnGuardar = new JButton();
        
        btnMostrar = new JButton(); 
        
        contenedor = new JPanel();   //Agregando un JPanel,para usarlo como contenedor
        pantalla = new JTextArea(5, 25);  // creando un nuevo textArea
        ampliar = new JScrollPane(pantalla, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
                JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        
        lblproducto = new JLabel();
        cbxcontenido = new JComboBox();
        
        lblproducto1= new JLabel();
        txtproducto1=new JTextField();
        
        lblproducto2 = new JLabel();
        txtproducto2 = new JTextField();
        
        lblproducto3 = new JLabel();
        txtproducto3 = new JTextField();
        
        
        btncalcular = new JButton();
        
        btnlimpiar = new JButton();
        
        lblpreciototal = new JLabel();
        
        txtpreciototal =  new JTextField();  
       
        //
        
        lblchocolates.setText("CHOCOLATES BRESKA");
        lblchocolates.setBounds(80,70,100,20);
        
        lblnombre.setText("Nombres y apellidos");
        txtnombre.setBounds(90, 70, 100, 25); 
        
        
        lblci.setText("C.I.");
        txtci.setBounds(230, 70, 100, 25);
        
        lbldireccion.setText("Direccion");
        txtdireccion.setBounds(240,70, 100,25);
        
        btnGuardar.setText("Guardar Datos");
        btnGuardar.setBounds(30, 150, 150, 30);
        
        btnGuardar.addActionListener((ActionListener) this);
        
        lbltemporal.setText("Datos guardados con exito!");
        lbltemporal.setBounds(30, 175, 180, 30);        
        lbltemporal.setVisible(false);
        
        btnMostrar.setText("Mostrar cliente");
        btnMostrar.setBounds(215, 150, 150, 30);
        btnMostrar.addActionListener((ActionListener) this);
        pantalla.setEditable(false);
        
        contenedor.setBounds(30, 220, 335, 90);
        contenedor.add(ampliar);
        
        lblproducto.setText("Producto");
        lblproducto.setBounds(34,228,335,90);     
        
        lblproducto1.setText("chocolate 1:");
        lblproducto1.setBounds(80, 330, 70, 20);
        
        txtproducto1.setBounds(150, 330, 140, 25);
        
        lblproducto2.setText("chocolate 2: ");
        lblproducto2.setBounds(80,370,70,20); 
        
        txtproducto2.setBounds(150,370,140,25);
        
        lblproducto3.setText("chocolate 3: ");
        lblproducto3.setBounds(80,370,70,20);        
        txtproducto3.setBounds(150,370,140,25);
        
        lblproducto.setText("PRODUCTOS");
        lblproducto.setBounds(80,410,70,20);
        
        cbxcontenido.setBounds(150,410,160,20);
        
        btncalcular.setText("Calcular");
        btncalcular.setBounds(90,450,90,25);
        btncalcular.addActionListener((ActionListener) this);
        
        
        btnlimpiar.setText("Limpiar");
        btnlimpiar.setBounds(200,450,130,25);
        btncalcular.addActionListener((ActionListener) this);
        
       
//        lblresultado.setText("Resultado");
//        lblresultado.setBounds(150,490,130,25);
//        
//        txtresultado.setBounds(220,490,130,25);
//        cbxoperacion.addItem("Seleccione opcion");
//        cbxoperacion.addItem("Suma");
//        cbxoperacion.addItem("Resta");
//        cbxoperacion.addItem("Multiplicacion");
//        cbxoperacion.addItem("Division");
//        cbxoperacion.addItem("modulo");

        //
        
        this.add(lblchocolates);
        this.add(lblnombre);
        this.add(txtnombre);
        this.add(lblci);
        this.add(txtci);
        this.add(btnGuardar);
        this.add(btnMostrar);
        this.add(contenedor);
        this.add(lblproducto);
        this.add(cbxcontenido);
        this.add(btncalcular);
        this.add(btnlimpiar);
        this.add(lblpreciototal);
        this.add(txtpreciototal);

    }
    public void guardarInformacion(String nombre) {
        try {
            // Crear un objeto de tipo FileWriter, para escribir en el documento.
            escribir = new FileWriter(informacion, true);
            // crear un objeto de tipo PrintWriter, para escribir una linea.
            linea = new PrintWriter(escribir);
            if (!informacion.exists()) {
                informacion.createNewFile();
            }
            linea.println(nombre);      //escribir el nombre ingresado
            linea.close();              // cerrar el objeto linea
            escribir.close();           //cerrar el objeto escribir
            lbltemporal.setVisible(true);
            // para evitar la expresion landa,variable de parametro
//            time = new Timer(3000, new ActionListener() {
//                @Override
//                public void actionPerformed(ActionEvent ae) {
//                    lblTemporal.setVisible(false);
//                    time.stop();
//                }
//            });
// expresion landa
//            time = new Timer(3000, (ActionEvent ae1) -> {
//                lblTemporal.setVisible(false);
//                time.stop();
//            });
            txtnombre.setText("");
            time.start();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, e.getStackTrace());
        }
    }
    
    public void producto (int producto1, int producto2, int procucto3) {
               
        }
         
       

    //Metodo mostrarInfomacion, mostrara todo el contenido del documento creado
    public void mostrarInformacion() {

        try {
            leer = new FileReader(informacion);
            leerLinea = new BufferedReader(leer);
            String datos = leerLinea.readLine();
            pantalla.setText(datos);

            while ((datos = leerLinea.readLine()) != null) {
                pantalla.setText(pantalla.getText() + "\n" + datos);
            }
            leer.close();
            leerLinea.close();

        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, e.getStackTrace());
        }
    }

    // el Override realizara la accion de cada boton una vez presionados
    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource() == btnGuardar) {
            String nombre = txtnombre.getText();     //Obtener el texto1 que exista en la caja
            guardarInformacion(nombre);
//             time = new Timer(3000, (ActionEvent ae1) -> {
//                lblTemporal.setVisible(false);
//                time.stop();
//            });
        }

        if (ae.getSource() == btnMostrar) {
            mostrarInformacion();

        }
        
//        if (ae.getSource() == btncalcular){
//            
//            Double calcular = Double.parseDouble(txtnumero1.getText());            
//            Double calcularr = Double.parseDouble(txtnumero2.getText());
//                    
//            operacion(calcular,calcularr);
        
    }
}

    





