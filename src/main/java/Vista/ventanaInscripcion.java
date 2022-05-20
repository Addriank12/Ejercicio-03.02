/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
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
 * @author Adrian
 */
public class ventanaInscripcion extends JFrame {
    JPanel jPanel;
    JTextField jTextField;   
    JButton jButton;
    List<JPanel> jPanels;
    List<JLabel> jLabels;
    List<JComboBox> jCombos;
    
    
     public ventanaInscripcion(String title) throws HeadlessException {
        super(title);
        this.setSize(400,300);
        this.setLocation(30, 30);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.iniciarComponentes();      
        this.setContentPane(jPanel);
    }
    public void iniciarComponentes()
    {
        this.jPanel = new JPanel();         
        this.jPanel.setLayout(new GridLayout(5,1));
        this.iniciarPaneles();
        this.iniciarLabels();
        this.iniciarCombos();
        this.iniciarTextos();
        this.iniciarBotones();
    }
    
    public void iniciarPaneles()
    {
        this.jPanels = new ArrayList<>();
        for(int i = 0; i<5; i++)
        {
           this.jPanels.add(new JPanel(new FlowLayout(FlowLayout.LEFT))); 
        }        
        this.jPanels.get(0).setBackground(new Color(21, 120, 181));      
        this.jPanel.add(this.jPanels.get(0));
        this.jPanel.add(this.jPanels.get(1));
        this.jPanel.add(this.jPanels.get(2));
        this.jPanel.add(this.jPanels.get(3));
        this.jPanel.add(this.jPanels.get(4));    
    }
    
    public void iniciarTextos()
    {
       jTextField = new JTextField();       
       jTextField.setColumns(12);
       this.jPanels.get(3).add(jTextField); 
    }
    public void iniciarLabels()
    {
        this.jLabels = new ArrayList<>();
        this.jLabels.add(new JLabel("INSCRÍBETE"));        
        this.jLabels.add(new JLabel("Selecciona una Sede: *"));
        this.jLabels.add(new JLabel("Tipo Documento:"));
        this.jLabels.add(new JLabel("Ingrese se identificación: *"));        
        
        jLabels.get(0).setForeground(Color.white); 
        this.jPanels.get(0).add(jLabels.get(0));
        this.jPanels.get(1).add(jLabels.get(1));
        this.jPanels.get(2).add(jLabels.get(2));
        this.jPanels.get(3).add(jLabels.get(3)); 
        
    }
    public void iniciarCombos()
    {
        this.jCombos= new ArrayList<>();
        this.jCombos.add(new JComboBox());
        this.jCombos.get(0).addItem("Cuenca");
        this.jCombos.get(0).addItem("Quito");
        this.jCombos.get(0).addItem("Guayaquil");
        
        this.jCombos.add(new JComboBox());
        this.jCombos.get(1).addItem("Cedula");
        this.jCombos.get(1).addItem("Pasaporte");  
        this.jPanels.get(1).add(jCombos.get(0));
        this.jPanels.get(2).add(jCombos.get(1));
    }
    
    public void iniciarBotones()
    {
        this.jButton = new JButton("Ingresar");
        this.jPanels.get(4).add(jButton);
    }
}
