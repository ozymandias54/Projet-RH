/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package frame;

import classe_special.ScrollBar;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import menu.MenuButton;
import menu.MenuTitre;
import panel.PanelAvisRecrutement;
import panel.PanelCandidat;
import panel.PanelConge;
import panel.PanelDepartement;
import panel.PanelEmploye;
import panel.PanelEntretient;
import panel.PanelEquipe;
import panel.PanelHistorique;
import panel.PanelUtilisateur;
import panel.PanelHome;
import panel.PanelProjet;

/**
 *
 * @author fofana
 */
public class FrameAccueil extends javax.swing.JFrame {

    /**
     * Creates new form FrameAccueil
     */
    public FrameAccueil() {
        initComponents();
        this.getContentPane().setBackground(Color.WHITE);
        //this.setExtendedState(MAXIMIZED_BOTH);
        execute();
        accueil();
    }

public void accueil(){
    PanelHome p=new PanelHome();
    panelAccueil.removeAll();
    panelAccueil.add(p );
    panelAccueil.repaint();
    panelAccueil.revalidate();
}
    private void execute() {
        ImageIcon iconAccueil=new ImageIcon(getClass().getResource("/menu/home.png"));
        ImageIcon iconUtilisateur=new ImageIcon(getClass().getResource("/menu/user.png"));
        ImageIcon iconDepartement=new ImageIcon(getClass().getResource("/menu/departement.png"));
        ImageIcon iconEquipe=new ImageIcon(getClass().getResource("/menu/equipe.png"));
        ImageIcon iconEmploye=new ImageIcon(getClass().getResource("/menu/employé.png"));
        ImageIcon iconProjet=new ImageIcon(getClass().getResource("/menu/projet.png"));
        ImageIcon iconDemande=new ImageIcon(getClass().getResource("/menu/demande.png"));
        ImageIcon iconCongé=new ImageIcon(getClass().getResource("/menu/congé.png"));
        ImageIcon iconAvis=new ImageIcon(getClass().getResource("/menu/avis.png"));
        ImageIcon iconEntretient=new ImageIcon(getClass().getResource("/menu/entretient.png"));
        ImageIcon iconHistorique=new ImageIcon(getClass().getResource("/menu/historique.png"));
        
        MenuButton menuAccueil = new MenuButton(iconAccueil, "Accueil", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                  accueil();
            }
        });
        MenuButton menuUtilisateur = new MenuButton(iconUtilisateur, "Utilisateurs", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                PanelUtilisateur p=new PanelUtilisateur();
                panelAccueil.removeAll();
                panelAccueil.add(p );
                panelAccueil.repaint();
                panelAccueil.revalidate();
            }
        });
        MenuButton menuDepartement = new MenuButton(iconDepartement, "Departement", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                PanelDepartement p=new PanelDepartement();
                panelAccueil.removeAll();
                panelAccueil.add(p );
                panelAccueil.repaint();
                panelAccueil.revalidate();
            }
        });
         MenuButton menuEquipe = new MenuButton(iconEquipe, "Equipé", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                PanelEquipe p=new PanelEquipe();
                panelAccueil.removeAll();
                panelAccueil.add(p );
                panelAccueil.repaint();
                panelAccueil.revalidate();
            }
        });
        MenuButton menuEmployé = new MenuButton(iconEmploye, "Employé", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                PanelEmploye p=new PanelEmploye();
                panelAccueil.removeAll();
                panelAccueil.add(p );
                panelAccueil.repaint();
                panelAccueil.revalidate();
            }
        });
        MenuButton menuProjet = new MenuButton(iconProjet, "Projet", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                PanelProjet p=new PanelProjet();
                panelAccueil.removeAll();
                panelAccueil.add(p );
                panelAccueil.repaint();
                panelAccueil.revalidate();
            }
        });
        MenuButton menuCandidature = new MenuButton(iconDemande, "Demande d'Emploi", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                PanelCandidat p=new PanelCandidat();
                panelAccueil.removeAll();
                panelAccueil.add(p );
                panelAccueil.repaint();
                panelAccueil.revalidate();
            }
        });
        MenuButton menuCongé = new MenuButton(iconCongé, "Demande Absence", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                PanelConge p=new PanelConge();
                panelAccueil.removeAll();
                panelAccueil.add(p );
                panelAccueil.repaint();
                panelAccueil.revalidate();
            }
        });
        MenuButton menuAvis = new MenuButton(iconAvis, "Avis Recrutement", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                PanelAvisRecrutement p=new PanelAvisRecrutement();
                panelAccueil.removeAll();
                panelAccueil.add(p );
                panelAccueil.repaint();
                panelAccueil.revalidate();
            }
        });
        MenuButton menuEntretient = new MenuButton(iconEntretient, "Entretient", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                PanelEntretient p=new PanelEntretient();
                panelAccueil.removeAll();
                panelAccueil.add(p );
                panelAccueil.repaint();
                panelAccueil.revalidate();
            }
        });
        MenuButton menuHistorique = new MenuButton(iconHistorique, "Historique", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                PanelHistorique p=new PanelHistorique();
                panelAccueil.removeAll();
                panelAccueil.add(p );
                panelAccueil.repaint();
                panelAccueil.revalidate();
            }
        });
       
        
         MenuTitre main=new MenuTitre("HOME PRINCIPAL");
         MenuTitre donné=new MenuTitre("GESTION DU PERSONNEL");
         MenuTitre autre=new MenuTitre("RECRUTEMENT");
         
        addMenutitre(main);addMenu(menuAccueil);
        
        addMenutitre(autre);addMenu(menuAvis,menuCandidature,menuEntretient,menuHistorique);
        
        addMenutitre(donné);addMenu(menuUtilisateur,menuDepartement);
        addMenu(menuEquipe,menuEmployé,menuProjet,menuCongé);
        
       //addMenu(menuAccueil,menuUtilisateur,menuDepartement,menuEmployé,menuProjet,menuCandidature,menuCongé,menuDeconnect);
        menuAccueil.select();
menuUtilisateur.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuDepartement.deselect();
                menuEmployé.deselect();
                menuEquipe.deselect();
                menuCandidature.deselect();
                menuCongé.deselect();
                menuProjet.deselect();
                menuAccueil.deselect();
                menuAvis.deselect();
                menuEntretient.deselect();
                menuHistorique.deselect();
            }
        });
menuDepartement.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuUtilisateur.deselect();
                menuEmployé.deselect();
                menuEquipe.deselect();
                menuCandidature.deselect();
                menuCongé.deselect();
                menuProjet.deselect();
                menuAccueil.deselect();
                menuAvis.deselect();
                menuEntretient.deselect();
                menuHistorique.deselect();
            }
        });
menuEmployé.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
               menuUtilisateur.deselect();
                menuDepartement.deselect();
                menuCandidature.deselect();
                menuEquipe.deselect();
                menuCongé.deselect();
                menuProjet.deselect();
                menuAccueil.deselect();
                menuAvis.deselect();
                menuEntretient.deselect();
                menuHistorique.deselect();
            }
        });
menuCandidature.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
               menuUtilisateur.deselect();
                menuDepartement.deselect();
                menuEmployé.deselect();
                menuEquipe.deselect();
                menuCongé.deselect();
                menuProjet.deselect();
                menuAccueil.deselect();
                menuAvis.deselect();
                menuEntretient.deselect();
                menuHistorique.deselect();
            }
        });
menuCongé.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
               menuUtilisateur.deselect();
                menuDepartement.deselect();
                menuEquipe.deselect();
                menuEmployé.deselect();
                menuCandidature.deselect();
                menuProjet.deselect();
                menuAccueil.deselect();
                menuAvis.deselect();
                menuEntretient.deselect();
                menuHistorique.deselect();
            }
        });
menuProjet.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
               menuUtilisateur.deselect();
                menuDepartement.deselect();
                menuEquipe.deselect();
                menuEmployé.deselect();
                menuCandidature.deselect();
                menuCongé.deselect();
                menuAccueil.deselect();
                menuAvis.deselect();
                menuEntretient.deselect();
                menuHistorique.deselect();
            }
        });
menuEquipe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
               menuUtilisateur.deselect();
                menuDepartement.deselect();
                menuProjet.deselect();
                menuEmployé.deselect();
                menuCandidature.deselect();
                menuCongé.deselect();
                menuAccueil.deselect();
                menuAvis.deselect();
                menuEntretient.deselect();
                menuHistorique.deselect();
            }
        });
menuAccueil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
               menuUtilisateur.deselect();
                menuDepartement.deselect();
                menuProjet.deselect();
                menuEmployé.deselect();
                menuCandidature.deselect();
                menuCongé.deselect();
                menuEquipe.deselect();
                menuAvis.deselect();
                menuEntretient.deselect();
                menuHistorique.deselect();
            }
        });
menuAvis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
               menuUtilisateur.deselect();
                menuDepartement.deselect();
                menuProjet.deselect();
                menuEmployé.deselect();
                menuCandidature.deselect();
                menuCongé.deselect();
                menuEquipe.deselect();
                menuAccueil.deselect();
                menuEntretient.deselect();
                menuHistorique.deselect();
            }
        });
menuEntretient.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
               menuUtilisateur.deselect();
                menuDepartement.deselect();
                menuProjet.deselect();
                menuEmployé.deselect();
                menuCandidature.deselect();
                menuCongé.deselect();
                menuEquipe.deselect();
                menuAvis.deselect();
                menuAccueil.deselect();
                menuHistorique.deselect();
            }
        });
menuHistorique.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
               menuUtilisateur.deselect();
                menuDepartement.deselect();
                menuProjet.deselect();
                menuEmployé.deselect();
                menuCandidature.deselect();
                menuCongé.deselect();
                menuEquipe.deselect();
                menuAvis.deselect();
                menuEntretient.deselect();
                menuAccueil.deselect();
            }
        });

  }
      
    private void addMenu(MenuButton... menu) {
        for (int i = 0; i < menu.length; i++) {
            menus.add(menu[i]);
        }
        menus.revalidate();
    }
    private void addMenutitre(MenuTitre... menu) {
        for (int i = 0; i < menu.length; i++) {
            menus.add(menu[i]);
        }
        menus.revalidate();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scroll = new javax.swing.JScrollPane();
        menus = new javax.swing.JPanel();
        logo = new javax.swing.JPanel();
        labelImage1 = new classe_special.LabelImage();
        panelAccueil = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Accueil");

        scroll.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scroll.setBorder(null);
        scroll.setVerticalScrollBar(new ScrollBar());
        scroll.getVerticalScrollBar().setBackground(Color.BLUE);
        scroll.getViewport().setBackground(Color.BLUE);
        scroll.setBackground(new java.awt.Color(51, 51, 255));

        menus.setBackground(new java.awt.Color(255, 255, 255));
        menus.setLayout(new javax.swing.BoxLayout(menus, javax.swing.BoxLayout.Y_AXIS));
        scroll.setViewportView(menus);

        logo.setBackground(new java.awt.Color(255, 255, 255));

        labelImage1.setImage(new javax.swing.ImageIcon(getClass().getResource("/icon/index.png"))); // NOI18N
        labelImage1.setImageSize(new java.awt.Dimension(111, 111));

        javax.swing.GroupLayout logoLayout = new javax.swing.GroupLayout(logo);
        logo.setLayout(logoLayout);
        logoLayout.setHorizontalGroup(
            logoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelImage1, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)
        );
        logoLayout.setVerticalGroup(
            logoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelImage1, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
        );

        panelAccueil.setBackground(new java.awt.Color(255, 255, 255));
        panelAccueil.setLayout(new java.awt.GridLayout(1, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 595, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 523, Short.MAX_VALUE)
        );

        panelAccueil.add(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(logo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(scroll, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelAccueil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scroll))
            .addComponent(panelAccueil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(FrameAccueil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameAccueil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameAccueil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameAccueil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameAccueil().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private classe_special.LabelImage labelImage1;
    private javax.swing.JPanel logo;
    private javax.swing.JPanel menus;
    private javax.swing.JPanel panelAccueil;
    private javax.swing.JScrollPane scroll;
    // End of variables declaration//GEN-END:variables
}
