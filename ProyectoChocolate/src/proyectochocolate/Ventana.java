/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectochocolate;



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
 * Clase Ventana Muestra la estructuta que deberia tener una Ventana en Java con
 * la libreria Swing
 */
public class Ventana extends JFrame implements ActionListener {

    private JLabel texto1;
    private JTextField caja;
    private JButton btnGuardar;
    private JButton btnMostrar;              //Nuevo boton
    private JLabel lblTemporal;              //nuevo Label
    private Timer time;
    private JTextArea pantalla;              // Nuevo elemento
    private JScrollPane ampliar;
    private JPanel contenedor;
    private final File informacion;
    private FileWriter escribir;
    private PrintWriter linea;
    private FileReader leer;
    private BufferedReader leerLinea;
    // nuevo
    private JLabel lblnumero1;
    private JTextField txtnumero1;
    private JLabel lblnumero2;
    private JTextField txtnumero2;
    private JLabel lbloperacion;
    private JComboBox cbxoperacion;
    private JButton btncalcular;
    private JButton btnlimpiar;
    private JLabel lblresultado;
    private JTextField txtresultado;
    
    public Ventana() {
        super();
        configurarVentana();
        inicializarComponentes();
        informacion = new File("Lista.txt");
    }

    private void configurarVentana() {
        this.setTitle("Lista De Nombres");// Nombre del formulario
        this.setSize(400, 600); // tamaño del formulario
        this.setLocationRelativeTo(null); // // Ubicacion con repecto a
        this.setLayout(null); // TAMAÑO Y POSICION DE LOS COMPONENTES
        this.setResizable(false); //SIRVE PARA QUE NO SE MODIFIQUE EL TAMAÑO
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void inicializarComponentes() {
        texto1 = new JLabel();
        caja = new JTextField();
        btnGuardar = new JButton();
        lblTemporal = new JLabel();
        btnMostrar = new JButton();  //Agregando nuevo boton
        contenedor = new JPanel();   //Agregando un JPanel,para usarlo como contenedor
        pantalla = new JTextArea(5, 25);  // creando un nuevo textArea
        ampliar = new JScrollPane(pantalla, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
                JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        
        lblnumero1= new JLabel();
        txtnumero1=new JTextField();
        
        lblnumero2 = new JLabel();
        txtnumero2 = new JTextField();
        lbloperacion = new JLabel();
        cbxoperacion = new JComboBox();
        btnlimpiar = new JButton();
        txtresultado =  new JTextField();  
       
        texto1.setText("Insertar Nombre");
        texto1.setBounds(90, 70, 100, 25);
        caja.setBounds(230, 70, 100, 25);
        btnGuardar.setText("Guardar Datos");
        btnGuardar.setBounds(30, 150, 150, 30);
        btnGuardar.addActionListener(this);
        lblTemporal.setText("Datos guardados con exito!");
        lblTemporal.setBounds(30, 175, 180, 30);
        lblTemporal.setVisible(false);
        btnMostrar.setText("Mostrar Datos");
        btnMostrar.setBounds(215, 150, 150, 30);
        btnMostrar.addActionListener(this);
        pantalla.setEditable(false);
        contenedor.setBounds(30, 220, 335, 90);
        contenedor.add(ampliar);
        
        lblnumero1.setText("Numero 1:");
        lblnumero1.setBounds(80, 330, 70, 20);
        
        txtnumero1.setBounds(150, 330, 140, 25);
        
        lblnumero2.setText("Numero 2: ");
        lblnumero2.setBounds(80,370,70,20);
        
        txtnumero2.setBounds(150,370,140,25);
        lbloperacion.setText("Operacion");
        lbloperacion.setBounds(80,410,70,20);
        
        cbxoperacion.setBounds(150,410,160,20);
        
        btncalcular.setText("Calcular");
        btncalcular.setBounds(90,450,90,25);
        btncalcular.addActionListener(this);
        
        
        btnlimpiar.setText("Limpiar");
        btnlimpiar.setBounds(200,450,130,25);
        btncalcular.addActionListener(this);
        
       
        lblresultado.setText("Resultado");
        lblresultado.setBounds(150,490,130,25);
        
        txtresultado.setBounds(220,490,130,25);
        cbxoperacion.addItem("Seleccione opcion");
        cbxoperacion.addItem("Suma");
        cbxoperacion.addItem("Resta");
        cbxoperacion.addItem("Multiplicacion");
        cbxoperacion.addItem("Division");
        cbxoperacion.addItem("modulo");
        
        
        
        this.add(texto1);
        this.add(caja);
        this.add(btnGuardar);
        this.add(lblTemporal);
        this.add(btnMostrar);
        this.add(contenedor);
        this.add(lblnumero1);
        this.add(txtnumero1);
        this.add(lblnumero2);
        this.add(txtnumero2);
        this.add(lbloperacion);
        this.add(cbxoperacion);
        this.add(btncalcular);
        this.add(btnlimpiar);
        this.add(lblresultado);
        this.add(txtresultado);
    }

    //Metodo guardarInformacion guardara los datos capturados de la caja de texto
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
            lblTemporal.setVisible(true);
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
            caja.setText("");
            time.start();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, e.getStackTrace());
        }
    }
    
    public void operacion(double numero1, double numero2) {
       double resultado = 0;
       
        if(cbxoperacion.getSelectedIndex()== 1){
            resultado = numero1+ numero2;
        }
        if(cbxoperacion.getSelectedIndex() == 2){
            
             resultado = numero1 - numero2;
        }
            
        if(cbxoperacion.getSelectedIndex() == 3){
            
            resultado = numero1 * numero2;
        }
        
        if(cbxoperacion.getSelectedIndex() == 4){
             resultado = numero1 / numero2;
        }
        
        if (cbxoperacion.getSelectedIndex() == 5){
            resultado = numero1 % numero2;         
        }
        
        
        lblresultado.setText(String.valueOf(resultado)); 
        
        
           
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
    @Override
    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource() == btnGuardar) {
            String nombre = caja.getText();     //Obtener el texto1 que exista en la caja
            guardarInformacion(nombre);
//             time = new Timer(3000, (ActionEvent ae1) -> {
//                lblTemporal.setVisible(false);
//                time.stop();
//            });
        }

        if (ae.getSource() == btnMostrar) {
            mostrarInformacion();

        }
        
        if (ae.getSource() == btncalcular){
            
            Double calcular = Double.parseDouble(txtnumero1.getText());            
            Double calcularr = Double.parseDouble(txtnumero2.getText());
                    
            operacion(calcular,calcularr);
        }
    }
}


