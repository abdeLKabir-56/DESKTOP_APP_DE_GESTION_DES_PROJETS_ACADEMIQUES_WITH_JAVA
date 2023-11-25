package Presentation;
import java.util.ArrayList;

import javax.swing.*;
import javax.swing.table.TableModel;

import Mitier.Etudiant;
import Mitier.GestionnaireEtudiant;
import Persistance.DAO_Etudiant;
public class CRUD_Etudiant extends JTable {
	    private Etudiant e;
	   
        private ArrayList<Etudiant>etudiants=new ArrayList<Etudiant>();
        private GestionnaireEtudiant GE;  
        //new GestionnaireEtudiant(new DAO_Etudiant(etudiants));
        TableModel model=new TableModel(etudiants);
        JTable table=new JTable( model);
        JScrollPane scrollpane = new JScrollPane(table);
        table.setPreferredScrollableViewportSize(new 
		Dimension(500, 500));
        TableRowSorter<TableModel> sorter = new TableRowSorter<>(model);
    	table.setRowSorter(sorter);
        JFrame frame=new JFrame();
        
        public void crud_etudiant() {
        	
        	GE.ajouterEtudiant(e);
        	
        }

}
