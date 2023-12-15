/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package neu.edu.csye6200.userInterface;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import neu.edu.csye6200.interfaces.StudentDataMangementFactory;
import neu.edu.csye6200.model.Student;

/**
 *
 * @author sahilmattoo
 */
public class ViewAllStudentJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewAllStudentJPanel
     */
    public ViewAllStudentJPanel() {
        initComponents();
        this.setSize(1240, 900);
        updateTotalStudentsLabel();
        populateTable();
        
    }
    public void populateTable(){
        updateTotalStudentsLabel();
        List<Student> students=  StudentDataMangementFactory.getFactoryInstance().getObject().getDataList();
        DefaultTableModel dtm = (DefaultTableModel)studentsTable.getModel();
        dtm.setRowCount(0);
        for(Student student : students){
            // create a row and pouplate each rules data  in the row
            Object[] row = new Object[dtm.getColumnCount()];
            
            row[0]=student.getStuId();
            row[1]=student.getFirstName();
            row[2]=student.getLastName();
            row[3]= student.getEmailid();
            row[4]= student.getGPA();
            dtm.addRow(row);
        } 
    }
    
    public void updateTotalStudentsLabel() {
    List<Student> students = StudentDataMangementFactory.getFactoryInstance().getObject().getDataList();
    if (students != null) {
        totalStudentsLabel.setText("Total Students: " + students.size());
    } else {
        totalStudentsLabel.setText("Total Students: 0");
    }
}

    
    private void sortStudentByID(){
         DefaultTableModel model = (DefaultTableModel) studentsTable.getModel();
        List<Student> studentList = StudentDataMangementFactory.getFactoryInstance().getObject().getDataList();

        // Sort the student list by ID
        Collections.sort(studentList, Comparator.comparingInt(Student::getStuId));

        // Clear the table before repopulating
        model.setRowCount(0);

        // Repopulate the table model with the sorted list
        for (Student student : studentList) {
            Student s = (Student) student;
            Object[] row = new Object[6];
            
            row[0]=student.getStuId();
            row[1]=student.getFirstName();
            row[2]=student.getLastName();
            row[3]= student.getEmailid();
            row[4]= student.getGPA();
            
            model.addRow(row);
        }
    }
    
       private void sortStudentByName(){
         DefaultTableModel model = (DefaultTableModel) studentsTable.getModel();
        List<Student> studentList = StudentDataMangementFactory.getFactoryInstance().getObject().getDataList();

        // Sort the student list by name
        Collections.sort(studentList, (s1, s2) -> {
            String name1 = s1.getFirstName() + " " + s1.getLastName();
            String name2 = s2.getFirstName() + " " + s2.getLastName();
            return name1.compareToIgnoreCase(name2);
        });

        // Clear the table before repopulating
        model.setRowCount(0);

        // Repopulate the table model with the sorted list
        for (Student student : studentList) {
            Student s = (Student) student;
            Object[] row = new Object[6];
            
            row[0]=student.getStuId();
            row[1]=student.getFirstName();
            row[2]=student.getLastName();
            row[3]= student.getEmailid();
            row[4]= student.getGPA();
            
            model.addRow(row);
        }
    }
       
       private void sortStudentByGPA(){
    DefaultTableModel model = (DefaultTableModel) studentsTable.getModel();
    List<Student> studentList = StudentDataMangementFactory.getFactoryInstance().getObject().getDataList();

    // Sort the student list by GPA
    Collections.sort(studentList, (s1, s2) -> {
        Double gpa1 = s1.getGPA();
        Double gpa2 = s2.getGPA();
        return gpa1.compareTo(gpa2);
    });

    // Clear the table before repopulating
    model.setRowCount(0);

    // Repopulate the table model with the sorted list
    for (Student student : studentList) {
        Object[] row = new Object[6];
        
        row[0] = student.getStuId();
        row[1] = student.getFirstName();
        row[2] = student.getLastName();
        row[3] = student.getEmailid();
        row[4] = student.getGPA();
        
        model.addRow(row);
    }
}


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jFrame2 = new javax.swing.JFrame();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        studentsTable = new javax.swing.JTable();
        totalStudentsLabel = new javax.swing.JLabel();
        sortByGPAButton = new javax.swing.JButton();
        sortByIdButton = new javax.swing.JButton();
        sortByNameButton = new javax.swing.JButton();
        btnAddStudent = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame2Layout = new javax.swing.GroupLayout(jFrame2.getContentPane());
        jFrame2.getContentPane().setLayout(jFrame2Layout);
        jFrame2Layout.setHorizontalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame2Layout.setVerticalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setLayout(null);

        studentsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "First Name", "Last name", "Email", "GPA"
            }
        ));
        jScrollPane1.setViewportView(studentsTable);

        jLayeredPane1.add(jScrollPane1);
        jScrollPane1.setBounds(90, 140, 879, 410);

        totalStudentsLabel.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        totalStudentsLabel.setForeground(new java.awt.Color(255, 255, 255));
        totalStudentsLabel.setText("Total Students : 0");
        jLayeredPane1.add(totalStudentsLabel);
        totalStudentsLabel.setBounds(50, 670, 330, 90);

        sortByGPAButton.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        sortByGPAButton.setText("Sort By GPA");
        sortByGPAButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortByGPAButtonActionPerformed(evt);
            }
        });
        jLayeredPane1.add(sortByGPAButton);
        sortByGPAButton.setBounds(550, 560, 170, 40);

        sortByIdButton.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        sortByIdButton.setText("Sort By ID");
        sortByIdButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortByIdButtonActionPerformed(evt);
            }
        });
        jLayeredPane1.add(sortByIdButton);
        sortByIdButton.setBounds(90, 560, 160, 40);

        sortByNameButton.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        sortByNameButton.setText("Sort By Name");
        sortByNameButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortByNameButtonActionPerformed(evt);
            }
        });
        jLayeredPane1.add(sortByNameButton);
        sortByNameButton.setBounds(310, 560, 180, 40);

        btnAddStudent.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnAddStudent.setText("Delete Student");
        btnAddStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddStudentActionPerformed(evt);
            }
        });
        jLayeredPane1.add(btnAddStudent);
        btnAddStudent.setBounds(760, 560, 210, 40);

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 102));
        jLabel3.setText("All Students");
        jLayeredPane1.add(jLabel3);
        jLabel3.setBounds(380, 30, 300, 90);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/studensmall.jpg"))); // NOI18N
        jLayeredPane1.add(jLabel2);
        jLabel2.setBounds(-1520, -340, 2790, 1630);

        add(jLayeredPane1);
        jLayeredPane1.setBounds(0, 0, 1150, 790);
    }// </editor-fold>//GEN-END:initComponents

    private void sortByGPAButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortByGPAButtonActionPerformed
        // TODO add your handling code here:
        sortStudentByGPA();
    }//GEN-LAST:event_sortByGPAButtonActionPerformed

    private void sortByIdButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortByIdButtonActionPerformed
        // TODO add your handling code here:
        sortStudentByID();
    }//GEN-LAST:event_sortByIdButtonActionPerformed

    private void sortByNameButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortByNameButtonActionPerformed
        // TODO add your handling code here:
        sortStudentByName();
    }//GEN-LAST:event_sortByNameButtonActionPerformed

    private void btnAddStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddStudentActionPerformed

        
        int selectedRowIndex = studentsTable.getSelectedRow();
    
    // Check if a row is selected
    if(selectedRowIndex >= 0) {
        // Get the model of the table
        DefaultTableModel model = (DefaultTableModel) studentsTable.getModel();
        
        // Get the student ID at the selected row, which is at column 0
        int studentIdToDelete = (int) model.getValueAt(selectedRowIndex, 0);
        
        // Create a Student object with the ID
        Student studentToDelete = new Student();
        studentToDelete.setStuId(studentIdToDelete);
        
        // Call the method to delete the student from the data list
        StudentDataMangementFactory.getFactoryInstance().getObject().deleteOneObject(studentToDelete);
        
        // Remove the row from the table model
        model.removeRow(selectedRowIndex);
        updateTotalStudentsLabel();
    } else {
        // No row selected to delete
        JOptionPane.showMessageDialog(null, "Please select a student to delete");
    }
    }//GEN-LAST:event_btnAddStudentActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddStudent;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton sortByGPAButton;
    private javax.swing.JButton sortByIdButton;
    private javax.swing.JButton sortByNameButton;
    private javax.swing.JTable studentsTable;
    private javax.swing.JLabel totalStudentsLabel;
    // End of variables declaration//GEN-END:variables
}
