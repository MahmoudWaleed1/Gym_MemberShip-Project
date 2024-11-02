/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package frontend;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Mahmoud Waleed
 */
public class TrainerRole extends javax.swing.JFrame {
         backend.TrainerRole trainer;
    /**
     * Creates new form TrainerRole
     * @throws java.io.FileNotFoundException
     */
    public TrainerRole() throws FileNotFoundException {
        this.trainer = new backend.TrainerRole();
        initComponents();
        setTitle("Trainer Role");
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addMembers = new javax.swing.JButton();
        viewMembers = new javax.swing.JButton();
        addClass = new javax.swing.JButton();
        viewClass = new javax.swing.JButton();
        registerMember = new javax.swing.JButton();
        classRegistration = new javax.swing.JButton();
        viewRegistrations = new javax.swing.JButton();
        logout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        addMembers.setBackground(new java.awt.Color(0, 0, 0));
        addMembers.setForeground(new java.awt.Color(255, 255, 255));
        addMembers.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.darkGray));
        addMembers.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        addMembers.setLabel("Add members");
        addMembers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addMembersActionPerformed(evt);
            }
        });

        viewMembers.setBackground(new java.awt.Color(0, 0, 0));
        viewMembers.setForeground(new java.awt.Color(255, 255, 255));
        viewMembers.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray));
        viewMembers.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        viewMembers.setLabel("View Members");
        viewMembers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewMembersActionPerformed(evt);
            }
        });

        addClass.setBackground(new java.awt.Color(0, 0, 0));
        addClass.setForeground(new java.awt.Color(255, 255, 255));
        addClass.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray));
        addClass.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        addClass.setLabel("Add class");
        addClass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addClassActionPerformed(evt);
            }
        });

        viewClass.setBackground(new java.awt.Color(0, 0, 0));
        viewClass.setForeground(new java.awt.Color(255, 255, 255));
        viewClass.setActionCommand("View Classes");
        viewClass.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray));
        viewClass.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        viewClass.setLabel("View classes");
        viewClass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewClassActionPerformed(evt);
            }
        });

        registerMember.setBackground(new java.awt.Color(0, 0, 0));
        registerMember.setForeground(new java.awt.Color(255, 255, 255));
        registerMember.setActionCommand("View Classes");
        registerMember.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray));
        registerMember.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        registerMember.setLabel("Register Member For Class");
        registerMember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerMemberActionPerformed(evt);
            }
        });

        classRegistration.setBackground(new java.awt.Color(0, 0, 0));
        classRegistration.setForeground(new java.awt.Color(255, 255, 255));
        classRegistration.setActionCommand("View Classes");
        classRegistration.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray));
        classRegistration.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        classRegistration.setLabel("Cancel Registration");
        classRegistration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                classRegistrationActionPerformed(evt);
            }
        });

        viewRegistrations.setBackground(new java.awt.Color(0, 0, 0));
        viewRegistrations.setForeground(new java.awt.Color(255, 255, 255));
        viewRegistrations.setActionCommand("View Classes");
        viewRegistrations.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray));
        viewRegistrations.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        viewRegistrations.setLabel("View Registrations");
        viewRegistrations.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewRegistrationsActionPerformed(evt);
            }
        });

        logout.setBackground(new java.awt.Color(0, 0, 0));
        logout.setForeground(new java.awt.Color(255, 255, 255));
        logout.setText("Logout");
        logout.setActionCommand("View Classes");
        logout.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray));
        logout.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(135, 135, 135)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(viewRegistrations, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(classRegistration, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(registerMember, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(viewClass, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(viewMembers, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                        .addComponent(addMembers, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(addClass, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(113, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(addMembers, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(viewMembers, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(addClass, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(viewClass, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(registerMember, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(classRegistration, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(viewRegistrations, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addMembersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addMembersActionPerformed

        dispose();
        AddMember am = new AddMember();
        am.setVisible(true);
    }//GEN-LAST:event_addMembersActionPerformed

    private void viewMembersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewMembersActionPerformed

        dispose();
<<<<<<< HEAD
        //RemoveTrainer ad = new RemoveTrainer(this);
        //ad.setVisible(true);
=======
        viewMembers vm = new viewMembers(this);
        vm.setVisible(true);
>>>>>>> ddb50c90c8046654d21daeb9c57abd6517d71886
    }//GEN-LAST:event_viewMembersActionPerformed

    private void addClassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addClassActionPerformed
        //ViewTrainers ad = new ViewTrainers(this);
        //ad.setVisible(true);
    }//GEN-LAST:event_addClassActionPerformed

    private void viewClassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewClassActionPerformed
        try {
            trainer.logout();
            dispose();
            Main_page m = new Main_page();
            m.setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(AdminRole.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_viewClassActionPerformed

    private void registerMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerMemberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_registerMemberActionPerformed

    private void classRegistrationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_classRegistrationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_classRegistrationActionPerformed

    private void viewRegistrationsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewRegistrationsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_viewRegistrationsActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_logoutActionPerformed

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
            java.util.logging.Logger.getLogger(TrainerRole.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TrainerRole.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TrainerRole.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TrainerRole.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {

                try {
                    new frontend.AdminRole().setVisible(true);
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(AdminRole.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addClass;
    private javax.swing.JButton addMembers;
    private javax.swing.JButton classRegistration;
    private javax.swing.JButton logout;
    private javax.swing.JButton registerMember;
    private javax.swing.JButton viewClass;
    private javax.swing.JButton viewMembers;
    private javax.swing.JButton viewRegistrations;
    // End of variables declaration//GEN-END:variables
}
