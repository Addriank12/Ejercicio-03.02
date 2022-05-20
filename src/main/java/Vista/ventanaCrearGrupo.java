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
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.JButton;



/**
 *
 * @author Adrian
 */
public class ventanaCrearGrupo extends JFrame {
    JPanel jPanel;
    JCheckBox jCheckBox;
    List<JPanel> jPanelList;
    List<JLabel> jLabels;
    List<JTextField> jTextFields;
    List<JComboBox> jComboBoxList;
    List<JButton> jButtons;
    public ventanaCrearGrupo(String title) throws HeadlessException {
        super(title);
        this.setSize(575,500);
        this.setLocation(30, 30);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.iniciarComponentes();      
        this.setContentPane(jPanel);
       
    }
    
    public void iniciarComponentes()
    {
        jPanelList = new ArrayList<>();
        iniciarPaneles();
        iniciarLabels();
        iniciarTextos();
        iniciarCombos();
        iniciarCheckBox();
        iniciarBotones();
    }
    
    private void iniciarPaneles()
    {
        jPanel = new JPanel();
        jPanel.setLayout(new GridLayout(16,1));        
        for(int i =0; i<31; i++)
        {
            jPanelList.add(new JPanel(new FlowLayout(FlowLayout.LEFT)));
        }  
        for(JPanel ijJPanel : jPanelList)
        {
           jPanel.add(ijJPanel);
        }  
        panelColor();
    }
    
    private void panelColor()
    {
        jPanelList.get(0).setBackground(new Color(21, 120, 181));
        jPanelList.get(1).setBackground(new Color(21, 120, 181));
        for(int i = 2; i < jPanelList.size()-3; i+=2)
        {
            jPanelList.get(i).setBackground(new Color(230,230,230));
        }
    }
    
    private void iniciarLabels()
    {
        jLabels= new ArrayList<>();
        jLabels.add(new JLabel("Crear Grupo"));
        jLabels.add(new JLabel("Periodo Academico: "));
        jLabels.add(new JLabel("2022 - 2022"));
        jLabels.add(new JLabel("Sede:"));
        jLabels.add(new JLabel("MATRIZ CUENCA"));
        jLabels.add(new JLabel("Campus/Extension"));
        jLabels.add(new JLabel("El Vecino"));
        jLabels.add(new JLabel("Modalidad"));
        jLabels.add(new JLabel("Prescencial"));
        jLabels.add(new JLabel("Carrera:"));
        jLabels.add(new JLabel("AGROPECUARIA"));
        jLabels.add(new JLabel("Código de Proyecto:"));
        jLabels.add(new JLabel("Agropecuaria [Rediseño] - NUEVA O REDISEÑO"));
        jLabels.add(new JLabel("Asignatura:"));
        jLabels.add(new JLabel("E-CV-IAG-003 BOTÁNICA"));
        jLabels.add(new JLabel("Nombre del Grupo: *"));
        jLabels.add(new JLabel("Cursos por Grupo: *"));        
        jLabels.add(new JLabel("Autorizacion Calificacion Sobre 100:"));
        jLabels.add(new JLabel("Seleccionar Jornada del Grupo:  "));
        jLabels.add(new JLabel("Oferta Para Estudiantes"));
        jLabels.add(new JLabel("Aplica Cambio de Grupo:"));
        jLabels.get(0).setForeground(Color.white);       
        jPanelList.get(0).add(jLabels.get(0));
        jPanelList.get(2).add(jLabels.get(1));
        jPanelList.get(3).add(jLabels.get(2));
        jPanelList.get(4).add(jLabels.get(3));
        jPanelList.get(5).add(jLabels.get(4));
        jPanelList.get(6).add(jLabels.get(5));
        jPanelList.get(7).add(jLabels.get(6));
        jPanelList.get(8).add(jLabels.get(7));
        jPanelList.get(9).add(jLabels.get(8));
        jPanelList.get(10).add(jLabels.get(9));
        jPanelList.get(11).add(jLabels.get(10));
        jPanelList.get(12).add(jLabels.get(11));
        jPanelList.get(13).add(jLabels.get(12));
        jPanelList.get(14).add(jLabels.get(13));
        jPanelList.get(15).add(jLabels.get(14));
        jPanelList.get(16).add(jLabels.get(15));
        jPanelList.get(18).add(jLabels.get(16));
        jPanelList.get(20).add(jLabels.get(17));
        jPanelList.get(22).add(jLabels.get(18));
        jPanelList.get(24).add(jLabels.get(19));
        jPanelList.get(26).add(jLabels.get(20));
    }
    
    private void iniciarTextos()
    {
        jTextFields = new ArrayList<>();
        jTextFields.add(new JTextField());
        jTextFields.add(new JTextField());
        jTextFields.get(0).setColumns(20);
        jTextFields.get(1).setColumns(20);
        jPanelList.get(17).add(jTextFields.get(0));
        jPanelList.get(19).add(jTextFields.get(1));
    }
    private void iniciarCombos()
    {
        String Lista[] = new String[2];
        Lista[0]="SI";
        Lista[1]="NO";
        jComboBoxList = new ArrayList<>();
        jComboBoxList.add(new JComboBox(Lista));
        jComboBoxList.add(new JComboBox(Lista)); 
        jComboBoxList.add(new JComboBox());
        jComboBoxList.get(2).addItem("Jornadas Disponibles");
        jComboBoxList.get(2).addItem("Vespertina");
        jComboBoxList.get(2).addItem("Diurna");
        jPanelList.get(21).add(jComboBoxList.get(0));
        jPanelList.get(23).add(jComboBoxList.get(2));
        jPanelList.get(27).add(jComboBoxList.get(1));
    }
    private void iniciarCheckBox()
    {
        jCheckBox = new JCheckBox("Nuevos");
        jPanelList.get(25).add(jCheckBox);        
    }
    private void iniciarBotones()
    {
        jButtons=new ArrayList<>();
        jButtons.add(new JButton("Guardar"));
        jButtons.add(new JButton("Cancelar"));
        jPanelList.get(30).add(jButtons.get(0));    
        jPanelList.get(30).add(jButtons.get(1));    
    }
}
