/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JButton;

/**
 *
 * @author juansinmiedo
 */
public class Ventana2 extends JFrame {
    private JPanel jPanel1;
    private List<JLabel> jLabelList; 
    JTextField jTextField;   
    JButton jButton;
    List<JPanel> jPanels;
    List<JLabel> jLabels;
    List<JComboBox> jCombos;
    
   public Ventana2(String title) {
        super(title);
        this.setSize(390, 350);
        this.setLocation(100,100 );
        this.iniciarComponentes();
        this.setContentPane(this.jPanel1);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

   public void iniciarComponentes(){

        this.jPanel1 = new JPanel();         
        this.jPanel1.setLayout(new GridLayout(10,1));
        this.iniciarPaneles();
        this.iniciarLabels();
        this.iniciarTextos();

   }
   
   public void iniciarPaneles(){
        this.jPanels = new ArrayList();
        this.jPanels.add(new JPanel());
        this.jPanels.get(0).setBackground(new Color(21, 120, 181));
        this.jPanels.add(new JPanel(new FlowLayout(FlowLayout.LEFT)));
        this.jPanels.add(new JPanel(new FlowLayout(FlowLayout.LEFT)));
        this.jPanels.add(new JPanel(new FlowLayout(FlowLayout.LEFT)));
        this.jPanels.add(new JPanel(new FlowLayout(FlowLayout.LEFT)));
        this.jPanels.add(new JPanel(new FlowLayout(FlowLayout.LEFT)));
        this.jPanels.add(new JPanel(new FlowLayout(FlowLayout.LEFT)));
        this.jPanels.add(new JPanel(new FlowLayout(FlowLayout.LEFT)));
        this.jPanels.add(new JPanel(new FlowLayout(FlowLayout.LEFT)));
        this.jPanels.add(new JPanel(new FlowLayout(FlowLayout.LEFT)));
        this.jPanels.add(new JPanel(new FlowLayout(FlowLayout.LEFT)));
        this.jPanels.add(new JPanel(new FlowLayout(FlowLayout.LEFT)));
        this.jPanels.add(new JPanel(new FlowLayout(FlowLayout.LEFT)));
        this.jPanels.add(new JPanel(new FlowLayout(FlowLayout.LEFT)));
        this.jPanels.add(new JPanel(new FlowLayout(FlowLayout.LEFT)));
        this.jPanels.add(new JPanel(new FlowLayout(FlowLayout.LEFT)));
        this.jPanels.add(new JPanel(new FlowLayout(FlowLayout.LEFT)));
        this.jPanels.add(new JPanel(new FlowLayout(FlowLayout.LEFT)));
        this.jPanels.add(new JPanel(new FlowLayout(FlowLayout.LEFT))); 
        this.jPanels.add(new JPanel());
        
        
        
        
        
        
        this.jPanel1.add(this.jPanels.get(0));
        this.jPanel1.add(this.jPanels.get(1));
        this.jPanel1.add(this.jPanels.get(2));
        this.jPanel1.add(this.jPanels.get(3));
        this.jPanel1.add(this.jPanels.get(4));
        this.jPanel1.add(this.jPanels.get(5));
        this.jPanel1.add(this.jPanels.get(6));
        this.jPanel1.add(this.jPanels.get(7)); 
        this.jPanel1.add(this.jPanels.get(8));
        this.jPanel1.add(this.jPanels.get(9));
        

   }
   public void iniciarTextos()
    {
       jTextField = new JTextField();       
       jTextField.setColumns(10);
       this.jPanels.get(9).add(jTextField); 
    }
   
   public void iniciarLabels()
    {
        this.jLabels = new ArrayList();
        this.jLabels.add(new JLabel("DATOS PERSONALES"));
        jLabels.get(0).setForeground(Color.white);
        this.jLabels.add(new JLabel("Apellidos:                      "
                + "       " ));
        this.jLabels.add(new JLabel("Nombres:                              "));
        this.jLabels.add(new JLabel("Nacionalidad:                        " ));
        this.jLabels.add(new JLabel("Genero:            "
                + "                      " ));
        this.jLabels.add(new JLabel("Correo electronico personal: " ));
        this.jLabels.add(new JLabel("Fecha Nacimiento:                 " ));
        this.jLabels.add(new JLabel("Telefono Domicilio:               " ));
        this.jLabels.add(new JLabel("Telefono Celular:                   " ));
        this.jLabels.add(new JLabel("Whatsapp:                            " ));
        
        
        this.jLabels.add(new JLabel("ORTIZ TERREROS" ));
        this.jLabels.add(new JLabel("JOSUE BENIGNO" ));
        this.jLabels.add(new JLabel("ECUATORIANA" ));
        this.jLabels.add(new JLabel("Masculino" ));
        this.jLabels.add(new JLabel("mortizo@yahoo.com" ));
        this.jLabels.add(new JLabel("01-09-1940 " ));
        this.jLabels.add(new JLabel("072812377" ));
        this.jLabels.add(new JLabel("0994747316" ));
        
        
        this.jPanels.get(0).add(jLabels.get(0));
        this.jPanels.get(1).add(jLabels.get(1));
        this.jPanels.get(2).add(jLabels.get(2));
        this.jPanels.get(3).add(jLabels.get(3));
        this.jPanels.get(4).add(jLabels.get(4));
        this.jPanels.get(5).add(jLabels.get(5));
        this.jPanels.get(6).add(jLabels.get(6));
        this.jPanels.get(7).add(jLabels.get(7));
        this.jPanels.get(8).add(jLabels.get(8));
        this.jPanels.get(9).add(jLabels.get(9));       
        
        
        this.jPanels.get(1).add(jLabels.get(10));
        this.jPanels.get(2).add(jLabels.get(11));
        this.jPanels.get(3).add(jLabels.get(12));
        this.jPanels.get(4).add(jLabels.get(13));
        this.jPanels.get(5).add(jLabels.get(14));
        this.jPanels.get(6).add(jLabels.get(15));
        this.jPanels.get(7).add(jLabels.get(16));
        this.jPanels.get(8).add(jLabels.get(17));

    }
 
}
