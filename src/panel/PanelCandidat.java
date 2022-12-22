/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package panel;

import DAO.CandidatDAO;
import DAO.DemandeEmploiDAO;
import DAO.EmployeDAO;
import DAO.EquipeDAO;
import beans.Candidat;
import beans.DemandeEmploi;
import classe_special.Confirm;
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
public class PanelCandidat extends javax.swing.JPanel {
 public boolean modifier;
    /**
     * Creates new form PanelCandidat
     */
    public PanelCandidat() {
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
        jLabel5 = new javax.swing.JLabel();
        txtGenre = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtCompetence = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtDateNaissance = new com.toedter.calendar.JDateChooser();
        txtPrenom = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtNom = new javax.swing.JTextField();
        txtPoste = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        btnEnregistrerAjouter = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbCandidat = new classe_special.Tableaux();
        btnAjouter = new javax.swing.JButton();
        btnInfoCandidat = new javax.swing.JButton();
        btnSupprimer = new javax.swing.JButton();
        btnDemandeAccepter = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        frameAjouter.setAlwaysOnTop(true);
        frameAjouter.setMinimumSize(new java.awt.Dimension(342, 492));
        frameAjouter.setResizable(false);
        frameAjouter.setSize(new java.awt.Dimension(342, 492));
        frameAjouter.setLocationRelativeTo(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 153, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Ajouter Candidat");

        txtGenre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Homme", "Femme" }));

        jLabel4.setText("Genre");

        jLabel10.setText("Competence");

        jLabel6.setText("DateNaissance");

        jLabel2.setText("Prenom");

        jLabel1.setText("Nom");

        jLabel11.setText("Poste");

        btnEnregistrerAjouter.setBackground(new java.awt.Color(0, 102, 255));
        btnEnregistrerAjouter.setForeground(new java.awt.Color(255, 255, 255));
        btnEnregistrerAjouter.setText("Enregistrer");
        btnEnregistrerAjouter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnregistrerAjouterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtPrenom)
                            .addComponent(txtNom)
                            .addComponent(txtGenre, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtDateNaissance, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCompetence, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPoste, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(btnEnregistrerAjouter, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPrenom, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtDateNaissance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtGenre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCompetence, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPoste, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(btnEnregistrerAjouter)
                .addContainerGap(84, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout frameAjouterLayout = new javax.swing.GroupLayout(frameAjouter.getContentPane());
        frameAjouter.getContentPane().setLayout(frameAjouterLayout);
        frameAjouterLayout.setHorizontalGroup(
            frameAjouterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        frameAjouterLayout.setVerticalGroup(
            frameAjouterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setBackground(new java.awt.Color(255, 255, 255));

        tbCandidat.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Poste", "Statut", "DateCandidature", "Candidat"
            }
        ));
        tbCandidat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbCandidatMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbCandidat);

        btnAjouter.setBackground(new java.awt.Color(0, 102, 255));
        btnAjouter.setForeground(new java.awt.Color(255, 255, 255));
        btnAjouter.setText("Ajouter");
        btnAjouter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAjouterActionPerformed(evt);
            }
        });

        btnInfoCandidat.setText("Info Candidat");
        btnInfoCandidat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInfoCandidatActionPerformed(evt);
            }
        });

        btnSupprimer.setBackground(new java.awt.Color(255, 51, 51));
        btnSupprimer.setForeground(new java.awt.Color(255, 255, 255));
        btnSupprimer.setText("Supprimer");
        btnSupprimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSupprimerActionPerformed(evt);
            }
        });

        btnDemandeAccepter.setBackground(new java.awt.Color(102, 102, 0));
        btnDemandeAccepter.setForeground(new java.awt.Color(255, 255, 255));
        btnDemandeAccepter.setText("Accepter Demande");
        btnDemandeAccepter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDemandeAccepterActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Gestion des Candidatures");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(btnAjouter)
                .addGap(26, 26, 26)
                .addComponent(btnInfoCandidat)
                .addGap(28, 28, 28)
                .addComponent(btnSupprimer)
                .addGap(18, 18, 18)
                .addComponent(btnDemandeAccepter)
                .addContainerGap(215, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(23, 23, 23)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(23, 23, 23)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAjouter)
                    .addComponent(btnInfoCandidat)
                    .addComponent(btnSupprimer)
                    .addComponent(btnDemandeAccepter))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 352, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 427, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnEnregistrerAjouterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnregistrerAjouterActionPerformed
        String nom=txtNom.getText();
        String prenom=txtPrenom.getText();
        Date dateNaissance=txtDateNaissance.getDate();
        String sexe=txtGenre.getSelectedItem().toString();
        boolean genre=false;
        if(sexe.equals("Homme")){
            genre=true;
        }
        String competence=txtCompetence.getText();
        String poste=txtPoste.getText();
        
        if(nom.equals("")||prenom.equals("")||competence.equals("")||poste.equals("")){
            JOptionPane.showMessageDialog(this,"Veuillez Remplir tous les champs");
        }
        else if(modifier==false){
            CandidatDAO cdao=new CandidatDAO();
            Candidat c=new Candidat(nom, prenom, dateNaissance, genre, competence);
            cdao.inserer(c);
            
            DemandeEmploiDAO dedao=new DemandeEmploiDAO();
            c=cdao.dernierCandidat();
            DemandeEmploi de=new DemandeEmploi(poste, "En attente", c.getIdCandidat());
            dedao.inserer(de);
            frameAjouter.setVisible(false);
            vider();liste();
        }
        else if(modifier==true){
            int index =tbCandidat.getSelectedRow();
            int id=(int) tbCandidat.getValueAt(index,0);
            
            DemandeEmploiDAO dedao=new DemandeEmploiDAO();
            CandidatDAO cdao=new CandidatDAO();
            Candidat c=new Candidat(nom, prenom, dateNaissance, genre, competence);
            cdao.modifier(c, dedao.rechercher(id).getIdCandidat());
            
            c.setIdCandidat(dedao.rechercher(id).getIdCandidat());
            
            DemandeEmploi de=new DemandeEmploi(poste, "En attente", c.getIdCandidat());
            dedao.modifier(de, id);
            frameAjouter.setVisible(false);
            vider();liste();
        }
    }//GEN-LAST:event_btnEnregistrerAjouterActionPerformed

    private void btnAjouterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAjouterActionPerformed
        modifier=false;
        jLabel5.setText("Ajouter Candidat");
        txtCompetence.setText("");
        txtDateNaissance.setDate(null);
        txtNom.setText("");
        txtPoste.setText("");
        txtPrenom.setText("");
        frameAjouter.setVisible(true);
        
    }//GEN-LAST:event_btnAjouterActionPerformed

    private void tbCandidatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbCandidatMouseClicked
        int index =tbCandidat.getSelectedRow();
        int id=(int) tbCandidat.getValueAt(index,0);
        DemandeEmploiDAO dedao=new DemandeEmploiDAO();
        DemandeEmploi de=dedao.rechercher(id);
        String poste=de.getEmploiDemande();
        CandidatDAO cdao=new CandidatDAO();
        Candidat c=cdao.rechercher(de.getIdCandidat());
        
        txtCompetence.setText(c.getCompetence());
        txtDateNaissance.setDate(c.getDateNaissance());
        txtNom.setText(c.getNom());
        txtPoste.setText(poste);
        txtPrenom.setText(c.getPrenom());
        txtGenre.setSelectedItem("Homme");
        if(c.isGenre()==false) txtGenre.setSelectedItem("Femme");
        
    }//GEN-LAST:event_tbCandidatMouseClicked

    private void btnInfoCandidatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInfoCandidatActionPerformed
        int index =tbCandidat.getSelectedRow();
        if(index==-1){
            JOptionPane.showMessageDialog(this,"Veuillez selectionnez une ligne");
        }
        else{
            modifier=true;
            jLabel5.setText("Modifier Candidat");
            frameAjouter.setVisible(true);
        }
    }//GEN-LAST:event_btnInfoCandidatActionPerformed

    private void btnSupprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSupprimerActionPerformed
        int index = tbCandidat.getSelectedRow();
        if (index==-1){
            JOptionPane.showMessageDialog(this,"Veuillez selectionnez une ligne");
        }
        else {
            new Confirm().affiche("Supprimer","Etes vous sur de vouloir Supprimer!!!", new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent ae) {
                    int index = tbCandidat.getSelectedRow();
                    int id = (int)tbCandidat.getValueAt(index,0);
                    DemandeEmploiDAO dedao = new DemandeEmploiDAO();
                    CandidatDAO cdao=new CandidatDAO();
                    cdao.supprimer(dedao.rechercher(id).getIdCandidat());
                    vider();
                    liste();
                    
                }
            });
        }
    }//GEN-LAST:event_btnSupprimerActionPerformed

    private void btnDemandeAccepterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDemandeAccepterActionPerformed
        int index = tbCandidat.getSelectedRow();
        if (index==-1){
            JOptionPane.showMessageDialog(this,"Veuillez selectionnez une ligne");
        }
        else{
            int id=(int) tbCandidat.getValueAt(index,0);
            DemandeEmploiDAO dedao=new DemandeEmploiDAO();
            DemandeEmploi de=dedao.rechercher(id);
            de.setStatut("Accepter");
            dedao.modifier(de, id);
            vider();liste();
        }
    }//GEN-LAST:event_btnDemandeAccepterActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAjouter;
    private javax.swing.JButton btnDemandeAccepter;
    private javax.swing.JButton btnEnregistrerAjouter;
    private javax.swing.JButton btnInfoCandidat;
    private javax.swing.JButton btnSupprimer;
    private javax.swing.JFrame frameAjouter;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private classe_special.Tableaux tbCandidat;
    private javax.swing.JTextField txtCompetence;
    private com.toedter.calendar.JDateChooser txtDateNaissance;
    private javax.swing.JComboBox<String> txtGenre;
    private javax.swing.JTextField txtNom;
    private javax.swing.JTextField txtPoste;
    private javax.swing.JTextField txtPrenom;
    // End of variables declaration//GEN-END:variables
public void vider(){
       
        DefaultTableModel model = (DefaultTableModel) tbCandidat.getModel();
        int n = model.getRowCount();
        for (int i = n - 1; i >= 0; --i) {
            model.removeRow(i);
        }
    }
public void liste(){
    DemandeEmploiDAO edao = new DemandeEmploiDAO();
    CandidatDAO cdao=new CandidatDAO();
        List<DemandeEmploi> de = edao.liste();
        
        for (int i = 0; i < de.size(); i++) {
            Candidat c=cdao.rechercher(de.get(i).getIdCandidat());
            String nom=c.getNom()+" "+c.getPrenom();
            
            ((DefaultTableModel) tbCandidat.getModel()).addRow(new Object[]{
                de.get(i).getIdDemandeEmploi(),
                de.get(i).getEmploiDemande(),
                de.get(i).getStatut(),
                c.getDateCandidature(),
                nom
            });

    }
}
}
