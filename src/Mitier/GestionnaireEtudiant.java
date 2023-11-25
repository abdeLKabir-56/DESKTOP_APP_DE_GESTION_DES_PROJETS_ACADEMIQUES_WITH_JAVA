package Mitier;

import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

import Persistance.DAO_Etudiant;

public class GestionnaireEtudiant implements TableModel {
	private DAO_Etudiant etudiant;

	public GestionnaireEtudiant(DAO_Etudiant etudiant) {
		super();
		this.etudiant = etudiant;
	}
	public GestionnaireEtudiant() {
		super();
	}
	public boolean ajouterEtudiant(Etudiant e) {
		return etudiant.ajouterEtudiant(e);
	}
	public boolean supprimerEtudiant(Etudiant e) {
		return etudiant.SuprimerEtudiant(e);
	}
	public boolean ModifierEtudiant(String CNE,String nom,String prenom,String niveau,String filiere,String email,String mdp ) {
		return etudiant.UpdateEtudiant(CNE,nom, prenom,niveau,filiere, email, mdp);
	}
	public ArrayList<Etudiant> getEtudiant(Etudiant e) throws SQLException {
		return etudiant.getAllEtudiants();
	}
	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public String getColumnName(int columnIndex) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Class<?> getColumnClass(int columnIndex) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public boolean isCellEditable(int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void addTableModelListener(TableModelListener l) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void removeTableModelListener(TableModelListener l) {
		// TODO Auto-generated method stub
		
	}

}
