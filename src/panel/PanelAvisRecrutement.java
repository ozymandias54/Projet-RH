/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package panel;

import DAO.AvisRecrutementDAO;
import DAO.EmployeDAO;
import DAO.UserDAO;
import beans.AvisRecrutement;
import beans.Employe;
import beans.User;
import classe_special.Confirm;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author fofana
 */
public class PanelAvisRecrutement extends javax.swing.JPanel {
 
    boolean modifier;
    /**
     * Creates new form PanelUtilisateur
     */
    public PanelAvisRecrutement() {
        initComponents();
        liste();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        frameAjouter = new javax.swing.JFrame();
        jPanel1 = new javax.swing.JPanel();
        btnEnregistrer = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtTitre = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDescription = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtExigence = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        txtDateFin = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_AvisRecrutement = new classe_special.Tableaux();
        btnAjouter1 = new javax.swing.JLabel();
        btnModifier1 = new javax.swing.JLabel();
        btnSupprimer1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        frameAjouter.getContentPane().setBackground(Color.WHITE);
        frameAjouter.setAlwaysOnTop(true);
        frameAjouter.setMinimumSize(new java.awt.Dimension(377, 515));
        frameAjouter.setResizable(false);
        frameAjouter.setSize(new java.awt.Dimension(377, 515));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        btnEnregistrer.setBackground(new java.awt.Color(0, 102, 255));
        btnEnregistrer.setForeground(new java.awt.Color(255, 255, 255));
        btnEnregistrer.setText("Enregistrer");
        btnEnregistrer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnregistrerActionPerformed(evt);
            }
        });

        jLabel2.setText("Description");

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 153, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Ajouter User");

        jLabel1.setText("Titre");

        txtDescription.setColumns(20);
        txtDescription.setRows(5);
        jScrollPane2.setViewportView(txtDescription);

        jLabel3.setText("Exigence");

        txtExigence.setColumns(20);
        txtExigence.setRows(5);
        jScrollPane3.setViewportView(txtExigence);

        jLabel4.setText("Date Fin");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(txtTitre, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                            .addComponent(txtDateFin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(15, 15, 15)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addComponent(btnEnregistrer, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTitre)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtDateFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(87, 87, 87)
                        .addComponent(jLabel3)
                        .addGap(87, 87, 87)
                        .addComponent(jLabel4)))
                .addGap(27, 27, 27)
                .addComponent(btnEnregistrer, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );

        frameAjouter.pack();
        frameAjouter.setLocationRelativeTo(null);

        javax.swing.GroupLayout frameAjouterLayout = new javax.swing.GroupLayout(frameAjouter.getContentPane());
        frameAjouter.getContentPane().setLayout(frameAjouterLayout);
        frameAjouterLayout.setHorizontalGroup(
            frameAjouterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        frameAjouterLayout.setVerticalGroup(
            frameAjouterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setBackground(new java.awt.Color(255, 255, 255));

        tb_AvisRecrutement.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Titre", "Description", "ExigenceEmploi", "Date Fin"
            }
        ));
        tb_AvisRecrutement.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_AvisRecrutementMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tb_AvisRecrutement);

        btnAjouter1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnAjouter1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/ajouter.png"))); // NOI18N
        btnAjouter1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAjouter1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAjouter1MouseClicked(evt);
            }
        });

        btnModifier1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnModifier1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/modifier.png"))); // NOI18N
        btnModifier1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnModifier1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnModifier1MouseClicked(evt);
            }
        });

        btnSupprimer1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnSupprimer1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/supprimer.png"))); // NOI18N
        btnSupprimer1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSupprimer1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSupprimer1MouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Avis de Recrutement");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(btnAjouter1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnModifier1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSupprimer1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(3, 3, 3)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(3, 3, 3)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnSupprimer1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnAjouter1)
                            .addComponent(btnModifier1))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 395, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAjouter1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAjouter1MouseClicked
        jLabel5.setText("Ajouter Avis");
        frameAjouter.setVisible(true);
        modifier=false;
        txtTitre.setText("");
        txtDescription.setText("");
        txtExigence.setText("");
        txtDateFin.setDate(null);
    }//GEN-LAST:event_btnAjouter1MouseClicked

    private void btnModifier1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModifier1MouseClicked
        int index = tb_AvisRecrutement.getSelectedRow();
        if (index==-1){
            JOptionPane.showMessageDialog(this,"Veuillez selectionnez une ligne");
        }
        else {
            jLabel5.setText("Modifier Avis");
            frameAjouter.setVisible(true);
            modifier=true;
        }
    }//GEN-LAST:event_btnModifier1MouseClicked

    private void btnSupprimer1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSupprimer1MouseClicked
        int index = tb_AvisRecrutement.getSelectedRow();
        if (index==-1){
            JOptionPane.showMessageDialog(this,"Veuillez selectionnez une ligne");
        }
        else {
            new Confirm().affiche("Supprimer","Etes vous sur de vouloir Supprimer!!!", new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent ae) {
                    int index = tb_AvisRecrutement.getSelectedRow();
                    String titre = (String)tb_AvisRecrutement.getValueAt(index,0);
                    AvisRecrutementDAO udao = new AvisRecrutementDAO();
                    udao.supprimer(titre);
                    vider();
                    liste();
                }
            });
        }
    }//GEN-LAST:event_btnSupprimer1MouseClicked

    private void btnEnregistrerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnregistrerActionPerformed
        String titre=txtTitre.getText();
        String description=txtDescription.getText();
        String exigence=txtExigence.getText();
        Date fin=txtDateFin.getDate();
       
        AvisRecrutementDAO adao=new AvisRecrutementDAO();
        
        if(titre.equals("")||description.equals("")||exigence.equals("")){
            JOptionPane.showMessageDialog(this,"Veuillez Remplir tous les champs");
        }
        else if(modifier==false){
            AvisRecrutement u=new AvisRecrutement(titre, description, exigence, fin);
            adao.inserer(u);
            vider();liste();
            frameAjouter.setVisible(false);
        }
        else if(modifier==true){
            int ligne=tb_AvisRecrutement.getSelectedRow();
            String idtitre =(String)tb_AvisRecrutement.getValueAt(ligne, 0);
            AvisRecrutement u=new AvisRecrutement(titre, description, exigence, fin);
            adao.modifier(u, idtitre);
            vider();liste();
            frameAjouter.setVisible(false);
        }
        
    }//GEN-LAST:event_btnEnregistrerActionPerformed

    private void tb_AvisRecrutementMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_AvisRecrutementMouseClicked
        int index = tb_AvisRecrutement.getSelectedRow();
        if(index!=-1){
            String id = (String)tb_AvisRecrutement.getValueAt(index,0);
            AvisRecrutementDAO udao=new AvisRecrutementDAO();
            AvisRecrutement u=udao.rechercher(id);
            txtTitre.setText(u.getTitrePoste());
            txtDescription.setText(u.getDescription());
            txtExigence.setText(u.getExigenceEmploi());
            txtDateFin.setDate(u.getDateFin());
        }
    }//GEN-LAST:event_tb_AvisRecrutementMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnAjouter1;
    private javax.swing.JButton btnEnregistrer;
    private javax.swing.JLabel btnModifier1;
    private javax.swing.JLabel btnSupprimer1;
    private javax.swing.JFrame frameAjouter;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private classe_special.Tableaux tb_AvisRecrutement;
    private com.toedter.calendar.JDateChooser txtDateFin;
    private javax.swing.JTextArea txtDescription;
    private javax.swing.JTextArea txtExigence;
    private javax.swing.JTextField txtTitre;
    // End of variables declaration//GEN-END:variables

public void liste(){
    AvisRecrutementDAO udao = new AvisRecrutementDAO();
        List<AvisRecrutement> avis = udao.liste();
        
        for (int i = 0; i < avis.size(); i++) {
            ((DefaultTableModel) tb_AvisRecrutement.getModel()).addRow(new Object[]{
                  avis.get(i).getTitrePoste(),
                  avis.get(i).getDescription(),
                  avis.get(i).getExigenceEmploi(),
                  avis.get(i).getDateFin()
            });

    }
}
public void vider(){
        txtTitre.setText("");
        txtDescription.setText("");
        txtExigence.setText("");
        txtDateFin.setDate(null);
        DefaultTableModel model = (DefaultTableModel) tb_AvisRecrutement.getModel();
        int n = model.getRowCount();
        for (int i = n - 1; i >= 0; --i) {
            model.removeRow(i);
        }
    }


}
