/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package neu.edu.csye6200.userInterface;

import java.awt.BorderLayout;
import java.awt.Color;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;
import javax.swing.JFrame;
import javax.swing.JPanel;
import neu.edu.csye6200.data.DataStore;
import neu.edu.csye6200.interfaces.ImmunizationDataManagementFactory;
import neu.edu.csye6200.interfaces.StudentDataMangementFactory;
import neu.edu.csye6200.model.ClassRoom;
import neu.edu.csye6200.model.Immunization;
import neu.edu.csye6200.model.Student;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.labels.PieSectionLabelGenerator;
import org.jfree.chart.labels.StandardPieSectionLabelGenerator;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author sahilmattoo
 */
public class ImmunizationGraphJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ImmunizationGraphJPanel
     */
    public static final String KEY_1= "Students Immunized";
    public static final String KEY_2= "Students not Immunized";
    private JPanel userProcessContainerJPanel;
     
    public ImmunizationGraphJPanel() {
        //this.userProcessContainerJPanel=userProcessControllerJPanel;
        initComponents();
        createPieChart();
    }
    
    public void createPieChart(){
        JFreeChart pieCHart = ChartFactory.createPieChart("Student Immunization data", createDataset());

        PiePlot plot = (PiePlot) pieCHart.getPlot();
        plot.setSectionPaint(KEY_1, Color.green);
        plot.setSectionPaint(KEY_2, Color.red);
        plot.setExplodePercent(KEY_1, 0.10);
        plot.setSimpleLabels(true);

        PieSectionLabelGenerator gen = new StandardPieSectionLabelGenerator(
            "{0}: {1} ({2})", new DecimalFormat("0"), new DecimalFormat("0%"));
        plot.setLabelGenerator(gen);
        ChartPanel chartPanel = new ChartPanel( pieCHart );        
        chartPanel.setPreferredSize(new java.awt.Dimension( 560 , 367 ) );
        chartPanel.setDomainZoomable(true);

        JPanel jPanel4 = new JPanel();
        jPanel4.setLayout(new BorderLayout());
        jPanel4.add(chartPanel, BorderLayout.NORTH);

        JFrame frame = new JFrame();
        frame.add(jPanel4);
        frame.pack();
        frame.setVisible(true);
    }

     private DefaultPieDataset createDataset( ) {
      int[] immuCounter= new int[]{0,0}; // 0 for true values and 1 for false values
      List<Immunization> immu =ImmunizationDataManagementFactory.getFactoryInstance().getObject().getDataList();
      for(Immunization i: immu){
          if(i.isStatus()){
              immuCounter[0]+=1;
          }else{
              immuCounter[1]+=1;
          }
      }
      final DefaultPieDataset dataset = 
      new DefaultPieDataset( );  

      dataset.setValue("Students Immunized",immuCounter[0]);        
      dataset.setValue("Students not Immunized", immuCounter[1]);       
      return dataset; 
   }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}