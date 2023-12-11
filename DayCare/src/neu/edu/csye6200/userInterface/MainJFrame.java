package neu.edu.csye6200.userInterface;

import java.awt.CardLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author @sahilmattoo
 */

public class MainJFrame extends javax.swing.JFrame {
   private StudentJPanel studentJPanel;
   private TeacherJPanel teacherJPanel;
   private RenewalJPanel renewalJPanel;
   private ClassRoomJPanel classRoomJPanel;
   private StateRulesJPanel StateRulesjPanel;
   private StatsJPanel statsJPanel;


    public MainJFrame() {
        initComponents();
         // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        containerJPanel = new javax.swing.JPanel();
        splitPane = new javax.swing.JSplitPane();
        controlJPanel = new javax.swing.JPanel();
        mainHeadingLabel = new javax.swing.JLabel();
        adminBtn = new javax.swing.JButton();
        teacherBtn = new javax.swing.JButton();
        studentBtn1 = new javax.swing.JButton();
        btnStateRules = new javax.swing.JButton();
        btnRenewal = new javax.swing.JButton();
        logoutBtn = new javax.swing.JButton();
        btnRenewal1 = new javax.swing.JButton();
        userProcessControllerJPanel = new javax.swing.JPanel();

        jLabel1.setText("jLabel1");

        jLabel2.setText("jLabel2");

        jLabel3.setText("jLabel3");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        containerJPanel.setBackground(new java.awt.Color(255, 255, 255));

        splitPane.setDividerLocation(150);
        splitPane.setDividerSize(0);
        splitPane.setMinimumSize(new java.awt.Dimension(800, 25));

        controlJPanel.setBackground(new java.awt.Color(255, 255, 255));

        mainHeadingLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        mainHeadingLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mainHeadingLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/iconfinder_menu-alt_134216.png"))); // NOI18N
        mainHeadingLabel.setText("Day Care");
        mainHeadingLabel.setToolTipText("Day Care");

        adminBtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        adminBtn.setText("Administrator");
        adminBtn.setToolTipText("Admin");
        adminBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        adminBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        adminBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        adminBtn.setNextFocusableComponent(adminBtn);
        adminBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminBtnActionPerformed(evt);
            }
        });

        teacherBtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        teacherBtn.setText("Teacher");
        teacherBtn.setToolTipText("teacher");
        teacherBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        teacherBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        teacherBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        teacherBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teacherBtnActionPerformed(evt);
            }
        });

        studentBtn1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        studentBtn1.setText("Student");
        studentBtn1.setToolTipText("Student");
        studentBtn1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        studentBtn1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        studentBtn1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        studentBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentBtn1ActionPerformed(evt);
            }
        });

        btnStateRules.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnStateRules.setText("State Rules");
        btnStateRules.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btnStateRules.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStateRulesActionPerformed(evt);
            }
        });

        btnRenewal.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnRenewal.setText("Renewal ");
        btnRenewal.setToolTipText("Student");
        btnRenewal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnRenewal.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnRenewal.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRenewal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRenewalActionPerformed(evt);
            }
        });

        logoutBtn.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        logoutBtn.setText("Logout");
        logoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBtnActionPerformed(evt);
            }
        });

        btnRenewal1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnRenewal1.setText("Statistics");
        btnRenewal1.setToolTipText("Student");
        btnRenewal1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnRenewal1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnRenewal1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRenewal1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRenewal1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout controlJPanelLayout = new javax.swing.GroupLayout(controlJPanel);
        controlJPanel.setLayout(controlJPanelLayout);
        controlJPanelLayout.setHorizontalGroup(
            controlJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(adminBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
            .addComponent(teacherBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
            .addComponent(studentBtn1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(mainHeadingLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnStateRules, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnRenewal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, controlJPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logoutBtn)
                .addGap(22, 22, 22))
            .addComponent(btnRenewal1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        controlJPanelLayout.setVerticalGroup(
            controlJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlJPanelLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(mainHeadingLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(adminBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(studentBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(teacherBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnStateRules, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRenewal, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRenewal1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(logoutBtn)
                .addGap(51, 51, 51))
        );

        splitPane.setLeftComponent(controlJPanel);

        userProcessControllerJPanel.setBackground(new java.awt.Color(255, 255, 255));
        userProcessControllerJPanel.setLayout(new java.awt.CardLayout());
        splitPane.setRightComponent(userProcessControllerJPanel);

        javax.swing.GroupLayout containerJPanelLayout = new javax.swing.GroupLayout(containerJPanel);
        containerJPanel.setLayout(containerJPanelLayout);
        containerJPanelLayout.setHorizontalGroup(
            containerJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splitPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        containerJPanelLayout.setVerticalGroup(
            containerJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splitPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(containerJPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(containerJPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void adminBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminBtnActionPerformed
   
    }//GEN-LAST:event_adminBtnActionPerformed

    private void studentBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentBtn1ActionPerformed
        
    }//GEN-LAST:event_studentBtn1ActionPerformed

    private void btnStateRulesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStateRulesActionPerformed
      
    }//GEN-LAST:event_btnStateRulesActionPerformed

    private void btnRenewalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRenewalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRenewalActionPerformed

    private void logoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtnActionPerformed
        // TODO add your handling code here:
        System.out.print("Logout");
        JFrame o = new LoginJFrame();
        o.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_logoutBtnActionPerformed

    private void teacherBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teacherBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_teacherBtnActionPerformed

    private void btnRenewal1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRenewal1ActionPerformed
        // TODO add your handling code here:
        statsJPanel();
    }//GEN-LAST:event_btnRenewal1ActionPerformed
    public void classRoomJPanel(){
        classRoomJPanel = new ClassRoomJPanel(userProcessControllerJPanel);
        userProcessControllerJPanel.add("classRoomJPanel",classRoomJPanel);
        CardLayout layout = (CardLayout) userProcessControllerJPanel.getLayout();
        layout.next(userProcessControllerJPanel);
    }
     public JPanel StateRulesJpanel(){
        StateRulesjPanel  = new StateRulesJPanel(userProcessControllerJPanel);
        userProcessControllerJPanel.add("stateRulesJPanel",StateRulesjPanel);
        CardLayout layout = (CardLayout) userProcessControllerJPanel.getLayout();
        layout.next(userProcessControllerJPanel);
        return StateRulesjPanel;
    }
    public void renewalJPanel(){
        renewalJPanel = new RenewalJPanel();
        userProcessControllerJPanel.add("renewalJPanel",renewalJPanel);
        CardLayout layout = (CardLayout) userProcessControllerJPanel.getLayout();
        layout.next(userProcessControllerJPanel);
   }
    public void studentJPanel(){
       studentJPanel = new StudentJPanel(userProcessControllerJPanel);
       userProcessControllerJPanel.add("studentJPanel",studentJPanel);
       CardLayout layout = (CardLayout) userProcessControllerJPanel.getLayout();
       layout.next(userProcessControllerJPanel);
   }
   public void teacherJPanel(){
       teacherJPanel = new TeacherJPanel(userProcessControllerJPanel);
        userProcessControllerJPanel.add("teacherJPanel",teacherJPanel);
        CardLayout layout = (CardLayout) userProcessControllerJPanel.getLayout();
        layout.next(userProcessControllerJPanel);
   }
   public void statsJPanel(){
        statsJPanel = new StatsJPanel(userProcessControllerJPanel);
        userProcessControllerJPanel.add("statsJPanel",statsJPanel);
        CardLayout layout = (CardLayout) userProcessControllerJPanel.getLayout();
        layout.next(userProcessControllerJPanel);
    }
    public JButton getAdminBtn() {
        return adminBtn;
    }

    public JButton getStudentBtn1() {
        return studentBtn1;
    }

    public JButton getTeacherBtn() {
        return teacherBtn;
    }
    public void setStudentJPanel(StudentJPanel studentJPanel) {
        this.studentJPanel = studentJPanel;
    }

    public void setTeacherJPanel(TeacherJPanel teacherJPanel) {
        this.teacherJPanel = teacherJPanel;
    }

    public StudentJPanel getStudentJPanel() {
        return studentJPanel;
    }

    public TeacherJPanel getTeacherJPanel() {
        return teacherJPanel;
    }
    public JPanel getUserProcessControllerJPanel() {
        return userProcessControllerJPanel;
    }

    public RenewalJPanel getRenewalJPanel() {
        return renewalJPanel;
    }

    public void setRenewalJPanel(RenewalJPanel renewalJPanel) {
        this.renewalJPanel = renewalJPanel;
    }


    public ClassRoomJPanel getClassRoomJPanel() {
        return classRoomJPanel;
    }

    public void setClassRoomJPanel(ClassRoomJPanel classRoomJPanel) {
        this.classRoomJPanel = classRoomJPanel;
    }

    public JButton getBtnStateRules() {
        return btnStateRules;
    }

    public void setBtnStateRules(JButton btnStateRules) {
        this.btnStateRules = btnStateRules;
    }

    public StateRulesJPanel getStateRulesjPanel() {
        return StateRulesjPanel;
    }

    public void setStateRulesjPanel(StateRulesJPanel StateRulesjPanel) {
        this.StateRulesjPanel = StateRulesjPanel;
    }

    public JButton getBtnRenewal() {
        return btnRenewal;
    }
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adminBtn;
    private javax.swing.JButton btnRenewal;
    private javax.swing.JButton btnRenewal1;
    private javax.swing.JButton btnStateRules;
    private javax.swing.JPanel containerJPanel;
    private javax.swing.JPanel controlJPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton logoutBtn;
    private javax.swing.JLabel mainHeadingLabel;
    private javax.swing.JSplitPane splitPane;
    private javax.swing.JButton studentBtn1;
    private javax.swing.JButton teacherBtn;
    private javax.swing.JPanel userProcessControllerJPanel;
    // End of variables declaration//GEN-END:variables
}
