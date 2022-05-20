/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Adrian
 */
public class ventana4 extends JFrame {
    
    List<JPanel> jPanelList;
    List<JLabel> jLabels;
    List<JComboBox> jComboBoxs;
    JPanel jPanel;
    
    public ventana4(String title) throws HeadlessException {
        super(title);
        this.setSize(1400,300);
        this.setLocation(30, 30);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        iniciarComponentes();
        this.setContentPane(jPanel);
    }
    
    private void iniciarComponentes()
    {
        jPanelList = new ArrayList<>();
        iniciarPaneles();
        crearLabels();
        crearCombos();
        iniciarControles();
    }
    
    private void iniciarPaneles()
    {
        jPanel = new JPanel();
        jPanel.setLayout(new GridLayout(3,3));        
        for(int i =0; i<9; i++)
        {
            jPanelList.add(new JPanel(new FlowLayout(FlowLayout.LEFT)));
        }  
        for(JPanel ijJPanel : jPanelList)
        {
           jPanel.add(ijJPanel);
        } 
    }
    
    private void crearLabels()
    {
        jLabels=new ArrayList<>();
        jLabels.add(new JLabel("Sede:"));
        jLabels.add(new JLabel("Campus/Extensión:"));
        jLabels.add(new JLabel("Carrera:"));
        jLabels.add(new JLabel("Código del Proyecto:"));
        jLabels.add(new JLabel("Modalidad:"));
        jLabels.add(new JLabel("Periodo Academico:"));
        jLabels.add(new JLabel("Fecha Inicio Clases: 28/03/2022 al 06/08/2022"));        
    }
    
    private void crearCombos()
    {
        jComboBoxs = new ArrayList<>();
        jComboBoxs.add(new JComboBox());
        jComboBoxs.get(0).addItem("MATRIZ CUENCA");
        jComboBoxs.get(0).addItem("MATRIZ QUITO");
        jComboBoxs.get(0).addItem("MATRIZ GUAYAQUIL");
        jComboBoxs.add(new JComboBox());
        jComboBoxs.get(1).addItem("EL VECINO");
        jComboBoxs.add(new JComboBox());
        jComboBoxs.get(2).addItem("AGROPECUARIA");
        jComboBoxs.get(2).addItem("COMPUTACION");
        jComboBoxs.get(2).addItem("BIOTECNOLOGIA");
        jComboBoxs.get(2).addItem("DERECHO");
        jComboBoxs.get(2).addItem("DISEÑO");
        jComboBoxs.get(2).addItem("MECANICA");
        jComboBoxs.add(new JComboBox());
        jComboBoxs.get(3).addItem("AGROPECUARIA [REDISEÑO] - NUEVA O REDISEÑO");        
        jComboBoxs.add(new JComboBox());
        jComboBoxs.get(4).addItem("PRESENCIAL");
        jComboBoxs.get(4).addItem("VIRTUAL");
        jComboBoxs.add(new JComboBox());
        jComboBoxs.get(5).addItem("2022 - 2022");
    }
    
    private void iniciarControles()
    {
        for (int i = 0; i<6; i++)
        {
            jPanelList.get(i).add(jLabels.get(i));
            jPanelList.get(i).add(jComboBoxs.get(i)); 
        }
        jPanelList.get(6).add(jLabels.get(6));

    }
    
}
