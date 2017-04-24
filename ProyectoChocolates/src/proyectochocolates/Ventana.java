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
public class Ventana extends JFrame implements ActionListener {

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
    private JComboBox cbxproducto;

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
        informacion = new File("Listas Chocolate.doc");
    }

    private void configurarVentana() {
        this.setTitle("Lista De Nombres");// Nombre del formulario
        this.setSize(500, 600); // tamaño del formulario
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
        pantalla = new JTextArea(15, 25);  // creando un nuevo textArea
        ampliar = new JScrollPane(pantalla, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
                JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

        lblproducto = new JLabel();
        cbxproducto = new JComboBox();

        lblproducto1 = new JLabel();
        txtproducto1 = new JTextField();

        lblproducto2 = new JLabel();
        txtproducto2 = new JTextField();

        lblproducto3 = new JLabel();
        txtproducto3 = new JTextField();

        btncalcular = new JButton();

        btnlimpiar = new JButton();

        lblpreciototal = new JLabel();

        txtpreciototal = new JTextField();

        //
        
        
        lblchocolates.setText("***CHOCOLATES BRESKA***");
        lblchocolates.setBounds(160, 70, 200, 20);

        lblnombre.setText("Nombres y apellidos");
        lblnombre.setBounds(13,160,150,30);
        txtnombre.setBounds(134, 160, 150, 30);

        lblci.setText("C.I.");
        lblci.setBounds(13,195,150,30);        
        txtci.setBounds(134, 200, 150, 30);

        lbldireccion.setText("Direccion");
        lbldireccion.setBounds(13,200,150,30);
        txtdireccion.setBounds(134, 230, 150, 30);

        btnGuardar.setText("Guardar Datos");
        btnGuardar.setBounds(320, 150, 150, 30);

        btnGuardar.addActionListener((ActionListener) this);

        lbltemporal.setText("Datos guardados con exito!");
        lbltemporal.setBounds(30, 175, 180, 30);
        lbltemporal.setVisible(false);

        btnMostrar.setText("Mostrar cliente");
        btnMostrar.setBounds(320, 230, 150, 30);
        btnMostrar.addActionListener((ActionListener) this);
        pantalla.setEditable(false);

        contenedor.setBounds(100, 280, 345, 100);
        contenedor.add(ampliar);

        lblproducto.setText("Producto");
        lblproducto.setBounds(34, 45, 335, 90);
      
        cbxproducto.setBounds(150, 410, 160, 20);

        btncalcular.setText("Calcular");
        btncalcular.setBounds(120, 500, 120, 30);
        btncalcular.addActionListener((ActionListener) this);

        btnlimpiar.setText("Limpiar");
        btnlimpiar.setBounds(280, 500, 120, 30);
        btncalcular.addActionListener((ActionListener) this);

//        lblresultado.setText("Resultado");
//        lblresultado.setBounds(150,490,130,25);
        
        lblproducto.setBounds(70,407,130,30);
        cbxproducto.addItem("CHOCOLATES: ");
        cbxproducto.addItem("Chocolate con relleno de cafe");
        cbxproducto.addItem("Chocolate con relleno de Frutilla");
        cbxproducto.addItem("chocolate relleno de durazno");
        cbxproducto.addItem("Chocolate beso de negro");
        
        
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
        this.add(cbxproducto);
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


    }
}
