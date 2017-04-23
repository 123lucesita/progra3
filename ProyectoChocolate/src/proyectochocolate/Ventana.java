/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectochocolate;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.Timer;

/**
 * @author HP g4-1066la i3
 */
public class Ventana extends JFrame{//implementar metodos abstractos
    
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
    
    
    private JComboBox cbxoperacion;
    
    private JLabel lblproducto1;
    private JTextField txtproducto1;
    
    private JLabel lblproducto2;
    private JTextField txtproducto2;
    
    private JLabel lblproducto3;
    private JTextField txtproducto3;
   
    
    private JButton btncalcular;
    
    private JButton btnlimpiar;
    
//    private JLabel lblpreciototal;
//    private JTextField txtpreciototal;
    
public Ventana(){
super();
inicializarVentana();
configurarComponentes();
}

public final  void inicializarVentana(){
this.setTitle("Chocolateria Breska");
this.setSize(370,550);
this.setLocationRelativeTo(null);
this.setLayout(null);
this.setResizable(false);
this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}

public final void configurarComponentes(){
        lblchocolates = new JLabel();  
        
        lblnombre = new JLabel();        
        txtnombre = new JTextField();
       
        lblci = new JLabel();
        txtci = new JTextField();
        
        lbldireccion = new JLabel();
        txtdireccion = new JTextField();
        
        
        btnGuardar = new JButton();
        
        btnMostrar = new JButton(); 
        
        contenedor = new JPanel();   //Agregando un JPanel,para usarlo como contenedor
        pantalla = new JTextArea(5, 25);  // creando un nuevo textArea
        ampliar = new JScrollPane(pantalla, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
                JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        
        cbxoperacion = new JComboBox();
        
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
        
        lblnombre.setText("Nombres y apellidos");
        txtnombre.setBounds(90, 70, 100, 25);  
        
        lblci.setText("C.I.");
        txtci.setBounds(230, 70, 100, 25);
        
        lbldireccion.setText("Direccion");
        txtdireccion.setBounds(240,70, 100,25);
        
        btnGuardar.setText("Guardar Datos");
        btnGuardar.setBounds(30, 150, 150, 30);
        
        btnGuardar.addActionListener(this);
        
        lbltemporal.setText("Datos guardados con exito!");
        lbltemporal.setBounds(30, 175, 180, 30);        
        lbltemporal.setVisible(false);
        
        btnMostrar.setText("Mostrar cliente");
        btnMostrar.setBounds(215, 150, 150, 30);
        btnMostrar.addActionListener(this);
        pantalla.setEditable(false);
        
        contenedor.setBounds(30, 220, 335, 90);
        contenedor.add(ampliar);
        
        lblproducto1.setText("Numero 1:");
        lblproducto1.setBounds(80, 330, 70, 20);
        
        txtproducto1.setBounds(150, 330, 140, 25);
        
        lblproducto2.setText("Numero 2: ");
        lblproducto2.setBounds(80,370,70,20);        
        txtproducto2.setBounds(150,370,140,25);
        
        lblproducto3.setText("Numero 2: ");
        lblproducto3.setBounds(80,370,70,20);        
        txtproducto3.setBounds(150,370,140,25);
        
//        lbloperacion.setText("Operacion");
//        lbloperacion.setBounds(80,410,70,20);
//        
        cbxoperacion.setBounds(150,410,160,20);
        
        btncalcular.setText("Calcular");
        btncalcular.setBounds(90,450,90,25);
        btncalcular.addActionListener(this);
        
        
        btnlimpiar.setText("Limpiar");
        btnlimpiar.setBounds(200,450,130,25);
        btncalcular.addActionListener(this);
        
       
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
        
        
   
}

    
}

