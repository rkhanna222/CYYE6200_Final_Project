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
 * @author moinu
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
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(null);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Student Details");
        add(jLabel2);
        jLabel2.setBounds(348, 33, 312, 65);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Student Id:");
        add(jLabel1);
        jLabel1.setBounds(373, 179, 97, 22);
        add(txtFieldStudentId);
        txtFieldStudentId.setBounds(505, 179, 145, 26);

        updateStudentBtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        updateStudentBtn.setText("View or Update Student Record");
        updateStudentBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateStudentBtnActionPerformed(evt);
            }
        });
        add(updateStudentBtn);
        updateStudentBtn.setBounds(346, 253, 314, 34);

        btnAddStudent.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnAddStudent.setText("Add New Student");
        btnAddStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddStudentActionPerformed(evt);
            }
        });
        add(btnAddStudent);
        btnAddStudent.setBounds(346, 317, 314, 30);

        viewAllStudentsBtn.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        viewAllStudentsBtn.setText("View All Students");
        viewAllStudentsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewAllStudentsBtnActionPerformed(evt);
            }
        });
        add(viewAllStudentsBtn);
        viewAllStudentsBtn.setBounds(346, 380, 314, 30);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/ss.jpeg"))); // NOI18N
        add(jLabel3);
        jLabel3.setBounds(0, 0, 1000, 680);
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
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JTextField txtFieldStudentId;
    private javax.swing.JToggleButton updateStudentBtn;
    private javax.swing.JButton viewAllStudentsBtn;
    // End of variables declaration//GEN-END:variables
}
