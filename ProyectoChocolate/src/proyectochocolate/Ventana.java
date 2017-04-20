/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectochocolate;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 * @author HP g4-1066la i3
 */
public class Ventana extends JFrame{//implementar metodos abstractos
    
    public JLabel lblchocolate1;
    public JLabel lblchocolate2;
    public JLabel lblchocolate3;
    public JLabel lblchocolate4;
    
    public JTextField txtchocolate1;
    public JTextField txtchocolate2;
    public JTextField txtchocolate3;
    public JTextField txtchocolate4;
    
    
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
lblchocolate1 = new JLabel();
lblchocolate2 = new JLabel();
lblchocolate3 = new JLabel();
lblchocolate4 = new JLabel();

txtchocolate1 = new JTextField();
txtchocolate2 = new JTextField();
txtchocolate3 = new JTextField();
txtchocolate4 = new JTextField();

lblchocolate1.setText("Chocolate Negro");
lblchocolate1.setBounds(80, 330, 70, 20);
        
txtchocolate1.setBounds(150, 330, 140, 25);

      

}

    
}

