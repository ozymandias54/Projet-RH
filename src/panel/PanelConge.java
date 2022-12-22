/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package panel;

import DAO.DemandeAbsenceDAO;
import DAO.EmployeDAO;
import DAO.UserDAO;
import beans.DemandeAbsence;
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
public class PanelConge extends javax.swing.JPanel {
 
    boolean modifier;
    /**
     * Creates new form PanelUtilisateur
     */
    public PanelConge() {
        initComponents();
        liste();
        combo();
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
        txtEmploye = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtMotif = new javax.swing.JTextArea();
        frameAccepter = new javax.swing.JFrame();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtDebute = new com.toedter.calendar.JDateChooser();
        txtFin = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        btnEnregistrerAccepter = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_DemandeAbsence = new classe_special.Tableaux();
        btnAjouter1 = new javax.swing.JLabel();
        btnModifier1 = new javax.swing.JLabel();
        btnSupprimer1 = new javax.swing.JLabel();
        btnAccepter = new javax.swing.JButton();

        frameAjouter.getContentPane().setBackground(Color.WHITE);
        frameAjouter.setAlwaysOnTop(true);
        frameAjouter.setMinimumSize(new java.awt.Dimension(407, 431));
        frameAjouter.setResizable(false);
        frameAjouter.setSize(new java.awt.Dimension(407, 431));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        btnEnregistrer.setBackground(new java.awt.Color(0, 102, 255));
        btnEnregistrer.setForeground(new java.awt.Color(255, 255, 255));
        btnEnregistrer.setText("Enregistrer");
        btnEnregistrer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnregistrerActionPerformed(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 153, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Ajouter User");

        jLabel1.setText("Motif");

        jLabel4.setText("Employe");

        txtMotif.setColumns(20);
        txtMotif.setRows(5);
        jScrollPane2.setViewportView(txtMotif);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 35, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtEmploye, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(132, 132, 132)
                .addComponent(btnEnregistrer, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtEmploye, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(btnEnregistrer, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
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

        frameAccepter.setAlwaysOnTop(true);
        frameAccepter.setMinimumSize(new java.awt.Dimension(398, 370));
        frameAccepter.setSize(new java.awt.Dimension(398, 370));
        frameAccepter.setLocationRelativeTo(null);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Demande Accepter");

        jLabel6.setText("Debute le");

        jLabel7.setText("Fini le");

        btnEnregistrerAccepter.setBackground(new java.awt.Color(0, 153, 255));
        btnEnregistrerAccepter.setForeground(new java.awt.Color(255, 255, 255));
        btnEnregistrerAccepter.setText("Enregistrer");
        btnEnregistrerAccepter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnregistrerAccepterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45)
                                .addComponent(txtDebute, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtFin, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(btnEnregistrerAccepter, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtDebute, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE))
                .addGap(41, 41, 41)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFin, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addComponent(btnEnregistrerAccepter)
                .addContainerGap(102, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout frameAccepterLayout = new javax.swing.GroupLayout(frameAccepter.getContentPane());
        frameAccepter.getContentPane().setLayout(frameAccepterLayout);
        frameAccepterLayout.setHorizontalGroup(
            frameAccepterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        frameAccepterLayout.setVerticalGroup(
            frameAccepterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Demande D'absence");

        tb_DemandeAbsence.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Enregistrer le", "Debut", "Fin", "motif", "Statut", "nom Employe"
            }
        ));
        tb_DemandeAbsence.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_DemandeAbsenceMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tb_DemandeAbsence);

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

        btnAccepter.setBackground(new java.awt.Color(51, 153, 0));
        btnAccepter.setForeground(new java.awt.Color(255, 255, 255));
        btnAccepter.setText("Accepter");
        btnAccepter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAccepterActionPerformed(evt);
            }
        });

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
                .addGap(128, 128, 128)
                .addComponent(btnAccepter)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(3, 3, 3)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(3, 3, 3)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnSupprimer1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(2, 2, 2)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnAjouter1)
                                .addComponent(btnModifier1))))
                    .addComponent(btnAccepter))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 389, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAjouter1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAjouter1MouseClicked
        jLabel5.setText("Nouvelle de demande");
        frameAjouter.setVisible(true);
        modifier=false;
        txtMotif.setText("");
    }//GEN-LAST:event_btnAjouter1MouseClicked

    private void btnModifier1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModifier1MouseClicked
        int index = tb_DemandeAbsence.getSelectedRow();
        if (index==-1){
            JOptionPane.showMessageDialog(this,"Veuillez selectionnez une ligne");
        }
        else {
            jLabel5.setText("Modifier une demande");
            txtEmploye.setEnabled(false);
            frameAjouter.setVisible(true);
            modifier=true;
        }
    }//GEN-LAST:event_btnModifier1MouseClicked

    private void btnSupprimer1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSupprimer1MouseClicked
        int index = tb_DemandeAbsence.getSelectedRow();
        if (index==-1){
            JOptionPane.showMessageDialog(this,"Veuillez selectionnez une ligne");
        }
        else {
            new Confirm().affiche("Supprimer","Etes vous sur de vouloir Supprimer!!!", new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent ae) {
                    int index = tb_DemandeAbsence.getSelectedRow();
                    int id = (int)tb_DemandeAbsence.getValueAt(index,0);
                    DemandeAbsenceDAO udao = new DemandeAbsenceDAO();
                    udao.supprimer(id);
                    vider();
                    liste();
                }
            });
        }
    }//GEN-LAST:event_btnSupprimer1MouseClicked

    private void btnEnregistrerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnregistrerActionPerformed
        String motif=txtMotif.getText();

        String emp=txtEmploye.getSelectedItem().toString();
        int index=emp.indexOf(" ");
        String id=emp.substring(0, index);
        int idEmploye=Integer.parseInt(id);
        
        DemandeAbsenceDAO udao=new DemandeAbsenceDAO();
        
        if(motif.equals("")){
            JOptionPane.showMessageDialog(this,"Veuillez Remplir tous les champs");
        }
        else if(modifier==false){
            DemandeAbsence u=new DemandeAbsence(motif, "En attente", idEmploye);
            udao.inserer(u);
            vider();liste();
            frameAjouter.setVisible(false);
        }
        else if(modifier==true){
            int ligne=tb_DemandeAbsence.getSelectedRow();
            int idUser =(int)tb_DemandeAbsence.getValueAt(ligne, 0);
            DemandeAbsence u=new DemandeAbsence(motif, "En attente", idEmploye);
            udao.modifier(u, idUser);
            vider();liste();
            frameAjouter.setVisible(false);
        }
        
    }//GEN-LAST:event_btnEnregistrerActionPerformed

    private void tb_DemandeAbsenceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_DemandeAbsenceMouseClicked
        int index = tb_DemandeAbsence.getSelectedRow();
        if(index!=-1){
            int id = (int)tb_DemandeAbsence.getValueAt(index,0);
            DemandeAbsenceDAO udao=new DemandeAbsenceDAO();
            DemandeAbsence u=udao.rechercher(id);
            txtMotif.setText(u.getMotif());
            
            EmployeDAO edao = new EmployeDAO();
            Employe employe = edao.rechercher(u.getIdEmploye());
            String emp=employe.getIdEmploye()+" "+employe.getNom()+" "+employe.getPrenom();
            txtEmploye.setSelectedItem(emp);
        }
    }//GEN-LAST:event_tb_DemandeAbsenceMouseClicked

    private void btnAccepterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAccepterActionPerformed
        int index = tb_DemandeAbsence.getSelectedRow();
        if (index==-1){
            JOptionPane.showMessageDialog(this,"Veuillez selectionnez une ligne");
        }
        else{
            String s=(String) tb_DemandeAbsence.getValueAt(index, 5);
            if(s.equals("Accepter")){
                JOptionPane.showMessageDialog(this,"Demande deja Accepter");
            }
            else{
                frameAccepter.setVisible(true);
            }
        }
    }//GEN-LAST:event_btnAccepterActionPerformed

    private void btnEnregistrerAccepterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnregistrerAccepterActionPerformed
        Date debut=txtDebute.getDate();
        Date fin=txtFin.getDate();
        String statut="Accepter";
        int index = tb_DemandeAbsence.getSelectedRow();
        int id = (int)tb_DemandeAbsence.getValueAt(index,0);
        DemandeAbsenceDAO dd=new DemandeAbsenceDAO();
        dd.modifierAccepter(debut, fin, statut, id);
        frameAccepter.setVisible(false);
        vider();liste();
    }//GEN-LAST:event_btnEnregistrerAccepterActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAccepter;
    private javax.swing.JLabel btnAjouter1;
    private javax.swing.JButton btnEnregistrer;
    private javax.swing.JButton btnEnregistrerAccepter;
    private javax.swing.JLabel btnModifier1;
    private javax.swing.JLabel btnSupprimer1;
    private javax.swing.JFrame frameAccepter;
    private javax.swing.JFrame frameAjouter;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private classe_special.Tableaux tb_DemandeAbsence;
    private com.toedter.calendar.JDateChooser txtDebute;
    private javax.swing.JComboBox<String> txtEmploye;
    private com.toedter.calendar.JDateChooser txtFin;
    private javax.swing.JTextArea txtMotif;
    // End of variables declaration//GEN-END:variables

public void liste(){
    DemandeAbsenceDAO udao = new DemandeAbsenceDAO();
    EmployeDAO edao=new EmployeDAO();
        List<DemandeAbsence> da = udao.liste();
        
        for (int i = 0; i < da.size(); i++) {
            Employe em=edao.rechercher(da.get(i).getIdEmploye());
            String nom=em.getNom()+" "+em.getPrenom();
            ((DefaultTableModel) tb_DemandeAbsence.getModel()).addRow(new Object[]{
                  da.get(i).getIdDemandeAbsence(),
                  da.get(i).getDateCreation(),
                  da.get(i).getDateDebut(),
                  da.get(i).getDateFin(),
                  da.get(i).getMotif(),
                  da.get(i).getStatut(),
                  nom
            });

    }
}
public void vider(){
        txtMotif.setText("");
        DefaultTableModel model = (DefaultTableModel) tb_DemandeAbsence.getModel();
        int n = model.getRowCount();
        for (int i = n - 1; i >= 0; --i) {
            model.removeRow(i);
        }
    }
public void combo(){
    EmployeDAO edao=new EmployeDAO();
    List<Employe> employe=edao.liste();
    for (int i = 0; i < employe.size(); i++){
        String emp=employe.get(i).getIdEmploye()+" "+employe.get(i).getNom()+" "+employe.get(i).getPrenom();
        txtEmploye.addItem(emp);
    }
}

}
