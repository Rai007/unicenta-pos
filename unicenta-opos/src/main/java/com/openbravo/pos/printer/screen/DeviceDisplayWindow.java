//    KrOS POS  - Touch Friendly Point Of Sale
//    Copyright (c) 2009-2018 uniCenta & previous Openbravo POS works
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

package com.openbravo.pos.printer.screen;

import com.openbravo.pos.forms.AppLocal;
import com.openbravo.pos.printer.DeviceDisplay;
import javax.swing.JComponent;

/**
 *
 * @author  adrian
 */
public class DeviceDisplayWindow extends javax.swing.JFrame implements DeviceDisplay {
    
    private String m_sName;
    private DeviceDisplayPanel m_display;
    
    /** Creates new form DeviceDisplayWindow */
    public DeviceDisplayWindow() {
        initComponents();
        
        m_sName = AppLocal.getIntString("display.window");
        m_display = new DeviceDisplayPanel(3.0);
        
        m_jContainer.add(m_display.getDisplayComponent());
        
        setVisible(true);
    }
    
    /**
     *
     * @return
     */
    @Override
    public String getDisplayName() {
        return m_sName;
    }    

    /**
     *
     * @return
     */
    @Override
    public String getDisplayDescription() {
        return null;
    }        

    /**
     *
     * @return
     */
    @Override
    public JComponent getDisplayComponent() {
        return null;
    }
    
    /**
     *
     * @param animation
     * @param sLine1
     * @param sLine2
     */
    @Override
    public void writeVisor(int animation, String sLine1, String sLine2) {
        m_display.writeVisor(animation, sLine1, sLine2);
    }

    /**
     *
     * @param sLine1
     * @param sLine2
     */
    @Override
    public void writeVisor(String sLine1, String sLine2) {
        m_display.writeVisor(sLine1, sLine2);
    }

    /**
     *
     */
    @Override
    public void clearVisor() {
        m_display.clearVisor();
    }
    
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        m_jContainer = new javax.swing.JPanel();

        setTitle(AppLocal.getIntString("display.window")); // NOI18N

        m_jContainer.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        m_jContainer.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        m_jContainer.setLayout(new java.awt.BorderLayout());
        getContentPane().add(m_jContainer, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(767, 245));
    }// </editor-fold>//GEN-END:initComponents
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel m_jContainer;
    // End of variables declaration//GEN-END:variables
    
}
