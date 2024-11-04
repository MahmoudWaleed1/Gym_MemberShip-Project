/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package frontend;

import backend.General;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Mahmoud Waleed
 */
public class cancelRegistration extends javax.swing.JFrame {

    private frontend.TrainerRole trainerRole;

    /**
     * Creates new form cancelRegistration
     *
     * @param trainer
     */
    public cancelRegistration(frontend.TrainerRole trainer) {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Cancel registeration");
        this.trainerRole = trainer;
    }

    public cancelRegistration() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cancelRegister = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        MemberIDInput = new javax.swing.JTextField();
        classIDInput = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        cancelRegister.setBackground(new java.awt.Color(51, 51, 51));
        cancelRegister.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        cancelRegister.setForeground(new java.awt.Color(255, 255, 255));
        cancelRegister.setText("Cancel Registration");
        cancelRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelRegisterActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(0, 204, 51));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Class ID");

        jLabel2.setBackground(new java.awt.Color(0, 204, 51));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Member ID");

        MemberIDInput.setActionCommand("UserNameInput");

        classIDInput.setActionCommand("PasswordInput");
        classIDInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                classIDInputActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(classIDInput, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MemberIDInput, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47))
            .addGroup(layout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addComponent(cancelRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(82, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MemberIDInput, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(classIDInput, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addComponent(cancelRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelRegisterActionPerformed
        if (checkEmptyBoxes()) {
            JOptionPane.showMessageDialog(rootPane, "Some fields are empty!", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            backend.TrainerRole trainer = trainerRole.trainer;
            String classIDString = classIDInput.getText();
            String memberIDString = MemberIDInput.getText();
            ArrayList<General> members=trainer.getListOfMembers();
                boolean flagMember = false;
                for(General m: members){
                    if(memberIDString.equals(m.getSearchKey())){
                        flagMember = true;
                    }
                }
            ArrayList<General> classes=trainer.getListOfClasses();
                boolean flagClass = false;
                for(General c: classes){
                    if(classIDString.equals(c.getSearchKey())){
                        flagClass = true;
                    }
                }
            if (!flagClass) {
                JOptionPane.showMessageDialog(rootPane, "The class with ID = " + classIDString + " does not exist", "Error", JOptionPane.ERROR_MESSAGE);
            } else if (!flagMember) {
                JOptionPane.showMessageDialog(rootPane, "The member with ID = " + memberIDString + " does not exist", "Error", JOptionPane.ERROR_MESSAGE);
          
            }
            boolean cancelled = trainer.cancelRegistration(memberIDString, classIDString);
            if (cancelled) {
                JOptionPane.showMessageDialog(rootPane, "The member with ID = " + memberIDString + " has unregistred from class " + classIDString);
                dispose();
                trainerRole.setVisible(true);
                
            } else {

                JOptionPane.showMessageDialog(rootPane, "The member with ID = " + memberIDString + " has never registred to class " + classIDString + " OR registered for more than 3 days!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }

    }//GEN-LAST:event_cancelRegisterActionPerformed
    private boolean checkEmptyBoxes() {
        return classIDInput.getText().equals("") || MemberIDInput.getText().equals("");
    }
    private void classIDInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_classIDInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_classIDInputActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        trainerRole.setVisible(true);
    }//GEN-LAST:event_formWindowClosed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(cancelRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cancelRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cancelRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cancelRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cancelRegistration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField MemberIDInput;
    private javax.swing.JButton cancelRegister;
    private javax.swing.JTextField classIDInput;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
