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
public class Ventana1 extends JFrame {
    private JPanel jPanel1;
    private List<JLabel> jLabelList; 
    JTextField jTextField;   
    JButton jButton;
    List<JPanel> jPanels;
    List<JLabel> jLabels;
    List<JComboBox> jCombos;
    
   public Ventana1(String title) {
        super(title);
        this.setSize(390, 300);
        this.setLocation(500, 100);
        this.iniciarComponentes();
        this.setContentPane(this.jPanel1);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

   public void iniciarComponentes(){

        this.jPanel1 = new JPanel();         
        this.jPanel1.setLayout(new GridLayout(9,1));
        this.iniciarPaneles();
        this.iniciarLabels();
        this.iniciarCombos();

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
        
        

   }

   
   public void iniciarLabels()
    {
        this.jLabels = new ArrayList();
        this.jLabels.add(new JLabel("INFORMACION DE CARRERA"));
        jLabels.get(0).setForeground(Color.white);
        this.jLabels.add(new JLabel("Periodo Academico:      " ));
        this.jLabels.add(new JLabel("Carrera:                       "));
        this.jLabels.add(new JLabel("Modalidad:                  " ));
        this.jLabels.add(new JLabel("Sede:                           " ));
        this.jLabels.add(new JLabel("Campus:                     " ));
        this.jLabels.add(new JLabel("Jornada:                      " ));
        this.jLabels.add(new JLabel("Fecha de registro:         " ));
        
        this.jLabels.add(new JLabel("2022 - 2022 " ));
        this.jLabels.add(new JLabel("20/05/2022 " ));
        
        this.jPanels.get(0).add(jLabels.get(0));
        this.jPanels.get(7).add(jLabels.get(7));
        
        
        this.jPanels.get(1).add(jLabels.get(1));
        this.jPanels.get(2).add(jLabels.get(2));
        this.jPanels.get(3).add(jLabels.get(3));
        this.jPanels.get(4).add(jLabels.get(4));
        this.jPanels.get(5).add(jLabels.get(5));
        this.jPanels.get(6).add(jLabels.get(6));
        this.jPanels.get(7).add(jLabels.get(7));
        this.jPanels.get(1).add(jLabels.get(8));
        this.jPanels.get(7).add(jLabels.get(9));

        
    }
   public void iniciarCombos()
    {
        this.jCombos= new ArrayList();
        
        this.jCombos.add(new JComboBox());
        this.jCombos.get(0).addItem("Presencial");
        this.jCombos.get(0).addItem("Virtual");
        
        
        
        
        this.jCombos.add(new JComboBox());  
        this.jCombos.get(1).addItem("Administracion de Empresas");
        this.jCombos.get(1).addItem("Arquitectura"); 
        this.jCombos.get(1).addItem("Agropecuaria");
        this.jCombos.get(1).addItem("Antropologia"); 
        this.jCombos.get(1).addItem("Biomedicina");
        this.jCombos.get(1).addItem("Biotecnologia");
        this.jCombos.get(1).addItem("Computacion");
        this.jCombos.get(1).addItem("Comunicacion"); 
        this.jCombos.get(1).addItem("Contabilidad");
        
        
        this.jCombos.add(new JComboBox());
        this.jCombos.get(2).addItem("Matriz Cuenca");
        this.jCombos.get(2).addItem("Sede Guayaquil");
        this.jCombos.get(2).addItem("Sede Quito");
        
        this.jCombos.add(new JComboBox());
        this.jCombos.get(3).addItem("EL VECINO");
        this.jCombos.get(3).addItem("CAMPUS QUITO");
        this.jCombos.get(3).addItem("CAMPUS GUAYAQUIL");
        
        this.jCombos.add(new JComboBox());
        this.jCombos.get(4).addItem("VESPERTINA");
        this.jCombos.get(4).addItem("MATUTINA");
       
        
        
        this.jPanels.get(2).add(jCombos.get(1));
        this.jPanels.get(3).add(jCombos.get(0));
        this.jPanels.get(4).add(jCombos.get(2));
        this.jPanels.get(5).add(jCombos.get(3));
        this.jPanels.get(6).add(jCombos.get(4));
    }

}
