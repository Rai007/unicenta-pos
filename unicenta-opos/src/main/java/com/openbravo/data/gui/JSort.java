//    KrOS POS  - Touch Friendly Point Of Sale
//    Copyright (c)  uniCenta & previous Openbravo POS works
//    https://unicenta.com
//
//    This file is part of KrOS POS
//
//    KrOS POS is free software: you can redistribute it and/or modify
//    it under the terms of the GNU General Public License as published by
//    the Free Software Foundation, either version 3 of the License, or
//    (at your option) any later version.
//
//   KrOS POS is distributed in the hope that it will be useful,
//    but WITHOUT ANY WARRANTY; without even the implied warranty of
//    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
//    GNU General Public License for more details.
//
//    You should have received a copy of the GNU General Public License
//    along with KrOS POS.  If not, see <http://www.gnu.org/licenses/>.

package com.openbravo.data.gui;

import javax.swing.*;
import java.awt.*;
import java.util.Comparator;
import com.openbravo.basic.BasicException;
import com.openbravo.data.loader.ComparatorCreator;
import com.openbravo.data.loader.LocalRes;

/**
 *
 * @author JG uniCenta
 */
public class JSort extends JDialog {
    
    private ComparatorCreator m_cc;
    private Comparator m_Comparator;
        
    private JSort(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
    }

    private JSort(java.awt.Dialog parent, boolean modal) {
        super(parent, modal);
    }
    
    private Comparator init(ComparatorCreator cc) throws BasicException {
        
        initComponents();

        getRootPane().setDefaultButton(jcmdOK);   
        
        m_cc = cc;
        
        String[] sHeaders = m_cc.getHeaders();
        
        m_jSort1.removeAllItems();
        m_jSort1.addItem("");
        for (int i = 0; i < sHeaders.length; i++) {
            m_jSort1.addItem(sHeaders[i]);
        }
        m_jSort1.setSelectedItem(0);
        
        m_jSort2.removeAllItems();
        m_jSort2.addItem("");
        for (int i = 0; i < sHeaders.length; i++) {
            m_jSort2.addItem(sHeaders[i]);
        }
        m_jSort2.setSelectedItem(0);
        
        m_jSort3.removeAllItems();
        m_jSort3.addItem("");
        for (int i = 0; i < sHeaders.length; i++) {
            m_jSort3.addItem(sHeaders[i]);
        }
        m_jSort3.setSelectedItem(0);
        
        m_Comparator = null;
        setVisible(true);       
        return m_Comparator;
    }
    
    private static Window getWindow(Component parent) {
        if (parent == null) {
            return new JFrame();
        } else if (parent instanceof Frame || parent instanceof Dialog) {
            return (Window)parent;
        } else {
            return getWindow(parent.getParent());
        }
    }
       
    /**
     *
     * @param parent
     * @param cc
     * @return
     * @throws BasicException
     */
    public static Comparator showMessage(Component parent, ComparatorCreator cc) throws BasicException {
         
        Window window = getWindow(parent);      
        
        JSort myMsg;
        if (window instanceof Frame) { 
            myMsg = new JSort((Frame) window, true);
        } else {
            myMsg = new JSort((Dialog) window, true);
        }
        return myMsg.init(cc);
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        m_jSort1 = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        m_jSort2 = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        m_jSort3 = new javax.swing.JComboBox();
        jPanel2 = new javax.swing.JPanel();
        jcmdCancel = new javax.swing.JButton();
        jcmdOK = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle(LocalRes.getIntString("caption.sort")); // NOI18N
        setResizable(false);

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setText(LocalRes.getIntString("label.sortby")); // NOI18N
        jLabel2.setPreferredSize(new java.awt.Dimension(150, 30));

        m_jSort1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        m_jSort1.setPreferredSize(new java.awt.Dimension(200, 30));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setText(LocalRes.getIntString("label.andby")); // NOI18N
        jLabel3.setPreferredSize(new java.awt.Dimension(150, 30));

        m_jSort2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        m_jSort2.setPreferredSize(new java.awt.Dimension(200, 30));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setText(LocalRes.getIntString("label.andby")); // NOI18N
        jLabel4.setPreferredSize(new java.awt.Dimension(150, 30));

        m_jSort3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        m_jSort3.setPreferredSize(new java.awt.Dimension(200, 30));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(m_jSort1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(m_jSort2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(m_jSort3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(m_jSort1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(m_jSort2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(m_jSort3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        jPanel2.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT));

        jcmdCancel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jcmdCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/openbravo/images/cancel.png"))); // NOI18N
        jcmdCancel.setText(LocalRes.getIntString("button.cancel")); // NOI18N
        jcmdCancel.setMaximumSize(new java.awt.Dimension(65, 33));
        jcmdCancel.setMinimumSize(new java.awt.Dimension(65, 33));
        jcmdCancel.setPreferredSize(new java.awt.Dimension(110, 45));
        jcmdCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcmdCancelActionPerformed(evt);
            }
        });
        jPanel2.add(jcmdCancel);

        jcmdOK.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jcmdOK.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/openbravo/images/ok.png"))); // NOI18N
        jcmdOK.setText(LocalRes.getIntString("button.OK")); // NOI18N
        jcmdOK.setMaximumSize(new java.awt.Dimension(65, 33));
        jcmdOK.setMinimumSize(new java.awt.Dimension(65, 33));
        jcmdOK.setPreferredSize(new java.awt.Dimension(110, 45));
        jcmdOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcmdOKActionPerformed(evt);
            }
        });
        jPanel2.add(jcmdOK);

        getContentPane().add(jPanel2, java.awt.BorderLayout.SOUTH);

        setSize(new java.awt.Dimension(396, 234));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jcmdCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcmdCancelActionPerformed
        
        dispose();
        
    }//GEN-LAST:event_jcmdCancelActionPerformed
    
    private void jcmdOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcmdOKActionPerformed

        int iSort1 = m_jSort1.getSelectedIndex();
        int iSort2 = m_jSort2.getSelectedIndex();
        int iSort3 = m_jSort3.getSelectedIndex();
        
        if (iSort1 > 0 && iSort2 == 0 && iSort3 == 0) {
            m_Comparator = m_cc.createComparator(new int[] {iSort1 - 1});
            dispose();
        } else if (iSort1 > 0 && iSort2 > 0 && iSort3 == 0) {
            m_Comparator = m_cc.createComparator(new int[] {iSort1 - 1, iSort2 - 1});
            dispose();
        } else if (iSort1 > 0 && iSort2 > 0 && iSort3 > 0) {
            m_Comparator = m_cc.createComparator(new int[] {iSort1 - 1, iSort2 - 1,  iSort3 - 1});
            dispose();
        } else {
            MessageInf msg = new MessageInf(MessageInf.SGN_NOTICE, LocalRes.getIntString("message.nosort"));
            msg.show(this);   
        }
  
    }//GEN-LAST:event_jcmdOKActionPerformed
       
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton jcmdCancel;
    private javax.swing.JButton jcmdOK;
    private javax.swing.JComboBox m_jSort1;
    private javax.swing.JComboBox m_jSort2;
    private javax.swing.JComboBox m_jSort3;
    // End of variables declaration//GEN-END:variables
    
}
