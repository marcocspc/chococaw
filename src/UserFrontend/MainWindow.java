/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserFrontend;

import java.awt.Rectangle;
import javax.swing.DefaultListModel;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author marcocspc
 */
public class MainWindow extends javax.swing.JFrame {

    /**
     * Creates new form MainWindow
     */
    public MainWindow() {
        initComponents();
        
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            JOptionPane.showMessageDialog(rootPane, "Error!\n" + ex.getMessage());
        }
        
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        idField = new javax.swing.JTextField();
        titleField = new javax.swing.JTextField();
        versionField = new javax.swing.JTextField();
        authorsField = new javax.swing.JTextField();
        ownersField = new javax.swing.JTextField();
        summaryField = new javax.swing.JTextField();
        projectURLField = new javax.swing.JTextField();
        licenseURLField = new javax.swing.JTextField();
        iconURLField = new javax.swing.JTextField();
        tagsField = new javax.swing.JTextField();
        dependenciesField = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        installerTypeField = new javax.swing.JTextField();
        unattendedArgumentsField = new javax.swing.JTextField();
        x86InstallerField = new javax.swing.JTextField();
        x64InstallerField = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        connectToServerBtn = new javax.swing.JButton();
        newBtn = new javax.swing.JButton();
        editBtn = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        doneBtn = new javax.swing.JButton();
        exampleBtn = new javax.swing.JButton();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cacao");
        setPreferredSize(new java.awt.Dimension(800, 600));
        setResizable(false);

        jList2.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jList2.setModel(new DefaultListModel());
        jScrollPane2.setViewportView(jList2);

        idField.setFont(new java.awt.Font("Lucida Grande", 2, 13)); // NOI18N
        idField.setForeground(new java.awt.Color(153, 153, 153));
        idField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        idField.setText("ID");
        idField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                idFieldFocusGained(evt);
            }
        });

        titleField.setFont(new java.awt.Font("Lucida Grande", 2, 12)); // NOI18N
        titleField.setForeground(new java.awt.Color(153, 153, 153));
        titleField.setText("Title");

        versionField.setFont(new java.awt.Font("Lucida Grande", 2, 13)); // NOI18N
        versionField.setForeground(new java.awt.Color(153, 153, 153));
        versionField.setText("Version");

        authorsField.setFont(new java.awt.Font("Lucida Grande", 2, 13)); // NOI18N
        authorsField.setForeground(new java.awt.Color(153, 153, 153));
        authorsField.setText("Authors");

        ownersField.setFont(new java.awt.Font("Lucida Grande", 2, 13)); // NOI18N
        ownersField.setForeground(new java.awt.Color(153, 153, 153));
        ownersField.setText("Owners");

        summaryField.setFont(new java.awt.Font("Lucida Grande", 2, 13)); // NOI18N
        summaryField.setForeground(new java.awt.Color(153, 153, 153));
        summaryField.setText("Summary");

        projectURLField.setFont(new java.awt.Font("Lucida Grande", 2, 13)); // NOI18N
        projectURLField.setForeground(new java.awt.Color(153, 153, 153));
        projectURLField.setText("Project URL");

        licenseURLField.setFont(new java.awt.Font("Lucida Grande", 2, 13)); // NOI18N
        licenseURLField.setForeground(new java.awt.Color(153, 153, 153));
        licenseURLField.setText("License URL");

        iconURLField.setFont(new java.awt.Font("Lucida Grande", 2, 13)); // NOI18N
        iconURLField.setForeground(new java.awt.Color(153, 153, 153));
        iconURLField.setText("Icon URL");

        tagsField.setFont(new java.awt.Font("Lucida Grande", 2, 13)); // NOI18N
        tagsField.setForeground(new java.awt.Color(153, 153, 153));
        tagsField.setText("Tags");

        dependenciesField.setEditable(false);
        dependenciesField.setFont(new java.awt.Font("Lucida Grande", 2, 13)); // NOI18N
        dependenciesField.setForeground(new java.awt.Color(153, 153, 153));
        dependenciesField.setText("Dependencies");

        jButton5.setText("...");

        installerTypeField.setFont(new java.awt.Font("Lucida Grande", 2, 13)); // NOI18N
        installerTypeField.setForeground(new java.awt.Color(153, 153, 153));
        installerTypeField.setText("Installer Type");

        unattendedArgumentsField.setFont(new java.awt.Font("Lucida Grande", 2, 13)); // NOI18N
        unattendedArgumentsField.setForeground(new java.awt.Color(153, 153, 153));
        unattendedArgumentsField.setText("Unattended Arguments");

        x86InstallerField.setEditable(false);
        x86InstallerField.setFont(new java.awt.Font("Lucida Grande", 2, 13)); // NOI18N
        x86InstallerField.setForeground(new java.awt.Color(153, 153, 153));
        x86InstallerField.setText("32-bit Installer");

        x64InstallerField.setEditable(false);
        x64InstallerField.setFont(new java.awt.Font("Lucida Grande", 2, 13)); // NOI18N
        x64InstallerField.setForeground(new java.awt.Color(153, 153, 153));
        x64InstallerField.setText("64-bit Installer");
        x64InstallerField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                x64InstallerFieldFocusGained(evt);
            }
        });

        jButton6.setText("...");

        jButton7.setText("...");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(idField)
                    .addComponent(titleField)
                    .addComponent(versionField)
                    .addComponent(authorsField)
                    .addComponent(ownersField)
                    .addComponent(summaryField)
                    .addComponent(projectURLField)
                    .addComponent(licenseURLField)
                    .addComponent(iconURLField)
                    .addComponent(tagsField)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(dependenciesField, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(installerTypeField)
                    .addComponent(unattendedArgumentsField)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(x86InstallerField)
                            .addComponent(x64InstallerField))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(82, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(idField, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(titleField, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(versionField, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(authorsField, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ownersField, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(summaryField, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(projectURLField, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(licenseURLField, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(iconURLField, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tagsField, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(dependenciesField)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(installerTypeField, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(unattendedArgumentsField, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(x86InstallerField)
                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(x64InstallerField)
                    .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jScrollPane3.setViewportView(jPanel2);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 619, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 483, Short.MAX_VALUE)
        );

        connectToServerBtn.setText("jButton1");
        connectToServerBtn.setMaximumSize(new java.awt.Dimension(100, 29));
        connectToServerBtn.setMinimumSize(new java.awt.Dimension(100, 29));
        connectToServerBtn.setPreferredSize(new java.awt.Dimension(100, 29));

        newBtn.setText("jButton2");
        newBtn.setMaximumSize(new java.awt.Dimension(100, 29));
        newBtn.setMinimumSize(new java.awt.Dimension(100, 29));
        newBtn.setPreferredSize(new java.awt.Dimension(100, 29));

        editBtn.setText("jButton3");
        editBtn.setMaximumSize(new java.awt.Dimension(100, 29));
        editBtn.setMinimumSize(new java.awt.Dimension(100, 29));
        editBtn.setPreferredSize(new java.awt.Dimension(100, 29));

        jButton4.setText("jButton4");
        jButton4.setMaximumSize(new java.awt.Dimension(100, 29));
        jButton4.setMinimumSize(new java.awt.Dimension(100, 29));
        jButton4.setPreferredSize(new java.awt.Dimension(100, 29));
        jButton4.setSize(new java.awt.Dimension(100, 29));

        deleteBtn.setText("jButton1");
        deleteBtn.setPreferredSize(new java.awt.Dimension(100, 29));
        deleteBtn.setSize(new java.awt.Dimension(100, 29));

        doneBtn.setText("jButton1");
        doneBtn.setPreferredSize(new java.awt.Dimension(100, 29));
        doneBtn.setSize(new java.awt.Dimension(100, 29));

        exampleBtn.setText("jButton1");
        exampleBtn.setPreferredSize(new java.awt.Dimension(100, 29));
        exampleBtn.setSize(new java.awt.Dimension(100, 29));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(connectToServerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(newBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(editBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(doneBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(exampleBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(newBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(connectToServerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(editBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(doneBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(exampleBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void idFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_idFieldFocusGained
        this.defaultActionForTextFieldFocusGained(idField);
    }//GEN-LAST:event_idFieldFocusGained

    private void x64InstallerFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_x64InstallerFieldFocusGained
        this.defaultActionForTextFieldFocusGained(x64InstallerField);
    }//GEN-LAST:event_x64InstallerFieldFocusGained

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
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField authorsField;
    private javax.swing.JButton connectToServerBtn;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JTextField dependenciesField;
    private javax.swing.JButton doneBtn;
    private javax.swing.JButton editBtn;
    private javax.swing.JButton exampleBtn;
    private javax.swing.JTextField iconURLField;
    private javax.swing.JTextField idField;
    private javax.swing.JTextField installerTypeField;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JList<String> jList2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField licenseURLField;
    private javax.swing.JButton newBtn;
    private javax.swing.JTextField ownersField;
    private javax.swing.JTextField projectURLField;
    private javax.swing.JTextField summaryField;
    private javax.swing.JTextField tagsField;
    private javax.swing.JTextField titleField;
    private javax.swing.JTextField unattendedArgumentsField;
    private javax.swing.JTextField versionField;
    private javax.swing.JTextField x64InstallerField;
    private javax.swing.JTextField x86InstallerField;
    // End of variables declaration//GEN-END:variables

    private void defaultActionForTextFieldFocusGained(JTextField jtf) {
        Rectangle bounds = jtf.getBounds();
        bounds.setLocation(SwingUtilities.convertPoint(jtf, bounds.getLocation(), jtf.getParent()));

        jtf.setText("");
        JComponent parent = (JComponent) jtf.getParent();
        parent.scrollRectToVisible(bounds);
    }
}