/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package neu.edu.csye6200.userInterface;

import java.awt.CardLayout;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.table.DefaultTableModel;
import neu.edu.csye6200.data.DataStore;
import neu.edu.csye6200.interfaces.StudentDataMangementFactory;
import neu.edu.csye6200.model.Rules;
import neu.edu.csye6200.model.Student;

/**
 *
 * @author sahilmattoo
 */
public class StudentJPanel extends javax.swing.JPanel {

    /**
     * Creates new form StudentJPanel
     */
    private UpdateStudentJPanel updateStudentJPanel;
    private AddStudentJPanel addStudentJPanel;
    private JPanel userProcessControllerJPanel;
    private ViewAllStudentJPanel viewAllStudentJPanel;
    public StudentJPanel(JPanel userProcessControllerJPanel) {
        initComponents();
        this.userProcessControllerJPanel = userProcessControllerJPanel;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtFieldStudentId = new javax.swing.JTextField();
        updateStudentBtn = new javax.swing.JToggleButton();
        btnAddStudent = new javax.swing.JButton();
        viewAllStudentsBtn = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(null);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 102));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Student Details");
        add(jLabel2);
        jLabel2.setBounds(290, 30, 470, 65);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Student id");
        add(jLabel1);
        jLabel1.setBounds(390, 210, 97, 22);

        txtFieldStudentId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldStudentIdActionPerformed(evt);
            }
        });
        add(txtFieldStudentId);
        txtFieldStudentId.setBounds(390, 240, 220, 40);

        updateStudentBtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        updateStudentBtn.setText("Lookup");
        updateStudentBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateStudentBtnActionPerformed(evt);
            }
        });
        add(updateStudentBtn);
        updateStudentBtn.setBounds(390, 310, 220, 40);

        btnAddStudent.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnAddStudent.setForeground(new java.awt.Color(0, 0, 102));
        btnAddStudent.setText("Add New Student");
        btnAddStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddStudentActionPerformed(evt);
            }
        });
        add(btnAddStudent);
        btnAddStudent.setBounds(140, 540, 314, 80);

        viewAllStudentsBtn.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        viewAllStudentsBtn.setForeground(new java.awt.Color(0, 0, 102));
        viewAllStudentsBtn.setText("View All Students");
        viewAllStudentsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewAllStudentsBtnActionPerformed(evt);
            }
        });
        add(viewAllStudentsBtn);
        viewAllStudentsBtn.setBounds(580, 540, 314, 80);

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        add(jSeparator1);
        jSeparator1.setBounds(-20, 100, 1080, 30);

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel4.setText("Find or Update student");
        add(jLabel4);
        jLabel4.setBounds(390, 140, 280, 50);
        add(jSeparator3);
        jSeparator3.setBounds(-80, 430, 1190, 20);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/studensmall.jpg"))); // NOI18N
        add(jLabel3);
        jLabel3.setBounds(-1390, -220, 2550, 1390);

        jSeparator2.setBackground(new java.awt.Color(0, 0, 102));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 102));
        add(jSeparator2);
        jSeparator2.setBounds(30, 90, 1000, 30);
    }// </editor-fold>//GEN-END:initComponents

    private void updateStudentBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateStudentBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_updateStudentBtnActionPerformed

    private void btnAddStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddStudentActionPerformed
       
    }//GEN-LAST:event_btnAddStudentActionPerformed

    private void viewAllStudentsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewAllStudentsBtnActionPerformed
        // TODO add your handling code here:
        viewAllStudent();
    }//GEN-LAST:event_viewAllStudentsBtnActionPerformed

    private void txtFieldStudentIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldStudentIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFieldStudentIdActionPerformed
    public void updateStudent(){
       updateStudentJPanel = new UpdateStudentJPanel(userProcessControllerJPanel);
       userProcessControllerJPanel.add("UpdateStudentJPanel",updateStudentJPanel);
       CardLayout layout = (CardLayout) userProcessControllerJPanel.getLayout();
       layout.next(userProcessControllerJPanel);
    }
    public void addStudent(){
       addStudentJPanel = new AddStudentJPanel();
       userProcessControllerJPanel.add("addStudentJPanel",addStudentJPanel);
       CardLayout layout = (CardLayout) userProcessControllerJPanel.getLayout();
       layout.next(userProcessControllerJPanel);
    }
    public void viewAllStudent(){
       viewAllStudentJPanel = new ViewAllStudentJPanel();
       userProcessControllerJPanel.add("ViewAllStudentJPanel",viewAllStudentJPanel);
       CardLayout layout = (CardLayout) userProcessControllerJPanel.getLayout();
       layout.next(userProcessControllerJPanel);
    }
    public JTextField getTxtFieldStudentId() {
        return txtFieldStudentId;
    }

    public void setTxtFieldStudentId(JTextField txtFieldStudentId) {
        this.txtFieldStudentId = txtFieldStudentId;
    }

    public JToggleButton getUpdateStudentBtn() {
        return updateStudentBtn;
    }

    public void setUpdateStudentBtn(JToggleButton updateStudentBtn) {
        this.updateStudentBtn = updateStudentBtn;
    }

    public UpdateStudentJPanel getUpdateStudentJPanel() {
        return updateStudentJPanel;
    }

    public void setUpdateStudentJPanel(UpdateStudentJPanel updateStudentJPanel) {
        this.updateStudentJPanel = updateStudentJPanel;
    }

    public ViewAllStudentJPanel getViewAllStudentJPanel() {
        return viewAllStudentJPanel;
    }

    public void setViewAllStudentJPanel(ViewAllStudentJPanel viewAllStudentJPanel) {
        this.viewAllStudentJPanel = viewAllStudentJPanel;
    }

    
    public JPanel getUserProcessControllerJPanel() {
        return userProcessControllerJPanel;
    }

    public void setUserProcessControllerJPanel(JPanel userProcessControllerJPanel) {
        this.userProcessControllerJPanel = userProcessControllerJPanel;
    }

    public JButton getBtnAddStudent() {
        return btnAddStudent;
    }

    public AddStudentJPanel getAddStudentJPanel() {
        return addStudentJPanel;
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddStudent;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField txtFieldStudentId;
    private javax.swing.JToggleButton updateStudentBtn;
    private javax.swing.JButton viewAllStudentsBtn;
    // End of variables declaration//GEN-END:variables
}
